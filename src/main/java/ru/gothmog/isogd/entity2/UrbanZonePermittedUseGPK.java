package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class UrbanZonePermittedUseGPK implements Serializable {
    private Integer zoneId;
    private Integer permittedUseId;

    @Column(name = "zone_id", nullable = false)
    @Id
    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    @Column(name = "permitted_use_id", nullable = false)
    @Id
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

        UrbanZonePermittedUseGPK that = (UrbanZonePermittedUseGPK) o;

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
