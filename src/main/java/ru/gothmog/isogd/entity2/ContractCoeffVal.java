package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "contract_coeff_val", schema = "public", catalog = "mgis")
public class ContractCoeffVal {
    private Long id;
    private Timestamp endDate;
    private Timestamp startDate;
    private Double coffValue;
    private Long coefficientId;

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
    @Column(name = "coff_value", nullable = true, precision = 0)
    public Double getCoffValue() {
        return coffValue;
    }

    public void setCoffValue(Double coffValue) {
        this.coffValue = coffValue;
    }

    @Basic
    @Column(name = "coefficient_id", nullable = true)
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

        ContractCoeffVal that = (ContractCoeffVal) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (coffValue != null ? !coffValue.equals(that.coffValue) : that.coffValue != null) return false;
        if (coefficientId != null ? !coefficientId.equals(that.coefficientId) : that.coefficientId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (coffValue != null ? coffValue.hashCode() : 0);
        result = 31 * result + (coefficientId != null ? coefficientId.hashCode() : 0);
        return result;
    }
}
