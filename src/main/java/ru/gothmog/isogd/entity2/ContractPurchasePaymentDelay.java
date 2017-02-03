package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_purchase_payment_delay", schema = "public", catalog = "mgis")
public class ContractPurchasePaymentDelay {
    private Long id;
    private Integer delay;
    private Boolean isDefault;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "delay", nullable = true)
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @Basic
    @Column(name = "is_default", nullable = true)
    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractPurchasePaymentDelay that = (ContractPurchasePaymentDelay) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (delay != null ? !delay.equals(that.delay) : that.delay != null) return false;
        if (isDefault != null ? !isDefault.equals(that.isDefault) : that.isDefault != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (delay != null ? delay.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        return result;
    }
}
