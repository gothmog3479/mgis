package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "contract_claims", schema = "public", catalog = "mgis")
public class ContractClaims {
    private Long id;
    private Date claimDate;
    private Integer forYear;
    private Double penaltiesValue;
    private Double rentPayment;
    private String userNote;
    private String reviewNum;
    private String reviewPeriod;
    private String reviewResult;
    private Boolean sendToSgo;
    private Long ownerId;
    private String claimType;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "claim_date", nullable = true)
    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    @Basic
    @Column(name = "for_year", nullable = true)
    public Integer getForYear() {
        return forYear;
    }

    public void setForYear(Integer forYear) {
        this.forYear = forYear;
    }

    @Basic
    @Column(name = "penalties_value", nullable = true, precision = 0)
    public Double getPenaltiesValue() {
        return penaltiesValue;
    }

    public void setPenaltiesValue(Double penaltiesValue) {
        this.penaltiesValue = penaltiesValue;
    }

    @Basic
    @Column(name = "rent_payment", nullable = true, precision = 0)
    public Double getRentPayment() {
        return rentPayment;
    }

    public void setRentPayment(Double rentPayment) {
        this.rentPayment = rentPayment;
    }

    @Basic
    @Column(name = "user_note", nullable = true, length = 255)
    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    @Basic
    @Column(name = "review_num", nullable = true, length = 255)
    public String getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(String reviewNum) {
        this.reviewNum = reviewNum;
    }

    @Basic
    @Column(name = "review_period", nullable = true, length = 255)
    public String getReviewPeriod() {
        return reviewPeriod;
    }

    public void setReviewPeriod(String reviewPeriod) {
        this.reviewPeriod = reviewPeriod;
    }

    @Basic
    @Column(name = "review_result", nullable = true, length = 255)
    public String getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
    }

    @Basic
    @Column(name = "send_to_sgo", nullable = true)
    public Boolean getSendToSgo() {
        return sendToSgo;
    }

    public void setSendToSgo(Boolean sendToSgo) {
        this.sendToSgo = sendToSgo;
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
    @Column(name = "claim_type", nullable = false, length = 31)
    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractClaims that = (ContractClaims) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (claimDate != null ? !claimDate.equals(that.claimDate) : that.claimDate != null) return false;
        if (forYear != null ? !forYear.equals(that.forYear) : that.forYear != null) return false;
        if (penaltiesValue != null ? !penaltiesValue.equals(that.penaltiesValue) : that.penaltiesValue != null)
            return false;
        if (rentPayment != null ? !rentPayment.equals(that.rentPayment) : that.rentPayment != null) return false;
        if (userNote != null ? !userNote.equals(that.userNote) : that.userNote != null) return false;
        if (reviewNum != null ? !reviewNum.equals(that.reviewNum) : that.reviewNum != null) return false;
        if (reviewPeriod != null ? !reviewPeriod.equals(that.reviewPeriod) : that.reviewPeriod != null) return false;
        if (reviewResult != null ? !reviewResult.equals(that.reviewResult) : that.reviewResult != null) return false;
        if (sendToSgo != null ? !sendToSgo.equals(that.sendToSgo) : that.sendToSgo != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (claimType != null ? !claimType.equals(that.claimType) : that.claimType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (claimDate != null ? claimDate.hashCode() : 0);
        result = 31 * result + (forYear != null ? forYear.hashCode() : 0);
        result = 31 * result + (penaltiesValue != null ? penaltiesValue.hashCode() : 0);
        result = 31 * result + (rentPayment != null ? rentPayment.hashCode() : 0);
        result = 31 * result + (userNote != null ? userNote.hashCode() : 0);
        result = 31 * result + (reviewNum != null ? reviewNum.hashCode() : 0);
        result = 31 * result + (reviewPeriod != null ? reviewPeriod.hashCode() : 0);
        result = 31 * result + (reviewResult != null ? reviewResult.hashCode() : 0);
        result = 31 * result + (sendToSgo != null ? sendToSgo.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (claimType != null ? claimType.hashCode() : 0);
        return result;
    }
}
