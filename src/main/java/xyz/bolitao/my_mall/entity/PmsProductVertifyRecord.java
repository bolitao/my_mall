package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 商品审核记录
 */
@Data
@TableName(value = "pms_product_vertify_record")
public class PmsProductVertifyRecord {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_VERTIFY_MAN = "vertify_man";
    public static final String COL_STATUS = "status";
    public static final String COL_DETAIL = "detail";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_id")
    private Long productId;
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 审核人
     */
    @TableField(value = "vertify_man")
    private String vertifyMan;
    @TableField(value = "`status`")
    private Integer status;
    /**
     * 反馈详情
     */
    @TableField(value = "detail")
    private String detail;
}