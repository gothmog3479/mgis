package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "building_generic_land", schema = "public", catalog = "mgis")
public class BuildingGenericLand {
    private Long buildingId;
    private Long landId;

    @Basic
    @Column(name = "building_id", nullable = false)
    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
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

        BuildingGenericLand that = (BuildingGenericLand) o;

        if (buildingId != null ? !buildingId.equals(that.buildingId) : that.buildingId != null) return false;
        if (landId != null ? !landId.equals(that.landId) : that.landId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = buildingId != null ? buildingId.hashCode() : 0;
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        return result;
    }
}
