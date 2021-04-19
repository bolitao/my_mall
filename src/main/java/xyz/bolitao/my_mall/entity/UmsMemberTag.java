package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 用户标签表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-UmsMemberTag")
@Data
@TableName(value = "ums_member_tag")
public class UmsMemberTag {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "`name`")
    @ApiModelProperty(value = "")
    private String name;

    /**
     * 自动打标签完成订单数量
     */
    @TableField(value = "finish_order_count")
    @ApiModelProperty(value = "自动打标签完成订单数量")
    private Integer finishOrderCount;

    /**
     * 自动打标签完成订单金额
     */
    @TableField(value = "finish_order_amount")
    @ApiModelProperty(value = "自动打标签完成订单金额")
    private BigDecimal finishOrderAmount;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_FINISH_ORDER_COUNT = "finish_order_count";

    public static final String COL_FINISH_ORDER_AMOUNT = "finish_order_amount";
}