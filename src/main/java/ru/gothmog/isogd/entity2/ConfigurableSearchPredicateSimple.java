package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "configurable_search_predicate_simple", schema = "public", catalog = "mgis")
public class ConfigurableSearchPredicateSimple {
    private String entityPropertyName;
    private String predicateType;
    private Long id;
    private Long valueId;
    private Long complexPredId;

    @Basic
    @Column(name = "entity_property_name", nullable = false, length = 255)
    public String getEntityPropertyName() {
        return entityPropertyName;
    }

    public void setEntityPropertyName(String entityPropertyName) {
        this.entityPropertyName = entityPropertyName;
    }

    @Basic
    @Column(name = "predicate_type", nullable = false, length = 255)
    public String getPredicateType() {
        return predicateType;
    }

    public void setPredicateType(String predicateType) {
        this.predicateType = predicateType;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value_id", nullable = false)
    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    @Basic
    @Column(name = "complex_pred_id", nullable = true)
    public Long getComplexPredId() {
        return complexPredId;
    }

    public void setComplexPredId(Long complexPredId) {
        this.complexPredId = complexPredId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigurableSearchPredicateSimple that = (ConfigurableSearchPredicateSimple) o;

        if (entityPropertyName != null ? !entityPropertyName.equals(that.entityPropertyName) : that.entityPropertyName != null)
            return false;
        if (predicateType != null ? !predicateType.equals(that.predicateType) : that.predicateType != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (valueId != null ? !valueId.equals(that.valueId) : that.valueId != null) return false;
        if (complexPredId != null ? !complexPredId.equals(that.complexPredId) : that.complexPredId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entityPropertyName != null ? entityPropertyName.hashCode() : 0;
        result = 31 * result + (predicateType != null ? predicateType.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (valueId != null ? valueId.hashCode() : 0);
        result = 31 * result + (complexPredId != null ? complexPredId.hashCode() : 0);
        return result;
    }
}
