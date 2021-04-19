package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 后台角色资源关系表
 */
@Data
@TableName(value = "ums_role_resource_relation")
public class UmsRoleResourceRelation {
    public static final String COL_ID = "id";
    public static final String COL_ROLE_ID = "role_id";
    public static final String COL_RESOURCE_ID = "resource_id";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Long roleId;
    /**
     * 资源ID
     */
    @TableField(value = "resource_id")
    private Long resourceId;
}