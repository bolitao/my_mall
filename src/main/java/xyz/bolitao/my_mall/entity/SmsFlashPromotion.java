package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 限时购表
 */
@Data
@TableName(value = "sms_flash_promotion")
public class SmsFlashPromotion {
    public static final String COL_ID = "id";
    public static final String COL_TITLE = "title";
    public static final String COL_START_DATE = "start_date";
    public static final String COL_END_DATE = "end_date";
    public static final String COL_STATUS = "status";
    public static final String COL_CREATE_TIME = "create_time";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "title")
    private String title;
    /**
     * 开始日期
     */
    @TableField(value = "start_date")
    private Date startDate;
    /**
     * 结束日期
     */
    @TableField(value = "end_date")
    private Date endDate;
    /**
     * 上下线状态
     */
    @TableField(value = "`status`")
    private Integer status;
    /**
     * 秒杀时间段名称
     */
    @TableField(value = "create_time")
    private Date createTime;
}