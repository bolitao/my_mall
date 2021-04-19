package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 专题商品关系表
 */
@Data
@TableName(value = "cms_subject_product_relation")
public class CmsSubjectProductRelation {
    public static final String COL_ID = "id";
    public static final String COL_SUBJECT_ID = "subject_id";
    public static final String COL_PRODUCT_ID = "product_id";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "subject_id")
    private Long subjectId;
    @TableField(value = "product_id")
    private Long productId;
}