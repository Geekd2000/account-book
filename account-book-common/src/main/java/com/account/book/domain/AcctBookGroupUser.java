package com.account.book.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 团队用户关系表
 * @TableName acct_book_group_user
 */
@Data
public class AcctBookGroupUser implements Serializable {
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
     * 用户ID
     */
    private String userId;

    /**
     * 是否默认组织，1是 0否
     */
    private Integer isDefaultGroup;

    /**
     * 扩展字段
     */
    private String extensions;

    private static final long serialVersionUID = 1L;
}