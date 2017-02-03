package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class LandJLandRightDocumentPK implements Serializable {
    private Long rightId;
    private Long documentId;

    @Column(name = "right_id", nullable = false)
    @Id
    public Long getRightId() {
        return rightId;
    }

    public void setRightId(Long rightId) {
        this.rightId = rightId;
    }

    @Column(name = "document_id", nullable = false)
    @Id
    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandJLandRightDocumentPK that = (LandJLandRightDocumentPK) o;

        if (rightId != null ? !rightId.equals(that.rightId) : that.rightId != null) return false;
        if (documentId != null ? !documentId.equals(that.documentId) : that.documentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rightId != null ? rightId.hashCode() : 0;
        result = 31 * result + (documentId != null ? documentId.hashCode() : 0);
        return result;
    }
}
