package com.excmmy.controller;

import com.excmmy.bean.CustomerInfo;
import com.excmmy.util.ResponseJsonBody;
import com.excmmy.service.CustomerInfoService;
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
public class CustomerInfoController {
    @Resource
    private CustomerInfoService customerInfoService;

    @RequestMapping(value = "/customerInfoService/getCustomerInfoList", method = RequestMethod.POST)
    public ResponseJsonBody getCustomerInfoList(@RequestBody Map<String, Object> requestData){
        return customerInfoService.searchCustomerByConditions(requestData);
    }

    @RequestMapping(value = "/customerInfoService/insertCustomer", method = RequestMethod.POST)
    public ResponseJsonBody insertCustomer(@RequestBody CustomerInfo customerInfo){
        return customerInfoService.insertCustomer(customerInfo);
    }

    @RequestMapping(value = "/customerInfoService/getCustomer", method = RequestMethod.POST)
    public ResponseJsonBody getCustomerById(@RequestBody CustomerInfo customerInfo){
        return customerInfoService.getCustomerById(customerInfo);
    }

    @RequestMapping(value = "/customerInfoService/updateCustomer", method = RequestMethod.POST)
    public ResponseJsonBody updateCustomer(@RequestBody CustomerInfo customerInfo) {
        return customerInfoService.updateCustomer(customerInfo);
    }

    @RequestMapping(value = "/customerInfoService/deleteOneCustomer", method = RequestMethod.POST)
    public ResponseJsonBody deleteOneCustomer(@RequestBody CustomerInfo customerInfo) {
        return customerInfoService.deleteOneCustomer(customerInfo);
    }
}
