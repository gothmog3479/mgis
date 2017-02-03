package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_ban_profile_join", schema = "public", catalog = "mgis")
@IdClass(ContractBanProfileJoinPK.class)
public class ContractBanProfileJoin {
    private Long banId;
    private Long profileId;

    @Id
    @Column(name = "ban_id", nullable = false)
    public Long getBanId() {
        return banId;
    }

    public void setBanId(Long banId) {
        this.banId = banId;
    }

    @Id
    @Column(name = "profile_id", nullable = false)
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

        ContractBanProfileJoin that = (ContractBanProfileJoin) o;

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
