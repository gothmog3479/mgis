package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mes_ods_work_day_composite", schema = "public", catalog = "mgis")
public class MesOdsWorkDayComposite {
    private Long id;
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

        MesOdsWorkDayComposite that = (MesOdsWorkDayComposite) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (workDate != null ? !workDate.equals(that.workDate) : that.workDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (workDate != null ? workDate.hashCode() : 0);
        return result;
    }
}
