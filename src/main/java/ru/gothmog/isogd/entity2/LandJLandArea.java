package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_j_land_area", schema = "public", catalog = "mgis")
@IdClass(LandJLandAreaPK.class)
public class LandJLandArea {
    private Long landId;
    private Long areaId;

    @Id
    @Column(name = "land_id", nullable = false)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Id
    @Column(name = "area_id", nullable = false)
    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandJLandArea that = (LandJLandArea) o;

        if (landId != null ? !landId.equals(that.landId) : that.landId != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = landId != null ? landId.hashCode() : 0;
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        return result;
    }
}
