package xyz.bolitao.my_mall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 会员积分成长规则表
 * </p>
 *
 * @author bolitao
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsMemberRuleSetting对象", description="会员积分成长规则表")
public class UmsMemberRuleSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "连续签到天数")
    private Integer continueSignDay;

    @ApiModelProperty(value = "连续签到赠送数量")
    private Integer continueSignPoint;

    @ApiModelProperty(value = "每消费多少元获取1个点")
    private BigDecimal consumePerPoint;

    @ApiModelProperty(value = "最低获取点数的订单金额")
    private BigDecimal lowOrderAmount;

    @ApiModelProperty(value = "每笔订单最高获取点数")
    private Integer maxPointPerOrder;

    @ApiModelProperty(value = "类型：0->积分规则；1->成长值规则")
    private Integer type;


}