package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "configurable_search_predicate", schema = "public", catalog = "mgis")
public class ConfigurableSearchPredicate {
    private Long id;
    private Integer orderIdx;
    private String viewAttrName;
    private Long filterId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_idx", nullable = false)
    public Integer getOrderIdx() {
        return orderIdx;
    }

    public void setOrderIdx(Integer orderIdx) {
        this.orderIdx = orderIdx;
    }

    @Basic
    @Column(name = "view_attr_name", nullable = true, length = 255)
    public String getViewAttrName() {
        return viewAttrName;
    }

    public void setViewAttrName(String viewAttrName) {
        this.viewAttrName = viewAttrName;
    }

    @Basic
    @Column(name = "filter_id", nullable = false)
    public Long getFilterId() {
        return filterId;
    }

    public void setFilterId(Long filterId) {
        this.filterId = filterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigurableSearchPredicate that = (ConfigurableSearchPredicate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (orderIdx != null ? !orderIdx.equals(that.orderIdx) : that.orderIdx != null) return false;
        if (viewAttrName != null ? !viewAttrName.equals(that.viewAttrName) : that.viewAttrName != null) return false;
        if (filterId != null ? !filterId.equals(that.filterId) : that.filterId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderIdx != null ? orderIdx.hashCode() : 0);
        result = 31 * result + (viewAttrName != null ? viewAttrName.hashCode() : 0);
        result = 31 * result + (filterId != null ? filterId.hashCode() : 0);
        return result;
    }
}
