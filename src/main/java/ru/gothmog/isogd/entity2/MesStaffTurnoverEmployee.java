package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mes_staff_turnover_employee", schema = "public", catalog = "mgis")
public class MesStaffTurnoverEmployee {
    private String stType;
    private Long id;
    private Integer orderIndex;
    private Boolean removable;
    private Boolean day;
    private Boolean night;
    private String phone;
    private String post;
    private Boolean exists;
    private Timestamp dateFromPost;
    private String staffCompStr;
    private Long empId;
    private Long staffCompId;
    private Long templateId;
    private String arm;

    @Basic
    @Column(name = "st_type", nullable = false, length = 31)
    public String getStType() {
        return stType;
    }

    public void setStType(String stType) {
        this.stType = stType;
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
    @Column(name = "order_index", nullable = true)
    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    @Basic
    @Column(name = "removable", nullable = true)
    public Boolean getRemovable() {
        return removable;
    }

    public void setRemovable(Boolean removable) {
        this.removable = removable;
    }

    @Basic
    @Column(name = "day", nullable = true)
    public Boolean getDay() {
        return day;
    }

    public void setDay(Boolean day) {
        this.day = day;
    }

    @Basic
    @Column(name = "night", nullable = true)
    public Boolean getNight() {
        return night;
    }

    public void setNight(Boolean night) {
        this.night = night;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "post", nullable = true, length = 512)
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Basic
    @Column(name = "exists", nullable = true)
    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    @Basic
    @Column(name = "date_from_post", nullable = true)
    public Timestamp getDateFromPost() {
        return dateFromPost;
    }

    public void setDateFromPost(Timestamp dateFromPost) {
        this.dateFromPost = dateFromPost;
    }

    @Basic
    @Column(name = "staff_comp_str", nullable = true, length = 512)
    public String getStaffCompStr() {
        return staffCompStr;
    }

    public void setStaffCompStr(String staffCompStr) {
        this.staffCompStr = staffCompStr;
    }

    @Basic
    @Column(name = "emp_id", nullable = true)
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "staff_comp_id", nullable = false)
    public Long getStaffCompId() {
        return staffCompId;
    }

    public void setStaffCompId(Long staffCompId) {
        this.staffCompId = staffCompId;
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
    @Column(name = "arm", nullable = true, length = 255)
    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesStaffTurnoverEmployee that = (MesStaffTurnoverEmployee) o;

        if (stType != null ? !stType.equals(that.stType) : that.stType != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (orderIndex != null ? !orderIndex.equals(that.orderIndex) : that.orderIndex != null) return false;
        if (removable != null ? !removable.equals(that.removable) : that.removable != null) return false;
        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (night != null ? !night.equals(that.night) : that.night != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (post != null ? !post.equals(that.post) : that.post != null) return false;
        if (exists != null ? !exists.equals(that.exists) : that.exists != null) return false;
        if (dateFromPost != null ? !dateFromPost.equals(that.dateFromPost) : that.dateFromPost != null) return false;
        if (staffCompStr != null ? !staffCompStr.equals(that.staffCompStr) : that.staffCompStr != null) return false;
        if (empId != null ? !empId.equals(that.empId) : that.empId != null) return false;
        if (staffCompId != null ? !staffCompId.equals(that.staffCompId) : that.staffCompId != null) return false;
        if (templateId != null ? !templateId.equals(that.templateId) : that.templateId != null) return false;
        if (arm != null ? !arm.equals(that.arm) : that.arm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stType != null ? stType.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (orderIndex != null ? orderIndex.hashCode() : 0);
        result = 31 * result + (removable != null ? removable.hashCode() : 0);
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (night != null ? night.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        result = 31 * result + (exists != null ? exists.hashCode() : 0);
        result = 31 * result + (dateFromPost != null ? dateFromPost.hashCode() : 0);
        result = 31 * result + (staffCompStr != null ? staffCompStr.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (staffCompId != null ? staffCompId.hashCode() : 0);
        result = 31 * result + (templateId != null ? templateId.hashCode() : 0);
        result = 31 * result + (arm != null ? arm.hashCode() : 0);
        return result;
    }
}
