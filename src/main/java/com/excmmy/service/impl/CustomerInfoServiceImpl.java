package com.excmmy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.excmmy.bean.CustomerInfo;
import com.excmmy.entity.CustomerInfoParameter;
import com.excmmy.mapper.CustomerInfoMapper;
import com.excmmy.service.CustomerInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.minidev.json.JSONUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public List<CustomerInfoParameter> searchCustomerByConditions(CustomerInfoParameter customerInfoParameter) {
        Page<CustomerInfo> page = new Page<>(customerInfoParameter.getCurrent(), customerInfoParameter.getSize());
        QueryWrapper<CustomerInfo> queryWrapper = new QueryWrapper<>();
        if (customerInfoParameter.getPid() != null) {
            queryWrapper.like("pid", customerInfoParameter.getPid());
        }
        if (customerInfoParameter.getName() != null) {
            queryWrapper.like("name", customerInfoParameter.getName());
        }
        if (customerInfoParameter.getMobile() != null) {
            queryWrapper.like("mobile", customerInfoParameter.getMobile());
        }
        if (customerInfoParameter.getSeries() != null) { // 测试用
            queryWrapper.like("series", customerInfoParameter.getSeries());
        }
        // 执行查询
        customerInfoMapper.selectPage(page, queryWrapper);
        List<CustomerInfo> customerInfos = page.getRecords();
        if (customerInfos.size() != 0) {
            ArrayList<CustomerInfoParameter> customerInfoResult = new ArrayList<>();
            for (CustomerInfo customerInfo : customerInfos) {
                customerInfoResult.add(new CustomerInfoParameter(customerInfo));
            }
            customerInfoResult.get(0).setCurrentPage((int) page.getCurrent()); // 当前页页码
            customerInfoResult.get(0).setPages((int) page.getPages()); // 总页数
            customerInfoResult.get(0).setSize((int) page.getSize()); // 当前页面数据条数
            customerInfoResult.get(0).setTotal((int) page.getTotal()); // 总数据条数
            customerInfoResult.get(0).setHasNext(page.hasNext()); // 是否有下一页
            customerInfoResult.get(0).setHasPrevious(page.hasPrevious()); // 是否有上一页
            return customerInfoResult;
        } else {
            return null;
        }
    }

    @Override
    public int insertCustomer(CustomerInfo customerInfo){
        customerInfo.setSeries(UUID.randomUUID().toString());
        return customerInfoMapper.insert(customerInfo);
    }

    @Override
    public CustomerInfo getCustomerById(CustomerInfo customerInfo) {
        return customerInfoMapper.selectById(customerInfo.getId());
    }

    @Override
    public int updateCustomer(CustomerInfo customerInfo) {
        return customerInfoMapper.updateById(customerInfo);
    }

    @Override
    public int deleteOneCustomer(CustomerInfo customerInfo) {
        return customerInfoMapper.deleteById(customerInfo.getId());
    }
}
