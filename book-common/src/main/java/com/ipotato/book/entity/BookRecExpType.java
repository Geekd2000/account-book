package com.ipotato.book.entity;

/**
 * 收支分类表
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/3/26 15:46
 */
public class BookRecExpType extends BaseEntity {
    private static final long serialVersionUID = 7788226275997888817L;

    /**
     * 分类ID
     */
    private String kindId;

    /**
     * 分类名称
     */
    private String kindName;

    /**
     * 收支类型 0:收入 1:支出
     */
    private String type;

    /**
     * 团队ID
     */
    private String groupId;

    /**
     * 扩展字段
     */
    private String extensions;

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "BookRecExpType{" +
                "kindId='" + kindId + '\'' +
                ", kindName='" + kindName + '\'' +
                ", type='" + type + '\'' +
                ", groupId='" + groupId + '\'' +
                ", extensions='" + extensions + '\'' +
                '}';
    }
}
