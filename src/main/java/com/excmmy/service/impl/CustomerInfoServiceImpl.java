package com.excmmy.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.excmmy.bean.CustomerInfo;
import com.excmmy.entity.OrderList;
import com.excmmy.mapper.CustomerInfoMapper;
import com.excmmy.service.CustomerInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.excmmy.util.PageInfo;
import com.excmmy.util.ResponseJsonBody;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.*;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
@Service
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoMapper, CustomerInfo> implements CustomerInfoService {
    @Resource
    private CustomerInfoMapper customerInfoMapper;

    @Override
    @Cacheable(value = "CustomerList")
    public ResponseJsonBody searchCustomerByConditions(@RequestBody Map<String, Object> requestData) {
        CustomerInfo customerInfo = JSON.parseObject(JSON.toJSONString(requestData.get("conditions")), CustomerInfo.class);
        PageInfo pageInfo = JSON.parseObject(JSON.toJSONString(requestData.get("pageInfo")), PageInfo.class);
        Page<CustomerInfo> page = new Page<>(pageInfo.getCurrent(), pageInfo.getSize());
        QueryWrapper<CustomerInfo> queryWrapper = new QueryWrapper<>();
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        // 添加判断条件
        if (customerInfo.getPid() != null) {
            queryWrapper.like("pid", customerInfo.getPid());
        }
        if (customerInfo.getName() != null) {
            queryWrapper.like("name", customerInfo.getName());
        }
        if (customerInfo.getMobile() != null) {
            queryWrapper.like("mobile", customerInfo.getMobile());
        }
        if (customerInfo.getSeries() != null) { // 测试用
            queryWrapper.like("series", customerInfo.getSeries());
        }
        // 执行查询
        customerInfoMapper.selectPage(page, queryWrapper);
        List<CustomerInfo> customerInfos = page.getRecords();
        PageInfo pageInfoResult = new PageInfo();
        pageInfoResult.setCurrentPage((int) page.getCurrent());
        pageInfoResult.setPages((int) page.getPages());
        pageInfoResult.setPageSize((int) page.getSize());
        pageInfoResult.setTotal((int) page.getTotal());
        if (customerInfos != null) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
            responseJsonBody.setData(customerInfos);
            responseJsonBody.setExtra(pageInfoResult);
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }

    @Override
    public ResponseJsonBody insertCustomer(CustomerInfo customerInfo){
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        customerInfo.setSeries(UUID.randomUUID().toString());
        int flag = customerInfoMapper.insert(customerInfo);
        if (flag == 1) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }

    @Override
    @Cacheable(value = "CustomerInfo")
    public ResponseJsonBody getCustomerById(CustomerInfo customerInfo) {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        CustomerInfo customerInfoResult = customerInfoMapper.selectById(customerInfo.getId());
        if (customerInfoResult != null) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
            responseJsonBody.setData(customerInfoResult);
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }

    @Override
    public ResponseJsonBody updateCustomer(CustomerInfo customerInfo) {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        int flag = customerInfoMapper.updateById(customerInfo);
        if (flag == 1) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }

    @Override
    public ResponseJsonBody deleteOneCustomer(CustomerInfo customerInfo) {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
//        int flag = customerInfoMapper.deleteById(customerInfo.getId());
        int flag = 1; // 测试用, 假删除
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
