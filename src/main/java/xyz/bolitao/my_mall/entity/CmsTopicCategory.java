package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 话题分类表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-CmsTopicCategory")
@Data
@TableName(value = "cms_topic_category")
public class CmsTopicCategory {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "`name`")
    @ApiModelProperty(value = "")
    private String name;

    /**
     * 分类图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value = "分类图标")
    private String icon;

    /**
     * 专题数量
     */
    @TableField(value = "subject_count")
    @ApiModelProperty(value = "专题数量")
    private Integer subjectCount;

    @TableField(value = "show_status")
    @ApiModelProperty(value = "")
    private Integer showStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value = "")
    private Integer sort;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_ICON = "icon";

    public static final String COL_SUBJECT_COUNT = "subject_count";

    public static final String COL_SHOW_STATUS = "show_status";

    public static final String COL_SORT = "sort";
}