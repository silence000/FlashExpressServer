package com.excmmy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.excmmy.bean.UserInfo;
import com.excmmy.entity.Logs;
import com.excmmy.mapper.UserInfoMapper;
import com.excmmy.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.excmmy.util.JWTUtil;
import com.excmmy.util.PasswordUtil;
import com.excmmy.util.ResponseJsonBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Autowired
    private MongoTemplate mongo;

    @Override
    public ResponseJsonBody loginVerify(UserInfo userInfo) {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        QueryWrapper<UserInfo> queryName = new QueryWrapper<>();
        queryName.eq("username", userInfo.getUsername());
        UserInfo userInfoSalt = userInfoMapper.selectOne(queryName);
        if (userInfoSalt != null) {
            String md5Password = PasswordUtil.md5(userInfo.getUserpass() + userInfoSalt.getSalt());
            QueryWrapper<UserInfo> userInfoCondition = new QueryWrapper<>();
            userInfoCondition.eq("username", userInfo.getUsername());
            userInfoCondition.eq("userpass", md5Password);
            UserInfo userInfoResult = userInfoMapper.selectOne(userInfoCondition);
            if (userInfoResult != null) {
                userInfoResult.setUserpass(null);
                userInfoResult.setSalt(null);
                responseJsonBody.setCode(1);
                responseJsonBody.setMsg("Success");
                responseJsonBody.setData(userInfoResult);
                responseJsonBody.setExtra(JWTUtil.sign(userInfo)); // 颁发Jwt令牌
                Logs logs = new Logs();
                logs.setUserId(userInfoResult.getId());
                logs.setUsername(userInfoResult.getUsername());
                logs.setLoginTime(new Date());
                mongo.save(logs);
                return responseJsonBody;
            }
        }
        responseJsonBody.setCode(0);
        responseJsonBody.setMsg("Fail");
        return responseJsonBody;
    }

    @Override
    public ResponseJsonBody insertUser(UserInfo userInfo) {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        String salt = PasswordUtil.salt();
        String md5Password = PasswordUtil.md5(userInfo.getUserpass() + salt);
        UserInfo userInfoContent = new UserInfo();
        userInfoContent.setUsername(userInfo.getUsername());
        userInfoContent.setUserpass(md5Password);
        userInfoContent.setSalt(salt);
        userInfoContent.setRole(userInfo.getRole());
        int flag = userInfoMapper.insert(userInfoContent);
        if (flag == 1) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }
}
