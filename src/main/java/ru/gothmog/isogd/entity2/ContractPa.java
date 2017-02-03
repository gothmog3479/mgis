package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "contract_pa", schema = "public", catalog = "mgis")
public class ContractPa {
    private Long id;
    private Timestamp paDate;
    private String person;
    private Boolean isdefault;
    private String paNumber;
    private String personJob;
    private String personName;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "person", nullable = true, length = 4096)
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Basic
    @Column(name = "isdefault", nullable = true)
    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    @Basic
    @Column(name = "pa_number", nullable = true, length = 64)
    public String getPaNumber() {
        return paNumber;
    }

    public void setPaNumber(String paNumber) {
        this.paNumber = paNumber;
    }

    @Basic
    @Column(name = "person_job", nullable = true, length = 2048)
    public String getPersonJob() {
        return personJob;
    }

    public void setPersonJob(String personJob) {
        this.personJob = personJob;
    }

    @Basic
    @Column(name = "person_name", nullable = true, length = 512)
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractPa that = (ContractPa) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paDate != null ? !paDate.equals(that.paDate) : that.paDate != null) return false;
        if (person != null ? !person.equals(that.person) : that.person != null) return false;
        if (isdefault != null ? !isdefault.equals(that.isdefault) : that.isdefault != null) return false;
        if (paNumber != null ? !paNumber.equals(that.paNumber) : that.paNumber != null) return false;
        if (personJob != null ? !personJob.equals(that.personJob) : that.personJob != null) return false;
        if (personName != null ? !personName.equals(that.personName) : that.personName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paDate != null ? paDate.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (isdefault != null ? isdefault.hashCode() : 0);
        result = 31 * result + (paNumber != null ? paNumber.hashCode() : 0);
        result = 31 * result + (personJob != null ? personJob.hashCode() : 0);
        result = 31 * result + (personName != null ? personName.hashCode() : 0);
        return result;
    }
}
