package com.excmmy.service;

import com.excmmy.bean.OrderInfo;
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
public interface OrderInfoService extends IService<OrderInfo> {
    public ResponseJsonBody initOrder();
    public ResponseJsonBody insertOrder(OrderInfo orderInfo);
    public ResponseJsonBody getOrderListByConditions(Map<String, Object> requestData);
    public ResponseJsonBody getOrderInfoFullByConditions(Map<String, Object> requestData);
}
