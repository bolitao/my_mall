package xyz.bolitao.my_mall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 会员任务表
 * </p>
 *
 * @author bolitao
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsMemberTask对象", description="会员任务表")
public class UmsMemberTask implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    @ApiModelProperty(value = "赠送成长值")
    private Integer growth;

    @ApiModelProperty(value = "赠送积分")
    private Integer intergration;

    @ApiModelProperty(value = "任务类型：0->新手任务；1->日常任务")
    private Integer type;


}
