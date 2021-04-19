package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 退货原因表
 */
@Data
@TableName(value = "oms_order_return_reason")
public class OmsOrderReturnReason {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_SORT = "sort";
    public static final String COL_STATUS = "status";
    public static final String COL_CREATE_TIME = "create_time";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 退货类型
     */
    @TableField(value = "`name`")
    private String name;
    @TableField(value = "sort")
    private Integer sort;
    /**
     * 状态：0->不启用；1->启用
     */
    @TableField(value = "`status`")
    private Integer status;
    /**
     * 添加时间
     */
    @TableField(value = "create_time")
    private Date createTime;
}