package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 优惠券和产品分类关系表
 */
@Data
@TableName(value = "sms_coupon_product_category_relation")
public class SmsCouponProductCategoryRelation {
    public static final String COL_ID = "id";
    public static final String COL_COUPON_ID = "coupon_id";
    public static final String COL_PRODUCT_CATEGORY_ID = "product_category_id";
    public static final String COL_PRODUCT_CATEGORY_NAME = "product_category_name";
    public static final String COL_PARENT_CATEGORY_NAME = "parent_category_name";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "coupon_id")
    private Long couponId;
    @TableField(value = "product_category_id")
    private Long productCategoryId;
    /**
     * 产品分类名称
     */
    @TableField(value = "product_category_name")
    private String productCategoryName;
    /**
     * 父分类名称
     */
    @TableField(value = "parent_category_name")
    private String parentCategoryName;
}