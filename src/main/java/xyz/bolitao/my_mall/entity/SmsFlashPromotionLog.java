package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 限时购通知记录
 */
@Data
@TableName(value = "sms_flash_promotion_log")
public class SmsFlashPromotionLog {
    public static final String COL_ID = "id";
    public static final String COL_MEMBER_ID = "member_id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_MEMBER_PHONE = "member_phone";
    public static final String COL_PRODUCT_NAME = "product_name";
    public static final String COL_SUBSCRIBE_TIME = "subscribe_time";
    public static final String COL_SEND_TIME = "send_time";
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;
    @TableField(value = "member_id")
    private Integer memberId;
    @TableField(value = "product_id")
    private Long productId;
    @TableField(value = "member_phone")
    private String memberPhone;
    @TableField(value = "product_name")
    private String productName;
    /**
     * 会员订阅时间
     */
    @TableField(value = "subscribe_time")
    private Date subscribeTime;
    @TableField(value = "send_time")
    private Date sendTime;
}