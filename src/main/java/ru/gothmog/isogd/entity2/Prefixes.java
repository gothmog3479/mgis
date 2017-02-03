package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prefixes {
    private Integer id;
    private String shortName;
    private String name;
    private Integer addressLayer;
    private Boolean addressHasDetails;
    private Boolean addressHasOktmo;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "short_name", nullable = true, length = -1)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "address_layer", nullable = true)
    public Integer getAddressLayer() {
        return addressLayer;
    }

    public void setAddressLayer(Integer addressLayer) {
        this.addressLayer = addressLayer;
    }

    @Basic
    @Column(name = "address_has_details", nullable = true)
    public Boolean getAddressHasDetails() {
        return addressHasDetails;
    }

    public void setAddressHasDetails(Boolean addressHasDetails) {
        this.addressHasDetails = addressHasDetails;
    }

    @Basic
    @Column(name = "address_has_oktmo", nullable = false)
    public Boolean getAddressHasOktmo() {
        return addressHasOktmo;
    }

    public void setAddressHasOktmo(Boolean addressHasOktmo) {
        this.addressHasOktmo = addressHasOktmo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prefixes prefixes = (Prefixes) o;

        if (id != null ? !id.equals(prefixes.id) : prefixes.id != null) return false;
        if (shortName != null ? !shortName.equals(prefixes.shortName) : prefixes.shortName != null) return false;
        if (name != null ? !name.equals(prefixes.name) : prefixes.name != null) return false;
        if (addressLayer != null ? !addressLayer.equals(prefixes.addressLayer) : prefixes.addressLayer != null)
            return false;
        if (addressHasDetails != null ? !addressHasDetails.equals(prefixes.addressHasDetails) : prefixes.addressHasDetails != null)
            return false;
        if (addressHasOktmo != null ? !addressHasOktmo.equals(prefixes.addressHasOktmo) : prefixes.addressHasOktmo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (addressLayer != null ? addressLayer.hashCode() : 0);
        result = 31 * result + (addressHasDetails != null ? addressHasDetails.hashCode() : 0);
        result = 31 * result + (addressHasOktmo != null ? addressHasOktmo.hashCode() : 0);
        return result;
    }
}
