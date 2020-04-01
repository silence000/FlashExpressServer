package com.excmmy.service;

import com.excmmy.bean.Dictionary;
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
public interface DictionaryService extends IService<Dictionary> {
    public List<Dictionary> getOrderType();

    public List<Dictionary> getOrderStatus();
}
