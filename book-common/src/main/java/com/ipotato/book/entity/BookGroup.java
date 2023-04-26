package com.ipotato.book.entity;

/**
 * 团队表
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/26 15:14
 */
public class BookGroup extends BaseEntity {
    private static final long serialVersionUID = 6145886486673817421L;

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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getExtensions() {
        return extensions;
    }

    public void setExtension(String extensions) {
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        return "BookGroup{" +
                "groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", owner='" + owner + '\'' +
                ", extensions='" + extensions + '\'' +
                '}';
    }
}
