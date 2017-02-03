package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "mes_incident", schema = "public", catalog = "mgis")
public class MesIncident {
    private Long id;
    private Timestamp dateOf;
    private Timestamp dateOfLiquidation;
    private Boolean onControl;
    private String title;
    private Double airPressure;
    private Integer equipment;
    private Integer equipmentTotal;
    private String iceCondition;
    private Integer personnel;
    private Integer personnelTotal;
    private String precipitation;
    private Double snowDepth;
    private byte[] sod;
    private String surfaceLayer;
    private Double temperature;
    private String visibility;
    private Double wet;
    private String wind;
    private Long regulationsId;
    private Long sodId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_of", nullable = true)
    public Timestamp getDateOf() {
        return dateOf;
    }

    public void setDateOf(Timestamp dateOf) {
        this.dateOf = dateOf;
    }

    @Basic
    @Column(name = "date_of_liquidation", nullable = true)
    public Timestamp getDateOfLiquidation() {
        return dateOfLiquidation;
    }

    public void setDateOfLiquidation(Timestamp dateOfLiquidation) {
        this.dateOfLiquidation = dateOfLiquidation;
    }

    @Basic
    @Column(name = "on_control", nullable = true)
    public Boolean getOnControl() {
        return onControl;
    }

    public void setOnControl(Boolean onControl) {
        this.onControl = onControl;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 4096)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "air_pressure", nullable = true, precision = 0)
    public Double getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(Double airPressure) {
        this.airPressure = airPressure;
    }

    @Basic
    @Column(name = "equipment", nullable = true)
    public Integer getEquipment() {
        return equipment;
    }

    public void setEquipment(Integer equipment) {
        this.equipment = equipment;
    }

    @Basic
    @Column(name = "equipment_total", nullable = true)
    public Integer getEquipmentTotal() {
        return equipmentTotal;
    }

    public void setEquipmentTotal(Integer equipmentTotal) {
        this.equipmentTotal = equipmentTotal;
    }

    @Basic
    @Column(name = "ice_condition", nullable = true, length = 255)
    public String getIceCondition() {
        return iceCondition;
    }

    public void setIceCondition(String iceCondition) {
        this.iceCondition = iceCondition;
    }

    @Basic
    @Column(name = "personnel", nullable = true)
    public Integer getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Integer personnel) {
        this.personnel = personnel;
    }

    @Basic
    @Column(name = "personnel_total", nullable = true)
    public Integer getPersonnelTotal() {
        return personnelTotal;
    }

    public void setPersonnelTotal(Integer personnelTotal) {
        this.personnelTotal = personnelTotal;
    }

    @Basic
    @Column(name = "precipitation", nullable = true, length = 255)
    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    @Basic
    @Column(name = "snow_depth", nullable = true, precision = 0)
    public Double getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(Double snowDepth) {
        this.snowDepth = snowDepth;
    }

    @Basic
    @Column(name = "sod", nullable = true)
    public byte[] getSod() {
        return sod;
    }

    public void setSod(byte[] sod) {
        this.sod = sod;
    }

    @Basic
    @Column(name = "surface_layer", nullable = true, length = 255)
    public String getSurfaceLayer() {
        return surfaceLayer;
    }

    public void setSurfaceLayer(String surfaceLayer) {
        this.surfaceLayer = surfaceLayer;
    }

    @Basic
    @Column(name = "temperature", nullable = true, precision = 0)
    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Basic
    @Column(name = "visibility", nullable = true, length = 255)
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Basic
    @Column(name = "wet", nullable = true, precision = 0)
    public Double getWet() {
        return wet;
    }

    public void setWet(Double wet) {
        this.wet = wet;
    }

    @Basic
    @Column(name = "wind", nullable = true, length = 255)
    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    @Basic
    @Column(name = "regulations_id", nullable = true)
    public Long getRegulationsId() {
        return regulationsId;
    }

    public void setRegulationsId(Long regulationsId) {
        this.regulationsId = regulationsId;
    }

    @Basic
    @Column(name = "sod_id", nullable = true)
    public Long getSodId() {
        return sodId;
    }

    public void setSodId(Long sodId) {
        this.sodId = sodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesIncident that = (MesIncident) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dateOf != null ? !dateOf.equals(that.dateOf) : that.dateOf != null) return false;
        if (dateOfLiquidation != null ? !dateOfLiquidation.equals(that.dateOfLiquidation) : that.dateOfLiquidation != null)
            return false;
        if (onControl != null ? !onControl.equals(that.onControl) : that.onControl != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (airPressure != null ? !airPressure.equals(that.airPressure) : that.airPressure != null) return false;
        if (equipment != null ? !equipment.equals(that.equipment) : that.equipment != null) return false;
        if (equipmentTotal != null ? !equipmentTotal.equals(that.equipmentTotal) : that.equipmentTotal != null)
            return false;
        if (iceCondition != null ? !iceCondition.equals(that.iceCondition) : that.iceCondition != null) return false;
        if (personnel != null ? !personnel.equals(that.personnel) : that.personnel != null) return false;
        if (personnelTotal != null ? !personnelTotal.equals(that.personnelTotal) : that.personnelTotal != null)
            return false;
        if (precipitation != null ? !precipitation.equals(that.precipitation) : that.precipitation != null)
            return false;
        if (snowDepth != null ? !snowDepth.equals(that.snowDepth) : that.snowDepth != null) return false;
        if (!Arrays.equals(sod, that.sod)) return false;
        if (surfaceLayer != null ? !surfaceLayer.equals(that.surfaceLayer) : that.surfaceLayer != null) return false;
        if (temperature != null ? !temperature.equals(that.temperature) : that.temperature != null) return false;
        if (visibility != null ? !visibility.equals(that.visibility) : that.visibility != null) return false;
        if (wet != null ? !wet.equals(that.wet) : that.wet != null) return false;
        if (wind != null ? !wind.equals(that.wind) : that.wind != null) return false;
        if (regulationsId != null ? !regulationsId.equals(that.regulationsId) : that.regulationsId != null)
            return false;
        if (sodId != null ? !sodId.equals(that.sodId) : that.sodId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateOf != null ? dateOf.hashCode() : 0);
        result = 31 * result + (dateOfLiquidation != null ? dateOfLiquidation.hashCode() : 0);
        result = 31 * result + (onControl != null ? onControl.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (airPressure != null ? airPressure.hashCode() : 0);
        result = 31 * result + (equipment != null ? equipment.hashCode() : 0);
        result = 31 * result + (equipmentTotal != null ? equipmentTotal.hashCode() : 0);
        result = 31 * result + (iceCondition != null ? iceCondition.hashCode() : 0);
        result = 31 * result + (personnel != null ? personnel.hashCode() : 0);
        result = 31 * result + (personnelTotal != null ? personnelTotal.hashCode() : 0);
        result = 31 * result + (precipitation != null ? precipitation.hashCode() : 0);
        result = 31 * result + (snowDepth != null ? snowDepth.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(sod);
        result = 31 * result + (surfaceLayer != null ? surfaceLayer.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        result = 31 * result + (wet != null ? wet.hashCode() : 0);
        result = 31 * result + (wind != null ? wind.hashCode() : 0);
        result = 31 * result + (regulationsId != null ? regulationsId.hashCode() : 0);
        result = 31 * result + (sodId != null ? sodId.hashCode() : 0);
        return result;
    }
}
