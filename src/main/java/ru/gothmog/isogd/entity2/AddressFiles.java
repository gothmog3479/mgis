package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "address_files", schema = "public", catalog = "mgis")
@IdClass(AddressFilesPK.class)
public class AddressFiles {
    private Integer addressDetailsId;
    private Integer fileId;

    @Id
    @Column(name = "address_details_id", nullable = false)
    public Integer getAddressDetailsId() {
        return addressDetailsId;
    }

    public void setAddressDetailsId(Integer addressDetailsId) {
        this.addressDetailsId = addressDetailsId;
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

        AddressFiles that = (AddressFiles) o;

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
