package com.wx.mall.service.impl;

import com.wx.mall.entity.BannerInfo;
import com.wx.mall.mapper.BannerInfoMapper;
import com.wx.mall.service.BannerInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 轮播图 服务实现类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@Service
public class BannerInfoServiceImpl extends ServiceImpl<BannerInfoMapper, BannerInfo> implements BannerInfoService {

    @Override
    public List<BannerInfo> initBannerList() {
        return this.list();
    }
}
