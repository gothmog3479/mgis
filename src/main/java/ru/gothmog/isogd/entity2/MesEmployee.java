package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "mes_employee", schema = "public", catalog = "mgis")
public class MesEmployee {
    private String empType;
    private Long id;
    private String militaryrank;
    private String name;

    @Basic
    @Column(name = "emp_type", nullable = false, length = 31)
    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
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
    @Column(name = "militaryrank", nullable = true, length = 255)
    public String getMilitaryrank() {
        return militaryrank;
    }

    public void setMilitaryrank(String militaryrank) {
        this.militaryrank = militaryrank;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesEmployee that = (MesEmployee) o;

        if (empType != null ? !empType.equals(that.empType) : that.empType != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (militaryrank != null ? !militaryrank.equals(that.militaryrank) : that.militaryrank != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empType != null ? empType.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (militaryrank != null ? militaryrank.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
