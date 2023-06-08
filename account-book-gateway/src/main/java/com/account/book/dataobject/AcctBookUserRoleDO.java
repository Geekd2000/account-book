package com.account.book.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户角色关系表
 * @TableName acct_book_user_role
 */
@TableName(value ="acct_book_user_role")
@Data
public class AcctBookUserRoleDO implements Serializable {
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
     * 角色ID
     */
    private String roleId;

    /**
     * 用户ID
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}