package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 后台用户表
 */
@Data
@TableName(value = "ums_admin")
public class UmsAdmin {
    public static final String COL_ID = "id";
    public static final String COL_USERNAME = "username";
    public static final String COL_PASSWORD = "password";
    public static final String COL_ICON = "icon";
    public static final String COL_EMAIL = "email";
    public static final String COL_NICK_NAME = "nick_name";
    public static final String COL_NOTE = "note";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_LOGIN_TIME = "login_time";
    public static final String COL_STATUS = "status";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "username")
    private String username;
    @TableField(value = "`password`")
    private String password;
    /**
     * 头像
     */
    @TableField(value = "icon")
    private String icon;
    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;
    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;
    /**
     * 备注信息
     */
    @TableField(value = "note")
    private String note;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 最后登录时间
     */
    @TableField(value = "login_time")
    private Date loginTime;
    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    @TableField(value = "`status`")
    private Integer status;
}