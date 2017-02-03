package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "individual_person_pa", schema = "public", catalog = "mgis")
public class IndividualPersonPa {
    private Long id;
    private String paAddress;
    private Timestamp paBirthdate;
    private String paCertified;
    private Timestamp paDate;
    private String paDocnumber;
    private String paDocseria;
    private String paGiven;
    private String paName;
    private String paNumber;
    private String paPatronymic;
    private String paSurname;
    private Long paAddressId;
    private Long paDoctypeTypeId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pa_address", nullable = true, length = 1024)
    public String getPaAddress() {
        return paAddress;
    }

    public void setPaAddress(String paAddress) {
        this.paAddress = paAddress;
    }

    @Basic
    @Column(name = "pa_birthdate", nullable = true)
    public Timestamp getPaBirthdate() {
        return paBirthdate;
    }

    public void setPaBirthdate(Timestamp paBirthdate) {
        this.paBirthdate = paBirthdate;
    }

    @Basic
    @Column(name = "pa_certified", nullable = true, length = 512)
    public String getPaCertified() {
        return paCertified;
    }

    public void setPaCertified(String paCertified) {
        this.paCertified = paCertified;
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
    @Column(name = "pa_docnumber", nullable = true, length = 64)
    public String getPaDocnumber() {
        return paDocnumber;
    }

    public void setPaDocnumber(String paDocnumber) {
        this.paDocnumber = paDocnumber;
    }

    @Basic
    @Column(name = "pa_docseria", nullable = true, length = 64)
    public String getPaDocseria() {
        return paDocseria;
    }

    public void setPaDocseria(String paDocseria) {
        this.paDocseria = paDocseria;
    }

    @Basic
    @Column(name = "pa_given", nullable = true, length = 512)
    public String getPaGiven() {
        return paGiven;
    }

    public void setPaGiven(String paGiven) {
        this.paGiven = paGiven;
    }

    @Basic
    @Column(name = "pa_name", nullable = true, length = 256)
    public String getPaName() {
        return paName;
    }

    public void setPaName(String paName) {
        this.paName = paName;
    }

    @Basic
    @Column(name = "pa_number", nullable = true, length = 128)
    public String getPaNumber() {
        return paNumber;
    }

    public void setPaNumber(String paNumber) {
        this.paNumber = paNumber;
    }

    @Basic
    @Column(name = "pa_patronymic", nullable = true, length = 256)
    public String getPaPatronymic() {
        return paPatronymic;
    }

    public void setPaPatronymic(String paPatronymic) {
        this.paPatronymic = paPatronymic;
    }

    @Basic
    @Column(name = "pa_surname", nullable = true, length = 256)
    public String getPaSurname() {
        return paSurname;
    }

    public void setPaSurname(String paSurname) {
        this.paSurname = paSurname;
    }

    @Basic
    @Column(name = "pa_address_id", nullable = true)
    public Long getPaAddressId() {
        return paAddressId;
    }

    public void setPaAddressId(Long paAddressId) {
        this.paAddressId = paAddressId;
    }

    @Basic
    @Column(name = "pa_doctype_type_id", nullable = true)
    public Long getPaDoctypeTypeId() {
        return paDoctypeTypeId;
    }

    public void setPaDoctypeTypeId(Long paDoctypeTypeId) {
        this.paDoctypeTypeId = paDoctypeTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndividualPersonPa that = (IndividualPersonPa) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paAddress != null ? !paAddress.equals(that.paAddress) : that.paAddress != null) return false;
        if (paBirthdate != null ? !paBirthdate.equals(that.paBirthdate) : that.paBirthdate != null) return false;
        if (paCertified != null ? !paCertified.equals(that.paCertified) : that.paCertified != null) return false;
        if (paDate != null ? !paDate.equals(that.paDate) : that.paDate != null) return false;
        if (paDocnumber != null ? !paDocnumber.equals(that.paDocnumber) : that.paDocnumber != null) return false;
        if (paDocseria != null ? !paDocseria.equals(that.paDocseria) : that.paDocseria != null) return false;
        if (paGiven != null ? !paGiven.equals(that.paGiven) : that.paGiven != null) return false;
        if (paName != null ? !paName.equals(that.paName) : that.paName != null) return false;
        if (paNumber != null ? !paNumber.equals(that.paNumber) : that.paNumber != null) return false;
        if (paPatronymic != null ? !paPatronymic.equals(that.paPatronymic) : that.paPatronymic != null) return false;
        if (paSurname != null ? !paSurname.equals(that.paSurname) : that.paSurname != null) return false;
        if (paAddressId != null ? !paAddressId.equals(that.paAddressId) : that.paAddressId != null) return false;
        if (paDoctypeTypeId != null ? !paDoctypeTypeId.equals(that.paDoctypeTypeId) : that.paDoctypeTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paAddress != null ? paAddress.hashCode() : 0);
        result = 31 * result + (paBirthdate != null ? paBirthdate.hashCode() : 0);
        result = 31 * result + (paCertified != null ? paCertified.hashCode() : 0);
        result = 31 * result + (paDate != null ? paDate.hashCode() : 0);
        result = 31 * result + (paDocnumber != null ? paDocnumber.hashCode() : 0);
        result = 31 * result + (paDocseria != null ? paDocseria.hashCode() : 0);
        result = 31 * result + (paGiven != null ? paGiven.hashCode() : 0);
        result = 31 * result + (paName != null ? paName.hashCode() : 0);
        result = 31 * result + (paNumber != null ? paNumber.hashCode() : 0);
        result = 31 * result + (paPatronymic != null ? paPatronymic.hashCode() : 0);
        result = 31 * result + (paSurname != null ? paSurname.hashCode() : 0);
        result = 31 * result + (paAddressId != null ? paAddressId.hashCode() : 0);
        result = 31 * result + (paDoctypeTypeId != null ? paDoctypeTypeId.hashCode() : 0);
        return result;
    }
}
