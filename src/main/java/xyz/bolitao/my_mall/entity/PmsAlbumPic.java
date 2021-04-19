package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 画册图片表
 */
@Data
@TableName(value = "pms_album_pic")
public class PmsAlbumPic {
    public static final String COL_ID = "id";
    public static final String COL_ALBUM_ID = "album_id";
    public static final String COL_PIC = "pic";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "album_id")
    private Long albumId;
    @TableField(value = "pic")
    private String pic;
}