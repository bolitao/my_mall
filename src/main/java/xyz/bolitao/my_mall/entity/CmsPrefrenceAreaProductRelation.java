package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 优选专区和产品关系表
 */
@Data
@TableName(value = "cms_prefrence_area_product_relation")
public class CmsPrefrenceAreaProductRelation {
    public static final String COL_ID = "id";
    public static final String COL_PREFRENCE_AREA_ID = "prefrence_area_id";
    public static final String COL_PRODUCT_ID = "product_id";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "prefrence_area_id")
    private Long prefrenceAreaId;
    @TableField(value = "product_id")
    private Long productId;
}