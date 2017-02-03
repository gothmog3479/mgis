package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "buc_inspection_check", schema = "public", catalog = "mgis")
public class BucInspectionCheck {
    private Long id;
    private Timestamp checkDate;
    private String title;
    private Long bucId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "check_date", nullable = true)
    public Timestamp getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Timestamp checkDate) {
        this.checkDate = checkDate;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 4096)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "buc_id", nullable = false)
    public Long getBucId() {
        return bucId;
    }

    public void setBucId(Long bucId) {
        this.bucId = bucId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BucInspectionCheck that = (BucInspectionCheck) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (checkDate != null ? !checkDate.equals(that.checkDate) : that.checkDate != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (bucId != null ? !bucId.equals(that.bucId) : that.bucId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (checkDate != null ? checkDate.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (bucId != null ? bucId.hashCode() : 0);
        return result;
    }
}
