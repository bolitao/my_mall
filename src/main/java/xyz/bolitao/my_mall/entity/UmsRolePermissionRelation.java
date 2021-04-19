package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 后台用户角色和权限关系表
 */
@Data
@TableName(value = "ums_role_permission_relation")
public class UmsRolePermissionRelation {
    public static final String COL_ID = "id";
    public static final String COL_ROLE_ID = "role_id";
    public static final String COL_PERMISSION_ID = "permission_id";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "role_id")
    private Long roleId;
    @TableField(value = "permission_id")
    private Long permissionId;
}