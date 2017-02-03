package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_wastewater", schema = "public", catalog = "mgis")
public class MilitaryWastewater {
    private Long id;
    private Double lengthExternalSewerage;
    private Double normConsumptionSanitation;
    private Long companyReceivingRunoffId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "length_external_sewerage", nullable = true, precision = 0)
    public Double getLengthExternalSewerage() {
        return lengthExternalSewerage;
    }

    public void setLengthExternalSewerage(Double lengthExternalSewerage) {
        this.lengthExternalSewerage = lengthExternalSewerage;
    }

    @Basic
    @Column(name = "norm_consumption_sanitation", nullable = true, precision = 0)
    public Double getNormConsumptionSanitation() {
        return normConsumptionSanitation;
    }

    public void setNormConsumptionSanitation(Double normConsumptionSanitation) {
        this.normConsumptionSanitation = normConsumptionSanitation;
    }

    @Basic
    @Column(name = "company_receiving_runoff_id", nullable = true)
    public Long getCompanyReceivingRunoffId() {
        return companyReceivingRunoffId;
    }

    public void setCompanyReceivingRunoffId(Long companyReceivingRunoffId) {
        this.companyReceivingRunoffId = companyReceivingRunoffId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryWastewater that = (MilitaryWastewater) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lengthExternalSewerage != null ? !lengthExternalSewerage.equals(that.lengthExternalSewerage) : that.lengthExternalSewerage != null)
            return false;
        if (normConsumptionSanitation != null ? !normConsumptionSanitation.equals(that.normConsumptionSanitation) : that.normConsumptionSanitation != null)
            return false;
        if (companyReceivingRunoffId != null ? !companyReceivingRunoffId.equals(that.companyReceivingRunoffId) : that.companyReceivingRunoffId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lengthExternalSewerage != null ? lengthExternalSewerage.hashCode() : 0);
        result = 31 * result + (normConsumptionSanitation != null ? normConsumptionSanitation.hashCode() : 0);
        result = 31 * result + (companyReceivingRunoffId != null ? companyReceivingRunoffId.hashCode() : 0);
        return result;
    }
}
