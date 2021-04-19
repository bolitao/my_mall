package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品会员价格表
 */
@Data
@TableName(value = "pms_member_price")
public class PmsMemberPrice {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ID = "product_id";
    public static final String COL_MEMBER_LEVEL_ID = "member_level_id";
    public static final String COL_MEMBER_PRICE = "member_price";
    public static final String COL_MEMBER_LEVEL_NAME = "member_level_name";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_id")
    private Long productId;
    @TableField(value = "member_level_id")
    private Long memberLevelId;
    /**
     * 会员价格
     */
    @TableField(value = "member_price")
    private BigDecimal memberPrice;
    @TableField(value = "member_level_name")
    private String memberLevelName;
}