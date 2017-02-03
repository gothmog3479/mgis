package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_profile_account_join", schema = "public", catalog = "mgis")
@IdClass(ContractProfileAccountJoinPK.class)
public class ContractProfileAccountJoin {
    private Long profileId;
    private Long accountId;

    @Id
    @Column(name = "profile_id", nullable = false)
    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    @Id
    @Column(name = "account_id", nullable = false)
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractProfileAccountJoin that = (ContractProfileAccountJoin) o;

        if (profileId != null ? !profileId.equals(that.profileId) : that.profileId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = profileId != null ? profileId.hashCode() : 0;
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        return result;
    }
}
