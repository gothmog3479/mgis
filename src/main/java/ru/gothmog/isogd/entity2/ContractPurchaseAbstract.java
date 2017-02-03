package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_purchase_abstract", schema = "public", catalog = "mgis")
public class ContractPurchaseAbstract {
    private Long id;
    private Long paymentDelayId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "payment_delay_id", nullable = true)
    public Long getPaymentDelayId() {
        return paymentDelayId;
    }

    public void setPaymentDelayId(Long paymentDelayId) {
        this.paymentDelayId = paymentDelayId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractPurchaseAbstract that = (ContractPurchaseAbstract) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paymentDelayId != null ? !paymentDelayId.equals(that.paymentDelayId) : that.paymentDelayId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paymentDelayId != null ? paymentDelayId.hashCode() : 0);
        return result;
    }
}
