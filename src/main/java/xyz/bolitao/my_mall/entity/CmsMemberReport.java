package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户举报表
 */
@Data
@TableName(value = "cms_member_report")
public class CmsMemberReport {
    public static final String COL_ID = "id";
    public static final String COL_REPORT_TYPE = "report_type";
    public static final String COL_REPORT_MEMBER_NAME = "report_member_name";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_REPORT_OBJECT = "report_object";
    public static final String COL_REPORT_STATUS = "report_status";
    public static final String COL_HANDLE_STATUS = "handle_status";
    public static final String COL_NOTE = "note";
    @TableId(value = "id")
    private Long id;
    /**
     * 举报类型：0->商品评价；1->话题内容；2->用户评论
     */
    @TableField(value = "report_type")
    private Integer reportType;
    /**
     * 举报人
     */
    @TableField(value = "report_member_name")
    private String reportMemberName;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "report_object")
    private String reportObject;
    /**
     * 举报状态：0->未处理；1->已处理
     */
    @TableField(value = "report_status")
    private Integer reportStatus;
    /**
     * 处理结果：0->无效；1->有效；2->恶意
     */
    @TableField(value = "handle_status")
    private Integer handleStatus;
    @TableField(value = "note")
    private String note;
}