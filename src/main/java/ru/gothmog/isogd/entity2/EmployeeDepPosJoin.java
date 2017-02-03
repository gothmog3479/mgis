package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee_dep_pos_join", schema = "public", catalog = "mgis")
public class EmployeeDepPosJoin {
    private Long departmentId;
    private Long positionId;

    @Basic
    @Column(name = "department_id", nullable = false)
    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "position_id", nullable = false)
    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeDepPosJoin that = (EmployeeDepPosJoin) o;

        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;
        if (positionId != null ? !positionId.equals(that.positionId) : that.positionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departmentId != null ? departmentId.hashCode() : 0;
        result = 31 * result + (positionId != null ? positionId.hashCode() : 0);
        return result;
    }
}
