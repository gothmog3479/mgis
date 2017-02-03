package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "request_ext_step_tranlation_join", schema = "public", catalog = "mgis")
public class RequestExtStepTranlationJoin {
    private Long stepId;
    private Long translaionId;

    @Basic
    @Column(name = "step_id", nullable = false)
    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    @Basic
    @Column(name = "translaion_id", nullable = false)
    public Long getTranslaionId() {
        return translaionId;
    }

    public void setTranslaionId(Long translaionId) {
        this.translaionId = translaionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestExtStepTranlationJoin that = (RequestExtStepTranlationJoin) o;

        if (stepId != null ? !stepId.equals(that.stepId) : that.stepId != null) return false;
        if (translaionId != null ? !translaionId.equals(that.translaionId) : that.translaionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stepId != null ? stepId.hashCode() : 0;
        result = 31 * result + (translaionId != null ? translaionId.hashCode() : 0);
        return result;
    }
}
