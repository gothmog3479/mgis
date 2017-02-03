package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_check_attr", schema = "public", catalog = "mgis")
public class LandCheckAttr {
    private Long id;
    private Long docTypeId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "doc_type_id", nullable = false)
    public Long getDocTypeId() {
        return docTypeId;
    }

    public void setDocTypeId(Long docTypeId) {
        this.docTypeId = docTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandCheckAttr that = (LandCheckAttr) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (docTypeId != null ? !docTypeId.equals(that.docTypeId) : that.docTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (docTypeId != null ? docTypeId.hashCode() : 0);
        return result;
    }
}
