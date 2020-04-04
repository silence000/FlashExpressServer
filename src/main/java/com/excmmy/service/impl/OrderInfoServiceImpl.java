package com.excmmy.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.excmmy.bean.OrderInfo;
import com.excmmy.entity.OrderInfoFull;
import com.excmmy.entity.OrderList;
import com.excmmy.entity.PageInfo;
import com.excmmy.entity.ResponseJsonBody;
import com.excmmy.mapper.OrderInfoMapper;
import com.excmmy.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
    public OrderInfo initOrder() {
        OrderInfo orderInfoID = new OrderInfo();
        orderInfoID.setSeries(orderInfoMapper.getNewestOrderInfo().getSeries() + 1);
        return orderInfoID;
    }

    @Override
    public int insertOrder(OrderInfo orderInfo) {
        return orderInfoMapper.insert(orderInfo);
    }

    @Override
    public ResponseJsonBody getOrderListByConditions(Map<String, Object> requestData) {
        OrderList orderList = JSON.parseObject(JSON.toJSONString(requestData.get("conditions")), OrderList.class);
        PageInfo pageInfo = JSON.parseObject(JSON.toJSONString(requestData.get("pageInfo")), PageInfo.class);
        Page<OrderList> page = new Page<>(pageInfo.getCurrent(),pageInfo.getSize());
        List<OrderList> orderListResult = orderInfoMapper.getOrderListByConditions(orderList, page);
        PageInfo pageInfoResult = new PageInfo();
        pageInfoResult.setCurrentPage((int) page.getCurrent());
        pageInfoResult.setPages((int) page.getPages());
        pageInfoResult.setPageSize((int) page.getSize());
        pageInfoResult.setTotal((int) page.getTotal());
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        if (orderListResult != null) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
            responseJsonBody.setData(orderListResult);
            responseJsonBody.setExtra(pageInfoResult);
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }

    @Override
    public ResponseJsonBody getOrderInfoFullByConditions(Map<String, Object> requestData) {
        OrderInfoFull orderInfoFull = JSON.parseObject(JSON.toJSONString(requestData.get("conditions")), OrderInfoFull.class);
        PageInfo pageInfo = JSON.parseObject(JSON.toJSONString(requestData.get("pageInfo")), PageInfo.class);
        Page<OrderList> page = new Page<>(pageInfo.getCurrent(),pageInfo.getSize());
        List<OrderInfoFull> orderInfoFullResult = orderInfoMapper.getOrderInfoFullByConditions(orderInfoFull, page);
        PageInfo pageInfoResult = new PageInfo();
        pageInfoResult.setCurrentPage((int) page.getCurrent());
        pageInfoResult.setPages((int) page.getPages());
        pageInfoResult.setPageSize((int) page.getSize());
        pageInfoResult.setTotal((int) page.getTotal());
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        if (orderInfoFullResult != null) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
            responseJsonBody.setData(orderInfoFullResult);
            responseJsonBody.setExtra(pageInfoResult);
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }
}
