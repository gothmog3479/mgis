package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contacts {
    private Integer id;
    private String contactInfo;
    private Integer legalPersonId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "contact_info", nullable = false, length = 2048)
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Basic
    @Column(name = "legal_person_id", nullable = true)
    public Integer getLegalPersonId() {
        return legalPersonId;
    }

    public void setLegalPersonId(Integer legalPersonId) {
        this.legalPersonId = legalPersonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contacts contacts = (Contacts) o;

        if (id != null ? !id.equals(contacts.id) : contacts.id != null) return false;
        if (contactInfo != null ? !contactInfo.equals(contacts.contactInfo) : contacts.contactInfo != null)
            return false;
        if (legalPersonId != null ? !legalPersonId.equals(contacts.legalPersonId) : contacts.legalPersonId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contactInfo != null ? contactInfo.hashCode() : 0);
        result = 31 * result + (legalPersonId != null ? legalPersonId.hashCode() : 0);
        return result;
    }
}
