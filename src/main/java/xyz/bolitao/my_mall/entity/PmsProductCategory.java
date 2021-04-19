package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 产品分类
 */
@Data
@TableName(value = "pms_product_category")
public class PmsProductCategory {
    public static final String COL_ID = "id";
    public static final String COL_PARENT_ID = "parent_id";
    public static final String COL_NAME = "name";
    public static final String COL_LEVEL = "level";
    public static final String COL_PRODUCT_COUNT = "product_count";
    public static final String COL_PRODUCT_UNIT = "product_unit";
    public static final String COL_NAV_STATUS = "nav_status";
    public static final String COL_SHOW_STATUS = "show_status";
    public static final String COL_SORT = "sort";
    public static final String COL_ICON = "icon";
    public static final String COL_KEYWORDS = "keywords";
    public static final String COL_DESCRIPTION = "description";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 上机分类的编号：0表示一级分类
     */
    @TableField(value = "parent_id")
    private Long parentId;
    @TableField(value = "`name`")
    private String name;
    /**
     * 分类级别：0->1级；1->2级
     */
    @TableField(value = "`level`")
    private Integer level;
    @TableField(value = "product_count")
    private Integer productCount;
    @TableField(value = "product_unit")
    private String productUnit;
    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @TableField(value = "nav_status")
    private Integer navStatus;
    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField(value = "show_status")
    private Integer showStatus;
    @TableField(value = "sort")
    private Integer sort;
    /**
     * 图标
     */
    @TableField(value = "icon")
    private String icon;
    @TableField(value = "keywords")
    private String keywords;
    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;
}