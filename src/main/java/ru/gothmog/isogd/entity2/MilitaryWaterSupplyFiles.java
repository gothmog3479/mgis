package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_water_supply_files", schema = "public", catalog = "mgis")
@IdClass(MilitaryWaterSupplyFilesPK.class)
public class MilitaryWaterSupplyFiles {
    private Long waterSupplyId;
    private Long fileId;

    @Id
    @Column(name = "water_supply_id", nullable = false)
    public Long getWaterSupplyId() {
        return waterSupplyId;
    }

    public void setWaterSupplyId(Long waterSupplyId) {
        this.waterSupplyId = waterSupplyId;
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

        MilitaryWaterSupplyFiles that = (MilitaryWaterSupplyFiles) o;

        if (waterSupplyId != null ? !waterSupplyId.equals(that.waterSupplyId) : that.waterSupplyId != null)
            return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = waterSupplyId != null ? waterSupplyId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
