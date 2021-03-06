package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "document_file", schema = "public", catalog = "mgis")
@IdClass(DocumentFilePK.class)
public class DocumentFile {
    private Integer docId;
    private Integer fileId;

    @Id
    @Column(name = "doc_id", nullable = false)
    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    @Id
    @Column(name = "file_id", nullable = false)
    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentFile that = (DocumentFile) o;

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
