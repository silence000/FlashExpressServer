package com.excmmy.mapper;

import com.excmmy.bean.OrderInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
public interface OrderInfoMapper extends BaseMapper<OrderInfo> {
    @Select("SELECT * FROM order_info WHERE id = (SELECT max(id) FROM order_info)")
    public OrderInfo getNewestOrderInfo();
}
