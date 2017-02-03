package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_core_property", schema = "public", catalog = "mgis")
public class ContractCoreProperty {
    private Long id;
    private String className;
    private Boolean isCore;
    private String property;
    private String name;
    private Boolean assertNull;
    private Boolean ignoreNull;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "is_core", nullable = true)
    public Boolean getCore() {
        return isCore;
    }

    public void setCore(Boolean core) {
        isCore = core;
    }

    @Basic
    @Column(name = "property", nullable = true, length = 255)
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "assert_null", nullable = true)
    public Boolean getAssertNull() {
        return assertNull;
    }

    public void setAssertNull(Boolean assertNull) {
        this.assertNull = assertNull;
    }

    @Basic
    @Column(name = "ignore_null", nullable = true)
    public Boolean getIgnoreNull() {
        return ignoreNull;
    }

    public void setIgnoreNull(Boolean ignoreNull) {
        this.ignoreNull = ignoreNull;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractCoreProperty that = (ContractCoreProperty) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (isCore != null ? !isCore.equals(that.isCore) : that.isCore != null) return false;
        if (property != null ? !property.equals(that.property) : that.property != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (assertNull != null ? !assertNull.equals(that.assertNull) : that.assertNull != null) return false;
        if (ignoreNull != null ? !ignoreNull.equals(that.ignoreNull) : that.ignoreNull != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + (isCore != null ? isCore.hashCode() : 0);
        result = 31 * result + (property != null ? property.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (assertNull != null ? assertNull.hashCode() : 0);
        result = 31 * result + (ignoreNull != null ? ignoreNull.hashCode() : 0);
        return result;
    }
}
