package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 后台用户角色和权限关系表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-UmsRolePermissionRelation")
@Data
@TableName(value = "ums_role_permission_relation")
public class UmsRolePermissionRelation {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "role_id")
    @ApiModelProperty(value = "")
    private Long roleId;

    @TableField(value = "permission_id")
    @ApiModelProperty(value = "")
    private Long permissionId;

    public static final String COL_ID = "id";

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_PERMISSION_ID = "permission_id";
}