package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mes_staff_rating", schema = "public", catalog = "mgis")
public class MesStaffRating {
    private String dtype;
    private Long id;
    private Timestamp dateOf;
    private String contextSearch;

    @Basic
    @Column(name = "dtype", nullable = false, length = 31)
    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_of", nullable = true)
    public Timestamp getDateOf() {
        return dateOf;
    }

    public void setDateOf(Timestamp dateOf) {
        this.dateOf = dateOf;
    }

    @Basic
    @Column(name = "context_search", nullable = true, length = 16000)
    public String getContextSearch() {
        return contextSearch;
    }

    public void setContextSearch(String contextSearch) {
        this.contextSearch = contextSearch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesStaffRating that = (MesStaffRating) o;

        if (dtype != null ? !dtype.equals(that.dtype) : that.dtype != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dateOf != null ? !dateOf.equals(that.dateOf) : that.dateOf != null) return false;
        if (contextSearch != null ? !contextSearch.equals(that.contextSearch) : that.contextSearch != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dtype != null ? dtype.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (dateOf != null ? dateOf.hashCode() : 0);
        result = 31 * result + (contextSearch != null ? contextSearch.hashCode() : 0);
        return result;
    }
}
