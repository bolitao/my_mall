package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品信息
 */
@Data
@TableName(value = "pms_product")
public class PmsProduct {
    public static final String COL_ID = "id";
    public static final String COL_BRAND_ID = "brand_id";
    public static final String COL_PRODUCT_CATEGORY_ID = "product_category_id";
    public static final String COL_FEIGHT_TEMPLATE_ID = "feight_template_id";
    public static final String COL_PRODUCT_ATTRIBUTE_CATEGORY_ID = "product_attribute_category_id";
    public static final String COL_NAME = "name";
    public static final String COL_PIC = "pic";
    public static final String COL_PRODUCT_SN = "product_sn";
    public static final String COL_DELETE_STATUS = "delete_status";
    public static final String COL_PUBLISH_STATUS = "publish_status";
    public static final String COL_NEW_STATUS = "new_status";
    public static final String COL_RECOMMAND_STATUS = "recommand_status";
    public static final String COL_VERIFY_STATUS = "verify_status";
    public static final String COL_SORT = "sort";
    public static final String COL_SALE = "sale";
    public static final String COL_PRICE = "price";
    public static final String COL_PROMOTION_PRICE = "promotion_price";
    public static final String COL_GIFT_GROWTH = "gift_growth";
    public static final String COL_GIFT_POINT = "gift_point";
    public static final String COL_USE_POINT_LIMIT = "use_point_limit";
    public static final String COL_SUB_TITLE = "sub_title";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_ORIGINAL_PRICE = "original_price";
    public static final String COL_STOCK = "stock";
    public static final String COL_LOW_STOCK = "low_stock";
    public static final String COL_UNIT = "unit";
    public static final String COL_WEIGHT = "weight";
    public static final String COL_PREVIEW_STATUS = "preview_status";
    public static final String COL_SERVICE_IDS = "service_ids";
    public static final String COL_KEYWORDS = "keywords";
    public static final String COL_NOTE = "note";
    public static final String COL_ALBUM_PICS = "album_pics";
    public static final String COL_DETAIL_TITLE = "detail_title";
    public static final String COL_DETAIL_DESC = "detail_desc";
    public static final String COL_DETAIL_HTML = "detail_html";
    public static final String COL_DETAIL_MOBILE_HTML = "detail_mobile_html";
    public static final String COL_PROMOTION_START_TIME = "promotion_start_time";
    public static final String COL_PROMOTION_END_TIME = "promotion_end_time";
    public static final String COL_PROMOTION_PER_LIMIT = "promotion_per_limit";
    public static final String COL_PROMOTION_TYPE = "promotion_type";
    public static final String COL_BRAND_NAME = "brand_name";
    public static final String COL_PRODUCT_CATEGORY_NAME = "product_category_name";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField(value = "brand_id")
    private Long brandId;
    @TableField(value = "product_category_id")
    private Long productCategoryId;
    @TableField(value = "feight_template_id")
    private Long feightTemplateId;
    @TableField(value = "product_attribute_category_id")
    private Long productAttributeCategoryId;
    @TableField(value = "`name`")
    private String name;
    @TableField(value = "pic")
    private String pic;
    /**
     * 货号
     */
    @TableField(value = "product_sn")
    private String productSn;
    /**
     * 删除状态：0->未删除；1->已删除
     */
    @TableField(value = "delete_status")
    private Integer deleteStatus;
    /**
     * 上架状态：0->下架；1->上架
     */
    @TableField(value = "publish_status")
    private Integer publishStatus;
    /**
     * 新品状态:0->不是新品；1->新品
     */
    @TableField(value = "new_status")
    private Integer newStatus;
    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    @TableField(value = "recommand_status")
    private Integer recommandStatus;
    /**
     * 审核状态：0->未审核；1->审核通过
     */
    @TableField(value = "verify_status")
    private Integer verifyStatus;
    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;
    /**
     * 销量
     */
    @TableField(value = "sale")
    private Integer sale;
    @TableField(value = "price")
    private BigDecimal price;
    /**
     * 促销价格
     */
    @TableField(value = "promotion_price")
    private BigDecimal promotionPrice;
    /**
     * 赠送的成长值
     */
    @TableField(value = "gift_growth")
    private Integer giftGrowth;
    /**
     * 赠送的积分
     */
    @TableField(value = "gift_point")
    private Integer giftPoint;
    /**
     * 限制使用的积分数
     */
    @TableField(value = "use_point_limit")
    private Integer usePointLimit;
    /**
     * 副标题
     */
    @TableField(value = "sub_title")
    private String subTitle;
    /**
     * 商品描述
     */
    @TableField(value = "description")
    private String description;
    /**
     * 市场价
     */
    @TableField(value = "original_price")
    private BigDecimal originalPrice;
    /**
     * 库存
     */
    @TableField(value = "stock")
    private Integer stock;
    /**
     * 库存预警值
     */
    @TableField(value = "low_stock")
    private Integer lowStock;
    /**
     * 单位
     */
    @TableField(value = "unit")
    private String unit;
    /**
     * 商品重量，默认为克
     */
    @TableField(value = "weight")
    private BigDecimal weight;
    /**
     * 是否为预告商品：0->不是；1->是
     */
    @TableField(value = "preview_status")
    private Integer previewStatus;
    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    @TableField(value = "service_ids")
    private String serviceIds;
    @TableField(value = "keywords")
    private String keywords;
    @TableField(value = "note")
    private String note;
    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    @TableField(value = "album_pics")
    private String albumPics;
    @TableField(value = "detail_title")
    private String detailTitle;
    @TableField(value = "detail_desc")
    private String detailDesc;
    /**
     * 产品详情网页内容
     */
    @TableField(value = "detail_html")
    private String detailHtml;
    /**
     * 移动端网页详情
     */
    @TableField(value = "detail_mobile_html")
    private String detailMobileHtml;
    /**
     * 促销开始时间
     */
    @TableField(value = "promotion_start_time")
    private Date promotionStartTime;
    /**
     * 促销结束时间
     */
    @TableField(value = "promotion_end_time")
    private Date promotionEndTime;
    /**
     * 活动限购数量
     */
    @TableField(value = "promotion_per_limit")
    private Integer promotionPerLimit;
    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    @TableField(value = "promotion_type")
    private Integer promotionType;
    /**
     * 品牌名称
     */
    @TableField(value = "brand_name")
    private String brandName;
    /**
     * 商品分类名称
     */
    @TableField(value = "product_category_name")
    private String productCategoryName;
}