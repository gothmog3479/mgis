package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_owner_ancestry", schema = "public", catalog = "mgis")
@IdClass(MilitaryOwnerAncestryPK.class)
public class MilitaryOwnerAncestry {
    private Long thisId;
    private Long ancestorId;

    @Id
    @Column(name = "this_id", nullable = false)
    public Long getThisId() {
        return thisId;
    }

    public void setThisId(Long thisId) {
        this.thisId = thisId;
    }

    @Id
    @Column(name = "ancestor_id", nullable = false)
    public Long getAncestorId() {
        return ancestorId;
    }

    public void setAncestorId(Long ancestorId) {
        this.ancestorId = ancestorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryOwnerAncestry that = (MilitaryOwnerAncestry) o;

        if (thisId != null ? !thisId.equals(that.thisId) : that.thisId != null) return false;
        if (ancestorId != null ? !ancestorId.equals(that.ancestorId) : that.ancestorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thisId != null ? thisId.hashCode() : 0;
        result = 31 * result + (ancestorId != null ? ancestorId.hashCode() : 0);
        return result;
    }
}
