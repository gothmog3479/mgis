package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "request_doc_name_doc_type_join", schema = "public", catalog = "mgis")
public class RequestDocNameDocTypeJoin {
    private Long requestDocNameId;
    private Long assignedtypesId;

    @Basic
    @Column(name = "request_doc_name_id", nullable = false)
    public Long getRequestDocNameId() {
        return requestDocNameId;
    }

    public void setRequestDocNameId(Long requestDocNameId) {
        this.requestDocNameId = requestDocNameId;
    }

    @Basic
    @Column(name = "assignedtypes_id", nullable = false)
    public Long getAssignedtypesId() {
        return assignedtypesId;
    }

    public void setAssignedtypesId(Long assignedtypesId) {
        this.assignedtypesId = assignedtypesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestDocNameDocTypeJoin that = (RequestDocNameDocTypeJoin) o;

        if (requestDocNameId != null ? !requestDocNameId.equals(that.requestDocNameId) : that.requestDocNameId != null)
            return false;
        if (assignedtypesId != null ? !assignedtypesId.equals(that.assignedtypesId) : that.assignedtypesId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requestDocNameId != null ? requestDocNameId.hashCode() : 0;
        result = 31 * result + (assignedtypesId != null ? assignedtypesId.hashCode() : 0);
        return result;
    }
}
