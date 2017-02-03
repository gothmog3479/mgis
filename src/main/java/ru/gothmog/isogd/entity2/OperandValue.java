package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "operand_value", schema = "public", catalog = "mgis")
public class OperandValue {
    private Long id;
    private Double value;
    private Long operandId;
    private Long ownerId;
    private Long coefficientId;
    private String dType;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value", nullable = true, precision = 0)
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Basic
    @Column(name = "operand_id", nullable = true)
    public Long getOperandId() {
        return operandId;
    }

    public void setOperandId(Long operandId) {
        this.operandId = operandId;
    }

    @Basic
    @Column(name = "owner_id", nullable = true)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "coefficient_id", nullable = true)
    public Long getCoefficientId() {
        return coefficientId;
    }

    public void setCoefficientId(Long coefficientId) {
        this.coefficientId = coefficientId;
    }

    @Basic
    @Column(name = "d_type", nullable = false, length = 31)
    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperandValue that = (OperandValue) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (operandId != null ? !operandId.equals(that.operandId) : that.operandId != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (coefficientId != null ? !coefficientId.equals(that.coefficientId) : that.coefficientId != null)
            return false;
        if (dType != null ? !dType.equals(that.dType) : that.dType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (operandId != null ? operandId.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (coefficientId != null ? coefficientId.hashCode() : 0);
        result = 31 * result + (dType != null ? dType.hashCode() : 0);
        return result;
    }
}
