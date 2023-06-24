package com.account.book.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 流水记录表（账单表）
 *
 * @TableName bacct_ook_bill_record
 */
@Data
public class BacctOokBillRecordDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 创建者，默认system
     */
    private String creator;

    /**
     * 修改者，默认system
     */
    private String modifier;

    /**
     * 是否被删除，1是 0否
     */
    private Integer isRemoved;

    /**
     * 账单ID
     */
    private String billId;

    /**
     * 金额
     */
    private Double price;

    /**
     * 账单时间
     */
    private Date billDate;

    /**
     * 备注说明
     */
    private String remark;

    /**
     * 分类ID
     */
    private String kindId;

    /**
     * 收支类型 0:收入 1:支出
     */
    private Integer useType;

    /**
     * 成员ID
     */
    private String userId;

    /**
     * 团队ID
     */
    private String groupId;

    /**
     * 扩展字段
     */
    private String extensions;

    private static final long serialVersionUID = 1L;
}