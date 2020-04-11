package com.excmmy.controller;

import com.excmmy.bean.OrderInfo;
import com.excmmy.util.ResponseJsonBody;
import com.excmmy.service.OrderInfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
        return orderInfoService.initOrder();
    }

    @RequestMapping(value = "/customerInfoService/updateOrderById", method = RequestMethod.POST)
    public ResponseJsonBody updateOrderById(@RequestBody OrderInfo orderInfo) {
        return orderInfoService.insertOrder(orderInfo);
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
