package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "legal_persons", schema = "public", catalog = "mgis")
public class LegalPersons {
    private Integer id;
    private String shortName;
    private String inn;
    private String kpp;
    private String ogrn;
    private Date registrationDate;
    private Integer legalAddressId;
    private String directorInfo;
    private String branch;
    private String comment;
    private String tradeName;
    private String status;
    private Integer opfId;
    private Integer managerTypeId;
    private String contactInfo;
    private Integer cityCode;
    private String phoneNumber;
    private String faxNumber;
    private Date egrulDate;
    private String grn;
    private String registratorName;
    private String account;
    private String addressText;
    private String okpo;
    private Long typeOfOwnershipId;
    private String bik;
    private String kaccount;
    private String regDocName;
    private String seria;
    private Timestamp paDate;
    private String paInThePersonOf;
    private String paNumber;
    private String signature;
    private String certified;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "short_name", nullable = true, length = 1024)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "inn", nullable = true, length = 64)
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "kpp", nullable = true, length = 64)
    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    @Basic
    @Column(name = "ogrn", nullable = true, length = 255)
    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    @Basic
    @Column(name = "registration_date", nullable = true)
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Basic
    @Column(name = "legal_address_id", nullable = true)
    public Integer getLegalAddressId() {
        return legalAddressId;
    }

    public void setLegalAddressId(Integer legalAddressId) {
        this.legalAddressId = legalAddressId;
    }

    @Basic
    @Column(name = "director_info", nullable = true, length = 255)
    public String getDirectorInfo() {
        return directorInfo;
    }

    public void setDirectorInfo(String directorInfo) {
        this.directorInfo = directorInfo;
    }

    @Basic
    @Column(name = "branch", nullable = true, length = 255)
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 1024)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "trade_name", nullable = true, length = 255)
    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 32)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "opf_id", nullable = true)
    public Integer getOpfId() {
        return opfId;
    }

    public void setOpfId(Integer opfId) {
        this.opfId = opfId;
    }

    @Basic
    @Column(name = "manager_type_id", nullable = true)
    public Integer getManagerTypeId() {
        return managerTypeId;
    }

    public void setManagerTypeId(Integer managerTypeId) {
        this.managerTypeId = managerTypeId;
    }

    @Basic
    @Column(name = "contact_info", nullable = true, length = 255)
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Basic
    @Column(name = "city_code", nullable = true)
    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "phone_number", nullable = true, length = 64)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "fax_number", nullable = true, length = 32)
    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @Basic
    @Column(name = "egrul_date", nullable = true)
    public Date getEgrulDate() {
        return egrulDate;
    }

    public void setEgrulDate(Date egrulDate) {
        this.egrulDate = egrulDate;
    }

    @Basic
    @Column(name = "grn", nullable = true, length = 64)
    public String getGrn() {
        return grn;
    }

    public void setGrn(String grn) {
        this.grn = grn;
    }

    @Basic
    @Column(name = "registrator_name", nullable = true, length = 1024)
    public String getRegistratorName() {
        return registratorName;
    }

    public void setRegistratorName(String registratorName) {
        this.registratorName = registratorName;
    }

    @Basic
    @Column(name = "account", nullable = true, length = 64)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "address_text", nullable = true, length = 1024)
    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }

    @Basic
    @Column(name = "okpo", nullable = true, length = 10)
    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    @Basic
    @Column(name = "type_of_ownership_id", nullable = true)
    public Long getTypeOfOwnershipId() {
        return typeOfOwnershipId;
    }

    public void setTypeOfOwnershipId(Long typeOfOwnershipId) {
        this.typeOfOwnershipId = typeOfOwnershipId;
    }

    @Basic
    @Column(name = "bik", nullable = true, length = 64)
    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }

    @Basic
    @Column(name = "kaccount", nullable = true, length = 64)
    public String getKaccount() {
        return kaccount;
    }

    public void setKaccount(String kaccount) {
        this.kaccount = kaccount;
    }

    @Basic
    @Column(name = "reg_doc_name", nullable = true, length = 512)
    public String getRegDocName() {
        return regDocName;
    }

    public void setRegDocName(String regDocName) {
        this.regDocName = regDocName;
    }

    @Basic
    @Column(name = "seria", nullable = true, length = 64)
    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    @Basic
    @Column(name = "pa_date", nullable = true)
    public Timestamp getPaDate() {
        return paDate;
    }

    public void setPaDate(Timestamp paDate) {
        this.paDate = paDate;
    }

    @Basic
    @Column(name = "pa_in_the_person_of", nullable = true, length = 4096)
    public String getPaInThePersonOf() {
        return paInThePersonOf;
    }

    public void setPaInThePersonOf(String paInThePersonOf) {
        this.paInThePersonOf = paInThePersonOf;
    }

    @Basic
    @Column(name = "pa_number", nullable = true, length = 255)
    public String getPaNumber() {
        return paNumber;
    }

    public void setPaNumber(String paNumber) {
        this.paNumber = paNumber;
    }

    @Basic
    @Column(name = "signature", nullable = true, length = 256)
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Basic
    @Column(name = "certified", nullable = true, length = 512)
    public String getCertified() {
        return certified;
    }

    public void setCertified(String certified) {
        this.certified = certified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LegalPersons that = (LegalPersons) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (shortName != null ? !shortName.equals(that.shortName) : that.shortName != null) return false;
        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (kpp != null ? !kpp.equals(that.kpp) : that.kpp != null) return false;
        if (ogrn != null ? !ogrn.equals(that.ogrn) : that.ogrn != null) return false;
        if (registrationDate != null ? !registrationDate.equals(that.registrationDate) : that.registrationDate != null)
            return false;
        if (legalAddressId != null ? !legalAddressId.equals(that.legalAddressId) : that.legalAddressId != null)
            return false;
        if (directorInfo != null ? !directorInfo.equals(that.directorInfo) : that.directorInfo != null) return false;
        if (branch != null ? !branch.equals(that.branch) : that.branch != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (tradeName != null ? !tradeName.equals(that.tradeName) : that.tradeName != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (opfId != null ? !opfId.equals(that.opfId) : that.opfId != null) return false;
        if (managerTypeId != null ? !managerTypeId.equals(that.managerTypeId) : that.managerTypeId != null)
            return false;
        if (contactInfo != null ? !contactInfo.equals(that.contactInfo) : that.contactInfo != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (faxNumber != null ? !faxNumber.equals(that.faxNumber) : that.faxNumber != null) return false;
        if (egrulDate != null ? !egrulDate.equals(that.egrulDate) : that.egrulDate != null) return false;
        if (grn != null ? !grn.equals(that.grn) : that.grn != null) return false;
        if (registratorName != null ? !registratorName.equals(that.registratorName) : that.registratorName != null)
            return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (addressText != null ? !addressText.equals(that.addressText) : that.addressText != null) return false;
        if (okpo != null ? !okpo.equals(that.okpo) : that.okpo != null) return false;
        if (typeOfOwnershipId != null ? !typeOfOwnershipId.equals(that.typeOfOwnershipId) : that.typeOfOwnershipId != null)
            return false;
        if (bik != null ? !bik.equals(that.bik) : that.bik != null) return false;
        if (kaccount != null ? !kaccount.equals(that.kaccount) : that.kaccount != null) return false;
        if (regDocName != null ? !regDocName.equals(that.regDocName) : that.regDocName != null) return false;
        if (seria != null ? !seria.equals(that.seria) : that.seria != null) return false;
        if (paDate != null ? !paDate.equals(that.paDate) : that.paDate != null) return false;
        if (paInThePersonOf != null ? !paInThePersonOf.equals(that.paInThePersonOf) : that.paInThePersonOf != null)
            return false;
        if (paNumber != null ? !paNumber.equals(that.paNumber) : that.paNumber != null) return false;
        if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;
        if (certified != null ? !certified.equals(that.certified) : that.certified != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (kpp != null ? kpp.hashCode() : 0);
        result = 31 * result + (ogrn != null ? ogrn.hashCode() : 0);
        result = 31 * result + (registrationDate != null ? registrationDate.hashCode() : 0);
        result = 31 * result + (legalAddressId != null ? legalAddressId.hashCode() : 0);
        result = 31 * result + (directorInfo != null ? directorInfo.hashCode() : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (tradeName != null ? tradeName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (opfId != null ? opfId.hashCode() : 0);
        result = 31 * result + (managerTypeId != null ? managerTypeId.hashCode() : 0);
        result = 31 * result + (contactInfo != null ? contactInfo.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (faxNumber != null ? faxNumber.hashCode() : 0);
        result = 31 * result + (egrulDate != null ? egrulDate.hashCode() : 0);
        result = 31 * result + (grn != null ? grn.hashCode() : 0);
        result = 31 * result + (registratorName != null ? registratorName.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (addressText != null ? addressText.hashCode() : 0);
        result = 31 * result + (okpo != null ? okpo.hashCode() : 0);
        result = 31 * result + (typeOfOwnershipId != null ? typeOfOwnershipId.hashCode() : 0);
        result = 31 * result + (bik != null ? bik.hashCode() : 0);
        result = 31 * result + (kaccount != null ? kaccount.hashCode() : 0);
        result = 31 * result + (regDocName != null ? regDocName.hashCode() : 0);
        result = 31 * result + (seria != null ? seria.hashCode() : 0);
        result = 31 * result + (paDate != null ? paDate.hashCode() : 0);
        result = 31 * result + (paInThePersonOf != null ? paInThePersonOf.hashCode() : 0);
        result = 31 * result + (paNumber != null ? paNumber.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (certified != null ? certified.hashCode() : 0);
        return result;
    }
}
