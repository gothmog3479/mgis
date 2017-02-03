package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "request_ext_step_translation", schema = "public", catalog = "mgis")
public class RequestExtStepTranslation {
    private String transType;
    private Long id;
    private Boolean common;
    private String checkerClassName;
    private Long permissionId;
    private Long stepTypeId;
    private Long targetId;

    @Basic
    @Column(name = "trans_type", nullable = false, length = 31)
    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "common", nullable = false)
    public Boolean getCommon() {
        return common;
    }

    public void setCommon(Boolean common) {
        this.common = common;
    }

    @Basic
    @Column(name = "checker_class_name", nullable = true, length = 255)
    public String getCheckerClassName() {
        return checkerClassName;
    }

    public void setCheckerClassName(String checkerClassName) {
        this.checkerClassName = checkerClassName;
    }

    @Basic
    @Column(name = "permission_id", nullable = true)
    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    @Basic
    @Column(name = "step_type_id", nullable = true)
    public Long getStepTypeId() {
        return stepTypeId;
    }

    public void setStepTypeId(Long stepTypeId) {
        this.stepTypeId = stepTypeId;
    }

    @Basic
    @Column(name = "target_id", nullable = true)
    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestExtStepTranslation that = (RequestExtStepTranslation) o;

        if (transType != null ? !transType.equals(that.transType) : that.transType != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (common != null ? !common.equals(that.common) : that.common != null) return false;
        if (checkerClassName != null ? !checkerClassName.equals(that.checkerClassName) : that.checkerClassName != null)
            return false;
        if (permissionId != null ? !permissionId.equals(that.permissionId) : that.permissionId != null) return false;
        if (stepTypeId != null ? !stepTypeId.equals(that.stepTypeId) : that.stepTypeId != null) return false;
        if (targetId != null ? !targetId.equals(that.targetId) : that.targetId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transType != null ? transType.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (common != null ? common.hashCode() : 0);
        result = 31 * result + (checkerClassName != null ? checkerClassName.hashCode() : 0);
        result = 31 * result + (permissionId != null ? permissionId.hashCode() : 0);
        result = 31 * result + (stepTypeId != null ? stepTypeId.hashCode() : 0);
        result = 31 * result + (targetId != null ? targetId.hashCode() : 0);
        return result;
    }
}
