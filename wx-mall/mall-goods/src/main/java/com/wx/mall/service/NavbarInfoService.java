package com.wx.mall.service;

import com.wx.mall.entity.NavbarInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 导航条 服务类
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
public interface NavbarInfoService extends IService<NavbarInfo> {

    List<NavbarInfo> initNavBarList();

}
