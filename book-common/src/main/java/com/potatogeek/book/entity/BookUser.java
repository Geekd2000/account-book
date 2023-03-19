package com.potatogeek.book.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户表
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/19 21:36
 */
@TableName("book_user")
public class BookUser extends BaseEntity {
    private static final long serialVersionUID = -715387571601221995L;

    /**
     * 用户Id
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
    private String extension;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "BookUser{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", userType='" + userType + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", groupId='" + groupId + '\'' +
                ", source='" + source + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
