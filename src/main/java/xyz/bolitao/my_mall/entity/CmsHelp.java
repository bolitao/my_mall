package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 帮助表
 */
@Data
@TableName(value = "cms_help")
public class CmsHelp {
    public static final String COL_ID = "id";
    public static final String COL_CATEGORY_ID = "category_id";
    public static final String COL_ICON = "icon";
    public static final String COL_TITLE = "title";
    public static final String COL_SHOW_STATUS = "show_status";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_READ_COUNT = "read_count";
    public static final String COL_CONTENT = "content";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "category_id")
    private Long categoryId;
    @TableField(value = "icon")
    private String icon;
    @TableField(value = "title")
    private String title;
    @TableField(value = "show_status")
    private Integer showStatus;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "read_count")
    private Integer readCount;
    @TableField(value = "content")
    private String content;
}