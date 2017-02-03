package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_land_info", schema = "public", catalog = "mgis")
public class ContractLandInfo {
    private Long id;
    private Long landId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "land_id", nullable = true)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractLandInfo that = (ContractLandInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (landId != null ? !landId.equals(that.landId) : that.landId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        return result;
    }
}
