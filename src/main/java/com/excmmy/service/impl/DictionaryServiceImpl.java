package com.excmmy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.excmmy.bean.Dictionary;
import com.excmmy.mapper.DictionaryMapper;
import com.excmmy.service.DictionaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
    public List<Dictionary> getOrderType() {
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("ex_type", "30");
        return dictionaryMapper.selectByMap(columnMap);
    }

    @Override
    public List<Dictionary> getOrderStatus() {
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("ex_type", "10");
        return dictionaryMapper.selectByMap(columnMap);
    }
}
