package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "contract_account_operation", schema = "public", catalog = "mgis")
public class ContractAccountOperation {
    private Long id;
    private Double addRealValue;
    private Double addValue;
    private Integer days;
    private String userNote;
    private Date operationDate;
    private Double realValue;
    private String opType;
    private Double value;
    private String editor;
    private Date offsetDate;
    private Date edition;
    private String paymentOrderNumber;
    private Long contractLinkPay;
    private Long paymentOrderTypeId;
    private String acOpType;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "add_real_value", nullable = true, precision = 0)
    public Double getAddRealValue() {
        return addRealValue;
    }

    public void setAddRealValue(Double addRealValue) {
        this.addRealValue = addRealValue;
    }

    @Basic
    @Column(name = "add_value", nullable = true, precision = 0)
    public Double getAddValue() {
        return addValue;
    }

    public void setAddValue(Double addValue) {
        this.addValue = addValue;
    }

    @Basic
    @Column(name = "days", nullable = true)
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Basic
    @Column(name = "user_note", nullable = true, length = 255)
    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    @Basic
    @Column(name = "operation_date", nullable = true)
    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    @Basic
    @Column(name = "real_value", nullable = true, precision = 0)
    public Double getRealValue() {
        return realValue;
    }

    public void setRealValue(Double realValue) {
        this.realValue = realValue;
    }

    @Basic
    @Column(name = "op_type", nullable = false, length = 255)
    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
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
    @Column(name = "editor", nullable = true, length = 255)
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Basic
    @Column(name = "offset_date", nullable = true)
    public Date getOffsetDate() {
        return offsetDate;
    }

    public void setOffsetDate(Date offsetDate) {
        this.offsetDate = offsetDate;
    }

    @Basic
    @Column(name = "edition", nullable = true)
    public Date getEdition() {
        return edition;
    }

    public void setEdition(Date edition) {
        this.edition = edition;
    }

    @Basic
    @Column(name = "payment_order_number", nullable = true, length = 255)
    public String getPaymentOrderNumber() {
        return paymentOrderNumber;
    }

    public void setPaymentOrderNumber(String paymentOrderNumber) {
        this.paymentOrderNumber = paymentOrderNumber;
    }

    @Basic
    @Column(name = "contract_link_pay", nullable = true)
    public Long getContractLinkPay() {
        return contractLinkPay;
    }

    public void setContractLinkPay(Long contractLinkPay) {
        this.contractLinkPay = contractLinkPay;
    }

    @Basic
    @Column(name = "payment_order_type_id", nullable = true)
    public Long getPaymentOrderTypeId() {
        return paymentOrderTypeId;
    }

    public void setPaymentOrderTypeId(Long paymentOrderTypeId) {
        this.paymentOrderTypeId = paymentOrderTypeId;
    }

    @Basic
    @Column(name = "ac_op_type", nullable = false, length = 31)
    public String getAcOpType() {
        return acOpType;
    }

    public void setAcOpType(String acOpType) {
        this.acOpType = acOpType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractAccountOperation that = (ContractAccountOperation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (addRealValue != null ? !addRealValue.equals(that.addRealValue) : that.addRealValue != null) return false;
        if (addValue != null ? !addValue.equals(that.addValue) : that.addValue != null) return false;
        if (days != null ? !days.equals(that.days) : that.days != null) return false;
        if (userNote != null ? !userNote.equals(that.userNote) : that.userNote != null) return false;
        if (operationDate != null ? !operationDate.equals(that.operationDate) : that.operationDate != null)
            return false;
        if (realValue != null ? !realValue.equals(that.realValue) : that.realValue != null) return false;
        if (opType != null ? !opType.equals(that.opType) : that.opType != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (editor != null ? !editor.equals(that.editor) : that.editor != null) return false;
        if (offsetDate != null ? !offsetDate.equals(that.offsetDate) : that.offsetDate != null) return false;
        if (edition != null ? !edition.equals(that.edition) : that.edition != null) return false;
        if (paymentOrderNumber != null ? !paymentOrderNumber.equals(that.paymentOrderNumber) : that.paymentOrderNumber != null)
            return false;
        if (contractLinkPay != null ? !contractLinkPay.equals(that.contractLinkPay) : that.contractLinkPay != null)
            return false;
        if (paymentOrderTypeId != null ? !paymentOrderTypeId.equals(that.paymentOrderTypeId) : that.paymentOrderTypeId != null)
            return false;
        if (acOpType != null ? !acOpType.equals(that.acOpType) : that.acOpType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (addRealValue != null ? addRealValue.hashCode() : 0);
        result = 31 * result + (addValue != null ? addValue.hashCode() : 0);
        result = 31 * result + (days != null ? days.hashCode() : 0);
        result = 31 * result + (userNote != null ? userNote.hashCode() : 0);
        result = 31 * result + (operationDate != null ? operationDate.hashCode() : 0);
        result = 31 * result + (realValue != null ? realValue.hashCode() : 0);
        result = 31 * result + (opType != null ? opType.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (editor != null ? editor.hashCode() : 0);
        result = 31 * result + (offsetDate != null ? offsetDate.hashCode() : 0);
        result = 31 * result + (edition != null ? edition.hashCode() : 0);
        result = 31 * result + (paymentOrderNumber != null ? paymentOrderNumber.hashCode() : 0);
        result = 31 * result + (contractLinkPay != null ? contractLinkPay.hashCode() : 0);
        result = 31 * result + (paymentOrderTypeId != null ? paymentOrderTypeId.hashCode() : 0);
        result = 31 * result + (acOpType != null ? acOpType.hashCode() : 0);
        return result;
    }
}
