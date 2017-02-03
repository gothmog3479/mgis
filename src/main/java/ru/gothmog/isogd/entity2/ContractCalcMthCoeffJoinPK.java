package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ContractCalcMthCoeffJoinPK implements Serializable {
    private Long methodId;
    private Long coeffTypeId;

    @Column(name = "method_id", nullable = false)
    @Id
    public Long getMethodId() {
        return methodId;
    }

    public void setMethodId(Long methodId) {
        this.methodId = methodId;
    }

    @Column(name = "coeff_type_id", nullable = false)
    @Id
    public Long getCoeffTypeId() {
        return coeffTypeId;
    }

    public void setCoeffTypeId(Long coeffTypeId) {
        this.coeffTypeId = coeffTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractCalcMthCoeffJoinPK that = (ContractCalcMthCoeffJoinPK) o;

        if (methodId != null ? !methodId.equals(that.methodId) : that.methodId != null) return false;
        if (coeffTypeId != null ? !coeffTypeId.equals(that.coeffTypeId) : that.coeffTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = methodId != null ? methodId.hashCode() : 0;
        result = 31 * result + (coeffTypeId != null ? coeffTypeId.hashCode() : 0);
        return result;
    }
}
