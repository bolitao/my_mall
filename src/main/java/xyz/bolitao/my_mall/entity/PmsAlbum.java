package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 相册表
 */
@Data
@TableName(value = "pms_album")
public class PmsAlbum {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_COVER_PIC = "cover_pic";
    public static final String COL_PIC_COUNT = "pic_count";
    public static final String COL_SORT = "sort";
    public static final String COL_DESCRIPTION = "description";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "`name`")
    private String name;
    @TableField(value = "cover_pic")
    private String coverPic;
    @TableField(value = "pic_count")
    private Integer picCount;
    @TableField(value = "sort")
    private Integer sort;
    @TableField(value = "description")
    private String description;
}