package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 商品属性参数表
 */
@Data
@TableName(value = "pms_product_attribute")
public class PmsProductAttribute {
    public static final String COL_ID = "id";
    public static final String COL_PRODUCT_ATTRIBUTE_CATEGORY_ID = "product_attribute_category_id";
    public static final String COL_NAME = "name";
    public static final String COL_SELECT_TYPE = "select_type";
    public static final String COL_INPUT_TYPE = "input_type";
    public static final String COL_INPUT_LIST = "input_list";
    public static final String COL_SORT = "sort";
    public static final String COL_FILTER_TYPE = "filter_type";
    public static final String COL_SEARCH_TYPE = "search_type";
    public static final String COL_RELATED_STATUS = "related_status";
    public static final String COL_HAND_ADD_STATUS = "hand_add_status";
    public static final String COL_TYPE = "type";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "product_attribute_category_id")
    private Long productAttributeCategoryId;
    @TableField(value = "`name`")
    private String name;
    /**
     * 属性选择类型：0->唯一；1->单选；2->多选
     */
    @TableField(value = "select_type")
    private Integer selectType;
    /**
     * 属性录入方式：0->手工录入；1->从列表中选取
     */
    @TableField(value = "input_type")
    private Integer inputType;
    /**
     * 可选值列表，以逗号隔开
     */
    @TableField(value = "input_list")
    private String inputList;
    /**
     * 排序字段：最高的可以单独上传图片
     */
    @TableField(value = "sort")
    private Integer sort;
    /**
     * 分类筛选样式：1->普通；1->颜色
     */
    @TableField(value = "filter_type")
    private Integer filterType;
    /**
     * 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     */
    @TableField(value = "search_type")
    private Integer searchType;
    /**
     * 相同属性产品是否关联；0->不关联；1->关联
     */
    @TableField(value = "related_status")
    private Integer relatedStatus;
    /**
     * 是否支持手动新增；0->不支持；1->支持
     */
    @TableField(value = "hand_add_status")
    private Integer handAddStatus;
    /**
     * 属性的类型；0->规格；1->参数
     */
    @TableField(value = "`type`")
    private Integer type;
}