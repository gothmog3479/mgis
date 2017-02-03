package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "bool_function", schema = "public", catalog = "mgis")
public class BoolFunction {
    private Long id;
    private String junctionType;
    private String key;
    private String sample;
    private Long parentId;
    private String dtype;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "junction_type", nullable = true, length = 255)
    public String getJunctionType() {
        return junctionType;
    }

    public void setJunctionType(String junctionType) {
        this.junctionType = junctionType;
    }

    @Basic
    @Column(name = "key", nullable = true, length = 255)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "sample", nullable = true, length = 255)
    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
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
    @Column(name = "dtype", nullable = false, length = 31)
    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoolFunction that = (BoolFunction) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (junctionType != null ? !junctionType.equals(that.junctionType) : that.junctionType != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (sample != null ? !sample.equals(that.sample) : that.sample != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (dtype != null ? !dtype.equals(that.dtype) : that.dtype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (junctionType != null ? junctionType.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (sample != null ? sample.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (dtype != null ? dtype.hashCode() : 0);
        return result;
    }
}
