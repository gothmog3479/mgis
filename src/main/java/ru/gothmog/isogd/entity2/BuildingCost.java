package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "building_cost", schema = "public", catalog = "mgis")
public class BuildingCost {
    private Long id;
    private byte[] costtype;
    private Timestamp date;
    private byte[] suspensiongroup;
    private String unit;
    private Double value;
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
    @Column(name = "costtype", nullable = true)
    public byte[] getCosttype() {
        return costtype;
    }

    public void setCosttype(byte[] costtype) {
        this.costtype = costtype;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "suspensiongroup", nullable = true)
    public byte[] getSuspensiongroup() {
        return suspensiongroup;
    }

    public void setSuspensiongroup(byte[] suspensiongroup) {
        this.suspensiongroup = suspensiongroup;
    }

    @Basic
    @Column(name = "unit", nullable = true, length = 255)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "value", nullable = true, precision = 0)
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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

        BuildingCost that = (BuildingCost) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (!Arrays.equals(costtype, that.costtype)) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (!Arrays.equals(suspensiongroup, that.suspensiongroup)) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (buildingId != null ? !buildingId.equals(that.buildingId) : that.buildingId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(costtype);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(suspensiongroup);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (buildingId != null ? buildingId.hashCode() : 0);
        return result;
    }
}
