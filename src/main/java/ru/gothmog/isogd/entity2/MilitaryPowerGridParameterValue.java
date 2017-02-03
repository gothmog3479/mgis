package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_power_grid_parameter_value", schema = "public", catalog = "mgis")
public class MilitaryPowerGridParameterValue {
    private Long id;
    private Integer length;
    private Double numberConventionalUnits;
    private Integer quantity;
    private Long paramId;
    private Long powerGridId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "length", nullable = true)
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Basic
    @Column(name = "number_conventional_units", nullable = true, precision = 0)
    public Double getNumberConventionalUnits() {
        return numberConventionalUnits;
    }

    public void setNumberConventionalUnits(Double numberConventionalUnits) {
        this.numberConventionalUnits = numberConventionalUnits;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "param_id", nullable = true)
    public Long getParamId() {
        return paramId;
    }

    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }

    @Basic
    @Column(name = "power_grid_id", nullable = true)
    public Long getPowerGridId() {
        return powerGridId;
    }

    public void setPowerGridId(Long powerGridId) {
        this.powerGridId = powerGridId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryPowerGridParameterValue that = (MilitaryPowerGridParameterValue) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (numberConventionalUnits != null ? !numberConventionalUnits.equals(that.numberConventionalUnits) : that.numberConventionalUnits != null)
            return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (paramId != null ? !paramId.equals(that.paramId) : that.paramId != null) return false;
        if (powerGridId != null ? !powerGridId.equals(that.powerGridId) : that.powerGridId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (numberConventionalUnits != null ? numberConventionalUnits.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (paramId != null ? paramId.hashCode() : 0);
        result = 31 * result + (powerGridId != null ? powerGridId.hashCode() : 0);
        return result;
    }
}
