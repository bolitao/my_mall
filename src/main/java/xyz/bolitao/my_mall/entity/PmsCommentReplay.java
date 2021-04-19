package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 产品评价回复表
 */
@Data
@TableName(value = "pms_comment_replay")
public class PmsCommentReplay {
    public static final String COL_ID = "id";
    public static final String COL_COMMENT_ID = "comment_id";
    public static final String COL_MEMBER_NICK_NAME = "member_nick_name";
    public static final String COL_MEMBER_ICON = "member_icon";
    public static final String COL_CONTENT = "content";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_TYPE = "type";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "comment_id")
    private Long commentId;
    @TableField(value = "member_nick_name")
    private String memberNickName;
    @TableField(value = "member_icon")
    private String memberIcon;
    @TableField(value = "content")
    private String content;
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 评论人员类型；0->会员；1->管理员
     */
    @TableField(value = "`type`")
    private Integer type;
}