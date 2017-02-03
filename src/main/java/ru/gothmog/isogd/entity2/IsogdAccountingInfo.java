package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "isogd_accounting_info", schema = "public", catalog = "mgis")
public class IsogdAccountingInfo {
    private Long id;
    private Date date;
    private String mediaType;
    private String name;
    private String note;
    private Integer number;
    private Date outcomeDate;
    private String outcomeNum;
    private Integer pagesCount;
    private Date placementdate;
    private String regnum;
    private String source;
    private Long isogdDocId;
    private Long signaturePersonId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "media_type", nullable = true, length = 64)
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 1024)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "number", nullable = true)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "outcome_date", nullable = true)
    public Date getOutcomeDate() {
        return outcomeDate;
    }

    public void setOutcomeDate(Date outcomeDate) {
        this.outcomeDate = outcomeDate;
    }

    @Basic
    @Column(name = "outcome_num", nullable = true, length = 256)
    public String getOutcomeNum() {
        return outcomeNum;
    }

    public void setOutcomeNum(String outcomeNum) {
        this.outcomeNum = outcomeNum;
    }

    @Basic
    @Column(name = "pages_count", nullable = true)
    public Integer getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(Integer pagesCount) {
        this.pagesCount = pagesCount;
    }

    @Basic
    @Column(name = "placementdate", nullable = false)
    public Date getPlacementdate() {
        return placementdate;
    }

    public void setPlacementdate(Date placementdate) {
        this.placementdate = placementdate;
    }

    @Basic
    @Column(name = "regnum", nullable = false, length = 256)
    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

    @Basic
    @Column(name = "source", nullable = true, length = 1024)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "isogd_doc_id", nullable = true)
    public Long getIsogdDocId() {
        return isogdDocId;
    }

    public void setIsogdDocId(Long isogdDocId) {
        this.isogdDocId = isogdDocId;
    }

    @Basic
    @Column(name = "signature_person_id", nullable = true)
    public Long getSignaturePersonId() {
        return signaturePersonId;
    }

    public void setSignaturePersonId(Long signaturePersonId) {
        this.signaturePersonId = signaturePersonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IsogdAccountingInfo that = (IsogdAccountingInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (mediaType != null ? !mediaType.equals(that.mediaType) : that.mediaType != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (outcomeDate != null ? !outcomeDate.equals(that.outcomeDate) : that.outcomeDate != null) return false;
        if (outcomeNum != null ? !outcomeNum.equals(that.outcomeNum) : that.outcomeNum != null) return false;
        if (pagesCount != null ? !pagesCount.equals(that.pagesCount) : that.pagesCount != null) return false;
        if (placementdate != null ? !placementdate.equals(that.placementdate) : that.placementdate != null)
            return false;
        if (regnum != null ? !regnum.equals(that.regnum) : that.regnum != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (isogdDocId != null ? !isogdDocId.equals(that.isogdDocId) : that.isogdDocId != null) return false;
        if (signaturePersonId != null ? !signaturePersonId.equals(that.signaturePersonId) : that.signaturePersonId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (mediaType != null ? mediaType.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (outcomeDate != null ? outcomeDate.hashCode() : 0);
        result = 31 * result + (outcomeNum != null ? outcomeNum.hashCode() : 0);
        result = 31 * result + (pagesCount != null ? pagesCount.hashCode() : 0);
        result = 31 * result + (placementdate != null ? placementdate.hashCode() : 0);
        result = 31 * result + (regnum != null ? regnum.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (isogdDocId != null ? isogdDocId.hashCode() : 0);
        result = 31 * result + (signaturePersonId != null ? signaturePersonId.hashCode() : 0);
        return result;
    }
}
