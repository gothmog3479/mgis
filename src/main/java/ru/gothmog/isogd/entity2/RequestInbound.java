package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "request_inbound", schema = "public", catalog = "mgis")
public class RequestInbound {
    private Integer id;
    private Integer requestId;
    private Date creationDate;
    private Date executionDate;
    private Timestamp factExecDate;
    private String resolution;
    private Timestamp resolutionDate;
    private String status;
    private Long executorId;
    private Long parentId;
    private Integer indexonlevel;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "request_id", nullable = false)
    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @Basic
    @Column(name = "creation_date", nullable = false)
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "execution_date", nullable = true)
    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    @Basic
    @Column(name = "fact_exec_date", nullable = true)
    public Timestamp getFactExecDate() {
        return factExecDate;
    }

    public void setFactExecDate(Timestamp factExecDate) {
        this.factExecDate = factExecDate;
    }

    @Basic
    @Column(name = "resolution", nullable = true, length = 50)
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Basic
    @Column(name = "resolution_date", nullable = true)
    public Timestamp getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(Timestamp resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "executor_id", nullable = false)
    public Long getExecutorId() {
        return executorId;
    }

    public void setExecutorId(Long executorId) {
        this.executorId = executorId;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "indexonlevel", nullable = true)
    public Integer getIndexonlevel() {
        return indexonlevel;
    }

    public void setIndexonlevel(Integer indexonlevel) {
        this.indexonlevel = indexonlevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestInbound that = (RequestInbound) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (executionDate != null ? !executionDate.equals(that.executionDate) : that.executionDate != null)
            return false;
        if (factExecDate != null ? !factExecDate.equals(that.factExecDate) : that.factExecDate != null) return false;
        if (resolution != null ? !resolution.equals(that.resolution) : that.resolution != null) return false;
        if (resolutionDate != null ? !resolutionDate.equals(that.resolutionDate) : that.resolutionDate != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (executorId != null ? !executorId.equals(that.executorId) : that.executorId != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (indexonlevel != null ? !indexonlevel.equals(that.indexonlevel) : that.indexonlevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (executionDate != null ? executionDate.hashCode() : 0);
        result = 31 * result + (factExecDate != null ? factExecDate.hashCode() : 0);
        result = 31 * result + (resolution != null ? resolution.hashCode() : 0);
        result = 31 * result + (resolutionDate != null ? resolutionDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (executorId != null ? executorId.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (indexonlevel != null ? indexonlevel.hashCode() : 0);
        return result;
    }
}
