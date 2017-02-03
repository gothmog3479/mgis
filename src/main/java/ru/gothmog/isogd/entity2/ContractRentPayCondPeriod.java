package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "contract_rent_pay_cond_period", schema = "public", catalog = "mgis")
public class ContractRentPayCondPeriod {
    private Long id;
    private Timestamp endDate;
    private Timestamp startDate;
    private String name;
    private Long ownerId;
    private Long payConditionId;
    private String patCondType;

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
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "owner_id", nullable = true)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "pay_condition_id", nullable = true)
    public Long getPayConditionId() {
        return payConditionId;
    }

    public void setPayConditionId(Long payConditionId) {
        this.payConditionId = payConditionId;
    }

    @Basic
    @Column(name = "pat_cond_type", nullable = false, length = 31)
    public String getPatCondType() {
        return patCondType;
    }

    public void setPatCondType(String patCondType) {
        this.patCondType = patCondType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractRentPayCondPeriod that = (ContractRentPayCondPeriod) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (payConditionId != null ? !payConditionId.equals(that.payConditionId) : that.payConditionId != null)
            return false;
        if (patCondType != null ? !patCondType.equals(that.patCondType) : that.patCondType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (payConditionId != null ? payConditionId.hashCode() : 0);
        result = 31 * result + (patCondType != null ? patCondType.hashCode() : 0);
        return result;
    }
}
