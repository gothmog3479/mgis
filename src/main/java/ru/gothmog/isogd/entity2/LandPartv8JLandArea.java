package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "land_partv8_j_land_area", schema = "public", catalog = "mgis")
public class LandPartv8JLandArea {
    private Long partId;
    private Long areaId;

    @Basic
    @Column(name = "part_id", nullable = false)
    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    @Basic
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

        LandPartv8JLandArea that = (LandPartv8JLandArea) o;

        if (partId != null ? !partId.equals(that.partId) : that.partId != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partId != null ? partId.hashCode() : 0;
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        return result;
    }
}
