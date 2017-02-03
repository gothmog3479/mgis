package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "coordinate_spatial_contour", schema = "public", catalog = "mgis")
public class CoordinateSpatialContour {
    private Long spContourId;
    private Long coordinateId;

    @Basic
    @Column(name = "sp_contour_id", nullable = false)
    public Long getSpContourId() {
        return spContourId;
    }

    public void setSpContourId(Long spContourId) {
        this.spContourId = spContourId;
    }

    @Basic
    @Column(name = "coordinate_id", nullable = false)
    public Long getCoordinateId() {
        return coordinateId;
    }

    public void setCoordinateId(Long coordinateId) {
        this.coordinateId = coordinateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoordinateSpatialContour that = (CoordinateSpatialContour) o;

        if (spContourId != null ? !spContourId.equals(that.spContourId) : that.spContourId != null) return false;
        if (coordinateId != null ? !coordinateId.equals(that.coordinateId) : that.coordinateId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = spContourId != null ? spContourId.hashCode() : 0;
        result = 31 * result + (coordinateId != null ? coordinateId.hashCode() : 0);
        return result;
    }
}
