package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "configurable_search_predicate_value", schema = "public", catalog = "mgis")
public class ConfigurableSearchPredicateValue {
    private String valueType;
    private Long id;
    private String valueAsString;

    @Basic
    @Column(name = "value_type", nullable = false, length = 31)
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
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
    @Column(name = "value_as_string", nullable = false, length = 4096)
    public String getValueAsString() {
        return valueAsString;
    }

    public void setValueAsString(String valueAsString) {
        this.valueAsString = valueAsString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigurableSearchPredicateValue that = (ConfigurableSearchPredicateValue) o;

        if (valueType != null ? !valueType.equals(that.valueType) : that.valueType != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (valueAsString != null ? !valueAsString.equals(that.valueAsString) : that.valueAsString != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = valueType != null ? valueType.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (valueAsString != null ? valueAsString.hashCode() : 0);
        return result;
    }
}
