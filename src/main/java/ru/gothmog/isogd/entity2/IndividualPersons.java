package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "individual_persons", schema = "public", catalog = "mgis")
public class IndividualPersons {
    private Integer id;
    private String firstName;
    private String patronymic;
    private String lastName;
    private String inn;
    private Date birthdate;
    private String passportSeries;
    private String passportNumber;
    private String passportIssuedBy;
    private String realAddress;
    private String registrationAddress;
    private Integer registrationAddressId;
    private String phoneNumber;
    private Integer passportTypeId;
    private Timestamp businessRegDocDate;
    private String businessRegDocGiven;
    private String businessRegDocName;
    private String businessRegDocNum;
    private String businessRegDocSeria;
    private Boolean isBusinessman;
    private Long paId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 128)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "patronymic", nullable = true, length = 128)
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 128)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    @Column(name = "birthdate", nullable = true)
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "passport_series", nullable = true, length = 32)
    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    @Basic
    @Column(name = "passport_number", nullable = true, length = 32)
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Basic
    @Column(name = "passport_issued_by", nullable = true, length = 512)
    public String getPassportIssuedBy() {
        return passportIssuedBy;
    }

    public void setPassportIssuedBy(String passportIssuedBy) {
        this.passportIssuedBy = passportIssuedBy;
    }

    @Basic
    @Column(name = "real_address", nullable = true, length = 1024)
    public String getRealAddress() {
        return realAddress;
    }

    public void setRealAddress(String realAddress) {
        this.realAddress = realAddress;
    }

    @Basic
    @Column(name = "registration_address", nullable = true, length = 1024)
    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    @Basic
    @Column(name = "registration_address_id", nullable = true)
    public Integer getRegistrationAddressId() {
        return registrationAddressId;
    }

    public void setRegistrationAddressId(Integer registrationAddressId) {
        this.registrationAddressId = registrationAddressId;
    }

    @Basic
    @Column(name = "phone_number", nullable = true, length = 32)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "passport_type_id", nullable = true)
    public Integer getPassportTypeId() {
        return passportTypeId;
    }

    public void setPassportTypeId(Integer passportTypeId) {
        this.passportTypeId = passportTypeId;
    }

    @Basic
    @Column(name = "business_reg_doc_date", nullable = true)
    public Timestamp getBusinessRegDocDate() {
        return businessRegDocDate;
    }

    public void setBusinessRegDocDate(Timestamp businessRegDocDate) {
        this.businessRegDocDate = businessRegDocDate;
    }

    @Basic
    @Column(name = "business_reg_doc_given", nullable = true, length = 512)
    public String getBusinessRegDocGiven() {
        return businessRegDocGiven;
    }

    public void setBusinessRegDocGiven(String businessRegDocGiven) {
        this.businessRegDocGiven = businessRegDocGiven;
    }

    @Basic
    @Column(name = "business_reg_doc_name", nullable = true, length = 1024)
    public String getBusinessRegDocName() {
        return businessRegDocName;
    }

    public void setBusinessRegDocName(String businessRegDocName) {
        this.businessRegDocName = businessRegDocName;
    }

    @Basic
    @Column(name = "business_reg_doc_num", nullable = true, length = 64)
    public String getBusinessRegDocNum() {
        return businessRegDocNum;
    }

    public void setBusinessRegDocNum(String businessRegDocNum) {
        this.businessRegDocNum = businessRegDocNum;
    }

    @Basic
    @Column(name = "business_reg_doc_seria", nullable = true, length = 64)
    public String getBusinessRegDocSeria() {
        return businessRegDocSeria;
    }

    public void setBusinessRegDocSeria(String businessRegDocSeria) {
        this.businessRegDocSeria = businessRegDocSeria;
    }

    @Basic
    @Column(name = "is_businessman", nullable = true)
    public Boolean getBusinessman() {
        return isBusinessman;
    }

    public void setBusinessman(Boolean businessman) {
        isBusinessman = businessman;
    }

    @Basic
    @Column(name = "pa_id", nullable = true)
    public Long getPaId() {
        return paId;
    }

    public void setPaId(Long paId) {
        this.paId = paId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndividualPersons that = (IndividualPersons) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (patronymic != null ? !patronymic.equals(that.patronymic) : that.patronymic != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (birthdate != null ? !birthdate.equals(that.birthdate) : that.birthdate != null) return false;
        if (passportSeries != null ? !passportSeries.equals(that.passportSeries) : that.passportSeries != null)
            return false;
        if (passportNumber != null ? !passportNumber.equals(that.passportNumber) : that.passportNumber != null)
            return false;
        if (passportIssuedBy != null ? !passportIssuedBy.equals(that.passportIssuedBy) : that.passportIssuedBy != null)
            return false;
        if (realAddress != null ? !realAddress.equals(that.realAddress) : that.realAddress != null) return false;
        if (registrationAddress != null ? !registrationAddress.equals(that.registrationAddress) : that.registrationAddress != null)
            return false;
        if (registrationAddressId != null ? !registrationAddressId.equals(that.registrationAddressId) : that.registrationAddressId != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (passportTypeId != null ? !passportTypeId.equals(that.passportTypeId) : that.passportTypeId != null)
            return false;
        if (businessRegDocDate != null ? !businessRegDocDate.equals(that.businessRegDocDate) : that.businessRegDocDate != null)
            return false;
        if (businessRegDocGiven != null ? !businessRegDocGiven.equals(that.businessRegDocGiven) : that.businessRegDocGiven != null)
            return false;
        if (businessRegDocName != null ? !businessRegDocName.equals(that.businessRegDocName) : that.businessRegDocName != null)
            return false;
        if (businessRegDocNum != null ? !businessRegDocNum.equals(that.businessRegDocNum) : that.businessRegDocNum != null)
            return false;
        if (businessRegDocSeria != null ? !businessRegDocSeria.equals(that.businessRegDocSeria) : that.businessRegDocSeria != null)
            return false;
        if (isBusinessman != null ? !isBusinessman.equals(that.isBusinessman) : that.isBusinessman != null)
            return false;
        if (paId != null ? !paId.equals(that.paId) : that.paId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (passportSeries != null ? passportSeries.hashCode() : 0);
        result = 31 * result + (passportNumber != null ? passportNumber.hashCode() : 0);
        result = 31 * result + (passportIssuedBy != null ? passportIssuedBy.hashCode() : 0);
        result = 31 * result + (realAddress != null ? realAddress.hashCode() : 0);
        result = 31 * result + (registrationAddress != null ? registrationAddress.hashCode() : 0);
        result = 31 * result + (registrationAddressId != null ? registrationAddressId.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (passportTypeId != null ? passportTypeId.hashCode() : 0);
        result = 31 * result + (businessRegDocDate != null ? businessRegDocDate.hashCode() : 0);
        result = 31 * result + (businessRegDocGiven != null ? businessRegDocGiven.hashCode() : 0);
        result = 31 * result + (businessRegDocName != null ? businessRegDocName.hashCode() : 0);
        result = 31 * result + (businessRegDocNum != null ? businessRegDocNum.hashCode() : 0);
        result = 31 * result + (businessRegDocSeria != null ? businessRegDocSeria.hashCode() : 0);
        result = 31 * result + (isBusinessman != null ? isBusinessman.hashCode() : 0);
        result = 31 * result + (paId != null ? paId.hashCode() : 0);
        return result;
    }
}
