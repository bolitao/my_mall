package xyz.bolitao.my_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 公司收发货地址表
 */
@Data
@TableName(value = "oms_company_address")
public class OmsCompanyAddress {
    public static final String COL_ID = "id";
    public static final String COL_ADDRESS_NAME = "address_name";
    public static final String COL_SEND_STATUS = "send_status";
    public static final String COL_RECEIVE_STATUS = "receive_status";
    public static final String COL_NAME = "name";
    public static final String COL_PHONE = "phone";
    public static final String COL_PROVINCE = "province";
    public static final String COL_CITY = "city";
    public static final String COL_REGION = "region";
    public static final String COL_DETAIL_ADDRESS = "detail_address";
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 地址名称
     */
    @TableField(value = "address_name")
    private String addressName;
    /**
     * 默认发货地址：0->否；1->是
     */
    @TableField(value = "send_status")
    private Integer sendStatus;
    /**
     * 是否默认收货地址：0->否；1->是
     */
    @TableField(value = "receive_status")
    private Integer receiveStatus;
    /**
     * 收发货人姓名
     */
    @TableField(value = "`name`")
    private String name;
    /**
     * 收货人电话
     */
    @TableField(value = "phone")
    private String phone;
    /**
     * 省/直辖市
     */
    @TableField(value = "province")
    private String province;
    /**
     * 市
     */
    @TableField(value = "city")
    private String city;
    /**
     * 区
     */
    @TableField(value = "region")
    private String region;
    /**
     * 详细地址
     */
    @TableField(value = "detail_address")
    private String detailAddress;
}