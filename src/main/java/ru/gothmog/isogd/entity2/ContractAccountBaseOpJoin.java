package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_account_base_op_join", schema = "public", catalog = "mgis")
@IdClass(ContractAccountBaseOpJoinPK.class)
public class ContractAccountBaseOpJoin {
    private Long opId;
    private Long baseId;

    @Id
    @Column(name = "op_id", nullable = false)
    public Long getOpId() {
        return opId;
    }

    public void setOpId(Long opId) {
        this.opId = opId;
    }

    @Id
    @Column(name = "base_id", nullable = false)
    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractAccountBaseOpJoin that = (ContractAccountBaseOpJoin) o;

        if (opId != null ? !opId.equals(that.opId) : that.opId != null) return false;
        if (baseId != null ? !baseId.equals(that.baseId) : that.baseId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = opId != null ? opId.hashCode() : 0;
        result = 31 * result + (baseId != null ? baseId.hashCode() : 0);
        return result;
    }
}
