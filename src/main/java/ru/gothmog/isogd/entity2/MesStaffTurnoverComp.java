package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mes_staff_turnover_comp", schema = "public", catalog = "mgis")
public class MesStaffTurnoverComp {
    private String scType;
    private Long id;
    private String title;
    private Timestamp workDate;
    private Long templateId;
    private Long staffCompBeforeId;
    private String attendantphone;
    private String email;
    private String specialist;
    private String teamviewerid;
    private String techical;
    private Long fireDepartmentId;
    private Long vcsTechnologyId;
    private String selectedStaffComp;
    private Long dsOneDayWorkId;
    private Long eddsOneDayWorkId;

    @Basic
    @Column(name = "sc_type", nullable = false, length = 31)
    public String getScType() {
        return scType;
    }

    public void setScType(String scType) {
        this.scType = scType;
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
    @Column(name = "title", nullable = true, length = 1024)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "work_date", nullable = true)
    public Timestamp getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Timestamp workDate) {
        this.workDate = workDate;
    }

    @Basic
    @Column(name = "template_id", nullable = true)
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "staff_comp_before_id", nullable = true)
    public Long getStaffCompBeforeId() {
        return staffCompBeforeId;
    }

    public void setStaffCompBeforeId(Long staffCompBeforeId) {
        this.staffCompBeforeId = staffCompBeforeId;
    }

    @Basic
    @Column(name = "attendantphone", nullable = true, length = 255)
    public String getAttendantphone() {
        return attendantphone;
    }

    public void setAttendantphone(String attendantphone) {
        this.attendantphone = attendantphone;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "specialist", nullable = true, length = 512)
    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Basic
    @Column(name = "teamviewerid", nullable = true, length = 255)
    public String getTeamviewerid() {
        return teamviewerid;
    }

    public void setTeamviewerid(String teamviewerid) {
        this.teamviewerid = teamviewerid;
    }

    @Basic
    @Column(name = "techical", nullable = true, length = 4096)
    public String getTechical() {
        return techical;
    }

    public void setTechical(String techical) {
        this.techical = techical;
    }

    @Basic
    @Column(name = "fire_department_id", nullable = true)
    public Long getFireDepartmentId() {
        return fireDepartmentId;
    }

    public void setFireDepartmentId(Long fireDepartmentId) {
        this.fireDepartmentId = fireDepartmentId;
    }

    @Basic
    @Column(name = "vcs_technology_id", nullable = true)
    public Long getVcsTechnologyId() {
        return vcsTechnologyId;
    }

    public void setVcsTechnologyId(Long vcsTechnologyId) {
        this.vcsTechnologyId = vcsTechnologyId;
    }

    @Basic
    @Column(name = "selected_staff_comp", nullable = true, length = 255)
    public String getSelectedStaffComp() {
        return selectedStaffComp;
    }

    public void setSelectedStaffComp(String selectedStaffComp) {
        this.selectedStaffComp = selectedStaffComp;
    }

    @Basic
    @Column(name = "ds_one_day_work_id", nullable = true)
    public Long getDsOneDayWorkId() {
        return dsOneDayWorkId;
    }

    public void setDsOneDayWorkId(Long dsOneDayWorkId) {
        this.dsOneDayWorkId = dsOneDayWorkId;
    }

    @Basic
    @Column(name = "edds_one_day_work_id", nullable = true)
    public Long getEddsOneDayWorkId() {
        return eddsOneDayWorkId;
    }

    public void setEddsOneDayWorkId(Long eddsOneDayWorkId) {
        this.eddsOneDayWorkId = eddsOneDayWorkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesStaffTurnoverComp that = (MesStaffTurnoverComp) o;

        if (scType != null ? !scType.equals(that.scType) : that.scType != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (workDate != null ? !workDate.equals(that.workDate) : that.workDate != null) return false;
        if (templateId != null ? !templateId.equals(that.templateId) : that.templateId != null) return false;
        if (staffCompBeforeId != null ? !staffCompBeforeId.equals(that.staffCompBeforeId) : that.staffCompBeforeId != null)
            return false;
        if (attendantphone != null ? !attendantphone.equals(that.attendantphone) : that.attendantphone != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (specialist != null ? !specialist.equals(that.specialist) : that.specialist != null) return false;
        if (teamviewerid != null ? !teamviewerid.equals(that.teamviewerid) : that.teamviewerid != null) return false;
        if (techical != null ? !techical.equals(that.techical) : that.techical != null) return false;
        if (fireDepartmentId != null ? !fireDepartmentId.equals(that.fireDepartmentId) : that.fireDepartmentId != null)
            return false;
        if (vcsTechnologyId != null ? !vcsTechnologyId.equals(that.vcsTechnologyId) : that.vcsTechnologyId != null)
            return false;
        if (selectedStaffComp != null ? !selectedStaffComp.equals(that.selectedStaffComp) : that.selectedStaffComp != null)
            return false;
        if (dsOneDayWorkId != null ? !dsOneDayWorkId.equals(that.dsOneDayWorkId) : that.dsOneDayWorkId != null)
            return false;
        if (eddsOneDayWorkId != null ? !eddsOneDayWorkId.equals(that.eddsOneDayWorkId) : that.eddsOneDayWorkId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scType != null ? scType.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (workDate != null ? workDate.hashCode() : 0);
        result = 31 * result + (templateId != null ? templateId.hashCode() : 0);
        result = 31 * result + (staffCompBeforeId != null ? staffCompBeforeId.hashCode() : 0);
        result = 31 * result + (attendantphone != null ? attendantphone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (specialist != null ? specialist.hashCode() : 0);
        result = 31 * result + (teamviewerid != null ? teamviewerid.hashCode() : 0);
        result = 31 * result + (techical != null ? techical.hashCode() : 0);
        result = 31 * result + (fireDepartmentId != null ? fireDepartmentId.hashCode() : 0);
        result = 31 * result + (vcsTechnologyId != null ? vcsTechnologyId.hashCode() : 0);
        result = 31 * result + (selectedStaffComp != null ? selectedStaffComp.hashCode() : 0);
        result = 31 * result + (dsOneDayWorkId != null ? dsOneDayWorkId.hashCode() : 0);
        result = 31 * result + (eddsOneDayWorkId != null ? eddsOneDayWorkId.hashCode() : 0);
        return result;
    }
}
