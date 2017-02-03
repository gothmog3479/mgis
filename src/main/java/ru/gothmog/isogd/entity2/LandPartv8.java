package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "land_partv8", schema = "public", catalog = "mgis")
public class LandPartv8 {
    private Long id;
    private Integer recnum;
    private Long encumbranceId;
    private Long landId;
    private Long stateId;
    private String cadnum;
    private Timestamp createDate;
    private Timestamp removeDate;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "recnum", nullable = true)
    public Integer getRecnum() {
        return recnum;
    }

    public void setRecnum(Integer recnum) {
        this.recnum = recnum;
    }

    @Basic
    @Column(name = "encumbrance_id", nullable = true)
    public Long getEncumbranceId() {
        return encumbranceId;
    }

    public void setEncumbranceId(Long encumbranceId) {
        this.encumbranceId = encumbranceId;
    }

    @Basic
    @Column(name = "land_id", nullable = false)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Basic
    @Column(name = "state_id", nullable = true)
    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "cadnum", nullable = true, length = 255)
    public String getCadnum() {
        return cadnum;
    }

    public void setCadnum(String cadnum) {
        this.cadnum = cadnum;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "remove_date", nullable = true)
    public Timestamp getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(Timestamp removeDate) {
        this.removeDate = removeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandPartv8 that = (LandPartv8) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (recnum != null ? !recnum.equals(that.recnum) : that.recnum != null) return false;
        if (encumbranceId != null ? !encumbranceId.equals(that.encumbranceId) : that.encumbranceId != null)
            return false;
        if (landId != null ? !landId.equals(that.landId) : that.landId != null) return false;
        if (stateId != null ? !stateId.equals(that.stateId) : that.stateId != null) return false;
        if (cadnum != null ? !cadnum.equals(that.cadnum) : that.cadnum != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (removeDate != null ? !removeDate.equals(that.removeDate) : that.removeDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (recnum != null ? recnum.hashCode() : 0);
        result = 31 * result + (encumbranceId != null ? encumbranceId.hashCode() : 0);
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
        result = 31 * result + (cadnum != null ? cadnum.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (removeDate != null ? removeDate.hashCode() : 0);
        return result;
    }
}
