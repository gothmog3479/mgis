package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "cadastr_numbers", schema = "public", catalog = "mgis")
public class CadastrNumbers {
    private Integer id;
    private Integer parentId;
    private String searchField;
    private String value;
    private Integer valueInt;
    private Integer layer;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "search_field", nullable = true, length = 2048)
    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    @Basic
    @Column(name = "value", nullable = false, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "value_int", nullable = true)
    public Integer getValueInt() {
        return valueInt;
    }

    public void setValueInt(Integer valueInt) {
        this.valueInt = valueInt;
    }

    @Basic
    @Column(name = "layer", nullable = false)
    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CadastrNumbers that = (CadastrNumbers) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (searchField != null ? !searchField.equals(that.searchField) : that.searchField != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (valueInt != null ? !valueInt.equals(that.valueInt) : that.valueInt != null) return false;
        if (layer != null ? !layer.equals(that.layer) : that.layer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (searchField != null ? searchField.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (valueInt != null ? valueInt.hashCode() : 0);
        result = 31 * result + (layer != null ? layer.hashCode() : 0);
        return result;
    }
}
