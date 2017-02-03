package ru.gothmog.isogd.entity.common;

import ru.gothmog.isogd.model.RegistryItem;

import javax.persistence.*;

@Entity
@Table(name = "report_template")
public class ReportTemplateObject implements RegistryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content_type", nullable = false)
    private String contentType;

    @Column(name = "for_class_names", length = 4096)
    private String forClassNames;

    @Column(name = "report_extension", nullable = false)
    private String reportExtension;

    @Column(name = "report_name", length = 1024, nullable = false)
    private String reportName;

    @Column(name = "template_name", length = 1024, nullable = false)
    private String templateName;

    @Column(name = "report_parametr")
    private String reportParametr;

    @Column(name = "for_subject_type")
    @Enumerated(EnumType.STRING)
    private ReportTemplateObject.SubjectType forSubjectType;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getForClassNames() {
        return forClassNames;
    }

    public void setForClassNames(String forClassNames) {
        this.forClassNames = forClassNames;
    }

    public String getReportExtension() {
        return reportExtension;
    }

    public void setReportExtension(String reportExtension) {
        this.reportExtension = reportExtension;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getReportParametr() {
        return reportParametr;
    }

    public void setReportParametr(String reportParametr) {
        this.reportParametr = reportParametr;
    }

    public SubjectType getForSubjectType() {
        return forSubjectType;
    }

    public void setForSubjectType(SubjectType forSubjectType) {
        this.forSubjectType = forSubjectType;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return null;
    }

    public enum SubjectType {
        JURIDICAL("только для юридических лиц"),
        PHISICAL("только для физических лиц или ИП");

        private String type;

        SubjectType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
}
