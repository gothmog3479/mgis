package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "isogd_books", schema = "public", catalog = "mgis")
public class IsogdBooks {
    private Integer id;
    private String name;
    private Integer partitionId;
    private String code;
    private Boolean selectable;
    private Integer volCounter;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 512)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "partition_id", nullable = false)
    public Integer getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Integer partitionId) {
        this.partitionId = partitionId;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "selectable", nullable = true)
    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    @Basic
    @Column(name = "vol_counter", nullable = true)
    public Integer getVolCounter() {
        return volCounter;
    }

    public void setVolCounter(Integer volCounter) {
        this.volCounter = volCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IsogdBooks that = (IsogdBooks) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (partitionId != null ? !partitionId.equals(that.partitionId) : that.partitionId != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (selectable != null ? !selectable.equals(that.selectable) : that.selectable != null) return false;
        if (volCounter != null ? !volCounter.equals(that.volCounter) : that.volCounter != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (partitionId != null ? partitionId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (selectable != null ? selectable.hashCode() : 0);
        result = 31 * result + (volCounter != null ? volCounter.hashCode() : 0);
        return result;
    }
}
