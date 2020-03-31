package com.excmmy.service.impl;

import com.excmmy.bean.UserInfo;
import com.excmmy.mapper.UserInfoMapper;
import com.excmmy.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public UserInfo loginVerify(UserInfo userInfo) {
        Map<String, Object> condition = new HashMap<>();
        condition.put("username", userInfo.getUsername());
        condition.put("userpass", userInfo.getUserpass());
        List<UserInfo> userInfos = userInfoMapper.selectByMap(condition);
        if (userInfos.size() == 0) {
            return null;
        } else {
            return userInfos.get(0);
        }
    }
}
