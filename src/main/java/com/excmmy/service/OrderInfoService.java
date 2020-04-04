package com.excmmy.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.excmmy.bean.OrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.excmmy.entity.OrderInfoFull;
import com.excmmy.entity.OrderList;
import com.excmmy.entity.ResponseJsonBody;

import java.util.List;
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
    public OrderInfo initOrder();
    public int insertOrder(OrderInfo orderInfo);
    public ResponseJsonBody getOrderListByConditions(Map<String, Object> requestData);
    public ResponseJsonBody getOrderInfoFullByConditions(Map<String, Object> requestData);
}
