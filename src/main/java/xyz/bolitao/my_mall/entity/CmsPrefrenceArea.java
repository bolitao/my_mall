package xyz.bolitao.my_mall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 优选专区
 * </p>
 *
 * @author bolitao
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CmsPrefrenceArea对象", description="优选专区")
public class CmsPrefrenceArea implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String subTitle;

    @ApiModelProperty(value = "展示图片")
    private byte[] pic;

    private Integer sort;

    private Integer showStatus;


}
