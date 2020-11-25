package com.wx.mall.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wx.mall.custom.BaseResponse;
import com.wx.mall.entity.ClassfyInfo;
import com.wx.mall.helper.TreeBuilder;
import com.wx.mall.service.ClassfyInfoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品分类 前端控制器
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/classfyInfo")
public class ClassfyInfoController {

    @Autowired
    ClassfyInfoService classfyInfoService;

    @GetMapping("/initClassfy")
    public BaseResponse initClassfy() {
        //初始化分类信息，只查询一级菜单
//        List<ClassfyInfo> firstMenu = classfyInfoService.list(new QueryWrapper<ClassfyInfo>().lambda().eq(ClassfyInfo::getParentId,0));
        List<ClassfyInfo> firstMenu = classfyInfoService.list();

        if (CollectionUtils.isEmpty(firstMenu)) {
            return BaseResponse.fail("未查询到分类信息");
        }

        JSONArray array = TreeBuilder.listToTree(JSONObject.parseArray(JSON.toJSONString(firstMenu)), "id", "parentId", "children");
        List<ClassfyInfo> resultList = JSONObject.parseArray(array.toJSONString(), ClassfyInfo.class);

//        //获取第一个的id，查询是否有二级菜单
//        Integer id = firstMenu.get(0).getId();
//        List<ClassfyInfo> secondMenu = classfyInfoService.list(new QueryWrapper<ClassfyInfo>().lambda().eq(ClassfyInfo::getParentId, id));
//        if(CollectionUtils.isNotEmpty(secondMenu)){
//            firstMenu.get(0).setChildren(secondMenu);
//        }

//        return BaseResponse.success(firstMenu);
        return BaseResponse.success(resultList);
    }


}
