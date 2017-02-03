package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_water_supply", schema = "public", catalog = "mgis")
public class MilitaryWaterSupply {
    private Long id;
    private Double lengthExternalWaterSupply;
    private Double normConsumptionGvs;
    private Double normConsumptionHvs;
    private Long hvsSupplierId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "length_external_water_supply", nullable = true, precision = 0)
    public Double getLengthExternalWaterSupply() {
        return lengthExternalWaterSupply;
    }

    public void setLengthExternalWaterSupply(Double lengthExternalWaterSupply) {
        this.lengthExternalWaterSupply = lengthExternalWaterSupply;
    }

    @Basic
    @Column(name = "norm_consumption_gvs", nullable = true, precision = 0)
    public Double getNormConsumptionGvs() {
        return normConsumptionGvs;
    }

    public void setNormConsumptionGvs(Double normConsumptionGvs) {
        this.normConsumptionGvs = normConsumptionGvs;
    }

    @Basic
    @Column(name = "norm_consumption_hvs", nullable = true, precision = 0)
    public Double getNormConsumptionHvs() {
        return normConsumptionHvs;
    }

    public void setNormConsumptionHvs(Double normConsumptionHvs) {
        this.normConsumptionHvs = normConsumptionHvs;
    }

    @Basic
    @Column(name = "hvs_supplier_id", nullable = true)
    public Long getHvsSupplierId() {
        return hvsSupplierId;
    }

    public void setHvsSupplierId(Long hvsSupplierId) {
        this.hvsSupplierId = hvsSupplierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryWaterSupply that = (MilitaryWaterSupply) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lengthExternalWaterSupply != null ? !lengthExternalWaterSupply.equals(that.lengthExternalWaterSupply) : that.lengthExternalWaterSupply != null)
            return false;
        if (normConsumptionGvs != null ? !normConsumptionGvs.equals(that.normConsumptionGvs) : that.normConsumptionGvs != null)
            return false;
        if (normConsumptionHvs != null ? !normConsumptionHvs.equals(that.normConsumptionHvs) : that.normConsumptionHvs != null)
            return false;
        if (hvsSupplierId != null ? !hvsSupplierId.equals(that.hvsSupplierId) : that.hvsSupplierId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lengthExternalWaterSupply != null ? lengthExternalWaterSupply.hashCode() : 0);
        result = 31 * result + (normConsumptionGvs != null ? normConsumptionGvs.hashCode() : 0);
        result = 31 * result + (normConsumptionHvs != null ? normConsumptionHvs.hashCode() : 0);
        result = 31 * result + (hvsSupplierId != null ? hvsSupplierId.hashCode() : 0);
        return result;
    }
}
