package xyz.bolitao.my_mall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 产品满减表(只针对同商品)
 * </p>
 *
 * @author bolitao
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PmsProductFullReduction对象", description="产品满减表(只针对同商品)")
public class PmsProductFullReduction implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productId;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;


}
