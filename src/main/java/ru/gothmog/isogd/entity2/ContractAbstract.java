package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "contract_abstract", schema = "public", catalog = "mgis")
public class ContractAbstract {
    private Long id;
    private String baseTermination;
    private Date begDate;
    private String comment;
    private String contractNum;
    private Date endDate;
    private Date entryDate;
    private Long budgetCodeId;
    private Long budgetPeniCodeId;
    private Long statusId;
    private String permittedUse;
    private String lands;
    private String subjects;
    private Double debt;
    private Double debtPenalt;
    private Long sourceOfIncomeId;
    private Timestamp dateRegKp;
    private String numRegKp;
    private Integer contractNumInt;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "base_termination", nullable = true, length = 255)
    public String getBaseTermination() {
        return baseTermination;
    }

    public void setBaseTermination(String baseTermination) {
        this.baseTermination = baseTermination;
    }

    @Basic
    @Column(name = "beg_date", nullable = true)
    public Date getBegDate() {
        return begDate;
    }

    public void setBegDate(Date begDate) {
        this.begDate = begDate;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 4096)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "contract_num", nullable = true, length = 255)
    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "entry_date", nullable = true)
    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Basic
    @Column(name = "budget_code_id", nullable = true)
    public Long getBudgetCodeId() {
        return budgetCodeId;
    }

    public void setBudgetCodeId(Long budgetCodeId) {
        this.budgetCodeId = budgetCodeId;
    }

    @Basic
    @Column(name = "budget_peni_code_id", nullable = true)
    public Long getBudgetPeniCodeId() {
        return budgetPeniCodeId;
    }

    public void setBudgetPeniCodeId(Long budgetPeniCodeId) {
        this.budgetPeniCodeId = budgetPeniCodeId;
    }

    @Basic
    @Column(name = "status_id", nullable = true)
    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "permitted_use", nullable = true, length = 255)
    public String getPermittedUse() {
        return permittedUse;
    }

    public void setPermittedUse(String permittedUse) {
        this.permittedUse = permittedUse;
    }

    @Basic
    @Column(name = "lands", nullable = true, length = 1024)
    public String getLands() {
        return lands;
    }

    public void setLands(String lands) {
        this.lands = lands;
    }

    @Basic
    @Column(name = "subjects", nullable = true, length = 1024)
    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Basic
    @Column(name = "debt", nullable = true, precision = 0)
    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    @Basic
    @Column(name = "debt_penalt", nullable = true, precision = 0)
    public Double getDebtPenalt() {
        return debtPenalt;
    }

    public void setDebtPenalt(Double debtPenalt) {
        this.debtPenalt = debtPenalt;
    }

    @Basic
    @Column(name = "source_of_income_id", nullable = true)
    public Long getSourceOfIncomeId() {
        return sourceOfIncomeId;
    }

    public void setSourceOfIncomeId(Long sourceOfIncomeId) {
        this.sourceOfIncomeId = sourceOfIncomeId;
    }

    @Basic
    @Column(name = "date_reg_kp", nullable = true)
    public Timestamp getDateRegKp() {
        return dateRegKp;
    }

    public void setDateRegKp(Timestamp dateRegKp) {
        this.dateRegKp = dateRegKp;
    }

    @Basic
    @Column(name = "num_reg_kp", nullable = true, length = 128)
    public String getNumRegKp() {
        return numRegKp;
    }

    public void setNumRegKp(String numRegKp) {
        this.numRegKp = numRegKp;
    }

    @Basic
    @Column(name = "contract_num_int", nullable = true)
    public Integer getContractNumInt() {
        return contractNumInt;
    }

    public void setContractNumInt(Integer contractNumInt) {
        this.contractNumInt = contractNumInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractAbstract that = (ContractAbstract) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (baseTermination != null ? !baseTermination.equals(that.baseTermination) : that.baseTermination != null)
            return false;
        if (begDate != null ? !begDate.equals(that.begDate) : that.begDate != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (contractNum != null ? !contractNum.equals(that.contractNum) : that.contractNum != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (entryDate != null ? !entryDate.equals(that.entryDate) : that.entryDate != null) return false;
        if (budgetCodeId != null ? !budgetCodeId.equals(that.budgetCodeId) : that.budgetCodeId != null) return false;
        if (budgetPeniCodeId != null ? !budgetPeniCodeId.equals(that.budgetPeniCodeId) : that.budgetPeniCodeId != null)
            return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (permittedUse != null ? !permittedUse.equals(that.permittedUse) : that.permittedUse != null) return false;
        if (lands != null ? !lands.equals(that.lands) : that.lands != null) return false;
        if (subjects != null ? !subjects.equals(that.subjects) : that.subjects != null) return false;
        if (debt != null ? !debt.equals(that.debt) : that.debt != null) return false;
        if (debtPenalt != null ? !debtPenalt.equals(that.debtPenalt) : that.debtPenalt != null) return false;
        if (sourceOfIncomeId != null ? !sourceOfIncomeId.equals(that.sourceOfIncomeId) : that.sourceOfIncomeId != null)
            return false;
        if (dateRegKp != null ? !dateRegKp.equals(that.dateRegKp) : that.dateRegKp != null) return false;
        if (numRegKp != null ? !numRegKp.equals(that.numRegKp) : that.numRegKp != null) return false;
        if (contractNumInt != null ? !contractNumInt.equals(that.contractNumInt) : that.contractNumInt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (baseTermination != null ? baseTermination.hashCode() : 0);
        result = 31 * result + (begDate != null ? begDate.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (contractNum != null ? contractNum.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (entryDate != null ? entryDate.hashCode() : 0);
        result = 31 * result + (budgetCodeId != null ? budgetCodeId.hashCode() : 0);
        result = 31 * result + (budgetPeniCodeId != null ? budgetPeniCodeId.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (permittedUse != null ? permittedUse.hashCode() : 0);
        result = 31 * result + (lands != null ? lands.hashCode() : 0);
        result = 31 * result + (subjects != null ? subjects.hashCode() : 0);
        result = 31 * result + (debt != null ? debt.hashCode() : 0);
        result = 31 * result + (debtPenalt != null ? debtPenalt.hashCode() : 0);
        result = 31 * result + (sourceOfIncomeId != null ? sourceOfIncomeId.hashCode() : 0);
        result = 31 * result + (dateRegKp != null ? dateRegKp.hashCode() : 0);
        result = 31 * result + (numRegKp != null ? numRegKp.hashCode() : 0);
        result = 31 * result + (contractNumInt != null ? contractNumInt.hashCode() : 0);
        return result;
    }
}
