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
 * 产品满减表(只针对同商品)
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-PmsProductFullReduction")
@Data
@TableName(value = "pms_product_full_reduction")
public class PmsProductFullReduction {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value = "")
    private Long productId;

    @TableField(value = "full_price")
    @ApiModelProperty(value = "")
    private BigDecimal fullPrice;

    @TableField(value = "reduce_price")
    @ApiModelProperty(value = "")
    private BigDecimal reducePrice;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_FULL_PRICE = "full_price";

    public static final String COL_REDUCE_PRICE = "reduce_price";
}