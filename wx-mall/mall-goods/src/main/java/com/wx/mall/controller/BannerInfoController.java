package com.wx.mall.controller;


import com.wx.mall.custom.BaseResponse;
import com.wx.mall.entity.BannerInfo;
import com.wx.mall.service.BannerInfoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 轮播图 前端控制器
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/bannerInfo")
public class BannerInfoController {
    @Autowired
    BannerInfoService bannerInfoService;

    @GetMapping("/initBannerList")
    public BaseResponse initBannerList() {
        List<BannerInfo> list = bannerInfoService.initBannerList();
        if (CollectionUtils.isEmpty(list)) {
            return BaseResponse.fail("未查询到轮播图信息");
        }
        return BaseResponse.success(list);
    }

}
