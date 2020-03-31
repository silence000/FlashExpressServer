package com.excmmy.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.excmmy.bean.CenterInfo;
import com.excmmy.bean.CustomerInfo;
import com.excmmy.entity.Repository;
import com.excmmy.mapper.CenterInfoMapper;
import com.excmmy.service.CenterInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
@Service
public class CenterInfoServiceImpl extends ServiceImpl<CenterInfoMapper, CenterInfo> implements CenterInfoService {
    @Resource
    private CenterInfoMapper centerInfoMapper;

    @Override
    public List<Repository> getCenterInfoByKeyword(Repository repository) {
        Page<Repository> page = new Page<>(repository.getCurrent(), repository.getSize());
        if (repository.getKeyword() != null) {
            List<Repository> repositoriesResult = centerInfoMapper.getCenterInfoByKeyword(page, repository.getKeyword());
            repositoriesResult.get(0).setCurrentPage((int) page.getCurrent());
            repositoriesResult.get(0).setPages((int) page.getPages()); // 总页数
            repositoriesResult.get(0).setSize((int) page.getSize()); // 当前页面数据条数
            repositoriesResult.get(0).setTotal((int) page.getTotal()); // 总数据条数
            repositoriesResult.get(0).setHasNext(page.hasNext()); // 是否有下一页
            repositoriesResult.get(0).setHasPrevious(page.hasPrevious()); // 是否有上一页
            return repositoriesResult;
        } else {
            List<Repository> repositoriesResult = centerInfoMapper.getAllCenterInfo(page);
            repositoriesResult.get(0).setCurrentPage((int) page.getCurrent());
            repositoriesResult.get(0).setPages((int) page.getPages()); // 总页数
            repositoriesResult.get(0).setSize((int) page.getSize()); // 当前页面数据条数
            repositoriesResult.get(0).setTotal((int) page.getTotal()); // 总数据条数
            repositoriesResult.get(0).setHasNext(page.hasNext()); // 是否有下一页
            repositoriesResult.get(0).setHasPrevious(page.hasPrevious()); // 是否有上一页
            return repositoriesResult;
        }

    }
}
