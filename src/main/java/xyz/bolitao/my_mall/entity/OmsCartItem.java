package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 购物车表
 */
@Data
@TableName(value = "oms_cart_item")
public class OmsCartItem {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_PRODUCT_SKU_ID = "product_sku_id";
    public static final String COL_MEMBER_ID = "member_id";
    public static final String COL_QUANTITY = "quantity";
    public static final String COL_PRICE = "price";
    public static final String COL_PRODUCT_PIC = "product_pic";
    public static final String COL_PRODUCT_NAME = "product_name";
    public static final String COL_PRODUCT_SUB_TITLE = "product_sub_title";
    public static final String COL_PRODUCT_SKU_CODE = "product_sku_code";
    public static final String COL_MEMBER_NICKNAME = "member_nickname";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_MODIFY_DATE = "modify_date";
    public static final String COL_DELETE_STATUS = "delete_status";
    public static final String COL_PRODUCT_CATEGORY_ID = "product_category_id";
    public static final String COL_PRODUCT_BRAND = "product_brand";
    public static final String COL_PRODUCT_SN = "product_sn";
    public static final String COL_PRODUCT_ATTR = "product_attr";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_id")
    private Long productId;
    @TableField(value = "product_sku_id")
    private Long productSkuId;
    @TableField(value = "member_id")
    private Long memberId;
    /**
     * 购买数量
     */
    @TableField(value = "quantity")
    private Integer quantity;
    /**
     * 添加到购物车的价格
     */
    @TableField(value = "price")
    private BigDecimal price;
    /**
     * 商品主图
     */
    @TableField(value = "product_pic")
    private String productPic;
    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    private String productName;
    /**
     * 商品副标题（卖点）
     */
    @TableField(value = "product_sub_title")
    private String productSubTitle;
    /**
     * 商品sku条码
     */
    @TableField(value = "product_sku_code")
    private String productSkuCode;
    /**
     * 会员昵称
     */
    @TableField(value = "member_nickname")
    private String memberNickname;
    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Date createDate;
    /**
     * 修改时间
     */
    @TableField(value = "modify_date")
    private Date modifyDate;
    /**
     * 是否删除
     */
    @TableField(value = "delete_status")
    private Integer deleteStatus;
    /**
     * 商品分类
     */
    @TableField(value = "product_category_id")
    private Long productCategoryId;
    @TableField(value = "product_brand")
    private String productBrand;
    @TableField(value = "product_sn")
    private String productSn;
    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @TableField(value = "product_attr")
    private String productAttr;
}