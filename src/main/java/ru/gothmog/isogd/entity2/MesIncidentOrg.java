package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mes_incident_org", schema = "public", catalog = "mgis")
public class MesIncidentOrg {
    private String orgType;
    private Long id;
    private Timestamp dateIncome;
    private Timestamp dateOutcome;
    private String department;
    private String mainPersonInfo;
    private Integer personnel;
    private Integer technics;
    private Long incidentId;

    @Basic
    @Column(name = "org_type", nullable = false, length = 31)
    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_income", nullable = true)
    public Timestamp getDateIncome() {
        return dateIncome;
    }

    public void setDateIncome(Timestamp dateIncome) {
        this.dateIncome = dateIncome;
    }

    @Basic
    @Column(name = "date_outcome", nullable = true)
    public Timestamp getDateOutcome() {
        return dateOutcome;
    }

    public void setDateOutcome(Timestamp dateOutcome) {
        this.dateOutcome = dateOutcome;
    }

    @Basic
    @Column(name = "department", nullable = true, length = 512)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "main_person_info", nullable = true, length = 255)
    public String getMainPersonInfo() {
        return mainPersonInfo;
    }

    public void setMainPersonInfo(String mainPersonInfo) {
        this.mainPersonInfo = mainPersonInfo;
    }

    @Basic
    @Column(name = "personnel", nullable = true)
    public Integer getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Integer personnel) {
        this.personnel = personnel;
    }

    @Basic
    @Column(name = "technics", nullable = true)
    public Integer getTechnics() {
        return technics;
    }

    public void setTechnics(Integer technics) {
        this.technics = technics;
    }

    @Basic
    @Column(name = "incident_id", nullable = false)
    public Long getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesIncidentOrg that = (MesIncidentOrg) o;

        if (orgType != null ? !orgType.equals(that.orgType) : that.orgType != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dateIncome != null ? !dateIncome.equals(that.dateIncome) : that.dateIncome != null) return false;
        if (dateOutcome != null ? !dateOutcome.equals(that.dateOutcome) : that.dateOutcome != null) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (mainPersonInfo != null ? !mainPersonInfo.equals(that.mainPersonInfo) : that.mainPersonInfo != null)
            return false;
        if (personnel != null ? !personnel.equals(that.personnel) : that.personnel != null) return false;
        if (technics != null ? !technics.equals(that.technics) : that.technics != null) return false;
        if (incidentId != null ? !incidentId.equals(that.incidentId) : that.incidentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orgType != null ? orgType.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (dateIncome != null ? dateIncome.hashCode() : 0);
        result = 31 * result + (dateOutcome != null ? dateOutcome.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (mainPersonInfo != null ? mainPersonInfo.hashCode() : 0);
        result = 31 * result + (personnel != null ? personnel.hashCode() : 0);
        result = 31 * result + (technics != null ? technics.hashCode() : 0);
        result = 31 * result + (incidentId != null ? incidentId.hashCode() : 0);
        return result;
    }
}
