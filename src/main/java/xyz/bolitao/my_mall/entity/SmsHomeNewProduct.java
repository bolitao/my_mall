package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 新鲜好物表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-SmsHomeNewProduct")
@Data
@TableName(value = "sms_home_new_product")
public class SmsHomeNewProduct {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value = "")
    private Long productId;

    @TableField(value = "product_name")
    @ApiModelProperty(value = "")
    private String productName;

    @TableField(value = "recommend_status")
    @ApiModelProperty(value = "")
    private Integer recommendStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value = "")
    private Integer sort;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_PRODUCT_NAME = "product_name";

    public static final String COL_RECOMMEND_STATUS = "recommend_status";

    public static final String COL_SORT = "sort";
}