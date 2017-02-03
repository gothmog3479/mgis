package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contract_rent_date_assg_period_join", schema = "public", catalog = "mgis")
public class ContractRentDateAssgPeriodJoin {
    private Long assgId;
    private Long periodId;

    @Basic
    @Column(name = "assg_id", nullable = false)
    public Long getAssgId() {
        return assgId;
    }

    public void setAssgId(Long assgId) {
        this.assgId = assgId;
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

        ContractRentDateAssgPeriodJoin that = (ContractRentDateAssgPeriodJoin) o;

        if (assgId != null ? !assgId.equals(that.assgId) : that.assgId != null) return false;
        if (periodId != null ? !periodId.equals(that.periodId) : that.periodId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = assgId != null ? assgId.hashCode() : 0;
        result = 31 * result + (periodId != null ? periodId.hashCode() : 0);
        return result;
    }
}
