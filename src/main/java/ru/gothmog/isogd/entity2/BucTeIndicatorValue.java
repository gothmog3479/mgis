package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "buc_te_indicator_value", schema = "public", catalog = "mgis")
public class BucTeIndicatorValue {
    private Long id;
    private Double valueFactDbl;
    private String valueFactStr;
    private Double valueProjDbl;
    private String valueProjStr;
    private Long indicatorId;
    private Integer valueFactInt;
    private Integer valueProjInt;
    private Long bucId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value_fact_dbl", nullable = true, precision = 0)
    public Double getValueFactDbl() {
        return valueFactDbl;
    }

    public void setValueFactDbl(Double valueFactDbl) {
        this.valueFactDbl = valueFactDbl;
    }

    @Basic
    @Column(name = "value_fact_str", nullable = true, length = 255)
    public String getValueFactStr() {
        return valueFactStr;
    }

    public void setValueFactStr(String valueFactStr) {
        this.valueFactStr = valueFactStr;
    }

    @Basic
    @Column(name = "value_proj_dbl", nullable = true, precision = 0)
    public Double getValueProjDbl() {
        return valueProjDbl;
    }

    public void setValueProjDbl(Double valueProjDbl) {
        this.valueProjDbl = valueProjDbl;
    }

    @Basic
    @Column(name = "value_proj_str", nullable = true, length = 255)
    public String getValueProjStr() {
        return valueProjStr;
    }

    public void setValueProjStr(String valueProjStr) {
        this.valueProjStr = valueProjStr;
    }

    @Basic
    @Column(name = "indicator_id", nullable = true)
    public Long getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Long indicatorId) {
        this.indicatorId = indicatorId;
    }

    @Basic
    @Column(name = "value_fact_int", nullable = true)
    public Integer getValueFactInt() {
        return valueFactInt;
    }

    public void setValueFactInt(Integer valueFactInt) {
        this.valueFactInt = valueFactInt;
    }

    @Basic
    @Column(name = "value_proj_int", nullable = true)
    public Integer getValueProjInt() {
        return valueProjInt;
    }

    public void setValueProjInt(Integer valueProjInt) {
        this.valueProjInt = valueProjInt;
    }

    @Basic
    @Column(name = "buc_id", nullable = false)
    public Long getBucId() {
        return bucId;
    }

    public void setBucId(Long bucId) {
        this.bucId = bucId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BucTeIndicatorValue that = (BucTeIndicatorValue) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (valueFactDbl != null ? !valueFactDbl.equals(that.valueFactDbl) : that.valueFactDbl != null) return false;
        if (valueFactStr != null ? !valueFactStr.equals(that.valueFactStr) : that.valueFactStr != null) return false;
        if (valueProjDbl != null ? !valueProjDbl.equals(that.valueProjDbl) : that.valueProjDbl != null) return false;
        if (valueProjStr != null ? !valueProjStr.equals(that.valueProjStr) : that.valueProjStr != null) return false;
        if (indicatorId != null ? !indicatorId.equals(that.indicatorId) : that.indicatorId != null) return false;
        if (valueFactInt != null ? !valueFactInt.equals(that.valueFactInt) : that.valueFactInt != null) return false;
        if (valueProjInt != null ? !valueProjInt.equals(that.valueProjInt) : that.valueProjInt != null) return false;
        if (bucId != null ? !bucId.equals(that.bucId) : that.bucId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (valueFactDbl != null ? valueFactDbl.hashCode() : 0);
        result = 31 * result + (valueFactStr != null ? valueFactStr.hashCode() : 0);
        result = 31 * result + (valueProjDbl != null ? valueProjDbl.hashCode() : 0);
        result = 31 * result + (valueProjStr != null ? valueProjStr.hashCode() : 0);
        result = 31 * result + (indicatorId != null ? indicatorId.hashCode() : 0);
        result = 31 * result + (valueFactInt != null ? valueFactInt.hashCode() : 0);
        result = 31 * result + (valueProjInt != null ? valueProjInt.hashCode() : 0);
        result = 31 * result + (bucId != null ? bucId.hashCode() : 0);
        return result;
    }
}
