package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "building_tech_info", schema = "public", catalog = "mgis")
public class BuildingTechInfo {
    private Long id;
    private Boolean alarmSystem;
    private String baseOperating;
    private Double buildingVolume;
    private Integer buildingYear;
    private Boolean coldWaterSupply;
    private Boolean conditioning;
    private Boolean electricPowerSupply;
    private Boolean equipmentPools;
    private Boolean fireAlarms;
    private Boolean fireExtinguishingSystem;
    private Boolean gasSupply;
    private Boolean heating;
    private Boolean hotWaterSupply;
    private Boolean lightningProtectionSystem;
    private Integer numberOfStoreys;
    private String serviceIndex;
    private Boolean sewerage;
    private Boolean smokeExhaustSystem;
    private Boolean steamSupply;
    private Boolean technologicalSystemOfGasSupply;
    private Boolean ventilation;
    private String wallMaterial;
    private Long techStateId;
    private Integer saturationIndex;
    private Integer commissioningYear;
    private Double percentageOfWear;
    private Integer yearLastOverhaul;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "alarm_system", nullable = true)
    public Boolean getAlarmSystem() {
        return alarmSystem;
    }

    public void setAlarmSystem(Boolean alarmSystem) {
        this.alarmSystem = alarmSystem;
    }

    @Basic
    @Column(name = "base_operating", nullable = true, length = 1024)
    public String getBaseOperating() {
        return baseOperating;
    }

    public void setBaseOperating(String baseOperating) {
        this.baseOperating = baseOperating;
    }

    @Basic
    @Column(name = "building_volume", nullable = true, precision = 0)
    public Double getBuildingVolume() {
        return buildingVolume;
    }

    public void setBuildingVolume(Double buildingVolume) {
        this.buildingVolume = buildingVolume;
    }

    @Basic
    @Column(name = "building_year", nullable = true)
    public Integer getBuildingYear() {
        return buildingYear;
    }

    public void setBuildingYear(Integer buildingYear) {
        this.buildingYear = buildingYear;
    }

    @Basic
    @Column(name = "cold_water_supply", nullable = true)
    public Boolean getColdWaterSupply() {
        return coldWaterSupply;
    }

    public void setColdWaterSupply(Boolean coldWaterSupply) {
        this.coldWaterSupply = coldWaterSupply;
    }

    @Basic
    @Column(name = "conditioning", nullable = true)
    public Boolean getConditioning() {
        return conditioning;
    }

    public void setConditioning(Boolean conditioning) {
        this.conditioning = conditioning;
    }

    @Basic
    @Column(name = "electric_power_supply", nullable = true)
    public Boolean getElectricPowerSupply() {
        return electricPowerSupply;
    }

    public void setElectricPowerSupply(Boolean electricPowerSupply) {
        this.electricPowerSupply = electricPowerSupply;
    }

    @Basic
    @Column(name = "equipment_pools", nullable = true)
    public Boolean getEquipmentPools() {
        return equipmentPools;
    }

    public void setEquipmentPools(Boolean equipmentPools) {
        this.equipmentPools = equipmentPools;
    }

    @Basic
    @Column(name = "fire_alarms", nullable = true)
    public Boolean getFireAlarms() {
        return fireAlarms;
    }

    public void setFireAlarms(Boolean fireAlarms) {
        this.fireAlarms = fireAlarms;
    }

    @Basic
    @Column(name = "fire_extinguishing_system", nullable = true)
    public Boolean getFireExtinguishingSystem() {
        return fireExtinguishingSystem;
    }

    public void setFireExtinguishingSystem(Boolean fireExtinguishingSystem) {
        this.fireExtinguishingSystem = fireExtinguishingSystem;
    }

    @Basic
    @Column(name = "gas_supply", nullable = true)
    public Boolean getGasSupply() {
        return gasSupply;
    }

    public void setGasSupply(Boolean gasSupply) {
        this.gasSupply = gasSupply;
    }

    @Basic
    @Column(name = "heating", nullable = true)
    public Boolean getHeating() {
        return heating;
    }

    public void setHeating(Boolean heating) {
        this.heating = heating;
    }

    @Basic
    @Column(name = "hot_water_supply", nullable = true)
    public Boolean getHotWaterSupply() {
        return hotWaterSupply;
    }

    public void setHotWaterSupply(Boolean hotWaterSupply) {
        this.hotWaterSupply = hotWaterSupply;
    }

    @Basic
    @Column(name = "lightning_protection_system", nullable = true)
    public Boolean getLightningProtectionSystem() {
        return lightningProtectionSystem;
    }

    public void setLightningProtectionSystem(Boolean lightningProtectionSystem) {
        this.lightningProtectionSystem = lightningProtectionSystem;
    }

    @Basic
    @Column(name = "number_of_storeys", nullable = true)
    public Integer getNumberOfStoreys() {
        return numberOfStoreys;
    }

    public void setNumberOfStoreys(Integer numberOfStoreys) {
        this.numberOfStoreys = numberOfStoreys;
    }

    @Basic
    @Column(name = "service_index", nullable = true, length = 255)
    public String getServiceIndex() {
        return serviceIndex;
    }

    public void setServiceIndex(String serviceIndex) {
        this.serviceIndex = serviceIndex;
    }

    @Basic
    @Column(name = "sewerage", nullable = true)
    public Boolean getSewerage() {
        return sewerage;
    }

    public void setSewerage(Boolean sewerage) {
        this.sewerage = sewerage;
    }

    @Basic
    @Column(name = "smoke_exhaust_system", nullable = true)
    public Boolean getSmokeExhaustSystem() {
        return smokeExhaustSystem;
    }

    public void setSmokeExhaustSystem(Boolean smokeExhaustSystem) {
        this.smokeExhaustSystem = smokeExhaustSystem;
    }

    @Basic
    @Column(name = "steam_supply", nullable = true)
    public Boolean getSteamSupply() {
        return steamSupply;
    }

    public void setSteamSupply(Boolean steamSupply) {
        this.steamSupply = steamSupply;
    }

    @Basic
    @Column(name = "technological_system_of_gas_supply", nullable = true)
    public Boolean getTechnologicalSystemOfGasSupply() {
        return technologicalSystemOfGasSupply;
    }

    public void setTechnologicalSystemOfGasSupply(Boolean technologicalSystemOfGasSupply) {
        this.technologicalSystemOfGasSupply = technologicalSystemOfGasSupply;
    }

    @Basic
    @Column(name = "ventilation", nullable = true)
    public Boolean getVentilation() {
        return ventilation;
    }

    public void setVentilation(Boolean ventilation) {
        this.ventilation = ventilation;
    }

    @Basic
    @Column(name = "wall_material", nullable = true, length = 255)
    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    @Basic
    @Column(name = "tech_state_id", nullable = true)
    public Long getTechStateId() {
        return techStateId;
    }

    public void setTechStateId(Long techStateId) {
        this.techStateId = techStateId;
    }

    @Basic
    @Column(name = "saturation_index", nullable = true)
    public Integer getSaturationIndex() {
        return saturationIndex;
    }

    public void setSaturationIndex(Integer saturationIndex) {
        this.saturationIndex = saturationIndex;
    }

    @Basic
    @Column(name = "commissioning_year", nullable = true)
    public Integer getCommissioningYear() {
        return commissioningYear;
    }

    public void setCommissioningYear(Integer commissioningYear) {
        this.commissioningYear = commissioningYear;
    }

    @Basic
    @Column(name = "percentage_of_wear", nullable = true, precision = 0)
    public Double getPercentageOfWear() {
        return percentageOfWear;
    }

    public void setPercentageOfWear(Double percentageOfWear) {
        this.percentageOfWear = percentageOfWear;
    }

    @Basic
    @Column(name = "year_last_overhaul", nullable = true)
    public Integer getYearLastOverhaul() {
        return yearLastOverhaul;
    }

    public void setYearLastOverhaul(Integer yearLastOverhaul) {
        this.yearLastOverhaul = yearLastOverhaul;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingTechInfo that = (BuildingTechInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (alarmSystem != null ? !alarmSystem.equals(that.alarmSystem) : that.alarmSystem != null) return false;
        if (baseOperating != null ? !baseOperating.equals(that.baseOperating) : that.baseOperating != null)
            return false;
        if (buildingVolume != null ? !buildingVolume.equals(that.buildingVolume) : that.buildingVolume != null)
            return false;
        if (buildingYear != null ? !buildingYear.equals(that.buildingYear) : that.buildingYear != null) return false;
        if (coldWaterSupply != null ? !coldWaterSupply.equals(that.coldWaterSupply) : that.coldWaterSupply != null)
            return false;
        if (conditioning != null ? !conditioning.equals(that.conditioning) : that.conditioning != null) return false;
        if (electricPowerSupply != null ? !electricPowerSupply.equals(that.electricPowerSupply) : that.electricPowerSupply != null)
            return false;
        if (equipmentPools != null ? !equipmentPools.equals(that.equipmentPools) : that.equipmentPools != null)
            return false;
        if (fireAlarms != null ? !fireAlarms.equals(that.fireAlarms) : that.fireAlarms != null) return false;
        if (fireExtinguishingSystem != null ? !fireExtinguishingSystem.equals(that.fireExtinguishingSystem) : that.fireExtinguishingSystem != null)
            return false;
        if (gasSupply != null ? !gasSupply.equals(that.gasSupply) : that.gasSupply != null) return false;
        if (heating != null ? !heating.equals(that.heating) : that.heating != null) return false;
        if (hotWaterSupply != null ? !hotWaterSupply.equals(that.hotWaterSupply) : that.hotWaterSupply != null)
            return false;
        if (lightningProtectionSystem != null ? !lightningProtectionSystem.equals(that.lightningProtectionSystem) : that.lightningProtectionSystem != null)
            return false;
        if (numberOfStoreys != null ? !numberOfStoreys.equals(that.numberOfStoreys) : that.numberOfStoreys != null)
            return false;
        if (serviceIndex != null ? !serviceIndex.equals(that.serviceIndex) : that.serviceIndex != null) return false;
        if (sewerage != null ? !sewerage.equals(that.sewerage) : that.sewerage != null) return false;
        if (smokeExhaustSystem != null ? !smokeExhaustSystem.equals(that.smokeExhaustSystem) : that.smokeExhaustSystem != null)
            return false;
        if (steamSupply != null ? !steamSupply.equals(that.steamSupply) : that.steamSupply != null) return false;
        if (technologicalSystemOfGasSupply != null ? !technologicalSystemOfGasSupply.equals(that.technologicalSystemOfGasSupply) : that.technologicalSystemOfGasSupply != null)
            return false;
        if (ventilation != null ? !ventilation.equals(that.ventilation) : that.ventilation != null) return false;
        if (wallMaterial != null ? !wallMaterial.equals(that.wallMaterial) : that.wallMaterial != null) return false;
        if (techStateId != null ? !techStateId.equals(that.techStateId) : that.techStateId != null) return false;
        if (saturationIndex != null ? !saturationIndex.equals(that.saturationIndex) : that.saturationIndex != null)
            return false;
        if (commissioningYear != null ? !commissioningYear.equals(that.commissioningYear) : that.commissioningYear != null)
            return false;
        if (percentageOfWear != null ? !percentageOfWear.equals(that.percentageOfWear) : that.percentageOfWear != null)
            return false;
        if (yearLastOverhaul != null ? !yearLastOverhaul.equals(that.yearLastOverhaul) : that.yearLastOverhaul != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (alarmSystem != null ? alarmSystem.hashCode() : 0);
        result = 31 * result + (baseOperating != null ? baseOperating.hashCode() : 0);
        result = 31 * result + (buildingVolume != null ? buildingVolume.hashCode() : 0);
        result = 31 * result + (buildingYear != null ? buildingYear.hashCode() : 0);
        result = 31 * result + (coldWaterSupply != null ? coldWaterSupply.hashCode() : 0);
        result = 31 * result + (conditioning != null ? conditioning.hashCode() : 0);
        result = 31 * result + (electricPowerSupply != null ? electricPowerSupply.hashCode() : 0);
        result = 31 * result + (equipmentPools != null ? equipmentPools.hashCode() : 0);
        result = 31 * result + (fireAlarms != null ? fireAlarms.hashCode() : 0);
        result = 31 * result + (fireExtinguishingSystem != null ? fireExtinguishingSystem.hashCode() : 0);
        result = 31 * result + (gasSupply != null ? gasSupply.hashCode() : 0);
        result = 31 * result + (heating != null ? heating.hashCode() : 0);
        result = 31 * result + (hotWaterSupply != null ? hotWaterSupply.hashCode() : 0);
        result = 31 * result + (lightningProtectionSystem != null ? lightningProtectionSystem.hashCode() : 0);
        result = 31 * result + (numberOfStoreys != null ? numberOfStoreys.hashCode() : 0);
        result = 31 * result + (serviceIndex != null ? serviceIndex.hashCode() : 0);
        result = 31 * result + (sewerage != null ? sewerage.hashCode() : 0);
        result = 31 * result + (smokeExhaustSystem != null ? smokeExhaustSystem.hashCode() : 0);
        result = 31 * result + (steamSupply != null ? steamSupply.hashCode() : 0);
        result = 31 * result + (technologicalSystemOfGasSupply != null ? technologicalSystemOfGasSupply.hashCode() : 0);
        result = 31 * result + (ventilation != null ? ventilation.hashCode() : 0);
        result = 31 * result + (wallMaterial != null ? wallMaterial.hashCode() : 0);
        result = 31 * result + (techStateId != null ? techStateId.hashCode() : 0);
        result = 31 * result + (saturationIndex != null ? saturationIndex.hashCode() : 0);
        result = 31 * result + (commissioningYear != null ? commissioningYear.hashCode() : 0);
        result = 31 * result + (percentageOfWear != null ? percentageOfWear.hashCode() : 0);
        result = 31 * result + (yearLastOverhaul != null ? yearLastOverhaul.hashCode() : 0);
        return result;
    }
}
