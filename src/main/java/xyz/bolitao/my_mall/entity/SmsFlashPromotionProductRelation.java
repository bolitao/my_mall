package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品限时购与商品关系表
 */
@Data
@TableName(value = "sms_flash_promotion_product_relation")
public class SmsFlashPromotionProductRelation {
    public static final String COL_ID = "id";
    public static final String COL_FLASH_PROMOTION_ID = "flash_promotion_id";
    public static final String COL_FLASH_PROMOTION_SESSION_ID = "flash_promotion_session_id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_FLASH_PROMOTION_PRICE = "flash_promotion_price";
    public static final String COL_FLASH_PROMOTION_COUNT = "flash_promotion_count";
    public static final String COL_FLASH_PROMOTION_LIMIT = "flash_promotion_limit";
    public static final String COL_SORT = "sort";
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "flash_promotion_id")
    private Long flashPromotionId;
    /**
     * 编号
     */
    @TableField(value = "flash_promotion_session_id")
    private Long flashPromotionSessionId;
    @TableField(value = "product_id")
    private Long productId;
    /**
     * 限时购价格
     */
    @TableField(value = "flash_promotion_price")
    private BigDecimal flashPromotionPrice;
    /**
     * 限时购数量
     */
    @TableField(value = "flash_promotion_count")
    private Integer flashPromotionCount;
    /**
     * 每人限购数量
     */
    @TableField(value = "flash_promotion_limit")
    private Integer flashPromotionLimit;
    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;
}