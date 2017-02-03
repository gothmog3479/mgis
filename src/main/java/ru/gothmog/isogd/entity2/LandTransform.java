package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_transform", schema = "public", catalog = "mgis")
public class LandTransform {
    private Long id;
    private Integer transformType;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "transform_type", nullable = true)
    public Integer getTransformType() {
        return transformType;
    }

    public void setTransformType(Integer transformType) {
        this.transformType = transformType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandTransform that = (LandTransform) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (transformType != null ? !transformType.equals(that.transformType) : that.transformType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (transformType != null ? transformType.hashCode() : 0);
        return result;
    }
}
