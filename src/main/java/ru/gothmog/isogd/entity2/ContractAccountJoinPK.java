package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ContractAccountJoinPK implements Serializable {
    private Long contractId;
    private Long accountId;

    @Column(name = "contract_id", nullable = false)
    @Id
    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
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

        ContractAccountJoinPK that = (ContractAccountJoinPK) o;

        if (contractId != null ? !contractId.equals(that.contractId) : that.contractId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contractId != null ? contractId.hashCode() : 0;
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        return result;
    }
}
