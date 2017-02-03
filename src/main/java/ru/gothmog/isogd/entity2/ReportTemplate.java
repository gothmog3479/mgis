package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "report_template", schema = "public", catalog = "mgis")
public class ReportTemplate {
    private Long id;
    private String contentType;
    private String forClassNames;
    private String reportExtension;
    private String reportName;
    private String templateName;
    private String reportParametr;
    private String forSubjectType;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content_type", nullable = false, length = 255)
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Basic
    @Column(name = "for_class_names", nullable = true, length = 4096)
    public String getForClassNames() {
        return forClassNames;
    }

    public void setForClassNames(String forClassNames) {
        this.forClassNames = forClassNames;
    }

    @Basic
    @Column(name = "report_extension", nullable = false, length = 255)
    public String getReportExtension() {
        return reportExtension;
    }

    public void setReportExtension(String reportExtension) {
        this.reportExtension = reportExtension;
    }

    @Basic
    @Column(name = "report_name", nullable = false, length = 1024)
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    @Basic
    @Column(name = "template_name", nullable = false, length = 1024)
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Basic
    @Column(name = "report_parametr", nullable = true, length = 255)
    public String getReportParametr() {
        return reportParametr;
    }

    public void setReportParametr(String reportParametr) {
        this.reportParametr = reportParametr;
    }

    @Basic
    @Column(name = "for_subject_type", nullable = true, length = 255)
    public String getForSubjectType() {
        return forSubjectType;
    }

    public void setForSubjectType(String forSubjectType) {
        this.forSubjectType = forSubjectType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportTemplate that = (ReportTemplate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (contentType != null ? !contentType.equals(that.contentType) : that.contentType != null) return false;
        if (forClassNames != null ? !forClassNames.equals(that.forClassNames) : that.forClassNames != null)
            return false;
        if (reportExtension != null ? !reportExtension.equals(that.reportExtension) : that.reportExtension != null)
            return false;
        if (reportName != null ? !reportName.equals(that.reportName) : that.reportName != null) return false;
        if (templateName != null ? !templateName.equals(that.templateName) : that.templateName != null) return false;
        if (reportParametr != null ? !reportParametr.equals(that.reportParametr) : that.reportParametr != null)
            return false;
        if (forSubjectType != null ? !forSubjectType.equals(that.forSubjectType) : that.forSubjectType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        result = 31 * result + (forClassNames != null ? forClassNames.hashCode() : 0);
        result = 31 * result + (reportExtension != null ? reportExtension.hashCode() : 0);
        result = 31 * result + (reportName != null ? reportName.hashCode() : 0);
        result = 31 * result + (templateName != null ? templateName.hashCode() : 0);
        result = 31 * result + (reportParametr != null ? reportParametr.hashCode() : 0);
        result = 31 * result + (forSubjectType != null ? forSubjectType.hashCode() : 0);
        return result;
    }
}
