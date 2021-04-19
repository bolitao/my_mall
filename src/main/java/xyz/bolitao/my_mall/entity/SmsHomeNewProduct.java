package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 新鲜好物表
 */
@Data
@TableName(value = "sms_home_new_product")
public class SmsHomeNewProduct {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_PRODUCT_NAME = "product_name";
    public static final String COL_RECOMMEND_STATUS = "recommend_status";
    public static final String COL_SORT = "sort";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_id")
    private Long productId;
    @TableField(value = "product_name")
    private String productName;
    @TableField(value = "recommend_status")
    private Integer recommendStatus;
    @TableField(value = "sort")
    private Integer sort;
}