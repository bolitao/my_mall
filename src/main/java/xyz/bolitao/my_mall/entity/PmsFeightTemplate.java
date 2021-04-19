package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 运费模版
 */
@Data
@TableName(value = "pms_feight_template")
public class PmsFeightTemplate {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_CHARGE_TYPE = "charge_type";
    public static final String COL_FIRST_WEIGHT = "first_weight";
    public static final String COL_FIRST_FEE = "first_fee";
    public static final String COL_CONTINUE_WEIGHT = "continue_weight";
    public static final String COL_CONTINME_FEE = "continme_fee";
    public static final String COL_DEST = "dest";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "`name`")
    private String name;
    /**
     * 计费类型:0->按重量；1->按件数
     */
    @TableField(value = "charge_type")
    private Integer chargeType;
    /**
     * 首重kg
     */
    @TableField(value = "first_weight")
    private BigDecimal firstWeight;
    /**
     * 首费（元）
     */
    @TableField(value = "first_fee")
    private BigDecimal firstFee;
    @TableField(value = "continue_weight")
    private BigDecimal continueWeight;
    @TableField(value = "continme_fee")
    private BigDecimal continmeFee;
    /**
     * 目的地（省、市）
     */
    @TableField(value = "dest")
    private String dest;
}