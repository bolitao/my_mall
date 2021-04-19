package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 首页轮播广告表
 */
@Data
@TableName(value = "sms_home_advertise")
public class SmsHomeAdvertise {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_TYPE = "type";
    public static final String COL_PIC = "pic";
    public static final String COL_START_TIME = "start_time";
    public static final String COL_END_TIME = "end_time";
    public static final String COL_STATUS = "status";
    public static final String COL_CLICK_COUNT = "click_count";
    public static final String COL_ORDER_COUNT = "order_count";
    public static final String COL_URL = "url";
    public static final String COL_NOTE = "note";
    public static final String COL_SORT = "sort";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "`name`")
    private String name;
    /**
     * 轮播位置：0->PC首页轮播；1->app首页轮播
     */
    @TableField(value = "`type`")
    private Integer type;
    @TableField(value = "pic")
    private String pic;
    @TableField(value = "start_time")
    private Date startTime;
    @TableField(value = "end_time")
    private Date endTime;
    /**
     * 上下线状态：0->下线；1->上线
     */
    @TableField(value = "`status`")
    private Integer status;
    /**
     * 点击数
     */
    @TableField(value = "click_count")
    private Integer clickCount;
    /**
     * 下单数
     */
    @TableField(value = "order_count")
    private Integer orderCount;
    /**
     * 链接地址
     */
    @TableField(value = "url")
    private String url;
    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;
    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;
}