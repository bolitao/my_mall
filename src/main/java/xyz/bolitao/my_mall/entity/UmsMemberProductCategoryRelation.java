package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-UmsMemberProductCategoryRelation")
@Data
@TableName(value = "ums_member_product_category_relation")
public class UmsMemberProductCategoryRelation {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value = "")
    private Long memberId;

    @TableField(value = "product_category_id")
    @ApiModelProperty(value = "")
    private Long productCategoryId;

    public static final String COL_ID = "id";

    public static final String COL_MEMBER_ID = "member_id";

    public static final String COL_PRODUCT_CATEGORY_ID = "product_category_id";
}