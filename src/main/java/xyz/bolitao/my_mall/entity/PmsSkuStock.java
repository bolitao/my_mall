package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * sku的库存
 */
@Data
@TableName(value = "pms_sku_stock")
public class PmsSkuStock {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_SKU_CODE = "sku_code";
    public static final String COL_PRICE = "price";
    public static final String COL_STOCK = "stock";
    public static final String COL_LOW_STOCK = "low_stock";
    public static final String COL_PIC = "pic";
    public static final String COL_SALE = "sale";
    public static final String COL_PROMOTION_PRICE = "promotion_price";
    public static final String COL_LOCK_STOCK = "lock_stock";
    public static final String COL_SP_DATA = "sp_data";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_id")
    private Long productId;
    /**
     * sku编码
     */
    @TableField(value = "sku_code")
    private String skuCode;
    @TableField(value = "price")
    private BigDecimal price;
    /**
     * 库存
     */
    @TableField(value = "stock")
    private Integer stock;
    /**
     * 预警库存
     */
    @TableField(value = "low_stock")
    private Integer lowStock;
    /**
     * 展示图片
     */
    @TableField(value = "pic")
    private String pic;
    /**
     * 销量
     */
    @TableField(value = "sale")
    private Integer sale;
    /**
     * 单品促销价格
     */
    @TableField(value = "promotion_price")
    private BigDecimal promotionPrice;
    /**
     * 锁定库存
     */
    @TableField(value = "lock_stock")
    private Integer lockStock;
    /**
     * 商品销售属性，json格式
     */
    @TableField(value = "sp_data")
    private String spData;
}