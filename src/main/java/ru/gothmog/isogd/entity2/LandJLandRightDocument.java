package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_j_land_right_document", schema = "public", catalog = "mgis")
@IdClass(LandJLandRightDocumentPK.class)
public class LandJLandRightDocument {
    private Long rightId;
    private Long documentId;

    @Id
    @Column(name = "right_id", nullable = false)
    public Long getRightId() {
        return rightId;
    }

    public void setRightId(Long rightId) {
        this.rightId = rightId;
    }

    @Id
    @Column(name = "document_id", nullable = false)
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

        LandJLandRightDocument that = (LandJLandRightDocument) o;

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
