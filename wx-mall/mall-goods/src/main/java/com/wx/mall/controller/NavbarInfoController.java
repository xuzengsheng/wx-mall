package com.wx.mall.controller;


import com.wx.mall.custom.BaseResponse;
import com.wx.mall.entity.NavbarInfo;
import com.wx.mall.service.NavbarInfoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 导航条 前端控制器
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/navbarInfo")
public class NavbarInfoController {

    @Autowired
    NavbarInfoService navbarInfoService;

    @GetMapping("/initNavBar")
    public BaseResponse initNavBar() {
        List<NavbarInfo> navbarInfos = navbarInfoService.initNavBarList();
        if (CollectionUtils.isEmpty(navbarInfos)) {
            return BaseResponse.fail("未查询到导航条信息");
        }
        return BaseResponse.success(navbarInfos);
    }
}
