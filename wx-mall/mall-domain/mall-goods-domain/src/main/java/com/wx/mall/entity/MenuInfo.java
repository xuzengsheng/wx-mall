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
 * 主页菜单
 * </p>
 *
 * @author Monroe
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MenuInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单名称
     */
    @TableField("menuName")
    private String menuName;

    /**
     * 菜单图片地址
     */
    @TableField("imgUrl")
    private String imgUrl;

    /**
     * 点击菜单跳转地址
     */
    @TableField("clickUrl")
    private String clickUrl;

    /**
     * 排序号
     */
    private Integer seq;


}
