package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_j_land_document", schema = "public", catalog = "mgis")
@IdClass(LandJLandDocumentPK.class)
public class LandJLandDocument {
    private Long documentId;
    private Long landId;

    @Id
    @Column(name = "document_id", nullable = false)
    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    @Id
    @Column(name = "land_id", nullable = false)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandJLandDocument that = (LandJLandDocument) o;

        if (documentId != null ? !documentId.equals(that.documentId) : that.documentId != null) return false;
        if (landId != null ? !landId.equals(that.landId) : that.landId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = documentId != null ? documentId.hashCode() : 0;
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        return result;
    }
}
