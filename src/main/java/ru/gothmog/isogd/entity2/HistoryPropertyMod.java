package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "history_property_mod", schema = "public", catalog = "mgis")
public class HistoryPropertyMod {
    private Long id;
    private String propertyName;
    private String dType;
    private Integer ownerId;
    private Timestamp editDate;
    private String referencedClassName;
    private String backwardPropertyName;
    private String editorUsername;
    private BigInteger numValue;
    private Timestamp dateValue;
    private String stringValue;
    private Integer objectId;
    private Boolean boolValue;
    private Integer transactionId;
    private Time timeValue;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "property_name", nullable = true, length = 255)
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Basic
    @Column(name = "d_type", nullable = false, length = -1)
    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType;
    }

    @Basic
    @Column(name = "owner_id", nullable = false)
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "edit_date", nullable = false)
    public Timestamp getEditDate() {
        return editDate;
    }

    public void setEditDate(Timestamp editDate) {
        this.editDate = editDate;
    }

    @Basic
    @Column(name = "referenced_class_name", nullable = true, length = 255)
    public String getReferencedClassName() {
        return referencedClassName;
    }

    public void setReferencedClassName(String referencedClassName) {
        this.referencedClassName = referencedClassName;
    }

    @Basic
    @Column(name = "backward_property_name", nullable = true, length = 255)
    public String getBackwardPropertyName() {
        return backwardPropertyName;
    }

    public void setBackwardPropertyName(String backwardPropertyName) {
        this.backwardPropertyName = backwardPropertyName;
    }

    @Basic
    @Column(name = "editor_username", nullable = true, length = 10)
    public String getEditorUsername() {
        return editorUsername;
    }

    public void setEditorUsername(String editorUsername) {
        this.editorUsername = editorUsername;
    }

    @Basic
    @Column(name = "num_value", nullable = true, precision = 0)
    public BigInteger getNumValue() {
        return numValue;
    }

    public void setNumValue(BigInteger numValue) {
        this.numValue = numValue;
    }

    @Basic
    @Column(name = "date_value", nullable = true)
    public Timestamp getDateValue() {
        return dateValue;
    }

    public void setDateValue(Timestamp dateValue) {
        this.dateValue = dateValue;
    }

    @Basic
    @Column(name = "string_value", nullable = true, length = 4096)
    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    @Basic
    @Column(name = "object_id", nullable = true)
    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    @Basic
    @Column(name = "bool_value", nullable = true)
    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    @Basic
    @Column(name = "transaction_id", nullable = true)
    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "time_value", nullable = true)
    public Time getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(Time timeValue) {
        this.timeValue = timeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoryPropertyMod that = (HistoryPropertyMod) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (propertyName != null ? !propertyName.equals(that.propertyName) : that.propertyName != null) return false;
        if (dType != null ? !dType.equals(that.dType) : that.dType != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (editDate != null ? !editDate.equals(that.editDate) : that.editDate != null) return false;
        if (referencedClassName != null ? !referencedClassName.equals(that.referencedClassName) : that.referencedClassName != null)
            return false;
        if (backwardPropertyName != null ? !backwardPropertyName.equals(that.backwardPropertyName) : that.backwardPropertyName != null)
            return false;
        if (editorUsername != null ? !editorUsername.equals(that.editorUsername) : that.editorUsername != null)
            return false;
        if (numValue != null ? !numValue.equals(that.numValue) : that.numValue != null) return false;
        if (dateValue != null ? !dateValue.equals(that.dateValue) : that.dateValue != null) return false;
        if (stringValue != null ? !stringValue.equals(that.stringValue) : that.stringValue != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (boolValue != null ? !boolValue.equals(that.boolValue) : that.boolValue != null) return false;
        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null)
            return false;
        if (timeValue != null ? !timeValue.equals(that.timeValue) : that.timeValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (propertyName != null ? propertyName.hashCode() : 0);
        result = 31 * result + (dType != null ? dType.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (editDate != null ? editDate.hashCode() : 0);
        result = 31 * result + (referencedClassName != null ? referencedClassName.hashCode() : 0);
        result = 31 * result + (backwardPropertyName != null ? backwardPropertyName.hashCode() : 0);
        result = 31 * result + (editorUsername != null ? editorUsername.hashCode() : 0);
        result = 31 * result + (numValue != null ? numValue.hashCode() : 0);
        result = 31 * result + (dateValue != null ? dateValue.hashCode() : 0);
        result = 31 * result + (stringValue != null ? stringValue.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (boolValue != null ? boolValue.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (timeValue != null ? timeValue.hashCode() : 0);
        return result;
    }
}
