package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "land_j_transform_income_land", schema = "public", catalog = "mgis")
public class LandJTransformIncomeLand {
    private Long transformId;
    private Long landId;

    @Basic
    @Column(name = "transform_id", nullable = false)
    public Long getTransformId() {
        return transformId;
    }

    public void setTransformId(Long transformId) {
        this.transformId = transformId;
    }

    @Basic
    @Column(name = "land_id", nullable = false)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandJTransformIncomeLand that = (LandJTransformIncomeLand) o;

        if (transformId != null ? !transformId.equals(that.transformId) : that.transformId != null) return false;
        if (landId != null ? !landId.equals(that.landId) : that.landId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transformId != null ? transformId.hashCode() : 0;
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        return result;
    }
}
