package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "land_check_result_document_attr_values", schema = "public", catalog = "mgis")
public class LandCheckResultDocumentAttrValues {
    private Long docId;
    private Long attrValueId;

    @Basic
    @Column(name = "doc_id", nullable = false)
    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    @Basic
    @Column(name = "attr_value_id", nullable = false)
    public Long getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandCheckResultDocumentAttrValues that = (LandCheckResultDocumentAttrValues) o;

        if (docId != null ? !docId.equals(that.docId) : that.docId != null) return false;
        if (attrValueId != null ? !attrValueId.equals(that.attrValueId) : that.attrValueId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = docId != null ? docId.hashCode() : 0;
        result = 31 * result + (attrValueId != null ? attrValueId.hashCode() : 0);
        return result;
    }
}
