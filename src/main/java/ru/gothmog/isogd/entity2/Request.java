package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Request {
    private Integer id;
    private String number;
    private Date creationDate;
    private String medium;
    private String name;
    private Integer docnameId;
    private String resolution;
    private Date resolutionDate;
    private Date controlDate;
    private Date executionDate;
    private String location;
    private Boolean onControl;
    private Integer recieverId;
    private Integer executorId;
    private Date execReceiveDate;
    private Integer reqId;
    private String comment;
    private Timestamp executionFactDate;
    private Timestamp incomeDate;
    private Timestamp outcomeDate;
    private String outcomeNumber;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "number", nullable = false, length = 30)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
    @Column(name = "medium", nullable = true, length = 255)
    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 4000)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "docname_id", nullable = true)
    public Integer getDocnameId() {
        return docnameId;
    }

    public void setDocnameId(Integer docnameId) {
        this.docnameId = docnameId;
    }

    @Basic
    @Column(name = "resolution", nullable = true, length = 1024)
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Basic
    @Column(name = "resolution_date", nullable = true)
    public Date getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(Date resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    @Basic
    @Column(name = "control_date", nullable = true)
    public Date getControlDate() {
        return controlDate;
    }

    public void setControlDate(Date controlDate) {
        this.controlDate = controlDate;
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
    @Column(name = "location", nullable = true, length = 1024)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "on_control", nullable = true)
    public Boolean getOnControl() {
        return onControl;
    }

    public void setOnControl(Boolean onControl) {
        this.onControl = onControl;
    }

    @Basic
    @Column(name = "reciever_id", nullable = false)
    public Integer getRecieverId() {
        return recieverId;
    }

    public void setRecieverId(Integer recieverId) {
        this.recieverId = recieverId;
    }

    @Basic
    @Column(name = "executor_id", nullable = true)
    public Integer getExecutorId() {
        return executorId;
    }

    public void setExecutorId(Integer executorId) {
        this.executorId = executorId;
    }

    @Basic
    @Column(name = "exec_receive_date", nullable = true)
    public Date getExecReceiveDate() {
        return execReceiveDate;
    }

    public void setExecReceiveDate(Date execReceiveDate) {
        this.execReceiveDate = execReceiveDate;
    }

    @Basic
    @Column(name = "req_id", nullable = true)
    public Integer getReqId() {
        return reqId;
    }

    public void setReqId(Integer reqId) {
        this.reqId = reqId;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 4000)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "execution_fact_date", nullable = true)
    public Timestamp getExecutionFactDate() {
        return executionFactDate;
    }

    public void setExecutionFactDate(Timestamp executionFactDate) {
        this.executionFactDate = executionFactDate;
    }

    @Basic
    @Column(name = "income_date", nullable = false)
    public Timestamp getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Timestamp incomeDate) {
        this.incomeDate = incomeDate;
    }

    @Basic
    @Column(name = "outcome_date", nullable = true)
    public Timestamp getOutcomeDate() {
        return outcomeDate;
    }

    public void setOutcomeDate(Timestamp outcomeDate) {
        this.outcomeDate = outcomeDate;
    }

    @Basic
    @Column(name = "outcome_number", nullable = true, length = 50)
    public String getOutcomeNumber() {
        return outcomeNumber;
    }

    public void setOutcomeNumber(String outcomeNumber) {
        this.outcomeNumber = outcomeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (id != null ? !id.equals(request.id) : request.id != null) return false;
        if (number != null ? !number.equals(request.number) : request.number != null) return false;
        if (creationDate != null ? !creationDate.equals(request.creationDate) : request.creationDate != null)
            return false;
        if (medium != null ? !medium.equals(request.medium) : request.medium != null) return false;
        if (name != null ? !name.equals(request.name) : request.name != null) return false;
        if (docnameId != null ? !docnameId.equals(request.docnameId) : request.docnameId != null) return false;
        if (resolution != null ? !resolution.equals(request.resolution) : request.resolution != null) return false;
        if (resolutionDate != null ? !resolutionDate.equals(request.resolutionDate) : request.resolutionDate != null)
            return false;
        if (controlDate != null ? !controlDate.equals(request.controlDate) : request.controlDate != null) return false;
        if (executionDate != null ? !executionDate.equals(request.executionDate) : request.executionDate != null)
            return false;
        if (location != null ? !location.equals(request.location) : request.location != null) return false;
        if (onControl != null ? !onControl.equals(request.onControl) : request.onControl != null) return false;
        if (recieverId != null ? !recieverId.equals(request.recieverId) : request.recieverId != null) return false;
        if (executorId != null ? !executorId.equals(request.executorId) : request.executorId != null) return false;
        if (execReceiveDate != null ? !execReceiveDate.equals(request.execReceiveDate) : request.execReceiveDate != null)
            return false;
        if (reqId != null ? !reqId.equals(request.reqId) : request.reqId != null) return false;
        if (comment != null ? !comment.equals(request.comment) : request.comment != null) return false;
        if (executionFactDate != null ? !executionFactDate.equals(request.executionFactDate) : request.executionFactDate != null)
            return false;
        if (incomeDate != null ? !incomeDate.equals(request.incomeDate) : request.incomeDate != null) return false;
        if (outcomeDate != null ? !outcomeDate.equals(request.outcomeDate) : request.outcomeDate != null) return false;
        if (outcomeNumber != null ? !outcomeNumber.equals(request.outcomeNumber) : request.outcomeNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (medium != null ? medium.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (docnameId != null ? docnameId.hashCode() : 0);
        result = 31 * result + (resolution != null ? resolution.hashCode() : 0);
        result = 31 * result + (resolutionDate != null ? resolutionDate.hashCode() : 0);
        result = 31 * result + (controlDate != null ? controlDate.hashCode() : 0);
        result = 31 * result + (executionDate != null ? executionDate.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (onControl != null ? onControl.hashCode() : 0);
        result = 31 * result + (recieverId != null ? recieverId.hashCode() : 0);
        result = 31 * result + (executorId != null ? executorId.hashCode() : 0);
        result = 31 * result + (execReceiveDate != null ? execReceiveDate.hashCode() : 0);
        result = 31 * result + (reqId != null ? reqId.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (executionFactDate != null ? executionFactDate.hashCode() : 0);
        result = 31 * result + (incomeDate != null ? incomeDate.hashCode() : 0);
        result = 31 * result + (outcomeDate != null ? outcomeDate.hashCode() : 0);
        result = 31 * result + (outcomeNumber != null ? outcomeNumber.hashCode() : 0);
        return result;
    }
}
