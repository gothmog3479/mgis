package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_heat_supply_files", schema = "public", catalog = "mgis")
@IdClass(MilitaryHeatSupplyFilesPK.class)
public class MilitaryHeatSupplyFiles {
    private Long heatSupplyId;
    private Long fileId;

    @Id
    @Column(name = "heat_supply_id", nullable = false)
    public Long getHeatSupplyId() {
        return heatSupplyId;
    }

    public void setHeatSupplyId(Long heatSupplyId) {
        this.heatSupplyId = heatSupplyId;
    }

    @Id
    @Column(name = "file_id", nullable = false)
    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryHeatSupplyFiles that = (MilitaryHeatSupplyFiles) o;

        if (heatSupplyId != null ? !heatSupplyId.equals(that.heatSupplyId) : that.heatSupplyId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = heatSupplyId != null ? heatSupplyId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
