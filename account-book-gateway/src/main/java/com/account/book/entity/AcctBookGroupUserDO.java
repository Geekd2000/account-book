package com.account.book.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 团队用户关系表
 * @TableName acct_book_group_user
 */
@TableName(value ="acct_book_group_user")
@Data
public class AcctBookGroupUserDO implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}