package com.excmmy.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.excmmy.bean.OrderInfo;
import com.excmmy.entity.OrderInfoFull;
import com.excmmy.entity.OrderList;
import com.excmmy.entity.PageInfo;
import com.excmmy.entity.ResponseJsonBody;
import com.excmmy.service.OrderInfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
    public ResponseJsonBody initOrder() {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        OrderInfo orderInfoResult = orderInfoService.initOrder();
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

    @RequestMapping(value = "/customerInfoService/updateOrderById", method = RequestMethod.POST)
    public ResponseJsonBody updateOrderById(@RequestBody OrderInfo orderInfo) {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        int flag = orderInfoService.insertOrder(orderInfo);
        if (flag == 1) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }

    @RequestMapping(value = "/customerInfoService/getOrderListByConditions", method = RequestMethod.POST)
    public ResponseJsonBody getOrderListByConditions(@RequestBody Map<String, Object> requestData) {
        return orderInfoService.getOrderListByConditions(requestData);
    }

    @RequestMapping(value = "/customerInfoService/getOrderInfoFullByConditions", method = RequestMethod.POST)
    public ResponseJsonBody getOrderInfoFullByConditions(@RequestBody Map<String, Object> requestData){
        return orderInfoService.getOrderInfoFullByConditions(requestData);
    }
}
