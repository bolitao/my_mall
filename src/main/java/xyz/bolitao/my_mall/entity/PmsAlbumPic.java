package xyz.bolitao.my_mall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 画册图片表
 * </p>
 *
 * @author bolitao
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PmsAlbumPic对象", description="画册图片表")
public class PmsAlbumPic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long albumId;

    private String pic;


}
