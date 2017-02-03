package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "building_military", schema = "public", catalog = "mgis")
public class BuildingMilitary {
    private Long id;
    private Long passportId;
    private String address;
    private String cantonment;
    private Double extraConsumersRoomsVolume;
    private Double hourlyHeatConsumptionForSteam;
    private Integer privateSecurityNumber;
    private Double specificHeatingCurve;
    private Double specificThermalPerformance;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "passport_id", nullable = true)
    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 1024)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "cantonment", nullable = true, length = 1024)
    public String getCantonment() {
        return cantonment;
    }

    public void setCantonment(String cantonment) {
        this.cantonment = cantonment;
    }

    @Basic
    @Column(name = "extra_consumers_rooms_volume", nullable = true, precision = 0)
    public Double getExtraConsumersRoomsVolume() {
        return extraConsumersRoomsVolume;
    }

    public void setExtraConsumersRoomsVolume(Double extraConsumersRoomsVolume) {
        this.extraConsumersRoomsVolume = extraConsumersRoomsVolume;
    }

    @Basic
    @Column(name = "hourly_heat_consumption_for_steam", nullable = true, precision = 0)
    public Double getHourlyHeatConsumptionForSteam() {
        return hourlyHeatConsumptionForSteam;
    }

    public void setHourlyHeatConsumptionForSteam(Double hourlyHeatConsumptionForSteam) {
        this.hourlyHeatConsumptionForSteam = hourlyHeatConsumptionForSteam;
    }

    @Basic
    @Column(name = "private_security_number", nullable = true)
    public Integer getPrivateSecurityNumber() {
        return privateSecurityNumber;
    }

    public void setPrivateSecurityNumber(Integer privateSecurityNumber) {
        this.privateSecurityNumber = privateSecurityNumber;
    }

    @Basic
    @Column(name = "specific_heating_curve", nullable = true, precision = 0)
    public Double getSpecificHeatingCurve() {
        return specificHeatingCurve;
    }

    public void setSpecificHeatingCurve(Double specificHeatingCurve) {
        this.specificHeatingCurve = specificHeatingCurve;
    }

    @Basic
    @Column(name = "specific_thermal_performance", nullable = true, precision = 0)
    public Double getSpecificThermalPerformance() {
        return specificThermalPerformance;
    }

    public void setSpecificThermalPerformance(Double specificThermalPerformance) {
        this.specificThermalPerformance = specificThermalPerformance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingMilitary that = (BuildingMilitary) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (passportId != null ? !passportId.equals(that.passportId) : that.passportId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (cantonment != null ? !cantonment.equals(that.cantonment) : that.cantonment != null) return false;
        if (extraConsumersRoomsVolume != null ? !extraConsumersRoomsVolume.equals(that.extraConsumersRoomsVolume) : that.extraConsumersRoomsVolume != null)
            return false;
        if (hourlyHeatConsumptionForSteam != null ? !hourlyHeatConsumptionForSteam.equals(that.hourlyHeatConsumptionForSteam) : that.hourlyHeatConsumptionForSteam != null)
            return false;
        if (privateSecurityNumber != null ? !privateSecurityNumber.equals(that.privateSecurityNumber) : that.privateSecurityNumber != null)
            return false;
        if (specificHeatingCurve != null ? !specificHeatingCurve.equals(that.specificHeatingCurve) : that.specificHeatingCurve != null)
            return false;
        if (specificThermalPerformance != null ? !specificThermalPerformance.equals(that.specificThermalPerformance) : that.specificThermalPerformance != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (passportId != null ? passportId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (cantonment != null ? cantonment.hashCode() : 0);
        result = 31 * result + (extraConsumersRoomsVolume != null ? extraConsumersRoomsVolume.hashCode() : 0);
        result = 31 * result + (hourlyHeatConsumptionForSteam != null ? hourlyHeatConsumptionForSteam.hashCode() : 0);
        result = 31 * result + (privateSecurityNumber != null ? privateSecurityNumber.hashCode() : 0);
        result = 31 * result + (specificHeatingCurve != null ? specificHeatingCurve.hashCode() : 0);
        result = 31 * result + (specificThermalPerformance != null ? specificThermalPerformance.hashCode() : 0);
        return result;
    }
}
