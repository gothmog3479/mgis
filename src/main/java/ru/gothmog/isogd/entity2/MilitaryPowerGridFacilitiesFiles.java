package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_power_grid_facilities_files", schema = "public", catalog = "mgis")
@IdClass(MilitaryPowerGridFacilitiesFilesPK.class)
public class MilitaryPowerGridFacilitiesFiles {
    private Long powerGridId;
    private Long fileId;

    @Id
    @Column(name = "power_grid_id", nullable = false)
    public Long getPowerGridId() {
        return powerGridId;
    }

    public void setPowerGridId(Long powerGridId) {
        this.powerGridId = powerGridId;
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

        MilitaryPowerGridFacilitiesFiles that = (MilitaryPowerGridFacilitiesFiles) o;

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
