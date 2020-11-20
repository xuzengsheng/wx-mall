package com.wx.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.mall.entity.BrandInfo;

import java.util.List;

/**
 * <p>
 * 品牌特卖 服务类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
public interface BrandInfoService extends IService<BrandInfo> {

    List<BrandInfo> initBrandList();

}
