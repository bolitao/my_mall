package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 商品评价表
 */
@Data
@TableName(value = "pms_comment")
public class PmsComment {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_MEMBER_NICK_NAME = "member_nick_name";
    public static final String COL_PRODUCT_NAME = "product_name";
    public static final String COL_STAR = "star";
    public static final String COL_MEMBER_IP = "member_ip";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_SHOW_STATUS = "show_status";
    public static final String COL_PRODUCT_ATTRIBUTE = "product_attribute";
    public static final String COL_COLLECT_COUONT = "collect_couont";
    public static final String COL_READ_COUNT = "read_count";
    public static final String COL_CONTENT = "content";
    public static final String COL_PICS = "pics";
    public static final String COL_MEMBER_ICON = "member_icon";
    public static final String COL_REPLAY_COUNT = "replay_count";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_id")
    private Long productId;
    @TableField(value = "member_nick_name")
    private String memberNickName;
    @TableField(value = "product_name")
    private String productName;
    /**
     * 评价星数：0->5
     */
    @TableField(value = "star")
    private Integer star;
    /**
     * 评价的ip
     */
    @TableField(value = "member_ip")
    private String memberIp;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "show_status")
    private Integer showStatus;
    /**
     * 购买时的商品属性
     */
    @TableField(value = "product_attribute")
    private String productAttribute;
    @TableField(value = "collect_couont")
    private Integer collectCouont;
    @TableField(value = "read_count")
    private Integer readCount;
    @TableField(value = "content")
    private String content;
    /**
     * 上传图片地址，以逗号隔开
     */
    @TableField(value = "pics")
    private String pics;
    /**
     * 评论用户头像
     */
    @TableField(value = "member_icon")
    private String memberIcon;
    @TableField(value = "replay_count")
    private Integer replayCount;
}