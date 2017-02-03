package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_calcinfo_coeff_join", schema = "public", catalog = "mgis")
@IdClass(ContractCalcinfoCoeffJoinPK.class)
public class ContractCalcinfoCoeffJoin {
    private Long calcInfoId;
    private Long coefficientId;

    @Id
    @Column(name = "calc_info_id", nullable = false)
    public Long getCalcInfoId() {
        return calcInfoId;
    }

    public void setCalcInfoId(Long calcInfoId) {
        this.calcInfoId = calcInfoId;
    }

    @Id
    @Column(name = "coefficient_id", nullable = false)
    public Long getCoefficientId() {
        return coefficientId;
    }

    public void setCoefficientId(Long coefficientId) {
        this.coefficientId = coefficientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractCalcinfoCoeffJoin that = (ContractCalcinfoCoeffJoin) o;

        if (calcInfoId != null ? !calcInfoId.equals(that.calcInfoId) : that.calcInfoId != null) return false;
        if (coefficientId != null ? !coefficientId.equals(that.coefficientId) : that.coefficientId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = calcInfoId != null ? calcInfoId.hashCode() : 0;
        result = 31 * result + (coefficientId != null ? coefficientId.hashCode() : 0);
        return result;
    }
}
