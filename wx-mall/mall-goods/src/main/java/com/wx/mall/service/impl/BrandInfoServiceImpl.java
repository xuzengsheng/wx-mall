package com.wx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.mall.entity.BrandInfo;
import com.wx.mall.mapper.BrandInfoMapper;
import com.wx.mall.service.BrandInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 品牌特卖 服务实现类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@Service
public class BrandInfoServiceImpl extends ServiceImpl<BrandInfoMapper, BrandInfo> implements BrandInfoService {

    @Override
    public List<BrandInfo> initBrandList() {
        return this.list();
    }
}
