package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ContractBanProfileJoinPK implements Serializable {
    private Long banId;
    private Long profileId;

    @Column(name = "ban_id", nullable = false)
    @Id
    public Long getBanId() {
        return banId;
    }

    public void setBanId(Long banId) {
        this.banId = banId;
    }

    @Column(name = "profile_id", nullable = false)
    @Id
    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractBanProfileJoinPK that = (ContractBanProfileJoinPK) o;

        if (banId != null ? !banId.equals(that.banId) : that.banId != null) return false;
        if (profileId != null ? !profileId.equals(that.profileId) : that.profileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = banId != null ? banId.hashCode() : 0;
        result = 31 * result + (profileId != null ? profileId.hashCode() : 0);
        return result;
    }
}
