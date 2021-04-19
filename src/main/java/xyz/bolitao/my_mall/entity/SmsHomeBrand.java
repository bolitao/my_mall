package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 首页推荐品牌表
 */
@Data
@TableName(value = "sms_home_brand")
public class SmsHomeBrand {
    public static final String COL_ID = "id";
    public static final String COL_BRAND_ID = "brand_id";
    public static final String COL_BRAND_NAME = "brand_name";
    public static final String COL_RECOMMEND_STATUS = "recommend_status";
    public static final String COL_SORT = "sort";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "brand_id")
    private Long brandId;
    @TableField(value = "brand_name")
    private String brandName;
    @TableField(value = "recommend_status")
    private Integer recommendStatus;
    @TableField(value = "sort")
    private Integer sort;
}