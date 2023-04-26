package com.ipotato.book.entity;

/**
 * 用户角色关系表
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/26 15:08
 */
public class BookUserRole extends BaseEntity {
    private static final long serialVersionUID = -5772333317643924116L;

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

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
        return "BookUserRole{" +
                "roleId='" + roleId + '\'' +
                ", userId='" + userId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", extensions='" + extensions + '\'' +
                '}';
    }
}
