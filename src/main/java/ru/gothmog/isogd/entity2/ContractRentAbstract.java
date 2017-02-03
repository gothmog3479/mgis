package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "contract_rent_abstract", schema = "public", catalog = "mgis")
public class ContractRentAbstract {
    private Date accuralsBegDate;
    private Date penaltiesBegDate;
    private Date validityBegDate;
    private Integer valudityDay;
    private Date validityEndDate;
    private Integer valudityMonth;
    private Integer validityYear;
    private Long id;
    private Long paymentMethodId;
    private Boolean valudityEndDateCalculated;

    @Basic
    @Column(name = "accurals_beg_date", nullable = true)
    public Date getAccuralsBegDate() {
        return accuralsBegDate;
    }

    public void setAccuralsBegDate(Date accuralsBegDate) {
        this.accuralsBegDate = accuralsBegDate;
    }

    @Basic
    @Column(name = "penalties_beg_date", nullable = true)
    public Date getPenaltiesBegDate() {
        return penaltiesBegDate;
    }

    public void setPenaltiesBegDate(Date penaltiesBegDate) {
        this.penaltiesBegDate = penaltiesBegDate;
    }

    @Basic
    @Column(name = "validity_beg_date", nullable = true)
    public Date getValidityBegDate() {
        return validityBegDate;
    }

    public void setValidityBegDate(Date validityBegDate) {
        this.validityBegDate = validityBegDate;
    }

    @Basic
    @Column(name = "valudity_day", nullable = true)
    public Integer getValudityDay() {
        return valudityDay;
    }

    public void setValudityDay(Integer valudityDay) {
        this.valudityDay = valudityDay;
    }

    @Basic
    @Column(name = "validity_end_date", nullable = true)
    public Date getValidityEndDate() {
        return validityEndDate;
    }

    public void setValidityEndDate(Date validityEndDate) {
        this.validityEndDate = validityEndDate;
    }

    @Basic
    @Column(name = "valudity_month", nullable = true)
    public Integer getValudityMonth() {
        return valudityMonth;
    }

    public void setValudityMonth(Integer valudityMonth) {
        this.valudityMonth = valudityMonth;
    }

    @Basic
    @Column(name = "validity_year", nullable = true)
    public Integer getValidityYear() {
        return validityYear;
    }

    public void setValidityYear(Integer validityYear) {
        this.validityYear = validityYear;
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
    @Column(name = "payment_method_id", nullable = true)
    public Long getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Long paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    @Basic
    @Column(name = "valudity_end_date_calculated", nullable = true)
    public Boolean getValudityEndDateCalculated() {
        return valudityEndDateCalculated;
    }

    public void setValudityEndDateCalculated(Boolean valudityEndDateCalculated) {
        this.valudityEndDateCalculated = valudityEndDateCalculated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractRentAbstract that = (ContractRentAbstract) o;

        if (accuralsBegDate != null ? !accuralsBegDate.equals(that.accuralsBegDate) : that.accuralsBegDate != null)
            return false;
        if (penaltiesBegDate != null ? !penaltiesBegDate.equals(that.penaltiesBegDate) : that.penaltiesBegDate != null)
            return false;
        if (validityBegDate != null ? !validityBegDate.equals(that.validityBegDate) : that.validityBegDate != null)
            return false;
        if (valudityDay != null ? !valudityDay.equals(that.valudityDay) : that.valudityDay != null) return false;
        if (validityEndDate != null ? !validityEndDate.equals(that.validityEndDate) : that.validityEndDate != null)
            return false;
        if (valudityMonth != null ? !valudityMonth.equals(that.valudityMonth) : that.valudityMonth != null)
            return false;
        if (validityYear != null ? !validityYear.equals(that.validityYear) : that.validityYear != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paymentMethodId != null ? !paymentMethodId.equals(that.paymentMethodId) : that.paymentMethodId != null)
            return false;
        if (valudityEndDateCalculated != null ? !valudityEndDateCalculated.equals(that.valudityEndDateCalculated) : that.valudityEndDateCalculated != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accuralsBegDate != null ? accuralsBegDate.hashCode() : 0;
        result = 31 * result + (penaltiesBegDate != null ? penaltiesBegDate.hashCode() : 0);
        result = 31 * result + (validityBegDate != null ? validityBegDate.hashCode() : 0);
        result = 31 * result + (valudityDay != null ? valudityDay.hashCode() : 0);
        result = 31 * result + (validityEndDate != null ? validityEndDate.hashCode() : 0);
        result = 31 * result + (valudityMonth != null ? valudityMonth.hashCode() : 0);
        result = 31 * result + (validityYear != null ? validityYear.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (paymentMethodId != null ? paymentMethodId.hashCode() : 0);
        result = 31 * result + (valudityEndDateCalculated != null ? valudityEndDateCalculated.hashCode() : 0);
        return result;
    }
}
