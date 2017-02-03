package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ContractProfileAccountJoinPK implements Serializable {
    private Long profileId;
    private Long accountId;

    @Column(name = "profile_id", nullable = false)
    @Id
    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    @Column(name = "account_id", nullable = false)
    @Id
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

        ContractProfileAccountJoinPK that = (ContractProfileAccountJoinPK) o;

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
