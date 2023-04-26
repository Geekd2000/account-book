package com.ipotato.book.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 角色权限表
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/19 21:16
 */
@TableName("book_role")
public class BookRole extends BaseEntity {
    private static final long serialVersionUID = -715387571601221995L;

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
    private String extension;

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "BookRole{" +
                "roleType='" + roleType + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleId='" + roleId + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
