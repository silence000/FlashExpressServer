package com.excmmy.service.impl;

import com.excmmy.bean.OrderInfo;
import com.excmmy.mapper.OrderInfoMapper;
import com.excmmy.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {
    @Resource
    private OrderInfoMapper orderInfoMapper;

    @Override
    public OrderInfo initOrder(OrderInfo orderInfo) {
        OrderInfo orderInfoInsert = new OrderInfo();
        orderInfoInsert.setCustomerId(orderInfo.getCustomerId());
        orderInfoInsert.setSeries(orderInfoMapper.getNewestOrderInfo().getSeries() + 1);
        orderInfoMapper.insert(orderInfoInsert);
//        System.out.println(orderInfoInsert.getId());
        return orderInfoInsert;
    }
}
