package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 优惠券使用、领取历史表
 */
@Data
@TableName(value = "sms_coupon_history")
public class SmsCouponHistory {
    public static final String COL_ID = "id";
    public static final String COL_COUPON_ID = "coupon_id";
    public static final String COL_MEMBER_ID = "member_id";
    public static final String COL_COUPON_CODE = "coupon_code";
    public static final String COL_MEMBER_NICKNAME = "member_nickname";
    public static final String COL_GET_TYPE = "get_type";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_USE_STATUS = "use_status";
    public static final String COL_USE_TIME = "use_time";
    public static final String COL_ORDER_ID = "order_id";
    public static final String COL_ORDER_SN = "order_sn";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "coupon_id")
    private Long couponId;
    @TableField(value = "member_id")
    private Long memberId;
    @TableField(value = "coupon_code")
    private String couponCode;
    /**
     * 领取人昵称
     */
    @TableField(value = "member_nickname")
    private String memberNickname;
    /**
     * 获取类型：0->后台赠送；1->主动获取
     */
    @TableField(value = "get_type")
    private Integer getType;
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 使用状态：0->未使用；1->已使用；2->已过期
     */
    @TableField(value = "use_status")
    private Integer useStatus;
    /**
     * 使用时间
     */
    @TableField(value = "use_time")
    private Date useTime;
    /**
     * 订单编号
     */
    @TableField(value = "order_id")
    private Long orderId;
    /**
     * 订单号码
     */
    @TableField(value = "order_sn")
    private String orderSn;
}