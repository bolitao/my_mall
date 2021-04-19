package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 订单操作历史记录
 */
@Data
@TableName(value = "oms_order_operate_history")
public class OmsOrderOperateHistory {
    public static final String COL_ID = "id";
    public static final String COL_ORDER_ID = "order_id";
    public static final String COL_OPERATE_MAN = "operate_man";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_ORDER_STATUS = "order_status";
    public static final String COL_NOTE = "note";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Long orderId;
    /**
     * 操作人：用户；系统；后台管理员
     */
    @TableField(value = "operate_man")
    private String operateMan;
    /**
     * 操作时间
     */
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    @TableField(value = "order_status")
    private Integer orderStatus;
    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;
}