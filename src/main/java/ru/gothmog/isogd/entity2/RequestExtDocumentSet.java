package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "request_ext_document_set", schema = "public", catalog = "mgis")
public class RequestExtDocumentSet {
    private Long id;
    private Long resultDocId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "result_doc_id", nullable = true)
    public Long getResultDocId() {
        return resultDocId;
    }

    public void setResultDocId(Long resultDocId) {
        this.resultDocId = resultDocId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestExtDocumentSet that = (RequestExtDocumentSet) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (resultDocId != null ? !resultDocId.equals(that.resultDocId) : that.resultDocId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (resultDocId != null ? resultDocId.hashCode() : 0);
        return result;
    }
}
