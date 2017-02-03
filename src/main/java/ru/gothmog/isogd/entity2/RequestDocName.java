package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "request_doc_name", schema = "public", catalog = "mgis")
public class RequestDocName {
    private Long id;
    private String title;
    private Long firstStepId;
    private String code;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 1024)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "first_step_id", nullable = true)
    public Long getFirstStepId() {
        return firstStepId;
    }

    public void setFirstStepId(Long firstStepId) {
        this.firstStepId = firstStepId;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestDocName that = (RequestDocName) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (firstStepId != null ? !firstStepId.equals(that.firstStepId) : that.firstStepId != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (firstStepId != null ? firstStepId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
