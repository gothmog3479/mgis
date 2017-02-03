package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "dynamic_entity_proxy", schema = "public", catalog = "mgis")
public class DynamicEntityProxy {
    private Long id;
    private Integer cascadeType;
    private String entityClass;
    private Long entityId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cascade_type", nullable = true)
    public Integer getCascadeType() {
        return cascadeType;
    }

    public void setCascadeType(Integer cascadeType) {
        this.cascadeType = cascadeType;
    }

    @Basic
    @Column(name = "entity_class", nullable = true, length = 255)
    public String getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(String entityClass) {
        this.entityClass = entityClass;
    }

    @Basic
    @Column(name = "entity_id", nullable = true)
    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicEntityProxy that = (DynamicEntityProxy) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cascadeType != null ? !cascadeType.equals(that.cascadeType) : that.cascadeType != null) return false;
        if (entityClass != null ? !entityClass.equals(that.entityClass) : that.entityClass != null) return false;
        if (entityId != null ? !entityId.equals(that.entityId) : that.entityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cascadeType != null ? cascadeType.hashCode() : 0);
        result = 31 * result + (entityClass != null ? entityClass.hashCode() : 0);
        result = 31 * result + (entityId != null ? entityId.hashCode() : 0);
        return result;
    }
}
