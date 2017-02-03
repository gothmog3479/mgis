package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mes_incident_document_work", schema = "public", catalog = "mgis")
public class MesIncidentDocumentWork {
    private Long id;
    private Timestamp createDateTime;
    private Timestamp endDateTime;
    private String status;
    private Long employeeId;
    private Long incidentId;
    private Long linkedDocumentId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "create_date_time", nullable = true)
    public Timestamp getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Timestamp createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Basic
    @Column(name = "end_date_time", nullable = true)
    public Timestamp getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Timestamp endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "employee_id", nullable = true)
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "incident_id", nullable = false)
    public Long getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
    }

    @Basic
    @Column(name = "linked_document_id", nullable = true)
    public Long getLinkedDocumentId() {
        return linkedDocumentId;
    }

    public void setLinkedDocumentId(Long linkedDocumentId) {
        this.linkedDocumentId = linkedDocumentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesIncidentDocumentWork that = (MesIncidentDocumentWork) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createDateTime != null ? !createDateTime.equals(that.createDateTime) : that.createDateTime != null)
            return false;
        if (endDateTime != null ? !endDateTime.equals(that.endDateTime) : that.endDateTime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (employeeId != null ? !employeeId.equals(that.employeeId) : that.employeeId != null) return false;
        if (incidentId != null ? !incidentId.equals(that.incidentId) : that.incidentId != null) return false;
        if (linkedDocumentId != null ? !linkedDocumentId.equals(that.linkedDocumentId) : that.linkedDocumentId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createDateTime != null ? createDateTime.hashCode() : 0);
        result = 31 * result + (endDateTime != null ? endDateTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        result = 31 * result + (incidentId != null ? incidentId.hashCode() : 0);
        result = 31 * result + (linkedDocumentId != null ? linkedDocumentId.hashCode() : 0);
        return result;
    }
}
