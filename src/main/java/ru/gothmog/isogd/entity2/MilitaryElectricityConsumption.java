package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_electricity_consumption", schema = "public", catalog = "mgis")
public class MilitaryElectricityConsumption {
    private Long id;
    private String accDeviceNum;
    private String accDeviceType;
    private String accountingPoint;
    private String currentTransformers;
    private String direction;
    private String powerHours;
    private Double technologicalLosses;
    private Double transformCoeff;
    private String voltageLevel;
    private Long electricitySupplyId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "acc_device_num", nullable = true, length = 255)
    public String getAccDeviceNum() {
        return accDeviceNum;
    }

    public void setAccDeviceNum(String accDeviceNum) {
        this.accDeviceNum = accDeviceNum;
    }

    @Basic
    @Column(name = "acc_device_type", nullable = true, length = 255)
    public String getAccDeviceType() {
        return accDeviceType;
    }

    public void setAccDeviceType(String accDeviceType) {
        this.accDeviceType = accDeviceType;
    }

    @Basic
    @Column(name = "accounting_point", nullable = true, length = 255)
    public String getAccountingPoint() {
        return accountingPoint;
    }

    public void setAccountingPoint(String accountingPoint) {
        this.accountingPoint = accountingPoint;
    }

    @Basic
    @Column(name = "current_transformers", nullable = true, length = 255)
    public String getCurrentTransformers() {
        return currentTransformers;
    }

    public void setCurrentTransformers(String currentTransformers) {
        this.currentTransformers = currentTransformers;
    }

    @Basic
    @Column(name = "direction", nullable = true, length = 255)
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Basic
    @Column(name = "power_hours", nullable = true, length = 255)
    public String getPowerHours() {
        return powerHours;
    }

    public void setPowerHours(String powerHours) {
        this.powerHours = powerHours;
    }

    @Basic
    @Column(name = "technological_losses", nullable = true, precision = 0)
    public Double getTechnologicalLosses() {
        return technologicalLosses;
    }

    public void setTechnologicalLosses(Double technologicalLosses) {
        this.technologicalLosses = technologicalLosses;
    }

    @Basic
    @Column(name = "transform_coeff", nullable = true, precision = 0)
    public Double getTransformCoeff() {
        return transformCoeff;
    }

    public void setTransformCoeff(Double transformCoeff) {
        this.transformCoeff = transformCoeff;
    }

    @Basic
    @Column(name = "voltage_level", nullable = true, length = 255)
    public String getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(String voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    @Basic
    @Column(name = "electricity_supply_id", nullable = true)
    public Long getElectricitySupplyId() {
        return electricitySupplyId;
    }

    public void setElectricitySupplyId(Long electricitySupplyId) {
        this.electricitySupplyId = electricitySupplyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryElectricityConsumption that = (MilitaryElectricityConsumption) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (accDeviceNum != null ? !accDeviceNum.equals(that.accDeviceNum) : that.accDeviceNum != null) return false;
        if (accDeviceType != null ? !accDeviceType.equals(that.accDeviceType) : that.accDeviceType != null)
            return false;
        if (accountingPoint != null ? !accountingPoint.equals(that.accountingPoint) : that.accountingPoint != null)
            return false;
        if (currentTransformers != null ? !currentTransformers.equals(that.currentTransformers) : that.currentTransformers != null)
            return false;
        if (direction != null ? !direction.equals(that.direction) : that.direction != null) return false;
        if (powerHours != null ? !powerHours.equals(that.powerHours) : that.powerHours != null) return false;
        if (technologicalLosses != null ? !technologicalLosses.equals(that.technologicalLosses) : that.technologicalLosses != null)
            return false;
        if (transformCoeff != null ? !transformCoeff.equals(that.transformCoeff) : that.transformCoeff != null)
            return false;
        if (voltageLevel != null ? !voltageLevel.equals(that.voltageLevel) : that.voltageLevel != null) return false;
        if (electricitySupplyId != null ? !electricitySupplyId.equals(that.electricitySupplyId) : that.electricitySupplyId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (accDeviceNum != null ? accDeviceNum.hashCode() : 0);
        result = 31 * result + (accDeviceType != null ? accDeviceType.hashCode() : 0);
        result = 31 * result + (accountingPoint != null ? accountingPoint.hashCode() : 0);
        result = 31 * result + (currentTransformers != null ? currentTransformers.hashCode() : 0);
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        result = 31 * result + (powerHours != null ? powerHours.hashCode() : 0);
        result = 31 * result + (technologicalLosses != null ? technologicalLosses.hashCode() : 0);
        result = 31 * result + (transformCoeff != null ? transformCoeff.hashCode() : 0);
        result = 31 * result + (voltageLevel != null ? voltageLevel.hashCode() : 0);
        result = 31 * result + (electricitySupplyId != null ? electricitySupplyId.hashCode() : 0);
        return result;
    }
}
