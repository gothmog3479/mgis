package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "dynamic_attribute_value", schema = "public", catalog = "mgis")
public class DynamicAttributeValue {
    private Long id;
    private Long attrId;
    private Timestamp valDate;
    private Double valDbl;
    private Integer valInt;
    private String valStr;
    private Boolean valBool;
    private Long valEntityId;
    private String valueType;
    private Long proxyId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attr_id", nullable = true)
    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    @Basic
    @Column(name = "val_date", nullable = true)
    public Timestamp getValDate() {
        return valDate;
    }

    public void setValDate(Timestamp valDate) {
        this.valDate = valDate;
    }

    @Basic
    @Column(name = "val_dbl", nullable = true, precision = 0)
    public Double getValDbl() {
        return valDbl;
    }

    public void setValDbl(Double valDbl) {
        this.valDbl = valDbl;
    }

    @Basic
    @Column(name = "val_int", nullable = true)
    public Integer getValInt() {
        return valInt;
    }

    public void setValInt(Integer valInt) {
        this.valInt = valInt;
    }

    @Basic
    @Column(name = "val_str", nullable = true, length = 4096)
    public String getValStr() {
        return valStr;
    }

    public void setValStr(String valStr) {
        this.valStr = valStr;
    }

    @Basic
    @Column(name = "val_bool", nullable = true)
    public Boolean getValBool() {
        return valBool;
    }

    public void setValBool(Boolean valBool) {
        this.valBool = valBool;
    }

    @Basic
    @Column(name = "val_entity_id", nullable = true)
    public Long getValEntityId() {
        return valEntityId;
    }

    public void setValEntityId(Long valEntityId) {
        this.valEntityId = valEntityId;
    }

    @Basic
    @Column(name = "value_type", nullable = false, length = 31)
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @Basic
    @Column(name = "proxy_id", nullable = true)
    public Long getProxyId() {
        return proxyId;
    }

    public void setProxyId(Long proxyId) {
        this.proxyId = proxyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicAttributeValue that = (DynamicAttributeValue) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (attrId != null ? !attrId.equals(that.attrId) : that.attrId != null) return false;
        if (valDate != null ? !valDate.equals(that.valDate) : that.valDate != null) return false;
        if (valDbl != null ? !valDbl.equals(that.valDbl) : that.valDbl != null) return false;
        if (valInt != null ? !valInt.equals(that.valInt) : that.valInt != null) return false;
        if (valStr != null ? !valStr.equals(that.valStr) : that.valStr != null) return false;
        if (valBool != null ? !valBool.equals(that.valBool) : that.valBool != null) return false;
        if (valEntityId != null ? !valEntityId.equals(that.valEntityId) : that.valEntityId != null) return false;
        if (valueType != null ? !valueType.equals(that.valueType) : that.valueType != null) return false;
        if (proxyId != null ? !proxyId.equals(that.proxyId) : that.proxyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (attrId != null ? attrId.hashCode() : 0);
        result = 31 * result + (valDate != null ? valDate.hashCode() : 0);
        result = 31 * result + (valDbl != null ? valDbl.hashCode() : 0);
        result = 31 * result + (valInt != null ? valInt.hashCode() : 0);
        result = 31 * result + (valStr != null ? valStr.hashCode() : 0);
        result = 31 * result + (valBool != null ? valBool.hashCode() : 0);
        result = 31 * result + (valEntityId != null ? valEntityId.hashCode() : 0);
        result = 31 * result + (valueType != null ? valueType.hashCode() : 0);
        result = 31 * result + (proxyId != null ? proxyId.hashCode() : 0);
        return result;
    }
}
