package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "land_right", schema = "public", catalog = "mgis")
public class LandRight {
    private Long id;
    private String comment;
    private Timestamp endDate;
    private String numEgrp;
    private String nemEndEgrp;
    private Timestamp regDate;
    private Timestamp regEndDate;
    private String share;
    private Timestamp shareDate;
    private Timestamp startDate;
    private Long landId;
    private Long statusId;
    private Long subjectId;
    private String rightType;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "end_date", nullable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "num_egrp", nullable = true, length = 64)
    public String getNumEgrp() {
        return numEgrp;
    }

    public void setNumEgrp(String numEgrp) {
        this.numEgrp = numEgrp;
    }

    @Basic
    @Column(name = "nem_end_egrp", nullable = true, length = 64)
    public String getNemEndEgrp() {
        return nemEndEgrp;
    }

    public void setNemEndEgrp(String nemEndEgrp) {
        this.nemEndEgrp = nemEndEgrp;
    }

    @Basic
    @Column(name = "reg_date", nullable = true)
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "reg_end_date", nullable = true)
    public Timestamp getRegEndDate() {
        return regEndDate;
    }

    public void setRegEndDate(Timestamp regEndDate) {
        this.regEndDate = regEndDate;
    }

    @Basic
    @Column(name = "share", nullable = true, length = 64)
    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    @Basic
    @Column(name = "share_date", nullable = true)
    public Timestamp getShareDate() {
        return shareDate;
    }

    public void setShareDate(Timestamp shareDate) {
        this.shareDate = shareDate;
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
    @Column(name = "land_id", nullable = true)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Basic
    @Column(name = "status_id", nullable = true)
    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
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
    @Column(name = "right_type", nullable = true, length = 255)
    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandRight landRight = (LandRight) o;

        if (id != null ? !id.equals(landRight.id) : landRight.id != null) return false;
        if (comment != null ? !comment.equals(landRight.comment) : landRight.comment != null) return false;
        if (endDate != null ? !endDate.equals(landRight.endDate) : landRight.endDate != null) return false;
        if (numEgrp != null ? !numEgrp.equals(landRight.numEgrp) : landRight.numEgrp != null) return false;
        if (nemEndEgrp != null ? !nemEndEgrp.equals(landRight.nemEndEgrp) : landRight.nemEndEgrp != null) return false;
        if (regDate != null ? !regDate.equals(landRight.regDate) : landRight.regDate != null) return false;
        if (regEndDate != null ? !regEndDate.equals(landRight.regEndDate) : landRight.regEndDate != null) return false;
        if (share != null ? !share.equals(landRight.share) : landRight.share != null) return false;
        if (shareDate != null ? !shareDate.equals(landRight.shareDate) : landRight.shareDate != null) return false;
        if (startDate != null ? !startDate.equals(landRight.startDate) : landRight.startDate != null) return false;
        if (landId != null ? !landId.equals(landRight.landId) : landRight.landId != null) return false;
        if (statusId != null ? !statusId.equals(landRight.statusId) : landRight.statusId != null) return false;
        if (subjectId != null ? !subjectId.equals(landRight.subjectId) : landRight.subjectId != null) return false;
        if (rightType != null ? !rightType.equals(landRight.rightType) : landRight.rightType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (numEgrp != null ? numEgrp.hashCode() : 0);
        result = 31 * result + (nemEndEgrp != null ? nemEndEgrp.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (regEndDate != null ? regEndDate.hashCode() : 0);
        result = 31 * result + (share != null ? share.hashCode() : 0);
        result = 31 * result + (shareDate != null ? shareDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        result = 31 * result + (rightType != null ? rightType.hashCode() : 0);
        return result;
    }
}
