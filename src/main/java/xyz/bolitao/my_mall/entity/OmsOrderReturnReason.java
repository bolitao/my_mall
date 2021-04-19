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
 * 退货原因表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-OmsOrderReturnReason")
@Data
@TableName(value = "oms_order_return_reason")
public class OmsOrderReturnReason {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * 退货类型
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "退货类型")
    private String name;

    @TableField(value = "sort")
    @ApiModelProperty(value = "")
    private Integer sort;

    /**
     * 状态：0->不启用；1->启用
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value = "状态：0->不启用；1->启用")
    private Integer status;

    /**
     * 添加时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value = "添加时间")
    private Date createTime;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_SORT = "sort";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATE_TIME = "create_time";
}