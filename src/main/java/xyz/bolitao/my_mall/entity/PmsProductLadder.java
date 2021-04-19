package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 产品阶梯价格表(只针对同商品)
 */
@Data
@TableName(value = "pms_product_ladder")
public class PmsProductLadder {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_COUNT = "count";
    public static final String COL_DISCOUNT = "discount";
    public static final String COL_PRICE = "price";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_id")
    private Long productId;
    /**
     * 满足的商品数量
     */
    @TableField(value = "`count`")
    private Integer count;
    /**
     * 折扣
     */
    @TableField(value = "discount")
    private BigDecimal discount;
    /**
     * 折后价格
     */
    @TableField(value = "price")
    private BigDecimal price;
}