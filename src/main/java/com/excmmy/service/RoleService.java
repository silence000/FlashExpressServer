package com.excmmy.service;

import com.excmmy.bean.Role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-26
 */
public interface RoleService extends IService<Role> {
    public Role getRoleById(String id);
}
