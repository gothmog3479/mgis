package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_profile", schema = "public", catalog = "mgis")
public class ContractProfile {
    private Long id;
    private Long subjectInfoId;
    private Long ownerId;
    private Long landInfoId;
    private Long zoneId;
    private String profileType;
    private Double purchasedCost;
    private Double purchasedSquare;
    private Long appointmentId;
    private String taxCalcType;
    private Double benefit;
    private Double tax;
    private Boolean taxCalcWithBenefit;
    private Boolean taxCalcFromFiscal;
    private Boolean taxCalcFromMungis;
    private Double tenderPrice;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "subject_info_id", nullable = true)
    public Long getSubjectInfoId() {
        return subjectInfoId;
    }

    public void setSubjectInfoId(Long subjectInfoId) {
        this.subjectInfoId = subjectInfoId;
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
    @Column(name = "land_info_id", nullable = true)
    public Long getLandInfoId() {
        return landInfoId;
    }

    public void setLandInfoId(Long landInfoId) {
        this.landInfoId = landInfoId;
    }

    @Basic
    @Column(name = "zone_id", nullable = true)
    public Long getZoneId() {
        return zoneId;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    @Basic
    @Column(name = "profile_type", nullable = false, length = 31)
    public String getProfileType() {
        return profileType;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    @Basic
    @Column(name = "purchased_cost", nullable = true, precision = 0)
    public Double getPurchasedCost() {
        return purchasedCost;
    }

    public void setPurchasedCost(Double purchasedCost) {
        this.purchasedCost = purchasedCost;
    }

    @Basic
    @Column(name = "purchased_square", nullable = true, precision = 0)
    public Double getPurchasedSquare() {
        return purchasedSquare;
    }

    public void setPurchasedSquare(Double purchasedSquare) {
        this.purchasedSquare = purchasedSquare;
    }

    @Basic
    @Column(name = "appointment_id", nullable = true)
    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Basic
    @Column(name = "tax_calc_type", nullable = true, length = 255)
    public String getTaxCalcType() {
        return taxCalcType;
    }

    public void setTaxCalcType(String taxCalcType) {
        this.taxCalcType = taxCalcType;
    }

    @Basic
    @Column(name = "benefit", nullable = true, precision = 0)
    public Double getBenefit() {
        return benefit;
    }

    public void setBenefit(Double benefit) {
        this.benefit = benefit;
    }

    @Basic
    @Column(name = "tax", nullable = true, precision = 0)
    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    @Basic
    @Column(name = "tax_calc_with_benefit", nullable = true)
    public Boolean getTaxCalcWithBenefit() {
        return taxCalcWithBenefit;
    }

    public void setTaxCalcWithBenefit(Boolean taxCalcWithBenefit) {
        this.taxCalcWithBenefit = taxCalcWithBenefit;
    }

    @Basic
    @Column(name = "tax_calc_from_fiscal", nullable = true)
    public Boolean getTaxCalcFromFiscal() {
        return taxCalcFromFiscal;
    }

    public void setTaxCalcFromFiscal(Boolean taxCalcFromFiscal) {
        this.taxCalcFromFiscal = taxCalcFromFiscal;
    }

    @Basic
    @Column(name = "tax_calc_from_mungis", nullable = true)
    public Boolean getTaxCalcFromMungis() {
        return taxCalcFromMungis;
    }

    public void setTaxCalcFromMungis(Boolean taxCalcFromMungis) {
        this.taxCalcFromMungis = taxCalcFromMungis;
    }

    @Basic
    @Column(name = "tender_price", nullable = true, precision = 0)
    public Double getTenderPrice() {
        return tenderPrice;
    }

    public void setTenderPrice(Double tenderPrice) {
        this.tenderPrice = tenderPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractProfile that = (ContractProfile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (subjectInfoId != null ? !subjectInfoId.equals(that.subjectInfoId) : that.subjectInfoId != null)
            return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (landInfoId != null ? !landInfoId.equals(that.landInfoId) : that.landInfoId != null) return false;
        if (zoneId != null ? !zoneId.equals(that.zoneId) : that.zoneId != null) return false;
        if (profileType != null ? !profileType.equals(that.profileType) : that.profileType != null) return false;
        if (purchasedCost != null ? !purchasedCost.equals(that.purchasedCost) : that.purchasedCost != null)
            return false;
        if (purchasedSquare != null ? !purchasedSquare.equals(that.purchasedSquare) : that.purchasedSquare != null)
            return false;
        if (appointmentId != null ? !appointmentId.equals(that.appointmentId) : that.appointmentId != null)
            return false;
        if (taxCalcType != null ? !taxCalcType.equals(that.taxCalcType) : that.taxCalcType != null) return false;
        if (benefit != null ? !benefit.equals(that.benefit) : that.benefit != null) return false;
        if (tax != null ? !tax.equals(that.tax) : that.tax != null) return false;
        if (taxCalcWithBenefit != null ? !taxCalcWithBenefit.equals(that.taxCalcWithBenefit) : that.taxCalcWithBenefit != null)
            return false;
        if (taxCalcFromFiscal != null ? !taxCalcFromFiscal.equals(that.taxCalcFromFiscal) : that.taxCalcFromFiscal != null)
            return false;
        if (taxCalcFromMungis != null ? !taxCalcFromMungis.equals(that.taxCalcFromMungis) : that.taxCalcFromMungis != null)
            return false;
        if (tenderPrice != null ? !tenderPrice.equals(that.tenderPrice) : that.tenderPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (subjectInfoId != null ? subjectInfoId.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (landInfoId != null ? landInfoId.hashCode() : 0);
        result = 31 * result + (zoneId != null ? zoneId.hashCode() : 0);
        result = 31 * result + (profileType != null ? profileType.hashCode() : 0);
        result = 31 * result + (purchasedCost != null ? purchasedCost.hashCode() : 0);
        result = 31 * result + (purchasedSquare != null ? purchasedSquare.hashCode() : 0);
        result = 31 * result + (appointmentId != null ? appointmentId.hashCode() : 0);
        result = 31 * result + (taxCalcType != null ? taxCalcType.hashCode() : 0);
        result = 31 * result + (benefit != null ? benefit.hashCode() : 0);
        result = 31 * result + (tax != null ? tax.hashCode() : 0);
        result = 31 * result + (taxCalcWithBenefit != null ? taxCalcWithBenefit.hashCode() : 0);
        result = 31 * result + (taxCalcFromFiscal != null ? taxCalcFromFiscal.hashCode() : 0);
        result = 31 * result + (taxCalcFromMungis != null ? taxCalcFromMungis.hashCode() : 0);
        result = 31 * result + (tenderPrice != null ? tenderPrice.hashCode() : 0);
        return result;
    }
}
