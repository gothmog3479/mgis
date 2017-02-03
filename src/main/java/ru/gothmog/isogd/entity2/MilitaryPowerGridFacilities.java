package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_power_grid_facilities", schema = "public", catalog = "mgis")
public class MilitaryPowerGridFacilities {
    private Long id;
    private Double authorizedPower;
    private Double claimedPower;
    private Double installedPower;
    private Double volume;
    private Long adjacentId;
    private Long ownerId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "authorized_power", nullable = true, precision = 0)
    public Double getAuthorizedPower() {
        return authorizedPower;
    }

    public void setAuthorizedPower(Double authorizedPower) {
        this.authorizedPower = authorizedPower;
    }

    @Basic
    @Column(name = "claimed_power", nullable = true, precision = 0)
    public Double getClaimedPower() {
        return claimedPower;
    }

    public void setClaimedPower(Double claimedPower) {
        this.claimedPower = claimedPower;
    }

    @Basic
    @Column(name = "installed_power", nullable = true, precision = 0)
    public Double getInstalledPower() {
        return installedPower;
    }

    public void setInstalledPower(Double installedPower) {
        this.installedPower = installedPower;
    }

    @Basic
    @Column(name = "volume", nullable = true, precision = 0)
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Basic
    @Column(name = "adjacent_id", nullable = true)
    public Long getAdjacentId() {
        return adjacentId;
    }

    public void setAdjacentId(Long adjacentId) {
        this.adjacentId = adjacentId;
    }

    @Basic
    @Column(name = "owner_id", nullable = true)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryPowerGridFacilities that = (MilitaryPowerGridFacilities) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (authorizedPower != null ? !authorizedPower.equals(that.authorizedPower) : that.authorizedPower != null)
            return false;
        if (claimedPower != null ? !claimedPower.equals(that.claimedPower) : that.claimedPower != null) return false;
        if (installedPower != null ? !installedPower.equals(that.installedPower) : that.installedPower != null)
            return false;
        if (volume != null ? !volume.equals(that.volume) : that.volume != null) return false;
        if (adjacentId != null ? !adjacentId.equals(that.adjacentId) : that.adjacentId != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (authorizedPower != null ? authorizedPower.hashCode() : 0);
        result = 31 * result + (claimedPower != null ? claimedPower.hashCode() : 0);
        result = 31 * result + (installedPower != null ? installedPower.hashCode() : 0);
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        result = 31 * result + (adjacentId != null ? adjacentId.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        return result;
    }
}
