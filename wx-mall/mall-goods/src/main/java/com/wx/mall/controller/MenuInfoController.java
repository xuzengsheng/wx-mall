package com.wx.mall.controller;


import com.wx.mall.custom.BaseResponse;
import com.wx.mall.entity.MenuInfo;
import com.wx.mall.service.MenuInfoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 主页菜单 前端控制器
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/menuInfo")
public class MenuInfoController {
    @Autowired
    MenuInfoService menuInfoService;

    @GetMapping("/initMenu")
    public BaseResponse initMenu() {
        List<MenuInfo> list = menuInfoService.initMenuList();
        if (CollectionUtils.isEmpty(list)) {
            return BaseResponse.fail("未查询到菜单信息");
        }
        return BaseResponse.success(list);
    }
}
