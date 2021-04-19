package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 优选专区
 */
@Data
@TableName(value = "cms_prefrence_area")
public class CmsPrefrenceArea {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_SUB_TITLE = "sub_title";
    public static final String COL_PIC = "pic";
    public static final String COL_SORT = "sort";
    public static final String COL_SHOW_STATUS = "show_status";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "`name`")
    private String name;
    @TableField(value = "sub_title")
    private String subTitle;
    /**
     * 展示图片
     */
    @TableField(value = "pic")
    private byte[] pic;
    @TableField(value = "sort")
    private Integer sort;
    @TableField(value = "show_status")
    private Integer showStatus;
}