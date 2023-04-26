package com.ipotato.book.entity;

import java.util.Date;

/**
 * 流水记录表（账单表）
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/26 15:40
 */
public class BookBillRecord extends BaseEntity {
    private static final long serialVersionUID = -2504184483299438252L;

    /**
     * 账单ID
     */
    private String billId;

    /**
     * 金额
     */
    private double price;

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
    private String useType;

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

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getExtensions() {
        return extensions;
    }

    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        return "BookBillRecord{" +
                "billId='" + billId + '\'' +
                ", price=" + price +
                ", billDate=" + billDate +
                ", remark='" + remark + '\'' +
                ", kindId='" + kindId + '\'' +
                ", useType='" + useType + '\'' +
                ", userId='" + userId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", extensions='" + extensions + '\'' +
                '}';
    }
}
