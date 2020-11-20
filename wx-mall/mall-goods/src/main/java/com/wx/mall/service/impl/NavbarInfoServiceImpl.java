package com.wx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.mall.entity.NavbarInfo;
import com.wx.mall.mapper.NavbarInfoMapper;
import com.wx.mall.service.NavbarInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 导航条 服务实现类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@Service
public class NavbarInfoServiceImpl extends ServiceImpl<NavbarInfoMapper, NavbarInfo> implements NavbarInfoService {


    @Override
    public List<NavbarInfo> initNavBarList() {
        return this.list();
    }
}
