package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Metadata {
    private String type;
    private Long id;
    private String title;
    private String className;
    private String attrName;
    private Boolean multiple;
    private Boolean simple;
    private Long parentId;
    private Long ownerId;

    @Basic
    @Column(name = "type", nullable = false, length = 31)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "class_name", nullable = true, length = 255)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "attr_name", nullable = true, length = 255)
    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Basic
    @Column(name = "multiple", nullable = true)
    public Boolean getMultiple() {
        return multiple;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    @Basic
    @Column(name = "simple", nullable = true)
    public Boolean getSimple() {
        return simple;
    }

    public void setSimple(Boolean simple) {
        this.simple = simple;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "owner_id", nullable = true)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Metadata metadata = (Metadata) o;

        if (type != null ? !type.equals(metadata.type) : metadata.type != null) return false;
        if (id != null ? !id.equals(metadata.id) : metadata.id != null) return false;
        if (title != null ? !title.equals(metadata.title) : metadata.title != null) return false;
        if (className != null ? !className.equals(metadata.className) : metadata.className != null) return false;
        if (attrName != null ? !attrName.equals(metadata.attrName) : metadata.attrName != null) return false;
        if (multiple != null ? !multiple.equals(metadata.multiple) : metadata.multiple != null) return false;
        if (simple != null ? !simple.equals(metadata.simple) : metadata.simple != null) return false;
        if (parentId != null ? !parentId.equals(metadata.parentId) : metadata.parentId != null) return false;
        if (ownerId != null ? !ownerId.equals(metadata.ownerId) : metadata.ownerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + (attrName != null ? attrName.hashCode() : 0);
        result = 31 * result + (multiple != null ? multiple.hashCode() : 0);
        result = 31 * result + (simple != null ? simple.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        return result;
    }
}
