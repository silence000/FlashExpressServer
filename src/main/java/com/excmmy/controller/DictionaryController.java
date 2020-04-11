package com.excmmy.controller;


import com.excmmy.bean.Dictionary;
import com.excmmy.util.ResponseJsonBody;
import com.excmmy.service.DictionaryService;
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
public class DictionaryController {
    @Resource
    private DictionaryService dictionaryService;

    @RequestMapping(value = "/customerInfoService/getOrderType", method = RequestMethod.POST)
    public ResponseJsonBody getOrderType(){
        return dictionaryService.getOrderType();
    }

    @RequestMapping(value = "/customerInfoService/getOrderStatus", method = RequestMethod.POST)
    public ResponseJsonBody getOrderStatus(){
        return dictionaryService.getOrderStatus();
    }
}
