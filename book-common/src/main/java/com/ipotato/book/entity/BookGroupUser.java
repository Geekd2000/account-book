package com.ipotato.book.entity;

/**
 * 团队用户关系表
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/26 15:14
 */
public class BookGroupUser extends BaseEntity {
    private static final long serialVersionUID = 7203173920238837288L;

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
    private String isDefaultGroup;

    /**
     * 扩展字段
     */
    private String extensions;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIsDefaultGroup() {
        return isDefaultGroup;
    }

    public void setIsDefaultGroup(String isDefaultGroup) {
        this.isDefaultGroup = isDefaultGroup;
    }

    public String getExtensions() {
        return extensions;
    }

    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        return "BookGroupUser{" +
                "groupId='" + groupId + '\'' +
                ", userId='" + userId + '\'' +
                ", isDefaultGroup='" + isDefaultGroup + '\'' +
                ", extensions='" + extensions + '\'' +
                '}';
    }
}
