package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 话题表
 */
@Data
@TableName(value = "cms_topic")
public class CmsTopic {
    public static final String COL_ID = "id";
    public static final String COL_CATEGORY_ID = "category_id";
    public static final String COL_NAME = "name";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_START_TIME = "start_time";
    public static final String COL_END_TIME = "end_time";
    public static final String COL_ATTEND_COUNT = "attend_count";
    public static final String COL_ATTENTION_COUNT = "attention_count";
    public static final String COL_READ_COUNT = "read_count";
    public static final String COL_AWARD_NAME = "award_name";
    public static final String COL_ATTEND_TYPE = "attend_type";
    public static final String COL_CONTENT = "content";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "category_id")
    private Long categoryId;
    @TableField(value = "`name`")
    private String name;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "start_time")
    private Date startTime;
    @TableField(value = "end_time")
    private Date endTime;
    /**
     * 参与人数
     */
    @TableField(value = "attend_count")
    private Integer attendCount;
    /**
     * 关注人数
     */
    @TableField(value = "attention_count")
    private Integer attentionCount;
    @TableField(value = "read_count")
    private Integer readCount;
    /**
     * 奖品名称
     */
    @TableField(value = "award_name")
    private String awardName;
    /**
     * 参与方式
     */
    @TableField(value = "attend_type")
    private String attendType;
    /**
     * 话题内容
     */
    @TableField(value = "content")
    private String content;
}