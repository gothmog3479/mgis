package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "building_generic_right", schema = "public", catalog = "mgis")
public class BuildingGenericRight {
    private Long id;
    private Timestamp endDate;
    private String part;
    private Timestamp startDate;
    private String status;
    private Long buildingId;
    private Long parentId;
    private Long subjectId;
    private Double areaByCertifying;
    private Double areaByEntitlement;
    private String comment;
    private Timestamp dateEndReg;
    private Timestamp dateReg;
    private String numEndReg;
    private String numReg;
    private Long typeId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "part", nullable = true, length = 255)
    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    @Basic
    @Column(name = "start_date", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
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
    @Column(name = "building_id", nullable = false)
    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
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
    @Column(name = "subject_id", nullable = true)
    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "area_by_certifying", nullable = true, precision = 0)
    public Double getAreaByCertifying() {
        return areaByCertifying;
    }

    public void setAreaByCertifying(Double areaByCertifying) {
        this.areaByCertifying = areaByCertifying;
    }

    @Basic
    @Column(name = "area_by_entitlement", nullable = true, precision = 0)
    public Double getAreaByEntitlement() {
        return areaByEntitlement;
    }

    public void setAreaByEntitlement(Double areaByEntitlement) {
        this.areaByEntitlement = areaByEntitlement;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 4096)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "date_end_reg", nullable = true)
    public Timestamp getDateEndReg() {
        return dateEndReg;
    }

    public void setDateEndReg(Timestamp dateEndReg) {
        this.dateEndReg = dateEndReg;
    }

    @Basic
    @Column(name = "date_reg", nullable = true)
    public Timestamp getDateReg() {
        return dateReg;
    }

    public void setDateReg(Timestamp dateReg) {
        this.dateReg = dateReg;
    }

    @Basic
    @Column(name = "num_end_reg", nullable = true, length = 255)
    public String getNumEndReg() {
        return numEndReg;
    }

    public void setNumEndReg(String numEndReg) {
        this.numEndReg = numEndReg;
    }

    @Basic
    @Column(name = "num_reg", nullable = true, length = 255)
    public String getNumReg() {
        return numReg;
    }

    public void setNumReg(String numReg) {
        this.numReg = numReg;
    }

    @Basic
    @Column(name = "type_id", nullable = true)
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingGenericRight that = (BuildingGenericRight) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (part != null ? !part.equals(that.part) : that.part != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (buildingId != null ? !buildingId.equals(that.buildingId) : that.buildingId != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;
        if (areaByCertifying != null ? !areaByCertifying.equals(that.areaByCertifying) : that.areaByCertifying != null)
            return false;
        if (areaByEntitlement != null ? !areaByEntitlement.equals(that.areaByEntitlement) : that.areaByEntitlement != null)
            return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (dateEndReg != null ? !dateEndReg.equals(that.dateEndReg) : that.dateEndReg != null) return false;
        if (dateReg != null ? !dateReg.equals(that.dateReg) : that.dateReg != null) return false;
        if (numEndReg != null ? !numEndReg.equals(that.numEndReg) : that.numEndReg != null) return false;
        if (numReg != null ? !numReg.equals(that.numReg) : that.numReg != null) return false;
        if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (part != null ? part.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (buildingId != null ? buildingId.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        result = 31 * result + (areaByCertifying != null ? areaByCertifying.hashCode() : 0);
        result = 31 * result + (areaByEntitlement != null ? areaByEntitlement.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (dateEndReg != null ? dateEndReg.hashCode() : 0);
        result = 31 * result + (dateReg != null ? dateReg.hashCode() : 0);
        result = 31 * result + (numEndReg != null ? numEndReg.hashCode() : 0);
        result = 31 * result + (numReg != null ? numReg.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        return result;
    }
}
