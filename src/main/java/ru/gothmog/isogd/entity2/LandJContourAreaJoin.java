package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_j_contour_area_join", schema = "public", catalog = "mgis")
@IdClass(LandJContourAreaJoinPK.class)
public class LandJContourAreaJoin {
    private Long contourId;
    private Long areaId;

    @Id
    @Column(name = "contour_id", nullable = false)
    public Long getContourId() {
        return contourId;
    }

    public void setContourId(Long contourId) {
        this.contourId = contourId;
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

        LandJContourAreaJoin that = (LandJContourAreaJoin) o;

        if (contourId != null ? !contourId.equals(that.contourId) : that.contourId != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contourId != null ? contourId.hashCode() : 0;
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        return result;
    }
}
