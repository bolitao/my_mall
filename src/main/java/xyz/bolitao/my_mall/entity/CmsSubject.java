package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 专题表
 */
@Data
@TableName(value = "cms_subject")
public class CmsSubject {
    public static final String COL_ID = "id";
    public static final String COL_CATEGORY_ID = "category_id";
    public static final String COL_TITLE = "title";
    public static final String COL_PIC = "pic";
    public static final String COL_PRODUCT_COUNT = "product_count";
    public static final String COL_RECOMMEND_STATUS = "recommend_status";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_COLLECT_COUNT = "collect_count";
    public static final String COL_READ_COUNT = "read_count";
    public static final String COL_COMMENT_COUNT = "comment_count";
    public static final String COL_ALBUM_PICS = "album_pics";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_SHOW_STATUS = "show_status";
    public static final String COL_CONTENT = "content";
    public static final String COL_FORWARD_COUNT = "forward_count";
    public static final String COL_CATEGORY_NAME = "category_name";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "category_id")
    private Long categoryId;
    @TableField(value = "title")
    private String title;
    /**
     * 专题主图
     */
    @TableField(value = "pic")
    private String pic;
    /**
     * 关联产品数量
     */
    @TableField(value = "product_count")
    private Integer productCount;
    @TableField(value = "recommend_status")
    private Integer recommendStatus;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "collect_count")
    private Integer collectCount;
    @TableField(value = "read_count")
    private Integer readCount;
    @TableField(value = "comment_count")
    private Integer commentCount;
    /**
     * 画册图片用逗号分割
     */
    @TableField(value = "album_pics")
    private String albumPics;
    @TableField(value = "description")
    private String description;
    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField(value = "show_status")
    private Integer showStatus;
    @TableField(value = "content")
    private String content;
    /**
     * 转发数
     */
    @TableField(value = "forward_count")
    private Integer forwardCount;
    /**
     * 专题分类名称
     */
    @TableField(value = "category_name")
    private String categoryName;
}