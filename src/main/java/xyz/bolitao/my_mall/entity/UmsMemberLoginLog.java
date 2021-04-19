package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 会员登录记录
 */
@Data
@TableName(value = "ums_member_login_log")
public class UmsMemberLoginLog {
    public static final String COL_ID = "id";
    public static final String COL_MEMBER_ID = "member_id";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_IP = "ip";
    public static final String COL_CITY = "city";
    public static final String COL_LOGIN_TYPE = "login_type";
    public static final String COL_PROVINCE = "province";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "member_id")
    private Long memberId;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "ip")
    private String ip;
    @TableField(value = "city")
    private String city;
    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    @TableField(value = "login_type")
    private Integer loginType;
    @TableField(value = "province")
    private String province;
}