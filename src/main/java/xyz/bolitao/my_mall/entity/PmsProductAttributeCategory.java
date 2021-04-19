package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 产品属性分类表
 */
@Data
@TableName(value = "pms_product_attribute_category")
public class PmsProductAttributeCategory {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_ATTRIBUTE_COUNT = "attribute_count";
    public static final String COL_PARAM_COUNT = "param_count";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "`name`")
    private String name;
    /**
     * 属性数量
     */
    @TableField(value = "attribute_count")
    private Integer attributeCount;
    /**
     * 参数数量
     */
    @TableField(value = "param_count")
    private Integer paramCount;
}