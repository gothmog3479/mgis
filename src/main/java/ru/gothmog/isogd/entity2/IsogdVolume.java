package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "isogd_volume", schema = "public", catalog = "mgis")
public class IsogdVolume {
    private Integer id;
    private String name;
    private Integer parentId;
    private Integer bookId;
    private Integer addressId;
    private Integer cadastralId;
    private Date startDate;
    private Date endDate;
    private String regNum;
    private String shortDescr;
    private String landmark;
    private Integer docCounter;
    private String bldRegType;
    private Long bucTypeId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 512)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "book_id", nullable = true)
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "address_id", nullable = true)
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "cadastral_id", nullable = true)
    public Integer getCadastralId() {
        return cadastralId;
    }

    public void setCadastralId(Integer cadastralId) {
        this.cadastralId = cadastralId;
    }

    @Basic
    @Column(name = "start_date", nullable = true)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "reg_num", nullable = true, length = 128)
    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    @Basic
    @Column(name = "short_descr", nullable = true, length = 8000)
    public String getShortDescr() {
        return shortDescr;
    }

    public void setShortDescr(String shortDescr) {
        this.shortDescr = shortDescr;
    }

    @Basic
    @Column(name = "landmark", nullable = true, length = 8000)
    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    @Basic
    @Column(name = "doc_counter", nullable = true)
    public Integer getDocCounter() {
        return docCounter;
    }

    public void setDocCounter(Integer docCounter) {
        this.docCounter = docCounter;
    }

    @Basic
    @Column(name = "bld_reg_type", nullable = true, length = 50)
    public String getBldRegType() {
        return bldRegType;
    }

    public void setBldRegType(String bldRegType) {
        this.bldRegType = bldRegType;
    }

    @Basic
    @Column(name = "buc_type_id", nullable = true)
    public Long getBucTypeId() {
        return bucTypeId;
    }

    public void setBucTypeId(Long bucTypeId) {
        this.bucTypeId = bucTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IsogdVolume that = (IsogdVolume) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
        if (cadastralId != null ? !cadastralId.equals(that.cadastralId) : that.cadastralId != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (regNum != null ? !regNum.equals(that.regNum) : that.regNum != null) return false;
        if (shortDescr != null ? !shortDescr.equals(that.shortDescr) : that.shortDescr != null) return false;
        if (landmark != null ? !landmark.equals(that.landmark) : that.landmark != null) return false;
        if (docCounter != null ? !docCounter.equals(that.docCounter) : that.docCounter != null) return false;
        if (bldRegType != null ? !bldRegType.equals(that.bldRegType) : that.bldRegType != null) return false;
        if (bucTypeId != null ? !bucTypeId.equals(that.bucTypeId) : that.bucTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (cadastralId != null ? cadastralId.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (regNum != null ? regNum.hashCode() : 0);
        result = 31 * result + (shortDescr != null ? shortDescr.hashCode() : 0);
        result = 31 * result + (landmark != null ? landmark.hashCode() : 0);
        result = 31 * result + (docCounter != null ? docCounter.hashCode() : 0);
        result = 31 * result + (bldRegType != null ? bldRegType.hashCode() : 0);
        result = 31 * result + (bucTypeId != null ? bucTypeId.hashCode() : 0);
        return result;
    }
}
