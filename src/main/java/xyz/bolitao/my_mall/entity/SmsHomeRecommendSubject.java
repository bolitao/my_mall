package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 首页推荐专题表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-SmsHomeRecommendSubject")
@Data
@TableName(value = "sms_home_recommend_subject")
public class SmsHomeRecommendSubject {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "subject_id")
    @ApiModelProperty(value = "")
    private Long subjectId;

    @TableField(value = "subject_name")
    @ApiModelProperty(value = "")
    private String subjectName;

    @TableField(value = "recommend_status")
    @ApiModelProperty(value = "")
    private Integer recommendStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value = "")
    private Integer sort;

    public static final String COL_ID = "id";

    public static final String COL_SUBJECT_ID = "subject_id";

    public static final String COL_SUBJECT_NAME = "subject_name";

    public static final String COL_RECOMMEND_STATUS = "recommend_status";

    public static final String COL_SORT = "sort";
}