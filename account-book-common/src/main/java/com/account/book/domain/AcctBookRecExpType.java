package com.account.book.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 收支分类表
 * @TableName acct_book_rec_exp_type
 */
@Data
public class AcctBookRecExpType implements Serializable {
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
     * 分类ID
     */
    private String kindId;

    /**
     * 分类名称
     */
    private String kindName;

    /**
     * 收支类型 0:收入 1:支出
     */
    private Integer type;

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