package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MilitaryWaterSupplyFilesPK implements Serializable {
    private Long waterSupplyId;
    private Long fileId;

    @Column(name = "water_supply_id", nullable = false)
    @Id
    public Long getWaterSupplyId() {
        return waterSupplyId;
    }

    public void setWaterSupplyId(Long waterSupplyId) {
        this.waterSupplyId = waterSupplyId;
    }

    @Column(name = "file_id", nullable = false)
    @Id
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

        MilitaryWaterSupplyFilesPK that = (MilitaryWaterSupplyFilesPK) o;

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
