package com.wx.mall.controller;


import com.wx.mall.custom.BaseResponse;
import com.wx.mall.entity.BrandInfo;
import com.wx.mall.service.BrandInfoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 品牌特卖 前端控制器
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/brandInfo")
public class BrandInfoController {

    @Autowired
    BrandInfoService brandInfoService;

    @GetMapping("/initBrand")
    public BaseResponse initBrand() {
        List<BrandInfo> list = brandInfoService.initBrandList();
        if (CollectionUtils.isEmpty(list)) {
            return BaseResponse.fail("未查询到品牌信息");
        }
        return BaseResponse.success(list);
    }

}
