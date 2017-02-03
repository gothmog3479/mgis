package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "contract_coeff_asignment", schema = "public", catalog = "mgis")
public class ContractCoeffAsignment {
    private Long id;
    private Timestamp endDate;
    private Timestamp startDate;
    private Long coeffId;
    private Long ownerId;
    private Long replacedId;
    private Long replacedTypeId;
    private Long operandId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "start_date", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "coeff_id", nullable = true)
    public Long getCoeffId() {
        return coeffId;
    }

    public void setCoeffId(Long coeffId) {
        this.coeffId = coeffId;
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
    @Column(name = "replaced_id", nullable = true)
    public Long getReplacedId() {
        return replacedId;
    }

    public void setReplacedId(Long replacedId) {
        this.replacedId = replacedId;
    }

    @Basic
    @Column(name = "replaced_type_id", nullable = true)
    public Long getReplacedTypeId() {
        return replacedTypeId;
    }

    public void setReplacedTypeId(Long replacedTypeId) {
        this.replacedTypeId = replacedTypeId;
    }

    @Basic
    @Column(name = "operand_id", nullable = true)
    public Long getOperandId() {
        return operandId;
    }

    public void setOperandId(Long operandId) {
        this.operandId = operandId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractCoeffAsignment that = (ContractCoeffAsignment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (coeffId != null ? !coeffId.equals(that.coeffId) : that.coeffId != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (replacedId != null ? !replacedId.equals(that.replacedId) : that.replacedId != null) return false;
        if (replacedTypeId != null ? !replacedTypeId.equals(that.replacedTypeId) : that.replacedTypeId != null)
            return false;
        if (operandId != null ? !operandId.equals(that.operandId) : that.operandId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (coeffId != null ? coeffId.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (replacedId != null ? replacedId.hashCode() : 0);
        result = 31 * result + (replacedTypeId != null ? replacedTypeId.hashCode() : 0);
        result = 31 * result + (operandId != null ? operandId.hashCode() : 0);
        return result;
    }
}
