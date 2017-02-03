package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "request_ext_step_doctype_join", schema = "public", catalog = "mgis")
public class RequestExtStepDoctypeJoin {
    private Long stepId;
    private Long docTypeId;

    @Basic
    @Column(name = "step_id", nullable = false)
    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    @Basic
    @Column(name = "doc_type_id", nullable = false)
    public Long getDocTypeId() {
        return docTypeId;
    }

    public void setDocTypeId(Long docTypeId) {
        this.docTypeId = docTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestExtStepDoctypeJoin that = (RequestExtStepDoctypeJoin) o;

        if (stepId != null ? !stepId.equals(that.stepId) : that.stepId != null) return false;
        if (docTypeId != null ? !docTypeId.equals(that.docTypeId) : that.docTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stepId != null ? stepId.hashCode() : 0;
        result = 31 * result + (docTypeId != null ? docTypeId.hashCode() : 0);
        return result;
    }
}
