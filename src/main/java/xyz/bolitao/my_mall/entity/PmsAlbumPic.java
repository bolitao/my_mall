package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 画册图片表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-PmsAlbumPic")
@Data
@TableName(value = "pms_album_pic")
public class PmsAlbumPic {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "album_id")
    @ApiModelProperty(value = "")
    private Long albumId;

    @TableField(value = "pic")
    @ApiModelProperty(value = "")
    private String pic;

    public static final String COL_ID = "id";

    public static final String COL_ALBUM_ID = "album_id";

    public static final String COL_PIC = "pic";
}