package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_j_land_document", schema = "public", catalog = "mgis")
@IdClass(ContractJLandDocumentPK.class)
public class ContractJLandDocument {
    private Long contractId;
    private Long documentId;

    @Id
    @Column(name = "contract_id", nullable = false)
    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
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

        ContractJLandDocument that = (ContractJLandDocument) o;

        if (contractId != null ? !contractId.equals(that.contractId) : that.contractId != null) return false;
        if (documentId != null ? !documentId.equals(that.documentId) : that.documentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contractId != null ? contractId.hashCode() : 0;
        result = 31 * result + (documentId != null ? documentId.hashCode() : 0);
        return result;
    }
}
