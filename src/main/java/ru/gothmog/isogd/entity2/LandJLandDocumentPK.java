package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class LandJLandDocumentPK implements Serializable {
    private Long documentId;
    private Long landId;

    @Column(name = "document_id", nullable = false)
    @Id
    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    @Column(name = "land_id", nullable = false)
    @Id
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

        LandJLandDocumentPK that = (LandJLandDocumentPK) o;

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
