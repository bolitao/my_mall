package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 优选专区和产品关系表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-CmsPrefrenceAreaProductRelation")
@Data
@TableName(value = "cms_prefrence_area_product_relation")
public class CmsPrefrenceAreaProductRelation {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "prefrence_area_id")
    @ApiModelProperty(value = "")
    private Long prefrenceAreaId;

    @TableField(value = "product_id")
    @ApiModelProperty(value = "")
    private Long productId;

    public static final String COL_ID = "id";

    public static final String COL_PREFRENCE_AREA_ID = "prefrence_area_id";

    public static final String COL_PRODUCT_ID = "product_id";
}