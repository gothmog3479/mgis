package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_external_customer_info", schema = "public", catalog = "mgis")
public class MilitaryExternalCustomerInfo {
    private Long id;
    private String baseWithin;
    private String buildingNum;
    private Boolean elAccounting;
    private Boolean heatAccounting;
    private Boolean waterAccounting;
    private Long customerId;
    private Long passportId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "base_within", nullable = true, length = 255)
    public String getBaseWithin() {
        return baseWithin;
    }

    public void setBaseWithin(String baseWithin) {
        this.baseWithin = baseWithin;
    }

    @Basic
    @Column(name = "building_num", nullable = true, length = 255)
    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    @Basic
    @Column(name = "el_accounting", nullable = true)
    public Boolean getElAccounting() {
        return elAccounting;
    }

    public void setElAccounting(Boolean elAccounting) {
        this.elAccounting = elAccounting;
    }

    @Basic
    @Column(name = "heat_accounting", nullable = true)
    public Boolean getHeatAccounting() {
        return heatAccounting;
    }

    public void setHeatAccounting(Boolean heatAccounting) {
        this.heatAccounting = heatAccounting;
    }

    @Basic
    @Column(name = "water_accounting", nullable = true)
    public Boolean getWaterAccounting() {
        return waterAccounting;
    }

    public void setWaterAccounting(Boolean waterAccounting) {
        this.waterAccounting = waterAccounting;
    }

    @Basic
    @Column(name = "customer_id", nullable = true)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "passport_id", nullable = true)
    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryExternalCustomerInfo that = (MilitaryExternalCustomerInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (baseWithin != null ? !baseWithin.equals(that.baseWithin) : that.baseWithin != null) return false;
        if (buildingNum != null ? !buildingNum.equals(that.buildingNum) : that.buildingNum != null) return false;
        if (elAccounting != null ? !elAccounting.equals(that.elAccounting) : that.elAccounting != null) return false;
        if (heatAccounting != null ? !heatAccounting.equals(that.heatAccounting) : that.heatAccounting != null)
            return false;
        if (waterAccounting != null ? !waterAccounting.equals(that.waterAccounting) : that.waterAccounting != null)
            return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (passportId != null ? !passportId.equals(that.passportId) : that.passportId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (baseWithin != null ? baseWithin.hashCode() : 0);
        result = 31 * result + (buildingNum != null ? buildingNum.hashCode() : 0);
        result = 31 * result + (elAccounting != null ? elAccounting.hashCode() : 0);
        result = 31 * result + (heatAccounting != null ? heatAccounting.hashCode() : 0);
        result = 31 * result + (waterAccounting != null ? waterAccounting.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (passportId != null ? passportId.hashCode() : 0);
        return result;
    }
}
