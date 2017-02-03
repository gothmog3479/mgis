package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "mes_incident_document", schema = "public", catalog = "mgis")
public class MesIncidentDocument {
    private Long id;
    private Time executePeriodicity;
    private String executorPost;
    private Boolean required;
    private Time timeToExecute;
    private String type;
    private Long regulationsId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "execute_periodicity", nullable = true)
    public Time getExecutePeriodicity() {
        return executePeriodicity;
    }

    public void setExecutePeriodicity(Time executePeriodicity) {
        this.executePeriodicity = executePeriodicity;
    }

    @Basic
    @Column(name = "executor_post", nullable = true, length = 255)
    public String getExecutorPost() {
        return executorPost;
    }

    public void setExecutorPost(String executorPost) {
        this.executorPost = executorPost;
    }

    @Basic
    @Column(name = "required", nullable = true)
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    @Basic
    @Column(name = "time_to_execute", nullable = true)
    public Time getTimeToExecute() {
        return timeToExecute;
    }

    public void setTimeToExecute(Time timeToExecute) {
        this.timeToExecute = timeToExecute;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "regulations_id", nullable = false)
    public Long getRegulationsId() {
        return regulationsId;
    }

    public void setRegulationsId(Long regulationsId) {
        this.regulationsId = regulationsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesIncidentDocument that = (MesIncidentDocument) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (executePeriodicity != null ? !executePeriodicity.equals(that.executePeriodicity) : that.executePeriodicity != null)
            return false;
        if (executorPost != null ? !executorPost.equals(that.executorPost) : that.executorPost != null) return false;
        if (required != null ? !required.equals(that.required) : that.required != null) return false;
        if (timeToExecute != null ? !timeToExecute.equals(that.timeToExecute) : that.timeToExecute != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (regulationsId != null ? !regulationsId.equals(that.regulationsId) : that.regulationsId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (executePeriodicity != null ? executePeriodicity.hashCode() : 0);
        result = 31 * result + (executorPost != null ? executorPost.hashCode() : 0);
        result = 31 * result + (required != null ? required.hashCode() : 0);
        result = 31 * result + (timeToExecute != null ? timeToExecute.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (regulationsId != null ? regulationsId.hashCode() : 0);
        return result;
    }
}
