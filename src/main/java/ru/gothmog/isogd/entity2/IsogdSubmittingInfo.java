package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "isogd_submitting_info", schema = "public", catalog = "mgis")
public class IsogdSubmittingInfo {
    private Long id;
    private Timestamp deliverydate;
    private String deliveryform;
    private String note;
    private Integer number;
    private Timestamp paydate;
    private String reqnum;
    private String status;
    private String subjectproj;
    private Long isogdReqId;
    private Long signaturePersonId;
    private Long subjectId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "deliverydate", nullable = true)
    public Timestamp getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Timestamp deliverydate) {
        this.deliverydate = deliverydate;
    }

    @Basic
    @Column(name = "deliveryform", nullable = true, length = 255)
    public String getDeliveryform() {
        return deliveryform;
    }

    public void setDeliveryform(String deliveryform) {
        this.deliveryform = deliveryform;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 4096)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "number", nullable = false)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "paydate", nullable = true)
    public Timestamp getPaydate() {
        return paydate;
    }

    public void setPaydate(Timestamp paydate) {
        this.paydate = paydate;
    }

    @Basic
    @Column(name = "reqnum", nullable = true, length = 256)
    public String getReqnum() {
        return reqnum;
    }

    public void setReqnum(String reqnum) {
        this.reqnum = reqnum;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 64)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "subjectproj", nullable = true, length = 512)
    public String getSubjectproj() {
        return subjectproj;
    }

    public void setSubjectproj(String subjectproj) {
        this.subjectproj = subjectproj;
    }

    @Basic
    @Column(name = "isogd_req_id", nullable = true)
    public Long getIsogdReqId() {
        return isogdReqId;
    }

    public void setIsogdReqId(Long isogdReqId) {
        this.isogdReqId = isogdReqId;
    }

    @Basic
    @Column(name = "signature_person_id", nullable = true)
    public Long getSignaturePersonId() {
        return signaturePersonId;
    }

    public void setSignaturePersonId(Long signaturePersonId) {
        this.signaturePersonId = signaturePersonId;
    }

    @Basic
    @Column(name = "subject_id", nullable = true)
    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IsogdSubmittingInfo that = (IsogdSubmittingInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (deliverydate != null ? !deliverydate.equals(that.deliverydate) : that.deliverydate != null) return false;
        if (deliveryform != null ? !deliveryform.equals(that.deliveryform) : that.deliveryform != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (paydate != null ? !paydate.equals(that.paydate) : that.paydate != null) return false;
        if (reqnum != null ? !reqnum.equals(that.reqnum) : that.reqnum != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (subjectproj != null ? !subjectproj.equals(that.subjectproj) : that.subjectproj != null) return false;
        if (isogdReqId != null ? !isogdReqId.equals(that.isogdReqId) : that.isogdReqId != null) return false;
        if (signaturePersonId != null ? !signaturePersonId.equals(that.signaturePersonId) : that.signaturePersonId != null)
            return false;
        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (deliverydate != null ? deliverydate.hashCode() : 0);
        result = 31 * result + (deliveryform != null ? deliveryform.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (paydate != null ? paydate.hashCode() : 0);
        result = 31 * result + (reqnum != null ? reqnum.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (subjectproj != null ? subjectproj.hashCode() : 0);
        result = 31 * result + (isogdReqId != null ? isogdReqId.hashCode() : 0);
        result = 31 * result + (signaturePersonId != null ? signaturePersonId.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        return result;
    }
}
