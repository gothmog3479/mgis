package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "building_generic_attr", schema = "public", catalog = "mgis")
public class BuildingGenericAttr {
    private Long id;
    private Long okofRootId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "okof_root_id", nullable = true)
    public Long getOkofRootId() {
        return okofRootId;
    }

    public void setOkofRootId(Long okofRootId) {
        this.okofRootId = okofRootId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingGenericAttr that = (BuildingGenericAttr) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (okofRootId != null ? !okofRootId.equals(that.okofRootId) : that.okofRootId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (okofRootId != null ? okofRootId.hashCode() : 0);
        return result;
    }
}
