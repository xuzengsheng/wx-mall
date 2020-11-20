package com.wx.mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品信息
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品实际价格
     */
    private BigDecimal price;

    /**
     * 商品原价
     */
    @TableField("privilegePrice")
    private BigDecimal privilegePrice;

    /**
     * 商品图片地址
     */
    @TableField("imgUrl")
    private String imgUrl;

    /**
     * 商品图片地址
     */
    @TableField("imgUrls")
    private String imgUrls;

    /**
     * 查看详细图片地址
     */
    private String details;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    @TableField("createDate")
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    @TableField("updateDate")
    private LocalDateTime updateDate;

    /**
     * 点击量
     */
    @TableField("clickRate")
    private Long clickRate;

    /**
     * 购买量
     */
    @TableField("buyRate")
    private Long buyRate;

    /**
     * 库存量
     */
    private Integer stock;

    /**
     * 是否热销， 0 否 ；1是
     */
    @TableField("isHot")
    private Integer isHot;

    /**
     * 是否新品  0否 1是
     */
    @TableField("isNew")
    private Integer isNew;

    /**
     * 所属类别id
     */
    @TableField("classifyId")
    private String classifyId;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 参与活动的id
     */
    @TableField("activityId")
    private String activityId;

    /**
     * 商品描述
     */
    private String description;


}
