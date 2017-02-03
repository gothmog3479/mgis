package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mes_edds_work_day_composite", schema = "public", catalog = "mgis")
public class MesEddsWorkDayComposite {
    private Long id;
    private String staffComp;
    private Timestamp workDate;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "staff_comp", nullable = true, length = 255)
    public String getStaffComp() {
        return staffComp;
    }

    public void setStaffComp(String staffComp) {
        this.staffComp = staffComp;
    }

    @Basic
    @Column(name = "work_date", nullable = true)
    public Timestamp getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Timestamp workDate) {
        this.workDate = workDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesEddsWorkDayComposite that = (MesEddsWorkDayComposite) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (staffComp != null ? !staffComp.equals(that.staffComp) : that.staffComp != null) return false;
        if (workDate != null ? !workDate.equals(that.workDate) : that.workDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (staffComp != null ? staffComp.hashCode() : 0);
        result = 31 * result + (workDate != null ? workDate.hashCode() : 0);
        return result;
    }
}
