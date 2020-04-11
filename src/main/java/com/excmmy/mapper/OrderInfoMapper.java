package com.excmmy.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.excmmy.bean.OrderInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.excmmy.entity.OrderInfoFull;
import com.excmmy.entity.OrderList;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

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

    @SelectProvider(type = DynamicDataDaoProvider.class, method = "getOrderListByConditions")
    @Results(id = "OrderList", value = {
            @Result(property = "startDate", column = "start_date"),
            @Result(property = "endDate", column = "end_date"),
            @Result(property = "customerId", column = "customer_id")
    })
    public List<OrderList> getOrderListByConditions(OrderList orderList, Page<OrderList> page);

    @SelectProvider(type = DynamicDataDaoProvider.class, method = "getOrderInfoFullByConditions")
    @Results(id = "OrderInfoFull", value = {
            @Result(property = "customerId", column = "customer_id"),
            @Result(property = "productId", column = "product_id"),
            @Result(property = "productSeries", column = "product_series"),
            @Result(property = "productName", column = "product_name"),
            @Result(property = "productDescription", column = "product_description"),
            @Result(property = "startDate", column = "start_date"),
            @Result(property = "endDate", column = "end_date"),
    })
    public List<OrderInfoFull> getOrderInfoFullByConditions(OrderInfoFull orderInfoFull, Page<OrderList> page);

    class DynamicDataDaoProvider {
        public String getOrderListByConditions(OrderList orderList) {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT*FROM orderlistfull");
            boolean name = orderList.getName() != null;
            boolean mobile = orderList.getMobile() != null;
            boolean type = orderList.getType() != null;
            boolean status = orderList.getStatus() != null;
            boolean startDate = orderList.getStartDate() != null;
            boolean endDate = orderList.getEndDate() != null;
            boolean blank;
            if (name || mobile || type || status || startDate || endDate) {
                sql.append(" WHERE ");
                blank = false;
            } else {
                blank = true;
            }
            if (name) {
                sql.append("`name` LIKE '%");
                sql.append(orderList.getName());
                sql.append("%' AND ");
            }
            if (mobile) {
                sql.append("`mobile` LIKE '%");
                sql.append(orderList.getMobile());
                sql.append("%' AND ");
            }
            if (type) {
                sql.append("`type` LIKE '%");
                sql.append(orderList.getType());
                sql.append("%' AND ");
            }
            if (status) {
                sql.append("`status` LIKE '%");
                sql.append(orderList.getStatus());
                sql.append("%' AND ");
            }
            if (startDate) {
                sql.append("`start_date` LIKE '%");
                sql.append(orderList.getStartDate());
                sql.append("%' AND ");
            }
            if (endDate) {
                sql.append("`end_date` LIKE '%");
                sql.append(orderList.getEndDate());
                sql.append("%' AND ");
            }
            if (!blank) {
                sql.delete(sql.length() - 4, sql.length());
            }
            return sql.toString();
        }

        public String getOrderInfoFullByConditions(OrderInfoFull orderInfoFull){
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT*FROM order_info_full");
            boolean startDate = orderInfoFull.getStartDate() != null;
            boolean status = orderInfoFull.getStatus().length() != 0;
            boolean productName = orderInfoFull.getProductName().length() != 0;
            boolean customerId = orderInfoFull.getCustomerId() != null;
            boolean blank;
            if (startDate || status || productName || customerId) {
                sql.append(" WHERE ");
                blank = false;
            } else {
                blank = true;
            }
            if (customerId) {
                sql.append("`customer_id` LIKE '");
                sql.append(orderInfoFull.getCustomerId());
                sql.append("' AND ");
            }
            if (startDate) {
                sql.append("`start_date` LIKE '%");
                sql.append(orderInfoFull.getStartDate());
                sql.append("%' AND ");
            }
            if (status) {
                sql.append("`status` LIKE '%");
                sql.append(orderInfoFull.getStatus());
                sql.append("%' AND ");
            }
            if (productName) {
                sql.append("`product_name` LIKE '%");
                sql.append(orderInfoFull.getProductName());
                sql.append("%' AND ");
            }
            if (!blank) {
                sql.delete(sql.length() - 4, sql.length());
            }
            return sql.toString();
        }
    }
}

