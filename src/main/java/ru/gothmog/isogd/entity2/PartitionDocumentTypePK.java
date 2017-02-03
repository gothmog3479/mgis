package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PartitionDocumentTypePK implements Serializable {
    private Integer partitionId;
    private Integer documentTypeId;

    @Column(name = "partition_id", nullable = false)
    @Id
    public Integer getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Integer partitionId) {
        this.partitionId = partitionId;
    }

    @Column(name = "document_type_id", nullable = false)
    @Id
    public Integer getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(Integer documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartitionDocumentTypePK that = (PartitionDocumentTypePK) o;

        if (partitionId != null ? !partitionId.equals(that.partitionId) : that.partitionId != null) return false;
        if (documentTypeId != null ? !documentTypeId.equals(that.documentTypeId) : that.documentTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partitionId != null ? partitionId.hashCode() : 0;
        result = 31 * result + (documentTypeId != null ? documentTypeId.hashCode() : 0);
        return result;
    }
}
