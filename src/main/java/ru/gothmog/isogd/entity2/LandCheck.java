package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "land_check", schema = "public", catalog = "mgis")
public class LandCheck {
    private Long id;
    private String baseOfViolation;
    private String comment;
    private Timestamp date;
    private Boolean landReleased;
    private Integer number;
    private Double penaltyPayment;
    private Double penaltyRate;
    private String state;
    private Timestamp timeframeViolation;
    private String violationDescription;
    private String violationsExistance;
    private Long checkTypeId;
    private Long checkViewId;
    private Long landId;
    private Long officialId;
    private Long subjectOfInspectionId;
    private Long subjectToCheckId;
    private String title;
    private String pLand;
    private String pSubjectToCheck;
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
    @Column(name = "base_of_violation", nullable = true, length = 2048)
    public String getBaseOfViolation() {
        return baseOfViolation;
    }

    public void setBaseOfViolation(String baseOfViolation) {
        this.baseOfViolation = baseOfViolation;
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
    @Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "land_released", nullable = true)
    public Boolean getLandReleased() {
        return landReleased;
    }

    public void setLandReleased(Boolean landReleased) {
        this.landReleased = landReleased;
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
    @Column(name = "penalty_payment", nullable = true, precision = 0)
    public Double getPenaltyPayment() {
        return penaltyPayment;
    }

    public void setPenaltyPayment(Double penaltyPayment) {
        this.penaltyPayment = penaltyPayment;
    }

    @Basic
    @Column(name = "penalty_rate", nullable = true, precision = 0)
    public Double getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(Double penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    @Basic
    @Column(name = "state", nullable = false, length = 255)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "timeframe_violation", nullable = true)
    public Timestamp getTimeframeViolation() {
        return timeframeViolation;
    }

    public void setTimeframeViolation(Timestamp timeframeViolation) {
        this.timeframeViolation = timeframeViolation;
    }

    @Basic
    @Column(name = "violation_description", nullable = true, length = 4096)
    public String getViolationDescription() {
        return violationDescription;
    }

    public void setViolationDescription(String violationDescription) {
        this.violationDescription = violationDescription;
    }

    @Basic
    @Column(name = "violations_existance", nullable = true, length = 255)
    public String getViolationsExistance() {
        return violationsExistance;
    }

    public void setViolationsExistance(String violationsExistance) {
        this.violationsExistance = violationsExistance;
    }

    @Basic
    @Column(name = "check_type_id", nullable = true)
    public Long getCheckTypeId() {
        return checkTypeId;
    }

    public void setCheckTypeId(Long checkTypeId) {
        this.checkTypeId = checkTypeId;
    }

    @Basic
    @Column(name = "check_view_id", nullable = true)
    public Long getCheckViewId() {
        return checkViewId;
    }

    public void setCheckViewId(Long checkViewId) {
        this.checkViewId = checkViewId;
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
    @Column(name = "official_id", nullable = true)
    public Long getOfficialId() {
        return officialId;
    }

    public void setOfficialId(Long officialId) {
        this.officialId = officialId;
    }

    @Basic
    @Column(name = "subject_of_inspection_id", nullable = true)
    public Long getSubjectOfInspectionId() {
        return subjectOfInspectionId;
    }

    public void setSubjectOfInspectionId(Long subjectOfInspectionId) {
        this.subjectOfInspectionId = subjectOfInspectionId;
    }

    @Basic
    @Column(name = "subject_to_check_id", nullable = true)
    public Long getSubjectToCheckId() {
        return subjectToCheckId;
    }

    public void setSubjectToCheckId(Long subjectToCheckId) {
        this.subjectToCheckId = subjectToCheckId;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 4096)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "p_land", nullable = true, length = 512)
    public String getpLand() {
        return pLand;
    }

    public void setpLand(String pLand) {
        this.pLand = pLand;
    }

    @Basic
    @Column(name = "p_subject_to_check", nullable = true, length = 512)
    public String getpSubjectToCheck() {
        return pSubjectToCheck;
    }

    public void setpSubjectToCheck(String pSubjectToCheck) {
        this.pSubjectToCheck = pSubjectToCheck;
    }

    @Basic
    @Column(name = "regulations_id", nullable = true)
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

        LandCheck landCheck = (LandCheck) o;

        if (id != null ? !id.equals(landCheck.id) : landCheck.id != null) return false;
        if (baseOfViolation != null ? !baseOfViolation.equals(landCheck.baseOfViolation) : landCheck.baseOfViolation != null)
            return false;
        if (comment != null ? !comment.equals(landCheck.comment) : landCheck.comment != null) return false;
        if (date != null ? !date.equals(landCheck.date) : landCheck.date != null) return false;
        if (landReleased != null ? !landReleased.equals(landCheck.landReleased) : landCheck.landReleased != null)
            return false;
        if (number != null ? !number.equals(landCheck.number) : landCheck.number != null) return false;
        if (penaltyPayment != null ? !penaltyPayment.equals(landCheck.penaltyPayment) : landCheck.penaltyPayment != null)
            return false;
        if (penaltyRate != null ? !penaltyRate.equals(landCheck.penaltyRate) : landCheck.penaltyRate != null)
            return false;
        if (state != null ? !state.equals(landCheck.state) : landCheck.state != null) return false;
        if (timeframeViolation != null ? !timeframeViolation.equals(landCheck.timeframeViolation) : landCheck.timeframeViolation != null)
            return false;
        if (violationDescription != null ? !violationDescription.equals(landCheck.violationDescription) : landCheck.violationDescription != null)
            return false;
        if (violationsExistance != null ? !violationsExistance.equals(landCheck.violationsExistance) : landCheck.violationsExistance != null)
            return false;
        if (checkTypeId != null ? !checkTypeId.equals(landCheck.checkTypeId) : landCheck.checkTypeId != null)
            return false;
        if (checkViewId != null ? !checkViewId.equals(landCheck.checkViewId) : landCheck.checkViewId != null)
            return false;
        if (landId != null ? !landId.equals(landCheck.landId) : landCheck.landId != null) return false;
        if (officialId != null ? !officialId.equals(landCheck.officialId) : landCheck.officialId != null) return false;
        if (subjectOfInspectionId != null ? !subjectOfInspectionId.equals(landCheck.subjectOfInspectionId) : landCheck.subjectOfInspectionId != null)
            return false;
        if (subjectToCheckId != null ? !subjectToCheckId.equals(landCheck.subjectToCheckId) : landCheck.subjectToCheckId != null)
            return false;
        if (title != null ? !title.equals(landCheck.title) : landCheck.title != null) return false;
        if (pLand != null ? !pLand.equals(landCheck.pLand) : landCheck.pLand != null) return false;
        if (pSubjectToCheck != null ? !pSubjectToCheck.equals(landCheck.pSubjectToCheck) : landCheck.pSubjectToCheck != null)
            return false;
        if (regulationsId != null ? !regulationsId.equals(landCheck.regulationsId) : landCheck.regulationsId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (baseOfViolation != null ? baseOfViolation.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (landReleased != null ? landReleased.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (penaltyPayment != null ? penaltyPayment.hashCode() : 0);
        result = 31 * result + (penaltyRate != null ? penaltyRate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (timeframeViolation != null ? timeframeViolation.hashCode() : 0);
        result = 31 * result + (violationDescription != null ? violationDescription.hashCode() : 0);
        result = 31 * result + (violationsExistance != null ? violationsExistance.hashCode() : 0);
        result = 31 * result + (checkTypeId != null ? checkTypeId.hashCode() : 0);
        result = 31 * result + (checkViewId != null ? checkViewId.hashCode() : 0);
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        result = 31 * result + (officialId != null ? officialId.hashCode() : 0);
        result = 31 * result + (subjectOfInspectionId != null ? subjectOfInspectionId.hashCode() : 0);
        result = 31 * result + (subjectToCheckId != null ? subjectToCheckId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (pLand != null ? pLand.hashCode() : 0);
        result = 31 * result + (pSubjectToCheck != null ? pSubjectToCheck.hashCode() : 0);
        result = 31 * result + (regulationsId != null ? regulationsId.hashCode() : 0);
        return result;
    }
}
