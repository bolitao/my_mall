package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 后台用户登录日志表
 */
@Data
@TableName(value = "ums_admin_login_log")
public class UmsAdminLoginLog {
    public static final String COL_ID = "id";
    public static final String COL_ADMIN_ID = "admin_id";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_IP = "ip";
    public static final String COL_ADDRESS = "address";
    public static final String COL_USER_AGENT = "user_agent";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "admin_id")
    private Long adminId;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "ip")
    private String ip;
    @TableField(value = "address")
    private String address;
    /**
     * 浏览器登录类型
     */
    @TableField(value = "user_agent")
    private String userAgent;
}