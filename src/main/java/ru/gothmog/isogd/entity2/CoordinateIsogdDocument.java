package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "coordinate_isogd_document", schema = "public", catalog = "mgis")
public class CoordinateIsogdDocument {
    private Long docId;
    private Long coordinateId;

    @Basic
    @Column(name = "doc_id", nullable = false)
    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    @Basic
    @Column(name = "coordinate_id", nullable = false)
    public Long getCoordinateId() {
        return coordinateId;
    }

    public void setCoordinateId(Long coordinateId) {
        this.coordinateId = coordinateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoordinateIsogdDocument that = (CoordinateIsogdDocument) o;

        if (docId != null ? !docId.equals(that.docId) : that.docId != null) return false;
        if (coordinateId != null ? !coordinateId.equals(that.coordinateId) : that.coordinateId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = docId != null ? docId.hashCode() : 0;
        result = 31 * result + (coordinateId != null ? coordinateId.hashCode() : 0);
        return result;
    }
}
