package com.excmmy.service;

import com.excmmy.bean.CustomerInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.excmmy.entity.CustomerInfoParameter;

import java.text.ParseException;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
public interface CustomerInfoService extends IService<CustomerInfo> {
    public List<CustomerInfoParameter> searchCustomerByConditions(CustomerInfoParameter customerInfoParameter);
    public int insertCustomer(CustomerInfo customerInfo);
}
