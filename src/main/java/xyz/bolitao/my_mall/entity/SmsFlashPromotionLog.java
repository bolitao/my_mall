package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 限时购通知记录
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-SmsFlashPromotionLog")
@Data
@TableName(value = "sms_flash_promotion_log")
public class SmsFlashPromotionLog {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "member_id")
    @ApiModelProperty(value = "")
    private Integer memberId;

    @TableField(value = "product_id")
    @ApiModelProperty(value = "")
    private Long productId;

    @TableField(value = "member_phone")
    @ApiModelProperty(value = "")
    private String memberPhone;

    @TableField(value = "product_name")
    @ApiModelProperty(value = "")
    private String productName;

    /**
     * 会员订阅时间
     */
    @TableField(value = "subscribe_time")
    @ApiModelProperty(value = "会员订阅时间")
    private Date subscribeTime;

    @TableField(value = "send_time")
    @ApiModelProperty(value = "")
    private Date sendTime;

    public static final String COL_ID = "id";

    public static final String COL_MEMBER_ID = "member_id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_MEMBER_PHONE = "member_phone";

    public static final String COL_PRODUCT_NAME = "product_name";

    public static final String COL_SUBSCRIBE_TIME = "subscribe_time";

    public static final String COL_SEND_TIME = "send_time";
}