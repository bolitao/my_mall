package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName(value = "pms_product_operate_log")
public class PmsProductOperateLog {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_PRICE_OLD = "price_old";
    public static final String COL_PRICE_NEW = "price_new";
    public static final String COL_SALE_PRICE_OLD = "sale_price_old";
    public static final String COL_SALE_PRICE_NEW = "sale_price_new";
    public static final String COL_GIFT_POINT_OLD = "gift_point_old";
    public static final String COL_GIFT_POINT_NEW = "gift_point_new";
    public static final String COL_USE_POINT_LIMIT_OLD = "use_point_limit_old";
    public static final String COL_USE_POINT_LIMIT_NEW = "use_point_limit_new";
    public static final String COL_OPERATE_MAN = "operate_man";
    public static final String COL_CREATE_TIME = "create_time";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_id")
    private Long productId;
    @TableField(value = "price_old")
    private BigDecimal priceOld;
    @TableField(value = "price_new")
    private BigDecimal priceNew;
    @TableField(value = "sale_price_old")
    private BigDecimal salePriceOld;
    @TableField(value = "sale_price_new")
    private BigDecimal salePriceNew;
    /**
     * 赠送的积分
     */
    @TableField(value = "gift_point_old")
    private Integer giftPointOld;
    @TableField(value = "gift_point_new")
    private Integer giftPointNew;
    @TableField(value = "use_point_limit_old")
    private Integer usePointLimitOld;
    @TableField(value = "use_point_limit_new")
    private Integer usePointLimitNew;
    /**
     * 操作人
     */
    @TableField(value = "operate_man")
    private String operateMan;
    @TableField(value = "create_time")
    private Date createTime;
}