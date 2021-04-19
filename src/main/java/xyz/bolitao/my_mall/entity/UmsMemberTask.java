package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 会员任务表
 */
@Data
@TableName(value = "ums_member_task")
public class UmsMemberTask {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_GROWTH = "growth";
    public static final String COL_INTERGRATION = "intergration";
    public static final String COL_TYPE = "type";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "`name`")
    private String name;
    /**
     * 赠送成长值
     */
    @TableField(value = "growth")
    private Integer growth;
    /**
     * 赠送积分
     */
    @TableField(value = "intergration")
    private Integer intergration;
    /**
     * 任务类型：0->新手任务；1->日常任务
     */
    @TableField(value = "`type`")
    private Integer type;
}