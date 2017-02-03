package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class LandJDocumentFilesPK implements Serializable {
    private Long docId;
    private Long fileId;

    @Column(name = "doc_id", nullable = false)
    @Id
    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    @Column(name = "file_id", nullable = false)
    @Id
    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandJDocumentFilesPK that = (LandJDocumentFilesPK) o;

        if (docId != null ? !docId.equals(that.docId) : that.docId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = docId != null ? docId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
