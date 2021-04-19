package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单退货申请
 */
@Data
@TableName(value = "oms_order_return_apply")
public class OmsOrderReturnApply {
    public static final String COL_ID = "id";
    public static final String COL_ORDER_ID = "order_id";
    public static final String COL_COMPANY_ADDRESS_ID = "company_address_id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_ORDER_SN = "order_sn";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_MEMBER_USERNAME = "member_username";
    public static final String COL_RETURN_AMOUNT = "return_amount";
    public static final String COL_RETURN_NAME = "return_name";
    public static final String COL_RETURN_PHONE = "return_phone";
    public static final String COL_STATUS = "status";
    public static final String COL_HANDLE_TIME = "handle_time";
    public static final String COL_PRODUCT_PIC = "product_pic";
    public static final String COL_PRODUCT_NAME = "product_name";
    public static final String COL_PRODUCT_BRAND = "product_brand";
    public static final String COL_PRODUCT_ATTR = "product_attr";
    public static final String COL_PRODUCT_COUNT = "product_count";
    public static final String COL_PRODUCT_PRICE = "product_price";
    public static final String COL_PRODUCT_REAL_PRICE = "product_real_price";
    public static final String COL_REASON = "reason";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_PROOF_PICS = "proof_pics";
    public static final String COL_HANDLE_NOTE = "handle_note";
    public static final String COL_HANDLE_MAN = "handle_man";
    public static final String COL_RECEIVE_MAN = "receive_man";
    public static final String COL_RECEIVE_TIME = "receive_time";
    public static final String COL_RECEIVE_NOTE = "receive_note";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Long orderId;
    /**
     * 收货地址表id
     */
    @TableField(value = "company_address_id")
    private Long companyAddressId;
    /**
     * 退货商品id
     */
    @TableField(value = "product_id")
    private Long productId;
    /**
     * 订单编号
     */
    @TableField(value = "order_sn")
    private String orderSn;
    /**
     * 申请时间
     */
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 会员用户名
     */
    @TableField(value = "member_username")
    private String memberUsername;
    /**
     * 退款金额
     */
    @TableField(value = "return_amount")
    private BigDecimal returnAmount;
    /**
     * 退货人姓名
     */
    @TableField(value = "return_name")
    private String returnName;
    /**
     * 退货人电话
     */
    @TableField(value = "return_phone")
    private String returnPhone;
    /**
     * 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
     */
    @TableField(value = "`status`")
    private Integer status;
    /**
     * 处理时间
     */
    @TableField(value = "handle_time")
    private Date handleTime;
    /**
     * 商品图片
     */
    @TableField(value = "product_pic")
    private String productPic;
    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    private String productName;
    /**
     * 商品品牌
     */
    @TableField(value = "product_brand")
    private String productBrand;
    /**
     * 商品销售属性：颜色：红色；尺码：xl;
     */
    @TableField(value = "product_attr")
    private String productAttr;
    /**
     * 退货数量
     */
    @TableField(value = "product_count")
    private Integer productCount;
    /**
     * 商品单价
     */
    @TableField(value = "product_price")
    private BigDecimal productPrice;
    /**
     * 商品实际支付单价
     */
    @TableField(value = "product_real_price")
    private BigDecimal productRealPrice;
    /**
     * 原因
     */
    @TableField(value = "reason")
    private String reason;
    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;
    /**
     * 凭证图片，以逗号隔开
     */
    @TableField(value = "proof_pics")
    private String proofPics;
    /**
     * 处理备注
     */
    @TableField(value = "handle_note")
    private String handleNote;
    /**
     * 处理人员
     */
    @TableField(value = "handle_man")
    private String handleMan;
    /**
     * 收货人
     */
    @TableField(value = "receive_man")
    private String receiveMan;
    /**
     * 收货时间
     */
    @TableField(value = "receive_time")
    private Date receiveTime;
    /**
     * 收货备注
     */
    @TableField(value = "receive_note")
    private String receiveNote;
}