package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "building_under_construction_customer", schema = "public", catalog = "mgis")
public class BuildingUnderConstructionCustomer {
    private Long bucId;
    private Long customerId;

    @Basic
    @Column(name = "buc_id", nullable = false)
    public Long getBucId() {
        return bucId;
    }

    public void setBucId(Long bucId) {
        this.bucId = bucId;
    }

    @Basic
    @Column(name = "customer_id", nullable = false)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingUnderConstructionCustomer that = (BuildingUnderConstructionCustomer) o;

        if (bucId != null ? !bucId.equals(that.bucId) : that.bucId != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bucId != null ? bucId.hashCode() : 0;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        return result;
    }
}
