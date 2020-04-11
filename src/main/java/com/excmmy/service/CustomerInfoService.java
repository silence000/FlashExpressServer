package com.excmmy.service;

import com.excmmy.bean.CustomerInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.excmmy.util.ResponseJsonBody;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
public interface CustomerInfoService extends IService<CustomerInfo> {
    public ResponseJsonBody searchCustomerByConditions(Map<String, Object> requestData);
    public ResponseJsonBody insertCustomer(CustomerInfo customerInfo);
    public ResponseJsonBody getCustomerById(CustomerInfo customerInfo);
    public ResponseJsonBody updateCustomer(CustomerInfo customerInfo);
    public ResponseJsonBody deleteOneCustomer(CustomerInfo customerInfo);
}
