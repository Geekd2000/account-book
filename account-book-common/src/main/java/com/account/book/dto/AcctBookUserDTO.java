package com.account.book.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 */
@Data
public class AcctBookUserDTO extends BaseDTO {
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
     * 用户ID，系统自动生成
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 账号类型
     */
    private String userType;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户密码，加密
     */
    private String password;

    /**
     * 团队ID
     */
    private String groupId;

    /**
     * 注册来源
     */
    private String source;

    /**
     * 扩展字段
     */
    private String extensions;
}