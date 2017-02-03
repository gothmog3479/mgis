package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "dynamic_attribute", schema = "public", catalog = "mgis")
public class DynamicAttribute {
    private Long id;
    private String title;
    private String valueType;
    private Integer index;
    private String dictionaryEntityClass;
    private String dictionaryType;
    private String selection;
    private String entityClass;
    private Long okofRootId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "value_type", nullable = false, length = 255)
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
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
    @Column(name = "dictionary_entity_class", nullable = true, length = 255)
    public String getDictionaryEntityClass() {
        return dictionaryEntityClass;
    }

    public void setDictionaryEntityClass(String dictionaryEntityClass) {
        this.dictionaryEntityClass = dictionaryEntityClass;
    }

    @Basic
    @Column(name = "dictionary_type", nullable = true, length = 255)
    public String getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(String dictionaryType) {
        this.dictionaryType = dictionaryType;
    }

    @Basic
    @Column(name = "selection", nullable = true, length = 512)
    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    @Basic
    @Column(name = "entity_class", nullable = true, length = 255)
    public String getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(String entityClass) {
        this.entityClass = entityClass;
    }

    @Basic
    @Column(name = "okof_root_id", nullable = true)
    public Long getOkofRootId() {
        return okofRootId;
    }

    public void setOkofRootId(Long okofRootId) {
        this.okofRootId = okofRootId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicAttribute that = (DynamicAttribute) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (valueType != null ? !valueType.equals(that.valueType) : that.valueType != null) return false;
        if (index != null ? !index.equals(that.index) : that.index != null) return false;
        if (dictionaryEntityClass != null ? !dictionaryEntityClass.equals(that.dictionaryEntityClass) : that.dictionaryEntityClass != null)
            return false;
        if (dictionaryType != null ? !dictionaryType.equals(that.dictionaryType) : that.dictionaryType != null)
            return false;
        if (selection != null ? !selection.equals(that.selection) : that.selection != null) return false;
        if (entityClass != null ? !entityClass.equals(that.entityClass) : that.entityClass != null) return false;
        if (okofRootId != null ? !okofRootId.equals(that.okofRootId) : that.okofRootId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (valueType != null ? valueType.hashCode() : 0);
        result = 31 * result + (index != null ? index.hashCode() : 0);
        result = 31 * result + (dictionaryEntityClass != null ? dictionaryEntityClass.hashCode() : 0);
        result = 31 * result + (dictionaryType != null ? dictionaryType.hashCode() : 0);
        result = 31 * result + (selection != null ? selection.hashCode() : 0);
        result = 31 * result + (entityClass != null ? entityClass.hashCode() : 0);
        result = 31 * result + (okofRootId != null ? okofRootId.hashCode() : 0);
        return result;
    }
}
