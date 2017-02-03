package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MilitaryPowerGridFacilitiesFilesPK implements Serializable {
    private Long powerGridId;
    private Long fileId;

    @Column(name = "power_grid_id", nullable = false)
    @Id
    public Long getPowerGridId() {
        return powerGridId;
    }

    public void setPowerGridId(Long powerGridId) {
        this.powerGridId = powerGridId;
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

        MilitaryPowerGridFacilitiesFilesPK that = (MilitaryPowerGridFacilitiesFilesPK) o;

        if (powerGridId != null ? !powerGridId.equals(that.powerGridId) : that.powerGridId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = powerGridId != null ? powerGridId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
