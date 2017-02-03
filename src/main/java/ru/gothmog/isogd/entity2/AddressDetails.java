package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "address_details", schema = "public", catalog = "mgis")
public class AddressDetails {
    private Integer id;
    private String objectName;
    private Double landSquare;
    private Integer cadastralId;
    private Integer addressCauseId;
    private String documentNumber;
    private Date documentDate;
    private Integer declarantId;
    private Integer declarantLegalAddressId;
    private Integer declarantPostalAddressId;
    private Integer index;
    private Double roomsArea;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "object_name", nullable = true, length = 255)
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Basic
    @Column(name = "land_square", nullable = true, precision = 0)
    public Double getLandSquare() {
        return landSquare;
    }

    public void setLandSquare(Double landSquare) {
        this.landSquare = landSquare;
    }

    @Basic
    @Column(name = "cadastral_id", nullable = true)
    public Integer getCadastralId() {
        return cadastralId;
    }

    public void setCadastralId(Integer cadastralId) {
        this.cadastralId = cadastralId;
    }

    @Basic
    @Column(name = "address_cause_id", nullable = true)
    public Integer getAddressCauseId() {
        return addressCauseId;
    }

    public void setAddressCauseId(Integer addressCauseId) {
        this.addressCauseId = addressCauseId;
    }

    @Basic
    @Column(name = "document_number", nullable = true, length = 255)
    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Basic
    @Column(name = "document_date", nullable = true)
    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    @Basic
    @Column(name = "declarant_id", nullable = true)
    public Integer getDeclarantId() {
        return declarantId;
    }

    public void setDeclarantId(Integer declarantId) {
        this.declarantId = declarantId;
    }

    @Basic
    @Column(name = "declarant_legal_address_id", nullable = true)
    public Integer getDeclarantLegalAddressId() {
        return declarantLegalAddressId;
    }

    public void setDeclarantLegalAddressId(Integer declarantLegalAddressId) {
        this.declarantLegalAddressId = declarantLegalAddressId;
    }

    @Basic
    @Column(name = "declarant_postal_address_id", nullable = true)
    public Integer getDeclarantPostalAddressId() {
        return declarantPostalAddressId;
    }

    public void setDeclarantPostalAddressId(Integer declarantPostalAddressId) {
        this.declarantPostalAddressId = declarantPostalAddressId;
    }

    @Basic
    @Column(name = "index", nullable = true)
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Basic
    @Column(name = "rooms_area", nullable = true, precision = 0)
    public Double getRoomsArea() {
        return roomsArea;
    }

    public void setRoomsArea(Double roomsArea) {
        this.roomsArea = roomsArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressDetails that = (AddressDetails) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (objectName != null ? !objectName.equals(that.objectName) : that.objectName != null) return false;
        if (landSquare != null ? !landSquare.equals(that.landSquare) : that.landSquare != null) return false;
        if (cadastralId != null ? !cadastralId.equals(that.cadastralId) : that.cadastralId != null) return false;
        if (addressCauseId != null ? !addressCauseId.equals(that.addressCauseId) : that.addressCauseId != null)
            return false;
        if (documentNumber != null ? !documentNumber.equals(that.documentNumber) : that.documentNumber != null)
            return false;
        if (documentDate != null ? !documentDate.equals(that.documentDate) : that.documentDate != null) return false;
        if (declarantId != null ? !declarantId.equals(that.declarantId) : that.declarantId != null) return false;
        if (declarantLegalAddressId != null ? !declarantLegalAddressId.equals(that.declarantLegalAddressId) : that.declarantLegalAddressId != null)
            return false;
        if (declarantPostalAddressId != null ? !declarantPostalAddressId.equals(that.declarantPostalAddressId) : that.declarantPostalAddressId != null)
            return false;
        if (index != null ? !index.equals(that.index) : that.index != null) return false;
        if (roomsArea != null ? !roomsArea.equals(that.roomsArea) : that.roomsArea != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (objectName != null ? objectName.hashCode() : 0);
        result = 31 * result + (landSquare != null ? landSquare.hashCode() : 0);
        result = 31 * result + (cadastralId != null ? cadastralId.hashCode() : 0);
        result = 31 * result + (addressCauseId != null ? addressCauseId.hashCode() : 0);
        result = 31 * result + (documentNumber != null ? documentNumber.hashCode() : 0);
        result = 31 * result + (documentDate != null ? documentDate.hashCode() : 0);
        result = 31 * result + (declarantId != null ? declarantId.hashCode() : 0);
        result = 31 * result + (declarantLegalAddressId != null ? declarantLegalAddressId.hashCode() : 0);
        result = 31 * result + (declarantPostalAddressId != null ? declarantPostalAddressId.hashCode() : 0);
        result = 31 * result + (index != null ? index.hashCode() : 0);
        result = 31 * result + (roomsArea != null ? roomsArea.hashCode() : 0);
        return result;
    }
}
