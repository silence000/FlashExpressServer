package com.excmmy.service.impl;

import com.excmmy.bean.Role;
import com.excmmy.mapper.RoleMapper;
import com.excmmy.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-26
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    @Resource
    private RoleMapper roleMapper;

    @Override
    public Role getRoleById(String id) {
        return roleMapper.selectById(id);
    }
}
