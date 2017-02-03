package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "contract_calc_method", schema = "public", catalog = "mgis")
public class ContractCalcMethod {
    private Long id;
    private Timestamp endDate;
    private Timestamp startDate;
    private String methodicName;
    private Long formulaId;
    private Long predicateId;
    private String code;

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
    @Column(name = "methodic_name", nullable = true, length = 255)
    public String getMethodicName() {
        return methodicName;
    }

    public void setMethodicName(String methodicName) {
        this.methodicName = methodicName;
    }

    @Basic
    @Column(name = "formula_id", nullable = true)
    public Long getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(Long formulaId) {
        this.formulaId = formulaId;
    }

    @Basic
    @Column(name = "predicate_id", nullable = true)
    public Long getPredicateId() {
        return predicateId;
    }

    public void setPredicateId(Long predicateId) {
        this.predicateId = predicateId;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractCalcMethod that = (ContractCalcMethod) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (methodicName != null ? !methodicName.equals(that.methodicName) : that.methodicName != null) return false;
        if (formulaId != null ? !formulaId.equals(that.formulaId) : that.formulaId != null) return false;
        if (predicateId != null ? !predicateId.equals(that.predicateId) : that.predicateId != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (methodicName != null ? methodicName.hashCode() : 0);
        result = 31 * result + (formulaId != null ? formulaId.hashCode() : 0);
        result = 31 * result + (predicateId != null ? predicateId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
