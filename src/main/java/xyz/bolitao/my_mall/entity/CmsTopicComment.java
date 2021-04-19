package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 专题评论表
 */
@Data
@TableName(value = "cms_topic_comment")
public class CmsTopicComment {
    public static final String COL_ID = "id";
    public static final String COL_MEMBER_NICK_NAME = "member_nick_name";
    public static final String COL_TOPIC_ID = "topic_id";
    public static final String COL_MEMBER_ICON = "member_icon";
    public static final String COL_CONTENT = "content";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_SHOW_STATUS = "show_status";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "member_nick_name")
    private String memberNickName;
    @TableField(value = "topic_id")
    private Long topicId;
    @TableField(value = "member_icon")
    private String memberIcon;
    @TableField(value = "content")
    private String content;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "show_status")
    private Integer showStatus;
}