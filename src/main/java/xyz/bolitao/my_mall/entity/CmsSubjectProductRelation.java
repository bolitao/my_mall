package xyz.bolitao.my_mall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 专题商品关系表
 * </p>
 *
 * @author bolitao
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CmsSubjectProductRelation对象", description="专题商品关系表")
public class CmsSubjectProductRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long subjectId;

    private Long productId;


}
