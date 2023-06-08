package com.account.book.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 团队表
 * @TableName acct_book_group
 */
@Data
public class AcctBookGroup implements Serializable {
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
     * 团队ID
     */
    private String groupId;

    /**
     * 团队名称
     */
    private String groupName;

    /**
     * 团队拥有者
     */
    private String owner;

    /**
     * 扩展字段
     */
    private String extensions;

    private static final long serialVersionUID = 1L;
}