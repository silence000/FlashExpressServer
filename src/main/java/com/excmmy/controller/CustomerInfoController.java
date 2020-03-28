package com.excmmy.controller;


import com.excmmy.bean.CustomerInfo;
import com.excmmy.entity.CustomerInfoParameter;
import com.excmmy.entity.ResponseJsonBody;
import com.excmmy.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
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
public class CustomerInfoController {
    @Resource
    private CustomerInfoService customerInfoService;

    @RequestMapping(value = "/customerInfoService/getCustomerInfoList", method = RequestMethod.POST)
    public ResponseJsonBody getCustomerInfoList(@RequestBody CustomerInfoParameter customerInfoParameter){
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        List<CustomerInfoParameter> customerInfoResult = customerInfoService.searchCustomerByConditions(customerInfoParameter);
        if (customerInfoResult != null) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
            responseJsonBody.setData(customerInfoResult);
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Null");
        }
        return responseJsonBody;
    }
    @RequestMapping(value = "/customerInfoService/insertCustomer", method = RequestMethod.POST)
    public ResponseJsonBody insertCustomer(@RequestBody CustomerInfo customerInfo){
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        int flag = customerInfoService.insertCustomer(customerInfo);
        if (flag == 1) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }
}
