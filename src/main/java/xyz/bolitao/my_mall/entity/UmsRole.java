package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 后台用户角色表
 */
@Data
@TableName(value = "ums_role")
public class UmsRole {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_ADMIN_COUNT = "admin_count";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_STATUS = "status";
    public static final String COL_SORT = "sort";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 名称
     */
    @TableField(value = "`name`")
    private String name;
    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;
    /**
     * 后台用户数量
     */
    @TableField(value = "admin_count")
    private Integer adminCount;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 启用状态：0->禁用；1->启用
     */
    @TableField(value = "`status`")
    private Integer status;
    @TableField(value = "sort")
    private Integer sort;
}