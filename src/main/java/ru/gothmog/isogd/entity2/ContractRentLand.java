package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "contract_rent_land", schema = "public", catalog = "mgis")
public class ContractRentLand {
    private Boolean isRegister;
    private Boolean isSettlement;
    private Date registerDate;
    private String registerNumber;
    private Long id;
    private Long municipalUnionId;
    private String calcPeriodType;

    @Basic
    @Column(name = "is_register", nullable = true)
    public Boolean getRegister() {
        return isRegister;
    }

    public void setRegister(Boolean register) {
        isRegister = register;
    }

    @Basic
    @Column(name = "is_settlement", nullable = true)
    public Boolean getSettlement() {
        return isSettlement;
    }

    public void setSettlement(Boolean settlement) {
        isSettlement = settlement;
    }

    @Basic
    @Column(name = "register_date", nullable = true)
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Basic
    @Column(name = "register_number", nullable = true, length = 255)
    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
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
    @Column(name = "municipal_union_id", nullable = true)
    public Long getMunicipalUnionId() {
        return municipalUnionId;
    }

    public void setMunicipalUnionId(Long municipalUnionId) {
        this.municipalUnionId = municipalUnionId;
    }

    @Basic
    @Column(name = "calc_period_type", nullable = true, length = 255)
    public String getCalcPeriodType() {
        return calcPeriodType;
    }

    public void setCalcPeriodType(String calcPeriodType) {
        this.calcPeriodType = calcPeriodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractRentLand that = (ContractRentLand) o;

        if (isRegister != null ? !isRegister.equals(that.isRegister) : that.isRegister != null) return false;
        if (isSettlement != null ? !isSettlement.equals(that.isSettlement) : that.isSettlement != null) return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;
        if (registerNumber != null ? !registerNumber.equals(that.registerNumber) : that.registerNumber != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (municipalUnionId != null ? !municipalUnionId.equals(that.municipalUnionId) : that.municipalUnionId != null)
            return false;
        if (calcPeriodType != null ? !calcPeriodType.equals(that.calcPeriodType) : that.calcPeriodType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isRegister != null ? isRegister.hashCode() : 0;
        result = 31 * result + (isSettlement != null ? isSettlement.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (registerNumber != null ? registerNumber.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (municipalUnionId != null ? municipalUnionId.hashCode() : 0);
        result = 31 * result + (calcPeriodType != null ? calcPeriodType.hashCode() : 0);
        return result;
    }
}
