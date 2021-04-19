package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 产品满减表(只针对同商品)
 */
@Data
@TableName(value = "pms_product_full_reduction")
public class PmsProductFullReduction {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_FULL_PRICE = "full_price";
    public static final String COL_REDUCE_PRICE = "reduce_price";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_id")
    private Long productId;
    @TableField(value = "full_price")
    private BigDecimal fullPrice;
    @TableField(value = "reduce_price")
    private BigDecimal reducePrice;
}