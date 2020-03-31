package com.excmmy.service;

import com.excmmy.bean.OrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
public interface OrderInfoService extends IService<OrderInfo> {
    public OrderInfo initOrder(OrderInfo orderInfo);
}
