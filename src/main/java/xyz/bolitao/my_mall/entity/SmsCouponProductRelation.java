package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 优惠券和产品的关系表
 */
@Data
@TableName(value = "sms_coupon_product_relation")
public class SmsCouponProductRelation {
    public static final String COL_ID = "id";
    public static final String COL_COUPON_ID = "coupon_id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_PRODUCT_NAME = "product_name";
    public static final String COL_PRODUCT_SN = "product_sn";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "coupon_id")
    private Long couponId;
    @TableField(value = "product_id")
    private Long productId;
    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    private String productName;
    /**
     * 商品编码
     */
    @TableField(value = "product_sn")
    private String productSn;
}