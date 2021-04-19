package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-PmsProductCategoryAttributeRelation")
@Data
@TableName(value = "pms_product_category_attribute_relation")
public class PmsProductCategoryAttributeRelation {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "product_category_id")
    @ApiModelProperty(value = "")
    private Long productCategoryId;

    @TableField(value = "product_attribute_id")
    @ApiModelProperty(value = "")
    private Long productAttributeId;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_CATEGORY_ID = "product_category_id";

    public static final String COL_PRODUCT_ATTRIBUTE_ID = "product_attribute_id";
}