package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "legal_person_addresses", schema = "public", catalog = "mgis")
@IdClass(LegalPersonAddressesPK.class)
public class LegalPersonAddresses {
    private Integer legalPersonId;
    private Integer addressId;

    @Id
    @Column(name = "legal_person_id", nullable = false)
    public Integer getLegalPersonId() {
        return legalPersonId;
    }

    public void setLegalPersonId(Integer legalPersonId) {
        this.legalPersonId = legalPersonId;
    }

    @Id
    @Column(name = "address_id", nullable = false)
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LegalPersonAddresses that = (LegalPersonAddresses) o;

        if (legalPersonId != null ? !legalPersonId.equals(that.legalPersonId) : that.legalPersonId != null)
            return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = legalPersonId != null ? legalPersonId.hashCode() : 0;
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        return result;
    }
}
