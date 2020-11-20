package com.wx.mall.service.impl;

import com.wx.mall.entity.MenuInfo;
import com.wx.mall.mapper.MenuInfoMapper;
import com.wx.mall.service.MenuInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 主页菜单 服务实现类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@Service
public class MenuInfoServiceImpl extends ServiceImpl<MenuInfoMapper, MenuInfo> implements MenuInfoService {

    @Override
    public List<MenuInfo> initMenuList() {
        return this.list();
    }
}
