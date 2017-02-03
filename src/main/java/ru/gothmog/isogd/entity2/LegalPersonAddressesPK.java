package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class LegalPersonAddressesPK implements Serializable {
    private Integer legalPersonId;
    private Integer addressId;

    @Column(name = "legal_person_id", nullable = false)
    @Id
    public Integer getLegalPersonId() {
        return legalPersonId;
    }

    public void setLegalPersonId(Integer legalPersonId) {
        this.legalPersonId = legalPersonId;
    }

    @Column(name = "address_id", nullable = false)
    @Id
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

        LegalPersonAddressesPK that = (LegalPersonAddressesPK) o;

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
