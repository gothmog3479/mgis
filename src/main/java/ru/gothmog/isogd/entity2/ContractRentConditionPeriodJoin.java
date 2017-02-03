package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contract_rent_condition_period_join", schema = "public", catalog = "mgis")
public class ContractRentConditionPeriodJoin {
    private Long conditionId;
    private Long periodId;

    @Basic
    @Column(name = "condition_id", nullable = false)
    public Long getConditionId() {
        return conditionId;
    }

    public void setConditionId(Long conditionId) {
        this.conditionId = conditionId;
    }

    @Basic
    @Column(name = "period_id", nullable = false)
    public Long getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Long periodId) {
        this.periodId = periodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractRentConditionPeriodJoin that = (ContractRentConditionPeriodJoin) o;

        if (conditionId != null ? !conditionId.equals(that.conditionId) : that.conditionId != null) return false;
        if (periodId != null ? !periodId.equals(that.periodId) : that.periodId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = conditionId != null ? conditionId.hashCode() : 0;
        result = 31 * result + (periodId != null ? periodId.hashCode() : 0);
        return result;
    }
}
