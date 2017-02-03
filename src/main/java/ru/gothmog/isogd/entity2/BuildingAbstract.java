package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "building_abstract", schema = "public", catalog = "mgis")
public class BuildingAbstract {
    private Long id;
    private Double grossArea;
    private String masterPlanNum;
    private String purpose;
    private String title;
    private Long techInfoId;
    private Double buildingHeight;
    private String status;
    private Double extraConsumersRoomsVolume;
    private Double hourlyHeatConsumptionForSteam;
    private Integer privatesecuritynumber;
    private Double specificHeatingCurve;
    private Double specificThermalPerformance;
    private String ctxSearchField;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "gross_area", nullable = true, precision = 0)
    public Double getGrossArea() {
        return grossArea;
    }

    public void setGrossArea(Double grossArea) {
        this.grossArea = grossArea;
    }

    @Basic
    @Column(name = "master_plan_num", nullable = true, length = 255)
    public String getMasterPlanNum() {
        return masterPlanNum;
    }

    public void setMasterPlanNum(String masterPlanNum) {
        this.masterPlanNum = masterPlanNum;
    }

    @Basic
    @Column(name = "purpose", nullable = true, length = 255)
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 1024)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "tech_info_id", nullable = true)
    public Long getTechInfoId() {
        return techInfoId;
    }

    public void setTechInfoId(Long techInfoId) {
        this.techInfoId = techInfoId;
    }

    @Basic
    @Column(name = "building_height", nullable = true, precision = 0)
    public Double getBuildingHeight() {
        return buildingHeight;
    }

    public void setBuildingHeight(Double buildingHeight) {
        this.buildingHeight = buildingHeight;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "privatesecuritynumber", nullable = true)
    public Integer getPrivatesecuritynumber() {
        return privatesecuritynumber;
    }

    public void setPrivatesecuritynumber(Integer privatesecuritynumber) {
        this.privatesecuritynumber = privatesecuritynumber;
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

    @Basic
    @Column(name = "ctx_search_field", nullable = true, length = 4096)
    public String getCtxSearchField() {
        return ctxSearchField;
    }

    public void setCtxSearchField(String ctxSearchField) {
        this.ctxSearchField = ctxSearchField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingAbstract that = (BuildingAbstract) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (grossArea != null ? !grossArea.equals(that.grossArea) : that.grossArea != null) return false;
        if (masterPlanNum != null ? !masterPlanNum.equals(that.masterPlanNum) : that.masterPlanNum != null)
            return false;
        if (purpose != null ? !purpose.equals(that.purpose) : that.purpose != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (techInfoId != null ? !techInfoId.equals(that.techInfoId) : that.techInfoId != null) return false;
        if (buildingHeight != null ? !buildingHeight.equals(that.buildingHeight) : that.buildingHeight != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (extraConsumersRoomsVolume != null ? !extraConsumersRoomsVolume.equals(that.extraConsumersRoomsVolume) : that.extraConsumersRoomsVolume != null)
            return false;
        if (hourlyHeatConsumptionForSteam != null ? !hourlyHeatConsumptionForSteam.equals(that.hourlyHeatConsumptionForSteam) : that.hourlyHeatConsumptionForSteam != null)
            return false;
        if (privatesecuritynumber != null ? !privatesecuritynumber.equals(that.privatesecuritynumber) : that.privatesecuritynumber != null)
            return false;
        if (specificHeatingCurve != null ? !specificHeatingCurve.equals(that.specificHeatingCurve) : that.specificHeatingCurve != null)
            return false;
        if (specificThermalPerformance != null ? !specificThermalPerformance.equals(that.specificThermalPerformance) : that.specificThermalPerformance != null)
            return false;
        if (ctxSearchField != null ? !ctxSearchField.equals(that.ctxSearchField) : that.ctxSearchField != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (grossArea != null ? grossArea.hashCode() : 0);
        result = 31 * result + (masterPlanNum != null ? masterPlanNum.hashCode() : 0);
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (techInfoId != null ? techInfoId.hashCode() : 0);
        result = 31 * result + (buildingHeight != null ? buildingHeight.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (extraConsumersRoomsVolume != null ? extraConsumersRoomsVolume.hashCode() : 0);
        result = 31 * result + (hourlyHeatConsumptionForSteam != null ? hourlyHeatConsumptionForSteam.hashCode() : 0);
        result = 31 * result + (privatesecuritynumber != null ? privatesecuritynumber.hashCode() : 0);
        result = 31 * result + (specificHeatingCurve != null ? specificHeatingCurve.hashCode() : 0);
        result = 31 * result + (specificThermalPerformance != null ? specificThermalPerformance.hashCode() : 0);
        result = 31 * result + (ctxSearchField != null ? ctxSearchField.hashCode() : 0);
        return result;
    }
}
