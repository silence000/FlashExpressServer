package com.excmmy.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.excmmy.bean.CenterInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.excmmy.bean.ProductInfo;
import com.excmmy.entity.Repository;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
public interface CenterInfoMapper extends BaseMapper<CenterInfo> {
    @Select("SELECT*FROM repository WHERE product_id IN (SELECT id FROM product_info WHERE name LIKE CONCAT('%',#{keyword},'%'))")
    public List<Repository> getCenterInfoByKeyword(Page<Repository> page, @Param("keyword") String keyword);

    @Select("SELECT*FROM repository")
    public List<Repository> getAllCenterInfo(Page<Repository> page);
}
