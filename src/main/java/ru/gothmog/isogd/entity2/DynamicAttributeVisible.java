package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "dynamic_attribute_visible", schema = "public", catalog = "mgis")
public class DynamicAttributeVisible {
    private String dictionaryType;
    private Integer index;
    private String selection;
    private Long id;

    @Basic
    @Column(name = "dictionary_type", nullable = true, length = 255)
    public String getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(String dictionaryType) {
        this.dictionaryType = dictionaryType;
    }

    @Basic
    @Column(name = "index", nullable = false)
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Basic
    @Column(name = "selection", nullable = true, length = 512)
    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicAttributeVisible that = (DynamicAttributeVisible) o;

        if (dictionaryType != null ? !dictionaryType.equals(that.dictionaryType) : that.dictionaryType != null)
            return false;
        if (index != null ? !index.equals(that.index) : that.index != null) return false;
        if (selection != null ? !selection.equals(that.selection) : that.selection != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dictionaryType != null ? dictionaryType.hashCode() : 0;
        result = 31 * result + (index != null ? index.hashCode() : 0);
        result = 31 * result + (selection != null ? selection.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
