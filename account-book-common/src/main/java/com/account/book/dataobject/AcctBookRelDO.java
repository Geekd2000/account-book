package com.account.book.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色权限表
 *
 * @TableName acct_book_rel
 */
@Data
public class AcctBookRelDO implements Serializable {
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
     * 角色类型
     */
    private String roleType;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 角色ID
     */
    private String roleId;

    /**
     * 扩展字段
     */
    private String extensions;

    private static final long serialVersionUID = 1L;
}