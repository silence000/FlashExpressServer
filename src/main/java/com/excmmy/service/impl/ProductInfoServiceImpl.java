package com.excmmy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.excmmy.bean.ProductInfo;
import com.excmmy.mapper.ProductInfoMapper;
import com.excmmy.service.ProductInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
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
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo> implements ProductInfoService {
    @Resource
    private ProductInfoMapper productInfoMapper;

    @Override
    public ProductInfo getProductInfoByName(ProductInfo productInfo) {
        QueryWrapper<ProductInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", productInfo.getName());
        return productInfoMapper.selectOne(queryWrapper);
    }
}
