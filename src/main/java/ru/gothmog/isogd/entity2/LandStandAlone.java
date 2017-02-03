package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_stand_alone", schema = "public", catalog = "mgis")
public class LandStandAlone {
    private String actualUtilization;
    private Long id;

    @Basic
    @Column(name = "actual_utilization", nullable = true, length = 255)
    public String getActualUtilization() {
        return actualUtilization;
    }

    public void setActualUtilization(String actualUtilization) {
        this.actualUtilization = actualUtilization;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandStandAlone that = (LandStandAlone) o;

        if (actualUtilization != null ? !actualUtilization.equals(that.actualUtilization) : that.actualUtilization != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = actualUtilization != null ? actualUtilization.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
