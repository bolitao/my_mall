package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 品牌表
 */
@Data
@TableName(value = "pms_brand")
public class PmsBrand {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_FIRST_LETTER = "first_letter";
    public static final String COL_SORT = "sort";
    public static final String COL_FACTORY_STATUS = "factory_status";
    public static final String COL_SHOW_STATUS = "show_status";
    public static final String COL_PRODUCT_COUNT = "product_count";
    public static final String COL_PRODUCT_COMMENT_COUNT = "product_comment_count";
    public static final String COL_LOGO = "logo";
    public static final String COL_BIG_PIC = "big_pic";
    public static final String COL_BRAND_STORY = "brand_story";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "`name`")
    private String name;
    /**
     * 首字母
     */
    @TableField(value = "first_letter")
    private String firstLetter;
    @TableField(value = "sort")
    private Integer sort;
    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @TableField(value = "factory_status")
    private Integer factoryStatus;
    @TableField(value = "show_status")
    private Integer showStatus;
    /**
     * 产品数量
     */
    @TableField(value = "product_count")
    private Integer productCount;
    /**
     * 产品评论数量
     */
    @TableField(value = "product_comment_count")
    private Integer productCommentCount;
    /**
     * 品牌logo
     */
    @TableField(value = "logo")
    private String logo;
    /**
     * 专区大图
     */
    @TableField(value = "big_pic")
    private String bigPic;
    /**
     * 品牌故事
     */
    @TableField(value = "brand_story")
    private String brandStory;
}