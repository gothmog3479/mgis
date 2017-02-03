package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class RequestExtDocSetDocJoinPK implements Serializable {
    private Long docSetId;
    private Long docId;

    @Column(name = "doc_set_id", nullable = false)
    @Id
    public Long getDocSetId() {
        return docSetId;
    }

    public void setDocSetId(Long docSetId) {
        this.docSetId = docSetId;
    }

    @Column(name = "doc_id", nullable = false)
    @Id
    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestExtDocSetDocJoinPK that = (RequestExtDocSetDocJoinPK) o;

        if (docSetId != null ? !docSetId.equals(that.docSetId) : that.docSetId != null) return false;
        if (docId != null ? !docId.equals(that.docId) : that.docId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = docSetId != null ? docSetId.hashCode() : 0;
        result = 31 * result + (docId != null ? docId.hashCode() : 0);
        return result;
    }
}
