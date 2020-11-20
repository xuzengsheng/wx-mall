package com.wx.mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 轮播图
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BannerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 轮播图名称
     */
    @TableField("bannerName")
    private String bannerName;

    /**
     * 轮播图图片地址
     */
    @TableField("imgUrl")
    private String imgUrl;

    /**
     * 点击链接地址
     */
    @TableField("clickUrl")
    private String clickUrl;

    /**
     * 轮播图排序号
     */
    private Integer seq;


}
