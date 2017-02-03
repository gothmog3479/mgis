package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_intersection_info", schema = "public", catalog = "mgis")
public class LandIntersectionInfo {
    private Long id;
    private Double intersectedArea;
    private Long intersectedLandId;
    private Long thisLandId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "intersected_area", nullable = false, precision = 0)
    public Double getIntersectedArea() {
        return intersectedArea;
    }

    public void setIntersectedArea(Double intersectedArea) {
        this.intersectedArea = intersectedArea;
    }

    @Basic
    @Column(name = "intersected_land_id", nullable = false)
    public Long getIntersectedLandId() {
        return intersectedLandId;
    }

    public void setIntersectedLandId(Long intersectedLandId) {
        this.intersectedLandId = intersectedLandId;
    }

    @Basic
    @Column(name = "this_land_id", nullable = false)
    public Long getThisLandId() {
        return thisLandId;
    }

    public void setThisLandId(Long thisLandId) {
        this.thisLandId = thisLandId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandIntersectionInfo that = (LandIntersectionInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (intersectedArea != null ? !intersectedArea.equals(that.intersectedArea) : that.intersectedArea != null)
            return false;
        if (intersectedLandId != null ? !intersectedLandId.equals(that.intersectedLandId) : that.intersectedLandId != null)
            return false;
        if (thisLandId != null ? !thisLandId.equals(that.thisLandId) : that.thisLandId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (intersectedArea != null ? intersectedArea.hashCode() : 0);
        result = 31 * result + (intersectedLandId != null ? intersectedLandId.hashCode() : 0);
        result = 31 * result + (thisLandId != null ? thisLandId.hashCode() : 0);
        return result;
    }
}
