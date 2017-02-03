package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "isogd_partitions", schema = "public", catalog = "mgis")
public class IsogdPartitions {
    private Integer id;
    private String name;
    private String description;
    private String code;
    private String partNumber;
    private Integer lastDocNumber;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 512)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "part_number", nullable = true, length = 2)
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Basic
    @Column(name = "last_doc_number", nullable = true)
    public Integer getLastDocNumber() {
        return lastDocNumber;
    }

    public void setLastDocNumber(Integer lastDocNumber) {
        this.lastDocNumber = lastDocNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IsogdPartitions that = (IsogdPartitions) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (partNumber != null ? !partNumber.equals(that.partNumber) : that.partNumber != null) return false;
        if (lastDocNumber != null ? !lastDocNumber.equals(that.lastDocNumber) : that.lastDocNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (partNumber != null ? partNumber.hashCode() : 0);
        result = 31 * result + (lastDocNumber != null ? lastDocNumber.hashCode() : 0);
        return result;
    }
}
