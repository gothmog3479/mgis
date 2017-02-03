package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "document_param_value", schema = "public", catalog = "mgis")
public class DocumentParamValue {
    private Integer id;
    private Integer paramId;
    private String value;
    private Integer documentId;
    private String planValue;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "param_id", nullable = false)
    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    @Basic
    @Column(name = "value", nullable = true, length = 1024)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "document_id", nullable = false)
    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    @Basic
    @Column(name = "plan_value", nullable = true, length = 1024)
    public String getPlanValue() {
        return planValue;
    }

    public void setPlanValue(String planValue) {
        this.planValue = planValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentParamValue that = (DocumentParamValue) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paramId != null ? !paramId.equals(that.paramId) : that.paramId != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (documentId != null ? !documentId.equals(that.documentId) : that.documentId != null) return false;
        if (planValue != null ? !planValue.equals(that.planValue) : that.planValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paramId != null ? paramId.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (documentId != null ? documentId.hashCode() : 0);
        result = 31 * result + (planValue != null ? planValue.hashCode() : 0);
        return result;
    }
}
