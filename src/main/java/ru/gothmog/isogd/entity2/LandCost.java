package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "land_cost", schema = "public", catalog = "mgis")
public class LandCost {
    private Long id;
    private Date date;
    private Double value;
    private Long landId;
    private Long typeId;
    private Timestamp endDate;
    private Timestamp startDate;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "value", nullable = false, precision = 0)
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Basic
    @Column(name = "land_id", nullable = true)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Basic
    @Column(name = "type_id", nullable = true)
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "start_date", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandCost landCost = (LandCost) o;

        if (id != null ? !id.equals(landCost.id) : landCost.id != null) return false;
        if (date != null ? !date.equals(landCost.date) : landCost.date != null) return false;
        if (value != null ? !value.equals(landCost.value) : landCost.value != null) return false;
        if (landId != null ? !landId.equals(landCost.landId) : landCost.landId != null) return false;
        if (typeId != null ? !typeId.equals(landCost.typeId) : landCost.typeId != null) return false;
        if (endDate != null ? !endDate.equals(landCost.endDate) : landCost.endDate != null) return false;
        if (startDate != null ? !startDate.equals(landCost.startDate) : landCost.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        return result;
    }
}
