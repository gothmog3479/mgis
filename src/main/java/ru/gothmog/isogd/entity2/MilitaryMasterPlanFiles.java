package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_master_plan_files", schema = "public", catalog = "mgis")
@IdClass(MilitaryMasterPlanFilesPK.class)
public class MilitaryMasterPlanFiles {
    private Long masterplanId;
    private Long fileId;

    @Id
    @Column(name = "masterplan_id", nullable = false)
    public Long getMasterplanId() {
        return masterplanId;
    }

    public void setMasterplanId(Long masterplanId) {
        this.masterplanId = masterplanId;
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

        MilitaryMasterPlanFiles that = (MilitaryMasterPlanFiles) o;

        if (masterplanId != null ? !masterplanId.equals(that.masterplanId) : that.masterplanId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = masterplanId != null ? masterplanId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
