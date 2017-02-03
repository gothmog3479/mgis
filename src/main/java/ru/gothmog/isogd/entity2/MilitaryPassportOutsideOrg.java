package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "military_passport_outside_org", schema = "public", catalog = "mgis")
public class MilitaryPassportOutsideOrg {
    private Long passportId;
    private Long organizationId;

    @Basic
    @Column(name = "passport_id", nullable = false)
    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }

    @Basic
    @Column(name = "organization_id", nullable = false)
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryPassportOutsideOrg that = (MilitaryPassportOutsideOrg) o;

        if (passportId != null ? !passportId.equals(that.passportId) : that.passportId != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = passportId != null ? passportId.hashCode() : 0;
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        return result;
    }
}
