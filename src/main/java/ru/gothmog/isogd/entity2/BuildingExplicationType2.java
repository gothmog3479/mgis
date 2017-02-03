package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "building_explication_type2", schema = "public", catalog = "mgis")
public class BuildingExplicationType2 {
    private Long id;
    private Double diameter;
    private String info;
    private Double length;
    private String location;
    private Double percOfWear;
    private Integer repairyear;
    private Integer year;
    private Long buildingId;
    private Long materialId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "diameter", nullable = true, precision = 0)
    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    @Basic
    @Column(name = "info", nullable = true, length = 1024)
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "length", nullable = true, precision = 0)
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Basic
    @Column(name = "location", nullable = true, length = 512)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "perc_of_wear", nullable = true, precision = 0)
    public Double getPercOfWear() {
        return percOfWear;
    }

    public void setPercOfWear(Double percOfWear) {
        this.percOfWear = percOfWear;
    }

    @Basic
    @Column(name = "repairyear", nullable = true)
    public Integer getRepairyear() {
        return repairyear;
    }

    public void setRepairyear(Integer repairyear) {
        this.repairyear = repairyear;
    }

    @Basic
    @Column(name = "year", nullable = true)
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "building_id", nullable = false)
    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    @Basic
    @Column(name = "material_id", nullable = true)
    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingExplicationType2 that = (BuildingExplicationType2) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (diameter != null ? !diameter.equals(that.diameter) : that.diameter != null) return false;
        if (info != null ? !info.equals(that.info) : that.info != null) return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (percOfWear != null ? !percOfWear.equals(that.percOfWear) : that.percOfWear != null) return false;
        if (repairyear != null ? !repairyear.equals(that.repairyear) : that.repairyear != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (buildingId != null ? !buildingId.equals(that.buildingId) : that.buildingId != null) return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (diameter != null ? diameter.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (percOfWear != null ? percOfWear.hashCode() : 0);
        result = 31 * result + (repairyear != null ? repairyear.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (buildingId != null ? buildingId.hashCode() : 0);
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        return result;
    }
}
