package com.excmmy.service;

import com.excmmy.bean.ProductInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.excmmy.util.ResponseJsonBody;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
public interface ProductInfoService extends IService<ProductInfo> {
    public ResponseJsonBody getProductInfoByName(ProductInfo productInfo);
}
