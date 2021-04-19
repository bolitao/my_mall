package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品会员价格表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-PmsMemberPrice")
@Data
@TableName(value = "pms_member_price")
public class PmsMemberPrice {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value = "")
    private Long productId;

    @TableField(value = "member_level_id")
    @ApiModelProperty(value = "")
    private Long memberLevelId;

    /**
     * 会员价格
     */
    @TableField(value = "member_price")
    @ApiModelProperty(value = "会员价格")
    private BigDecimal memberPrice;

    @TableField(value = "member_level_name")
    @ApiModelProperty(value = "")
    private String memberLevelName;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_MEMBER_LEVEL_ID = "member_level_id";

    public static final String COL_MEMBER_PRICE = "member_price";

    public static final String COL_MEMBER_LEVEL_NAME = "member_level_name";
}