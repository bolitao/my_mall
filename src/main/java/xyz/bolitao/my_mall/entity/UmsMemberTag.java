package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 用户标签表
 */
@Data
@TableName(value = "ums_member_tag")
public class UmsMemberTag {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_FINISH_ORDER_COUNT = "finish_order_count";
    public static final String COL_FINISH_ORDER_AMOUNT = "finish_order_amount";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "`name`")
    private String name;
    /**
     * 自动打标签完成订单数量
     */
    @TableField(value = "finish_order_count")
    private Integer finishOrderCount;
    /**
     * 自动打标签完成订单金额
     */
    @TableField(value = "finish_order_amount")
    private BigDecimal finishOrderAmount;
}