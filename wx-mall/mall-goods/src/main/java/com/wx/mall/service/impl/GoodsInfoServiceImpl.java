package com.wx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.mall.entity.GoodsInfo;
import com.wx.mall.mapper.GoodsInfoMapper;
import com.wx.mall.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@Service
public class GoodsInfoServiceImpl extends ServiceImpl<GoodsInfoMapper, GoodsInfo> implements GoodsInfoService {
    @Autowired
    GoodsInfoMapper goodsInfoMapper;

    @Override
    public List<GoodsInfo> initGoods() {
        return this.list();
    }

    //更新点击量
    @Override
    public Integer updateClickRateById(Integer id) {
        return goodsInfoMapper.updateClickRateById(id);
    }
}
