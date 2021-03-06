package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 相册表
 */
@ApiModel(value = "xyz-bolitao-my_mall-entity-PmsAlbum")
@Data
@TableName(value = "pms_album")
public class PmsAlbum {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "`name`")
    @ApiModelProperty(value = "")
    private String name;

    @TableField(value = "cover_pic")
    @ApiModelProperty(value = "")
    private String coverPic;

    @TableField(value = "pic_count")
    @ApiModelProperty(value = "")
    private Integer picCount;

    @TableField(value = "sort")
    @ApiModelProperty(value = "")
    private Integer sort;

    @TableField(value = "description")
    @ApiModelProperty(value = "")
    private String description;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_COVER_PIC = "cover_pic";

    public static final String COL_PIC_COUNT = "pic_count";

    public static final String COL_SORT = "sort";

    public static final String COL_DESCRIPTION = "description";
}