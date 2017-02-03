package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_check_result_document", schema = "public", catalog = "mgis")
public class LandCheckResultDocument {
    private Long id;
    private Long docTypeId;
    private Long landCheckId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "doc_type_id", nullable = true)
    public Long getDocTypeId() {
        return docTypeId;
    }

    public void setDocTypeId(Long docTypeId) {
        this.docTypeId = docTypeId;
    }

    @Basic
    @Column(name = "land_check_id", nullable = true)
    public Long getLandCheckId() {
        return landCheckId;
    }

    public void setLandCheckId(Long landCheckId) {
        this.landCheckId = landCheckId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandCheckResultDocument that = (LandCheckResultDocument) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (docTypeId != null ? !docTypeId.equals(that.docTypeId) : that.docTypeId != null) return false;
        if (landCheckId != null ? !landCheckId.equals(that.landCheckId) : that.landCheckId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (docTypeId != null ? docTypeId.hashCode() : 0);
        result = 31 * result + (landCheckId != null ? landCheckId.hashCode() : 0);
        return result;
    }
}
