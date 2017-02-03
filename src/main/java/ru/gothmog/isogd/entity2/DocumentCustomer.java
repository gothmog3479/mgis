package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "document_customer", schema = "public", catalog = "mgis")
@IdClass(DocumentCustomerPK.class)
public class DocumentCustomer {
    private Long docId;
    private Long customerId;

    @Id
    @Column(name = "doc_id", nullable = false)
    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    @Id
    @Column(name = "customer_id", nullable = false)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentCustomer that = (DocumentCustomer) o;

        if (docId != null ? !docId.equals(that.docId) : that.docId != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = docId != null ? docId.hashCode() : 0;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        return result;
    }
}
