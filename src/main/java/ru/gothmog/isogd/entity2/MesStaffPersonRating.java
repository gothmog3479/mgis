package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "mes_staff_person_rating", schema = "public", catalog = "mgis")
public class MesStaffPersonRating {
    private String dtype;
    private Long id;
    private Integer dynamic;
    private String title;
    private Long ownerId;
    private Long workStaffEmployeeDsId;
    private Long workStaffEmployeeEddsId;
    private Long valuesId;
    private Long workStaffEmployeeEmcId;

    @Basic
    @Column(name = "dtype", nullable = false, length = 31)
    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
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
    @Column(name = "dynamic", nullable = true)
    public Integer getDynamic() {
        return dynamic;
    }

    public void setDynamic(Integer dynamic) {
        this.dynamic = dynamic;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 1024)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "owner_id", nullable = false)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "work_staff_employee_ds_id", nullable = true)
    public Long getWorkStaffEmployeeDsId() {
        return workStaffEmployeeDsId;
    }

    public void setWorkStaffEmployeeDsId(Long workStaffEmployeeDsId) {
        this.workStaffEmployeeDsId = workStaffEmployeeDsId;
    }

    @Basic
    @Column(name = "work_staff_employee_edds_id", nullable = true)
    public Long getWorkStaffEmployeeEddsId() {
        return workStaffEmployeeEddsId;
    }

    public void setWorkStaffEmployeeEddsId(Long workStaffEmployeeEddsId) {
        this.workStaffEmployeeEddsId = workStaffEmployeeEddsId;
    }

    @Basic
    @Column(name = "values_id", nullable = true)
    public Long getValuesId() {
        return valuesId;
    }

    public void setValuesId(Long valuesId) {
        this.valuesId = valuesId;
    }

    @Basic
    @Column(name = "work_staff_employee_emc_id", nullable = true)
    public Long getWorkStaffEmployeeEmcId() {
        return workStaffEmployeeEmcId;
    }

    public void setWorkStaffEmployeeEmcId(Long workStaffEmployeeEmcId) {
        this.workStaffEmployeeEmcId = workStaffEmployeeEmcId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesStaffPersonRating that = (MesStaffPersonRating) o;

        if (dtype != null ? !dtype.equals(that.dtype) : that.dtype != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dynamic != null ? !dynamic.equals(that.dynamic) : that.dynamic != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (workStaffEmployeeDsId != null ? !workStaffEmployeeDsId.equals(that.workStaffEmployeeDsId) : that.workStaffEmployeeDsId != null)
            return false;
        if (workStaffEmployeeEddsId != null ? !workStaffEmployeeEddsId.equals(that.workStaffEmployeeEddsId) : that.workStaffEmployeeEddsId != null)
            return false;
        if (valuesId != null ? !valuesId.equals(that.valuesId) : that.valuesId != null) return false;
        if (workStaffEmployeeEmcId != null ? !workStaffEmployeeEmcId.equals(that.workStaffEmployeeEmcId) : that.workStaffEmployeeEmcId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dtype != null ? dtype.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (dynamic != null ? dynamic.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (workStaffEmployeeDsId != null ? workStaffEmployeeDsId.hashCode() : 0);
        result = 31 * result + (workStaffEmployeeEddsId != null ? workStaffEmployeeEddsId.hashCode() : 0);
        result = 31 * result + (valuesId != null ? valuesId.hashCode() : 0);
        result = 31 * result + (workStaffEmployeeEmcId != null ? workStaffEmployeeEmcId.hashCode() : 0);
        return result;
    }
}
