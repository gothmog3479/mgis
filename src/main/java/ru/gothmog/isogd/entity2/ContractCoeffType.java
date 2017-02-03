package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_coeff_type", schema = "public", catalog = "mgis")
public class ContractCoeffType {
    private Long id;
    private String coeffName;
    private Long parentId;
    private Boolean forbuysell;
    private Boolean fortax;
    private String code;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "coeff_name", nullable = true, length = 2048)
    public String getCoeffName() {
        return coeffName;
    }

    public void setCoeffName(String coeffName) {
        this.coeffName = coeffName;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "forbuysell", nullable = true)
    public Boolean getForbuysell() {
        return forbuysell;
    }

    public void setForbuysell(Boolean forbuysell) {
        this.forbuysell = forbuysell;
    }

    @Basic
    @Column(name = "fortax", nullable = true)
    public Boolean getFortax() {
        return fortax;
    }

    public void setFortax(Boolean fortax) {
        this.fortax = fortax;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 256)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractCoeffType that = (ContractCoeffType) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (coeffName != null ? !coeffName.equals(that.coeffName) : that.coeffName != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (forbuysell != null ? !forbuysell.equals(that.forbuysell) : that.forbuysell != null) return false;
        if (fortax != null ? !fortax.equals(that.fortax) : that.fortax != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (coeffName != null ? coeffName.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (forbuysell != null ? forbuysell.hashCode() : 0);
        result = 31 * result + (fortax != null ? fortax.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
