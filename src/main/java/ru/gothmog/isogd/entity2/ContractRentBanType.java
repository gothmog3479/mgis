package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_rent_ban_type", schema = "public", catalog = "mgis")
public class ContractRentBanType {
    private Long id;
    private Double affectCoefficient;
    private String name;
    private Double realCoefficient;
    private String type;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "affect_coefficient", nullable = true, precision = 0)
    public Double getAffectCoefficient() {
        return affectCoefficient;
    }

    public void setAffectCoefficient(Double affectCoefficient) {
        this.affectCoefficient = affectCoefficient;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "real_coefficient", nullable = true, precision = 0)
    public Double getRealCoefficient() {
        return realCoefficient;
    }

    public void setRealCoefficient(Double realCoefficient) {
        this.realCoefficient = realCoefficient;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractRentBanType that = (ContractRentBanType) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (affectCoefficient != null ? !affectCoefficient.equals(that.affectCoefficient) : that.affectCoefficient != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (realCoefficient != null ? !realCoefficient.equals(that.realCoefficient) : that.realCoefficient != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (affectCoefficient != null ? affectCoefficient.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (realCoefficient != null ? realCoefficient.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
