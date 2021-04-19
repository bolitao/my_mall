package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 资源分类表
 */
@Data
@TableName(value = "ums_resource_category")
public class UmsResourceCategory {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_NAME = "name";
    public static final String COL_SORT = "sort";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 分类名称
     */
    @TableField(value = "`name`")
    private String name;
    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;
}