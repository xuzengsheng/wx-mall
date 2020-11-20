package com.wx.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.mall.entity.BannerInfo;

import java.util.List;

/**
 * <p>
 * 轮播图 服务类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
public interface BannerInfoService extends IService<BannerInfo> {

    List<BannerInfo> initBannerList();

}
