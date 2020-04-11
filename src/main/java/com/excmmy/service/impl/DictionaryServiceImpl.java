package com.excmmy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.excmmy.bean.Dictionary;
import com.excmmy.mapper.DictionaryMapper;
import com.excmmy.service.DictionaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.excmmy.util.ResponseJsonBody;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
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
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, Dictionary> implements DictionaryService {
    @Resource
    private DictionaryMapper dictionaryMapper;

    @Override
    @Cacheable(value = "OrderType")
    public ResponseJsonBody getOrderType() {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("ex_type", "30");
        List<Dictionary> dictionaryList = dictionaryMapper.selectByMap(columnMap);
        if (dictionaryList != null) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
            responseJsonBody.setData(dictionaryList);
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }

    @Override
    @Cacheable(value = "OrderStatus")
    public ResponseJsonBody getOrderStatus() {
        ResponseJsonBody responseJsonBody = new ResponseJsonBody();
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("ex_type", "10");
        List<Dictionary> dictionaryList =  dictionaryMapper.selectByMap(columnMap);
        if (dictionaryList != null) {
            responseJsonBody.setCode(1);
            responseJsonBody.setMsg("Success");
            responseJsonBody.setData(dictionaryList);
        } else {
            responseJsonBody.setCode(0);
            responseJsonBody.setMsg("Fail");
        }
        return responseJsonBody;
    }
}
