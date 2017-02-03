package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "import_report", schema = "public", catalog = "mgis")
public class ImportReport {
    private String dtype;
    private Long id;
    private Timestamp reportDate;

    @Basic
    @Column(name = "dtype", nullable = false, length = 31)
    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
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
    @Column(name = "report_date", nullable = false)
    public Timestamp getReportDate() {
        return reportDate;
    }

    public void setReportDate(Timestamp reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImportReport that = (ImportReport) o;

        if (dtype != null ? !dtype.equals(that.dtype) : that.dtype != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (reportDate != null ? !reportDate.equals(that.reportDate) : that.reportDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dtype != null ? dtype.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (reportDate != null ? reportDate.hashCode() : 0);
        return result;
    }
}
