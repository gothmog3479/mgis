package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MilitaryHeatSupplyFilesPK implements Serializable {
    private Long heatSupplyId;
    private Long fileId;

    @Column(name = "heat_supply_id", nullable = false)
    @Id
    public Long getHeatSupplyId() {
        return heatSupplyId;
    }

    public void setHeatSupplyId(Long heatSupplyId) {
        this.heatSupplyId = heatSupplyId;
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

        MilitaryHeatSupplyFilesPK that = (MilitaryHeatSupplyFilesPK) o;

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
