package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "building_generic", schema = "public", catalog = "mgis")
public class BuildingGeneric {
    private Long id;
    private Timestamp registryDate;
    private Integer registryNumber;
    private String cadnum2;
    private String condCadnum;
    private String egroCadnum;
    private String liter;
    private String location;
    private Long addressId;
    private Long cadnum1Id;
    private String comment;
    private String inventaryNumber;
    private Long branchId;
    private Long okofId;
    private Long parentId;
    private Timestamp inventaryDate;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "registry_date", nullable = true)
    public Timestamp getRegistryDate() {
        return registryDate;
    }

    public void setRegistryDate(Timestamp registryDate) {
        this.registryDate = registryDate;
    }

    @Basic
    @Column(name = "registry_number", nullable = true)
    public Integer getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(Integer registryNumber) {
        this.registryNumber = registryNumber;
    }

    @Basic
    @Column(name = "cadnum2", nullable = true, length = 10)
    public String getCadnum2() {
        return cadnum2;
    }

    public void setCadnum2(String cadnum2) {
        this.cadnum2 = cadnum2;
    }

    @Basic
    @Column(name = "cond_cadnum", nullable = true, length = 20)
    public String getCondCadnum() {
        return condCadnum;
    }

    public void setCondCadnum(String condCadnum) {
        this.condCadnum = condCadnum;
    }

    @Basic
    @Column(name = "egro_cadnum", nullable = true, length = 255)
    public String getEgroCadnum() {
        return egroCadnum;
    }

    public void setEgroCadnum(String egroCadnum) {
        this.egroCadnum = egroCadnum;
    }

    @Basic
    @Column(name = "liter", nullable = true, length = 255)
    public String getLiter() {
        return liter;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    @Basic
    @Column(name = "location", nullable = true, length = 1024)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "address_id", nullable = true)
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "cadnum1_id", nullable = true)
    public Long getCadnum1Id() {
        return cadnum1Id;
    }

    public void setCadnum1Id(Long cadnum1Id) {
        this.cadnum1Id = cadnum1Id;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 4096)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "inventary_number", nullable = true, length = 255)
    public String getInventaryNumber() {
        return inventaryNumber;
    }

    public void setInventaryNumber(String inventaryNumber) {
        this.inventaryNumber = inventaryNumber;
    }

    @Basic
    @Column(name = "branch_id", nullable = true)
    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    @Basic
    @Column(name = "okof_id", nullable = true)
    public Long getOkofId() {
        return okofId;
    }

    public void setOkofId(Long okofId) {
        this.okofId = okofId;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "inventary_date", nullable = true)
    public Timestamp getInventaryDate() {
        return inventaryDate;
    }

    public void setInventaryDate(Timestamp inventaryDate) {
        this.inventaryDate = inventaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingGeneric that = (BuildingGeneric) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (registryDate != null ? !registryDate.equals(that.registryDate) : that.registryDate != null) return false;
        if (registryNumber != null ? !registryNumber.equals(that.registryNumber) : that.registryNumber != null)
            return false;
        if (cadnum2 != null ? !cadnum2.equals(that.cadnum2) : that.cadnum2 != null) return false;
        if (condCadnum != null ? !condCadnum.equals(that.condCadnum) : that.condCadnum != null) return false;
        if (egroCadnum != null ? !egroCadnum.equals(that.egroCadnum) : that.egroCadnum != null) return false;
        if (liter != null ? !liter.equals(that.liter) : that.liter != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
        if (cadnum1Id != null ? !cadnum1Id.equals(that.cadnum1Id) : that.cadnum1Id != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (inventaryNumber != null ? !inventaryNumber.equals(that.inventaryNumber) : that.inventaryNumber != null)
            return false;
        if (branchId != null ? !branchId.equals(that.branchId) : that.branchId != null) return false;
        if (okofId != null ? !okofId.equals(that.okofId) : that.okofId != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (inventaryDate != null ? !inventaryDate.equals(that.inventaryDate) : that.inventaryDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (registryDate != null ? registryDate.hashCode() : 0);
        result = 31 * result + (registryNumber != null ? registryNumber.hashCode() : 0);
        result = 31 * result + (cadnum2 != null ? cadnum2.hashCode() : 0);
        result = 31 * result + (condCadnum != null ? condCadnum.hashCode() : 0);
        result = 31 * result + (egroCadnum != null ? egroCadnum.hashCode() : 0);
        result = 31 * result + (liter != null ? liter.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (cadnum1Id != null ? cadnum1Id.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (inventaryNumber != null ? inventaryNumber.hashCode() : 0);
        result = 31 * result + (branchId != null ? branchId.hashCode() : 0);
        result = 31 * result + (okofId != null ? okofId.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (inventaryDate != null ? inventaryDate.hashCode() : 0);
        return result;
    }
}
