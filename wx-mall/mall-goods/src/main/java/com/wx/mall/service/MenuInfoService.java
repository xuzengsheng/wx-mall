package com.wx.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.mall.entity.MenuInfo;

import java.util.List;

/**
 * <p>
 * 主页菜单 服务类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
public interface MenuInfoService extends IService<MenuInfo> {

    List<MenuInfo> initMenuList();

}
