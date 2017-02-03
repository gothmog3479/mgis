package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AddressFilesPK implements Serializable {
    private Integer addressDetailsId;
    private Integer fileId;

    @Column(name = "address_details_id", nullable = false)
    @Id
    public Integer getAddressDetailsId() {
        return addressDetailsId;
    }

    public void setAddressDetailsId(Integer addressDetailsId) {
        this.addressDetailsId = addressDetailsId;
    }

    @Column(name = "file_id", nullable = false)
    @Id
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

        AddressFilesPK that = (AddressFilesPK) o;

        if (addressDetailsId != null ? !addressDetailsId.equals(that.addressDetailsId) : that.addressDetailsId != null)
            return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addressDetailsId != null ? addressDetailsId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
