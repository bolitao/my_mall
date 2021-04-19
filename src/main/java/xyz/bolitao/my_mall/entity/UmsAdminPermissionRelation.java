package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 */
@Data
@TableName(value = "ums_admin_permission_relation")
public class UmsAdminPermissionRelation {
    public static final String COL_ID = "id";
    public static final String COL_ADMIN_ID = "admin_id";
    public static final String COL_PERMISSION_ID = "permission_id";
    public static final String COL_TYPE = "type";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "admin_id")
    private Long adminId;
    @TableField(value = "permission_id")
    private Long permissionId;
    @TableField(value = "`type`")
    private Integer type;
}