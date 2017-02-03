package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "configurable_search_predicate_complex", schema = "public", catalog = "mgis")
public class ConfigurableSearchPredicateComplex {
    private String attr;
    private String forClass;
    private String selAttr;
    private Long id;

    @Basic
    @Column(name = "attr", nullable = true, length = 255)
    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Basic
    @Column(name = "for_class", nullable = true, length = 255)
    public String getForClass() {
        return forClass;
    }

    public void setForClass(String forClass) {
        this.forClass = forClass;
    }

    @Basic
    @Column(name = "sel_attr", nullable = true, length = 255)
    public String getSelAttr() {
        return selAttr;
    }

    public void setSelAttr(String selAttr) {
        this.selAttr = selAttr;
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

        ConfigurableSearchPredicateComplex that = (ConfigurableSearchPredicateComplex) o;

        if (attr != null ? !attr.equals(that.attr) : that.attr != null) return false;
        if (forClass != null ? !forClass.equals(that.forClass) : that.forClass != null) return false;
        if (selAttr != null ? !selAttr.equals(that.selAttr) : that.selAttr != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attr != null ? attr.hashCode() : 0;
        result = 31 * result + (forClass != null ? forClass.hashCode() : 0);
        result = 31 * result + (selAttr != null ? selAttr.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
