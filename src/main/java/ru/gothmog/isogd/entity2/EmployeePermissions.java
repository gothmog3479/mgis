package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "employee_permissions", schema = "public", catalog = "mgis")
public class EmployeePermissions {
    private String permType;
    private Long id;

    @Basic
    @Column(name = "perm_type", nullable = false, length = 31)
    public String getPermType() {
        return permType;
    }

    public void setPermType(String permType) {
        this.permType = permType;
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

        EmployeePermissions that = (EmployeePermissions) o;

        if (permType != null ? !permType.equals(that.permType) : that.permType != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = permType != null ? permType.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
