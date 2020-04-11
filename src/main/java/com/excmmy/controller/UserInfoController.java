package com.excmmy.controller;


import com.excmmy.bean.UserInfo;
import com.excmmy.service.UserInfoService;
import com.excmmy.util.ResponseJsonBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
@RestController
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return "Welcome to FlashExpress";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseJsonBody login(@RequestBody UserInfo userInfo){
        return userInfoService.loginVerify(userInfo);
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public ResponseJsonBody insertUser(@RequestBody UserInfo userInfo){
        return userInfoService.insertUser(userInfo);
    }
}
