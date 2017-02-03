package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "employee_department", schema = "public", catalog = "mgis")
public class EmployeeDepartment {
    private Long id;
    private String title;
    private Long depHeadId;
    private Long parentId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "dep_head_id", nullable = true)
    public Long getDepHeadId() {
        return depHeadId;
    }

    public void setDepHeadId(Long depHeadId) {
        this.depHeadId = depHeadId;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeDepartment that = (EmployeeDepartment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (depHeadId != null ? !depHeadId.equals(that.depHeadId) : that.depHeadId != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (depHeadId != null ? depHeadId.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        return result;
    }
}
