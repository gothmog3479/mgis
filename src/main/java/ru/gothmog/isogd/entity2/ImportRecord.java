package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "import_record", schema = "public", catalog = "mgis")
public class ImportRecord {
    private String dtype;
    private Long id;
    private String comment;
    private Timestamp recDate;
    private String source;
    private Long reportId;
    private Long landId;
    private Boolean error;

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
    @Column(name = "comment", nullable = true, length = 4096)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "rec_date", nullable = false)
    public Timestamp getRecDate() {
        return recDate;
    }

    public void setRecDate(Timestamp recDate) {
        this.recDate = recDate;
    }

    @Basic
    @Column(name = "source", nullable = true, length = 1024)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "report_id", nullable = false)
    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
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
    @Column(name = "error", nullable = true)
    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImportRecord that = (ImportRecord) o;

        if (dtype != null ? !dtype.equals(that.dtype) : that.dtype != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (recDate != null ? !recDate.equals(that.recDate) : that.recDate != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (reportId != null ? !reportId.equals(that.reportId) : that.reportId != null) return false;
        if (landId != null ? !landId.equals(that.landId) : that.landId != null) return false;
        if (error != null ? !error.equals(that.error) : that.error != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dtype != null ? dtype.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (recDate != null ? recDate.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (reportId != null ? reportId.hashCode() : 0);
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        result = 31 * result + (error != null ? error.hashCode() : 0);
        return result;
    }
}
