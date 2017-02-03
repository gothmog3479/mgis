package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "buc_te_indicator", schema = "public", catalog = "mgis")
public class BucTeIndicator {
    private Long id;
    private Integer index;
    private String okei;
    private String unit;
    private Long buildingTypeId;
    private Long registryTypeId;
    private String title;
    private String valueType;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "index", nullable = true)
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Basic
    @Column(name = "okei", nullable = true, length = 255)
    public String getOkei() {
        return okei;
    }

    public void setOkei(String okei) {
        this.okei = okei;
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
    @Column(name = "building_type_id", nullable = true)
    public Long getBuildingTypeId() {
        return buildingTypeId;
    }

    public void setBuildingTypeId(Long buildingTypeId) {
        this.buildingTypeId = buildingTypeId;
    }

    @Basic
    @Column(name = "registry_type_id", nullable = false)
    public Long getRegistryTypeId() {
        return registryTypeId;
    }

    public void setRegistryTypeId(Long registryTypeId) {
        this.registryTypeId = registryTypeId;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 512)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "value_type", nullable = true, length = 255)
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BucTeIndicator that = (BucTeIndicator) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (index != null ? !index.equals(that.index) : that.index != null) return false;
        if (okei != null ? !okei.equals(that.okei) : that.okei != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (buildingTypeId != null ? !buildingTypeId.equals(that.buildingTypeId) : that.buildingTypeId != null)
            return false;
        if (registryTypeId != null ? !registryTypeId.equals(that.registryTypeId) : that.registryTypeId != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (valueType != null ? !valueType.equals(that.valueType) : that.valueType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (index != null ? index.hashCode() : 0);
        result = 31 * result + (okei != null ? okei.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (buildingTypeId != null ? buildingTypeId.hashCode() : 0);
        result = 31 * result + (registryTypeId != null ? registryTypeId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (valueType != null ? valueType.hashCode() : 0);
        return result;
    }
}
