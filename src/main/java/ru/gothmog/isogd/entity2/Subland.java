package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subland {
    private String actualutilization;
    private Long id;
    private Long contour;
    private Long ownerId;

    @Basic
    @Column(name = "actualutilization", nullable = true, length = 255)
    public String getActualutilization() {
        return actualutilization;
    }

    public void setActualutilization(String actualutilization) {
        this.actualutilization = actualutilization;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "contour", nullable = true)
    public Long getContour() {
        return contour;
    }

    public void setContour(Long contour) {
        this.contour = contour;
    }

    @Basic
    @Column(name = "owner_id", nullable = true)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subland subland = (Subland) o;

        if (actualutilization != null ? !actualutilization.equals(subland.actualutilization) : subland.actualutilization != null)
            return false;
        if (id != null ? !id.equals(subland.id) : subland.id != null) return false;
        if (contour != null ? !contour.equals(subland.contour) : subland.contour != null) return false;
        if (ownerId != null ? !ownerId.equals(subland.ownerId) : subland.ownerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = actualutilization != null ? actualutilization.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (contour != null ? contour.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        return result;
    }
}
