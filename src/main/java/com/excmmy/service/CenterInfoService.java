package com.excmmy.service;

import com.excmmy.bean.CenterInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.excmmy.entity.Repository;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
public interface CenterInfoService extends IService<CenterInfo> {
    public List<Repository> getCenterInfoByKeyword(Repository repository);
}
