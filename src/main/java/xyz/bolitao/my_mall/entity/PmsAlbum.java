package xyz.bolitao.my_mall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 相册表
 * </p>
 *
 * @author bolitao
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PmsAlbum对象", description="相册表")
public class PmsAlbum implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String coverPic;

    private Integer picCount;

    private Integer sort;

    private String description;


}
