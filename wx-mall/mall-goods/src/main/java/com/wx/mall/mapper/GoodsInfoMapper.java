package com.wx.mall.mapper;

import com.wx.mall.entity.GoodsInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 商品信息 Mapper 接口
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
public interface GoodsInfoMapper extends BaseMapper<GoodsInfo> {

    Integer updateClickRateById(@Param("id") Integer id);
}
