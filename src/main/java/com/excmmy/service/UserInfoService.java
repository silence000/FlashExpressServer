package com.excmmy.service;

import com.excmmy.bean.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.excmmy.util.ResponseJsonBody;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
public interface UserInfoService extends IService<UserInfo> {
    public ResponseJsonBody loginVerify(UserInfo userInfo);
    public ResponseJsonBody insertUser(UserInfo userInfo);
}
