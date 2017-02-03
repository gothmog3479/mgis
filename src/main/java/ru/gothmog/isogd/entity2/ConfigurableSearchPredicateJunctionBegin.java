package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "configurable_search_predicate_junction_begin", schema = "public", catalog = "mgis")
public class ConfigurableSearchPredicateJunctionBegin {
    private String junctionType;
    private Long id;

    @Basic
    @Column(name = "junction_type", nullable = true, length = 255)
    public String getJunctionType() {
        return junctionType;
    }

    public void setJunctionType(String junctionType) {
        this.junctionType = junctionType;
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

        ConfigurableSearchPredicateJunctionBegin that = (ConfigurableSearchPredicateJunctionBegin) o;

        if (junctionType != null ? !junctionType.equals(that.junctionType) : that.junctionType != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = junctionType != null ? junctionType.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
