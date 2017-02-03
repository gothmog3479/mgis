package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "contract_calc_info", schema = "public", catalog = "mgis")
public class ContractCalcInfo {
    private Long id;
    private Timestamp endDate;
    private Timestamp startDate;
    private Double calculationRealResult;
    private Double calculationResult;
    private Long accuralId;
    private Long calcMethodId;
    private Long ownerId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "start_date", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "calculation_real_result", nullable = true, precision = 0)
    public Double getCalculationRealResult() {
        return calculationRealResult;
    }

    public void setCalculationRealResult(Double calculationRealResult) {
        this.calculationRealResult = calculationRealResult;
    }

    @Basic
    @Column(name = "calculation_result", nullable = true, precision = 0)
    public Double getCalculationResult() {
        return calculationResult;
    }

    public void setCalculationResult(Double calculationResult) {
        this.calculationResult = calculationResult;
    }

    @Basic
    @Column(name = "accural_id", nullable = true)
    public Long getAccuralId() {
        return accuralId;
    }

    public void setAccuralId(Long accuralId) {
        this.accuralId = accuralId;
    }

    @Basic
    @Column(name = "calc_method_id", nullable = true)
    public Long getCalcMethodId() {
        return calcMethodId;
    }

    public void setCalcMethodId(Long calcMethodId) {
        this.calcMethodId = calcMethodId;
    }

    @Basic
    @Column(name = "owner_id", nullable = true)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractCalcInfo that = (ContractCalcInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (calculationRealResult != null ? !calculationRealResult.equals(that.calculationRealResult) : that.calculationRealResult != null)
            return false;
        if (calculationResult != null ? !calculationResult.equals(that.calculationResult) : that.calculationResult != null)
            return false;
        if (accuralId != null ? !accuralId.equals(that.accuralId) : that.accuralId != null) return false;
        if (calcMethodId != null ? !calcMethodId.equals(that.calcMethodId) : that.calcMethodId != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (calculationRealResult != null ? calculationRealResult.hashCode() : 0);
        result = 31 * result + (calculationResult != null ? calculationResult.hashCode() : 0);
        result = 31 * result + (accuralId != null ? accuralId.hashCode() : 0);
        result = 31 * result + (calcMethodId != null ? calcMethodId.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        return result;
    }
}
