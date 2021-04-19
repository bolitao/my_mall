package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 限时购场次表
 */
@Data
@TableName(value = "sms_flash_promotion_session")
public class SmsFlashPromotionSession {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_START_TIME = "start_time";
    public static final String COL_END_TIME = "end_time";
    public static final String COL_STATUS = "status";
    public static final String COL_CREATE_TIME = "create_time";
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 场次名称
     */
    @TableField(value = "`name`")
    private String name;
    /**
     * 每日开始时间
     */
    @TableField(value = "start_time")
    private Date startTime;
    /**
     * 每日结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;
    /**
     * 启用状态：0->不启用；1->启用
     */
    @TableField(value = "`status`")
    private Integer status;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;
}