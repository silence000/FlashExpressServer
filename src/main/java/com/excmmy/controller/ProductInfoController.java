package com.excmmy.controller;


import com.excmmy.bean.ProductInfo;
import com.excmmy.entity.ResponseJsonBody;
import com.excmmy.service.ProductInfoService;
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
public class ProductInfoController {
    @Resource
    private ProductInfoService productInfoService;
    @RequestMapping(value = "/customerInfoService/getProductInfoByName", method = RequestMethod.POST)
    public ResponseJsonBody getProductInfoByName(@RequestBody ProductInfo productInfo) {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        ProductInfo productInfoResult = productInfoService.getProductInfoByName(productInfo);
        if (productInfoResult != null) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
            responseJsonBody.setData(productInfoResult);
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Null");
        }
        return responseJsonBody;
    }
}

