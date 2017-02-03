package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "building_thermal_energy_consumption_standard", schema = "public", catalog = "mgis")
public class BuildingThermalEnergyConsumptionStandard {
    private Long id;
    private Double gvs;
    private Double heating;
    private String month;
    private Double steam;
    private Double ventilation;
    private Long buildingId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "gvs", nullable = true, precision = 0)
    public Double getGvs() {
        return gvs;
    }

    public void setGvs(Double gvs) {
        this.gvs = gvs;
    }

    @Basic
    @Column(name = "heating", nullable = true, precision = 0)
    public Double getHeating() {
        return heating;
    }

    public void setHeating(Double heating) {
        this.heating = heating;
    }

    @Basic
    @Column(name = "month", nullable = false, length = 255)
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Basic
    @Column(name = "steam", nullable = true, precision = 0)
    public Double getSteam() {
        return steam;
    }

    public void setSteam(Double steam) {
        this.steam = steam;
    }

    @Basic
    @Column(name = "ventilation", nullable = true, precision = 0)
    public Double getVentilation() {
        return ventilation;
    }

    public void setVentilation(Double ventilation) {
        this.ventilation = ventilation;
    }

    @Basic
    @Column(name = "building_id", nullable = false)
    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingThermalEnergyConsumptionStandard that = (BuildingThermalEnergyConsumptionStandard) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (gvs != null ? !gvs.equals(that.gvs) : that.gvs != null) return false;
        if (heating != null ? !heating.equals(that.heating) : that.heating != null) return false;
        if (month != null ? !month.equals(that.month) : that.month != null) return false;
        if (steam != null ? !steam.equals(that.steam) : that.steam != null) return false;
        if (ventilation != null ? !ventilation.equals(that.ventilation) : that.ventilation != null) return false;
        if (buildingId != null ? !buildingId.equals(that.buildingId) : that.buildingId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (gvs != null ? gvs.hashCode() : 0);
        result = 31 * result + (heating != null ? heating.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (steam != null ? steam.hashCode() : 0);
        result = 31 * result + (ventilation != null ? ventilation.hashCode() : 0);
        result = 31 * result + (buildingId != null ? buildingId.hashCode() : 0);
        return result;
    }
}
