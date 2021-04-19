package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 订单设置表
 */
@Data
@TableName(value = "oms_order_setting")
public class OmsOrderSetting {
    public static final String COL_ID = "id";
    public static final String COL_FLASH_ORDER_OVERTIME = "flash_order_overtime";
    public static final String COL_NORMAL_ORDER_OVERTIME = "normal_order_overtime";
    public static final String COL_CONFIRM_OVERTIME = "confirm_overtime";
    public static final String COL_FINISH_OVERTIME = "finish_overtime";
    public static final String COL_COMMENT_OVERTIME = "comment_overtime";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 秒杀订单超时关闭时间(分)
     */
    @TableField(value = "flash_order_overtime")
    private Integer flashOrderOvertime;
    /**
     * 正常订单超时时间(分)
     */
    @TableField(value = "normal_order_overtime")
    private Integer normalOrderOvertime;
    /**
     * 发货后自动确认收货时间（天）
     */
    @TableField(value = "confirm_overtime")
    private Integer confirmOvertime;
    /**
     * 自动完成交易时间，不能申请售后（天）
     */
    @TableField(value = "finish_overtime")
    private Integer finishOvertime;
    /**
     * 订单完成后自动好评时间（天）
     */
    @TableField(value = "comment_overtime")
    private Integer commentOvertime;
}