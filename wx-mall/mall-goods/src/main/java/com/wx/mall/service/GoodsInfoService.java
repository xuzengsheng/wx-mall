package com.wx.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.mall.entity.GoodsInfo;

import java.util.List;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
public interface GoodsInfoService extends IService<GoodsInfo> {

    List<GoodsInfo> initGoods();

    //更新点击量
    Integer updateClickRateById(Integer id);

}
