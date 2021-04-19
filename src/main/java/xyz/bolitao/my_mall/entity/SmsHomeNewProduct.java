package xyz.bolitao.my_mall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 新鲜好物表
 * </p>
 *
 * @author bolitao
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SmsHomeNewProduct对象", description="新鲜好物表")
public class SmsHomeNewProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productId;

    private String productName;

    private Integer recommendStatus;

    private Integer sort;


}
