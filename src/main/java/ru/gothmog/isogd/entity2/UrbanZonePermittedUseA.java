package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "urban_zone_permitted_use_a", schema = "public", catalog = "mgis")
@IdClass(UrbanZonePermittedUseAPK.class)
public class UrbanZonePermittedUseA {
    private Integer zoneId;
    private Integer permittedUseId;

    @Id
    @Column(name = "zone_id", nullable = false)
    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    @Id
    @Column(name = "permitted_use_id", nullable = false)
    public Integer getPermittedUseId() {
        return permittedUseId;
    }

    public void setPermittedUseId(Integer permittedUseId) {
        this.permittedUseId = permittedUseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UrbanZonePermittedUseA that = (UrbanZonePermittedUseA) o;

        if (zoneId != null ? !zoneId.equals(that.zoneId) : that.zoneId != null) return false;
        if (permittedUseId != null ? !permittedUseId.equals(that.permittedUseId) : that.permittedUseId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zoneId != null ? zoneId.hashCode() : 0;
        result = 31 * result + (permittedUseId != null ? permittedUseId.hashCode() : 0);
        return result;
    }
}
