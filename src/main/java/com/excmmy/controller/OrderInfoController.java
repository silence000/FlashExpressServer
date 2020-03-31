package com.excmmy.controller;


import com.excmmy.bean.OrderInfo;
import com.excmmy.entity.ResponseJsonBody;
import com.excmmy.service.OrderInfoService;
import org.springframework.web.bind.annotation.RequestBody;
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
 * @since 2020-03-25
 */
@RestController
public class OrderInfoController {
    @Resource
    private OrderInfoService orderInfoService;

    @RequestMapping(value = "/customerInfoService/initOrder", method = RequestMethod.POST)
    public ResponseJsonBody initOrder(@RequestBody OrderInfo orderInfo) {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        OrderInfo orderInfoResult = orderInfoService.initOrder(orderInfo);
        if (orderInfoResult != null) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
            responseJsonBody.setData(orderInfoResult);
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }
}
