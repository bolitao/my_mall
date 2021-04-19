package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠券表
 */
@Data
@TableName(value = "sms_coupon")
public class SmsCoupon {
    public static final String COL_ID = "id";
    public static final String COL_TYPE = "type";
    public static final String COL_NAME = "name";
    public static final String COL_PLATFORM = "platform";
    public static final String COL_COUNT = "count";
    public static final String COL_AMOUNT = "amount";
    public static final String COL_PER_LIMIT = "per_limit";
    public static final String COL_MIN_POINT = "min_point";
    public static final String COL_START_TIME = "start_time";
    public static final String COL_END_TIME = "end_time";
    public static final String COL_USE_TYPE = "use_type";
    public static final String COL_NOTE = "note";
    public static final String COL_PUBLISH_COUNT = "publish_count";
    public static final String COL_USE_COUNT = "use_count";
    public static final String COL_RECEIVE_COUNT = "receive_count";
    public static final String COL_ENABLE_TIME = "enable_time";
    public static final String COL_CODE = "code";
    public static final String COL_MEMBER_LEVEL = "member_level";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 优惠券类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券
     */
    @TableField(value = "`type`")
    private Integer type;
    @TableField(value = "`name`")
    private String name;
    /**
     * 使用平台：0->全部；1->移动；2->PC
     */
    @TableField(value = "platform")
    private Integer platform;
    /**
     * 数量
     */
    @TableField(value = "`count`")
    private Integer count;
    /**
     * 金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;
    /**
     * 每人限领张数
     */
    @TableField(value = "per_limit")
    private Integer perLimit;
    /**
     * 使用门槛；0表示无门槛
     */
    @TableField(value = "min_point")
    private BigDecimal minPoint;
    @TableField(value = "start_time")
    private Date startTime;
    @TableField(value = "end_time")
    private Date endTime;
    /**
     * 使用类型：0->全场通用；1->指定分类；2->指定商品
     */
    @TableField(value = "use_type")
    private Integer useType;
    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;
    /**
     * 发行数量
     */
    @TableField(value = "publish_count")
    private Integer publishCount;
    /**
     * 已使用数量
     */
    @TableField(value = "use_count")
    private Integer useCount;
    /**
     * 领取数量
     */
    @TableField(value = "receive_count")
    private Integer receiveCount;
    /**
     * 可以领取的日期
     */
    @TableField(value = "enable_time")
    private Date enableTime;
    /**
     * 优惠码
     */
    @TableField(value = "code")
    private String code;
    /**
     * 可领取的会员类型：0->无限时
     */
    @TableField(value = "member_level")
    private Integer memberLevel;
}