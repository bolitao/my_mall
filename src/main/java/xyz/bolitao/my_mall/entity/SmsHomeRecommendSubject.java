package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 首页推荐专题表
 */
@Data
@TableName(value = "sms_home_recommend_subject")
public class SmsHomeRecommendSubject {
    public static final String COL_ID = "id";
    public static final String COL_SUBJECT_ID = "subject_id";
    public static final String COL_SUBJECT_NAME = "subject_name";
    public static final String COL_RECOMMEND_STATUS = "recommend_status";
    public static final String COL_SORT = "sort";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "subject_id")
    private Long subjectId;
    @TableField(value = "subject_name")
    private String subjectName;
    @TableField(value = "recommend_status")
    private Integer recommendStatus;
    @TableField(value = "sort")
    private Integer sort;
}