package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "request_ext", schema = "public", catalog = "mgis")
public class RequestExt {
    private Integer id;
    private Integer requestorId;
    private String number;
    private Date reqDate;
    private Integer curatorId;
    private Integer knId;
    private Integer addrId;
    private String room;
    private Double area;
    private String comment;
    private Integer purposeId;
    private Double square;
    private Long addressId;
    private Long docnameId;
    private Long docSetId;
    private Long sourceId;
    private Long detailedAddressId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "requestor_id", nullable = false)
    public Integer getRequestorId() {
        return requestorId;
    }

    public void setRequestorId(Integer requestorId) {
        this.requestorId = requestorId;
    }

    @Basic
    @Column(name = "number", nullable = true, length = 128)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "req_date", nullable = false)
    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    @Basic
    @Column(name = "curator_id", nullable = true)
    public Integer getCuratorId() {
        return curatorId;
    }

    public void setCuratorId(Integer curatorId) {
        this.curatorId = curatorId;
    }

    @Basic
    @Column(name = "kn_id", nullable = true)
    public Integer getKnId() {
        return knId;
    }

    public void setKnId(Integer knId) {
        this.knId = knId;
    }

    @Basic
    @Column(name = "addr_id", nullable = true)
    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    @Basic
    @Column(name = "room", nullable = true, length = 10)
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Basic
    @Column(name = "area", nullable = true, precision = 0)
    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 8000)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "purpose_id", nullable = true)
    public Integer getPurposeId() {
        return purposeId;
    }

    public void setPurposeId(Integer purposeId) {
        this.purposeId = purposeId;
    }

    @Basic
    @Column(name = "square", nullable = true, precision = 0)
    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    @Basic
    @Column(name = "address_id", nullable = true)
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "docname_id", nullable = false)
    public Long getDocnameId() {
        return docnameId;
    }

    public void setDocnameId(Long docnameId) {
        this.docnameId = docnameId;
    }

    @Basic
    @Column(name = "doc_set_id", nullable = true)
    public Long getDocSetId() {
        return docSetId;
    }

    public void setDocSetId(Long docSetId) {
        this.docSetId = docSetId;
    }

    @Basic
    @Column(name = "source_id", nullable = true)
    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    @Basic
    @Column(name = "detailed_address_id", nullable = true)
    public Long getDetailedAddressId() {
        return detailedAddressId;
    }

    public void setDetailedAddressId(Long detailedAddressId) {
        this.detailedAddressId = detailedAddressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestExt that = (RequestExt) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (requestorId != null ? !requestorId.equals(that.requestorId) : that.requestorId != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (reqDate != null ? !reqDate.equals(that.reqDate) : that.reqDate != null) return false;
        if (curatorId != null ? !curatorId.equals(that.curatorId) : that.curatorId != null) return false;
        if (knId != null ? !knId.equals(that.knId) : that.knId != null) return false;
        if (addrId != null ? !addrId.equals(that.addrId) : that.addrId != null) return false;
        if (room != null ? !room.equals(that.room) : that.room != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (purposeId != null ? !purposeId.equals(that.purposeId) : that.purposeId != null) return false;
        if (square != null ? !square.equals(that.square) : that.square != null) return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
        if (docnameId != null ? !docnameId.equals(that.docnameId) : that.docnameId != null) return false;
        if (docSetId != null ? !docSetId.equals(that.docSetId) : that.docSetId != null) return false;
        if (sourceId != null ? !sourceId.equals(that.sourceId) : that.sourceId != null) return false;
        if (detailedAddressId != null ? !detailedAddressId.equals(that.detailedAddressId) : that.detailedAddressId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (requestorId != null ? requestorId.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (reqDate != null ? reqDate.hashCode() : 0);
        result = 31 * result + (curatorId != null ? curatorId.hashCode() : 0);
        result = 31 * result + (knId != null ? knId.hashCode() : 0);
        result = 31 * result + (addrId != null ? addrId.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (purposeId != null ? purposeId.hashCode() : 0);
        result = 31 * result + (square != null ? square.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (docnameId != null ? docnameId.hashCode() : 0);
        result = 31 * result + (docSetId != null ? docSetId.hashCode() : 0);
        result = 31 * result + (sourceId != null ? sourceId.hashCode() : 0);
        result = 31 * result + (detailedAddressId != null ? detailedAddressId.hashCode() : 0);
        return result;
    }
}
