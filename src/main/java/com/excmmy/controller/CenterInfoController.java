package com.excmmy.controller;


import com.excmmy.entity.Repository;
import com.excmmy.util.ResponseJsonBody;
import com.excmmy.service.CenterInfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
@RestController
public class CenterInfoController {
    @Resource
    private CenterInfoService centerInfoService;

    @RequestMapping(value = "/customerInfoService/getCenterInfoByKeyword", method = RequestMethod.POST)
    public ResponseJsonBody getCenterInfoByKeyword(@RequestBody Repository repository){
        return centerInfoService.getCenterInfoByKeyword(repository);
    }
}

