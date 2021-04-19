package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 后台角色菜单关系表
 */
@Data
@TableName(value = "ums_role_menu_relation")
public class UmsRoleMenuRelation {
    public static final String COL_ID = "id";
    public static final String COL_ROLE_ID = "role_id";
    public static final String COL_MENU_ID = "menu_id";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Long roleId;
    /**
     * 菜单ID
     */
    @TableField(value = "menu_id")
    private Long menuId;
}