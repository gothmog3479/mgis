package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_link_payment", schema = "public", catalog = "mgis")
public class ContractLinkPayment {
    private Long id;
    private Long contract;
    private Long owner;
    private Long payment;
    private Long profile;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "contract", nullable = true)
    public Long getContract() {
        return contract;
    }

    public void setContract(Long contract) {
        this.contract = contract;
    }

    @Basic
    @Column(name = "owner", nullable = true)
    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "payment", nullable = true)
    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "profile", nullable = true)
    public Long getProfile() {
        return profile;
    }

    public void setProfile(Long profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractLinkPayment that = (ContractLinkPayment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (contract != null ? !contract.equals(that.contract) : that.contract != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (payment != null ? !payment.equals(that.payment) : that.payment != null) return false;
        if (profile != null ? !profile.equals(that.profile) : that.profile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contract != null ? contract.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (profile != null ? profile.hashCode() : 0);
        return result;
    }
}
