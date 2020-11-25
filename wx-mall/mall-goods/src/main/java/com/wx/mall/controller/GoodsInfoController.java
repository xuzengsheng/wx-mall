package com.wx.mall.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wx.mall.custom.BaseResponse;
import com.wx.mall.entity.GoodsInfo;
import com.wx.mall.service.GoodsInfoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品信息 前端控制器
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/goodsInfo")
public class GoodsInfoController {

    @Autowired
    GoodsInfoService goodsInfoService;

    @GetMapping("/initGoods")
    public BaseResponse initMenu() {
        List<GoodsInfo> list = goodsInfoService.initGoods();
        if (CollectionUtils.isEmpty(list)) {
            return BaseResponse.fail("未查询到物品信息");
        }
        return BaseResponse.success(list);
    }

    /**
     * 更新点击量
     *
     * @return
     */
    @GetMapping("/updateClickRate")
    public BaseResponse updateClickRate(@RequestParam("id") Integer id) {
        if (id == null || id == 0) {
            return BaseResponse.fail("参数为空");
        }
        Integer result = goodsInfoService.updateClickRateById(id);
        if (result == null || result <= 0) {
            return BaseResponse.fail("点击量更新失败,goods_id = " + id);
        }
        return BaseResponse.success("点击量+1");
    }

    @GetMapping("/getInfoById")
    public BaseResponse getInfoById(@RequestParam("id") Integer id) {
        if (id == null || id == 0) {
            return BaseResponse.fail("参数为空");
        }
        GoodsInfo goodsInfo = goodsInfoService.getById(id);
        if (goodsInfo == null) {
            return BaseResponse.fail("未查询到相关商品,goods_id = " + id);
        }
        return BaseResponse.success(goodsInfo);
    }

    @GetMapping("/getGoodsByClassifyId")
    public BaseResponse getGoodsByClassifyId(@RequestParam("classifyId") Integer classifyId) {
        if (classifyId == null || classifyId == 0) {
            return BaseResponse.fail("参数为空");
        }
        List<GoodsInfo> list = goodsInfoService.list(new QueryWrapper<GoodsInfo>().lambda().eq(GoodsInfo::getClassifyId, classifyId));

        return BaseResponse.success(list);
    }


}
