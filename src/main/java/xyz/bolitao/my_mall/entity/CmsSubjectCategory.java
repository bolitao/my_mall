package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 专题分类表
 */
@Data
@TableName(value = "cms_subject_category")
public class CmsSubjectCategory {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_ICON = "icon";
    public static final String COL_SUBJECT_COUNT = "subject_count";
    public static final String COL_SHOW_STATUS = "show_status";
    public static final String COL_SORT = "sort";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "`name`")
    private String name;
    /**
     * 分类图标
     */
    @TableField(value = "icon")
    private String icon;
    /**
     * 专题数量
     */
    @TableField(value = "subject_count")
    private Integer subjectCount;
    @TableField(value = "show_status")
    private Integer showStatus;
    @TableField(value = "sort")
    private Integer sort;
}