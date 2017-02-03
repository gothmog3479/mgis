package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mes_shift_journal", schema = "public", catalog = "mgis")
public class MesShiftJournal {
    private Long id;
    private String biomedicalState;
    private String contextSearchField;
    private Date dateOf;
    private Integer emergencyCount;
    private Integer incidentCount;
    private String lifeSupportState;
    private Double mobileBalance;
    private Integer onControlCount;
    private String rating;
    private Long sodId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "biomedical_state", nullable = true, length = 1024)
    public String getBiomedicalState() {
        return biomedicalState;
    }

    public void setBiomedicalState(String biomedicalState) {
        this.biomedicalState = biomedicalState;
    }

    @Basic
    @Column(name = "context_search_field", nullable = true, length = 255)
    public String getContextSearchField() {
        return contextSearchField;
    }

    public void setContextSearchField(String contextSearchField) {
        this.contextSearchField = contextSearchField;
    }

    @Basic
    @Column(name = "date_of", nullable = false)
    public Date getDateOf() {
        return dateOf;
    }

    public void setDateOf(Date dateOf) {
        this.dateOf = dateOf;
    }

    @Basic
    @Column(name = "emergency_count", nullable = true)
    public Integer getEmergencyCount() {
        return emergencyCount;
    }

    public void setEmergencyCount(Integer emergencyCount) {
        this.emergencyCount = emergencyCount;
    }

    @Basic
    @Column(name = "incident_count", nullable = true)
    public Integer getIncidentCount() {
        return incidentCount;
    }

    public void setIncidentCount(Integer incidentCount) {
        this.incidentCount = incidentCount;
    }

    @Basic
    @Column(name = "life_support_state", nullable = true, length = 1024)
    public String getLifeSupportState() {
        return lifeSupportState;
    }

    public void setLifeSupportState(String lifeSupportState) {
        this.lifeSupportState = lifeSupportState;
    }

    @Basic
    @Column(name = "mobile_balance", nullable = true, precision = 0)
    public Double getMobileBalance() {
        return mobileBalance;
    }

    public void setMobileBalance(Double mobileBalance) {
        this.mobileBalance = mobileBalance;
    }

    @Basic
    @Column(name = "on_control_count", nullable = true)
    public Integer getOnControlCount() {
        return onControlCount;
    }

    public void setOnControlCount(Integer onControlCount) {
        this.onControlCount = onControlCount;
    }

    @Basic
    @Column(name = "rating", nullable = true, length = 255)
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "sod_id", nullable = true)
    public Long getSodId() {
        return sodId;
    }

    public void setSodId(Long sodId) {
        this.sodId = sodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesShiftJournal that = (MesShiftJournal) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (biomedicalState != null ? !biomedicalState.equals(that.biomedicalState) : that.biomedicalState != null)
            return false;
        if (contextSearchField != null ? !contextSearchField.equals(that.contextSearchField) : that.contextSearchField != null)
            return false;
        if (dateOf != null ? !dateOf.equals(that.dateOf) : that.dateOf != null) return false;
        if (emergencyCount != null ? !emergencyCount.equals(that.emergencyCount) : that.emergencyCount != null)
            return false;
        if (incidentCount != null ? !incidentCount.equals(that.incidentCount) : that.incidentCount != null)
            return false;
        if (lifeSupportState != null ? !lifeSupportState.equals(that.lifeSupportState) : that.lifeSupportState != null)
            return false;
        if (mobileBalance != null ? !mobileBalance.equals(that.mobileBalance) : that.mobileBalance != null)
            return false;
        if (onControlCount != null ? !onControlCount.equals(that.onControlCount) : that.onControlCount != null)
            return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (sodId != null ? !sodId.equals(that.sodId) : that.sodId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (biomedicalState != null ? biomedicalState.hashCode() : 0);
        result = 31 * result + (contextSearchField != null ? contextSearchField.hashCode() : 0);
        result = 31 * result + (dateOf != null ? dateOf.hashCode() : 0);
        result = 31 * result + (emergencyCount != null ? emergencyCount.hashCode() : 0);
        result = 31 * result + (incidentCount != null ? incidentCount.hashCode() : 0);
        result = 31 * result + (lifeSupportState != null ? lifeSupportState.hashCode() : 0);
        result = 31 * result + (mobileBalance != null ? mobileBalance.hashCode() : 0);
        result = 31 * result + (onControlCount != null ? onControlCount.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (sodId != null ? sodId.hashCode() : 0);
        return result;
    }
}
