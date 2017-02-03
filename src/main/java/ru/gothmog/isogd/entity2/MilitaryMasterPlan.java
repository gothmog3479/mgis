package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_master_plan", schema = "public", catalog = "mgis")
public class MilitaryMasterPlan {
    private Long id;
    private Long executorId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "executor_id", nullable = true)
    public Long getExecutorId() {
        return executorId;
    }

    public void setExecutorId(Long executorId) {
        this.executorId = executorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryMasterPlan that = (MilitaryMasterPlan) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (executorId != null ? !executorId.equals(that.executorId) : that.executorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (executorId != null ? executorId.hashCode() : 0);
        return result;
    }
}
