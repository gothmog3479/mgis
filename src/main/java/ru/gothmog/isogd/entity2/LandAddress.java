package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_address", schema = "public", catalog = "mgis")
@IdClass(LandAddressPK.class)
public class LandAddress {
    private Long landId;
    private Long addressId;

    @Id
    @Column(name = "land_id", nullable = false)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Id
    @Column(name = "address_id", nullable = false)
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandAddress that = (LandAddress) o;

        if (landId != null ? !landId.equals(that.landId) : that.landId != null) return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = landId != null ? landId.hashCode() : 0;
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        return result;
    }
}
