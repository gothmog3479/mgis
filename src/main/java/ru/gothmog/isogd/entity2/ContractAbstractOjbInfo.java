package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_abstract_ojb_info", schema = "public", catalog = "mgis")
public class ContractAbstractOjbInfo {
    private Long id;
    private Integer orderInd;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_ind", nullable = true)
    public Integer getOrderInd() {
        return orderInd;
    }

    public void setOrderInd(Integer orderInd) {
        this.orderInd = orderInd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractAbstractOjbInfo that = (ContractAbstractOjbInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (orderInd != null ? !orderInd.equals(that.orderInd) : that.orderInd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderInd != null ? orderInd.hashCode() : 0);
        return result;
    }
}
