package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "building_metering_device_electric", schema = "public", catalog = "mgis")
public class BuildingMeteringDeviceElectric {
    private Long id;
    private String comment;
    private String deviceNum;
    private String deviceType;
    private String direction;
    private String powerUseageHours;
    private Double processLosses;
    private String ratedVoltageLevel;
    private Double transfCoeff;
    private String transformersCurrent;
    private String transformersVoltage;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 4096)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "device_num", nullable = true, length = 255)
    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum;
    }

    @Basic
    @Column(name = "device_type", nullable = true, length = 255)
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
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
    @Column(name = "power_useage_hours", nullable = true, length = 255)
    public String getPowerUseageHours() {
        return powerUseageHours;
    }

    public void setPowerUseageHours(String powerUseageHours) {
        this.powerUseageHours = powerUseageHours;
    }

    @Basic
    @Column(name = "process_losses", nullable = true, precision = 0)
    public Double getProcessLosses() {
        return processLosses;
    }

    public void setProcessLosses(Double processLosses) {
        this.processLosses = processLosses;
    }

    @Basic
    @Column(name = "rated_voltage_level", nullable = true, length = 255)
    public String getRatedVoltageLevel() {
        return ratedVoltageLevel;
    }

    public void setRatedVoltageLevel(String ratedVoltageLevel) {
        this.ratedVoltageLevel = ratedVoltageLevel;
    }

    @Basic
    @Column(name = "transf_coeff", nullable = true, precision = 0)
    public Double getTransfCoeff() {
        return transfCoeff;
    }

    public void setTransfCoeff(Double transfCoeff) {
        this.transfCoeff = transfCoeff;
    }

    @Basic
    @Column(name = "transformers_current", nullable = true, length = 255)
    public String getTransformersCurrent() {
        return transformersCurrent;
    }

    public void setTransformersCurrent(String transformersCurrent) {
        this.transformersCurrent = transformersCurrent;
    }

    @Basic
    @Column(name = "transformers_voltage", nullable = true, length = 255)
    public String getTransformersVoltage() {
        return transformersVoltage;
    }

    public void setTransformersVoltage(String transformersVoltage) {
        this.transformersVoltage = transformersVoltage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingMeteringDeviceElectric that = (BuildingMeteringDeviceElectric) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (deviceNum != null ? !deviceNum.equals(that.deviceNum) : that.deviceNum != null) return false;
        if (deviceType != null ? !deviceType.equals(that.deviceType) : that.deviceType != null) return false;
        if (direction != null ? !direction.equals(that.direction) : that.direction != null) return false;
        if (powerUseageHours != null ? !powerUseageHours.equals(that.powerUseageHours) : that.powerUseageHours != null)
            return false;
        if (processLosses != null ? !processLosses.equals(that.processLosses) : that.processLosses != null)
            return false;
        if (ratedVoltageLevel != null ? !ratedVoltageLevel.equals(that.ratedVoltageLevel) : that.ratedVoltageLevel != null)
            return false;
        if (transfCoeff != null ? !transfCoeff.equals(that.transfCoeff) : that.transfCoeff != null) return false;
        if (transformersCurrent != null ? !transformersCurrent.equals(that.transformersCurrent) : that.transformersCurrent != null)
            return false;
        if (transformersVoltage != null ? !transformersVoltage.equals(that.transformersVoltage) : that.transformersVoltage != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (deviceNum != null ? deviceNum.hashCode() : 0);
        result = 31 * result + (deviceType != null ? deviceType.hashCode() : 0);
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        result = 31 * result + (powerUseageHours != null ? powerUseageHours.hashCode() : 0);
        result = 31 * result + (processLosses != null ? processLosses.hashCode() : 0);
        result = 31 * result + (ratedVoltageLevel != null ? ratedVoltageLevel.hashCode() : 0);
        result = 31 * result + (transfCoeff != null ? transfCoeff.hashCode() : 0);
        result = 31 * result + (transformersCurrent != null ? transformersCurrent.hashCode() : 0);
        result = 31 * result + (transformersVoltage != null ? transformersVoltage.hashCode() : 0);
        return result;
    }
}
