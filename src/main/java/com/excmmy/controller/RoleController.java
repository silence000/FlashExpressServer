package com.excmmy.controller;


import com.excmmy.bean.Role;
import com.excmmy.service.RoleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-26
 */
@RestController
public class RoleController {
    @Resource
    private RoleService roleService;

    @RequestMapping(value = "/role/query{id}", method = RequestMethod.POST)
    public Role queryAuthority(@PathVariable("id") String id){
        return roleService.getRoleById(id);
    }
}

