package com.mrdotxin.propsmart.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 账单视图
 */
@Data
public class BillVO implements Serializable {

    /**
     * 账单ID
     */
    @ApiModelProperty("账单ID")
    private Long id;

    /**
     * 房产ID
     */
    @ApiModelProperty("房产ID")
    private Long propertyId;
    
    /**
     * 房产信息（楼栋名 + 单元号 + 房号）
     */
    @ApiModelProperty("房产信息")
    private String propertyInfo;

    /**
     * 费用类型
     */
    @ApiModelProperty("费用类型")
    private String type;
    
    /**
     * 费用类型文本
     */
    @ApiModelProperty("费用类型文本")
    private String typeText;

    /**
     * 金额
     */
    @ApiModelProperty("金额")
    private BigDecimal amount;

    /**
     * 截止日期
     */
    @ApiModelProperty("截止日期")
    private Date deadline;

    /**
     * 缴费状态
     */
    @ApiModelProperty("缴费状态")
    private String status;
    
    /**
     * 缴费状态文本
     */
    @ApiModelProperty("缴费状态文本")
    private String statusText;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 缴费时间
     */
    @ApiModelProperty("缴费时间")
    private Date paidTime;
    
    private static final long serialVersionUID = 1L;
} 