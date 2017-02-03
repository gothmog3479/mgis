package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ContractAccountBaseOpJoinPK implements Serializable {
    private Long opId;
    private Long baseId;

    @Column(name = "op_id", nullable = false)
    @Id
    public Long getOpId() {
        return opId;
    }

    public void setOpId(Long opId) {
        this.opId = opId;
    }

    @Column(name = "base_id", nullable = false)
    @Id
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

        ContractAccountBaseOpJoinPK that = (ContractAccountBaseOpJoinPK) o;

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
