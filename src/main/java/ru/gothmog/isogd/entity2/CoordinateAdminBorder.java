package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "coordinate_admin_border", schema = "public", catalog = "mgis")
public class CoordinateAdminBorder {
    private Long borderId;
    private Long coordinateId;

    @Basic
    @Column(name = "border_id", nullable = false)
    public Long getBorderId() {
        return borderId;
    }

    public void setBorderId(Long borderId) {
        this.borderId = borderId;
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

        CoordinateAdminBorder that = (CoordinateAdminBorder) o;

        if (borderId != null ? !borderId.equals(that.borderId) : that.borderId != null) return false;
        if (coordinateId != null ? !coordinateId.equals(that.coordinateId) : that.coordinateId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = borderId != null ? borderId.hashCode() : 0;
        result = 31 * result + (coordinateId != null ? coordinateId.hashCode() : 0);
        return result;
    }
}
