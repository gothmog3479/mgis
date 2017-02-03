package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_wastewater_files", schema = "public", catalog = "mgis")
@IdClass(MilitaryWastewaterFilesPK.class)
public class MilitaryWastewaterFiles {
    private Long wastewaterId;
    private Long fileId;

    @Id
    @Column(name = "wastewater_id", nullable = false)
    public Long getWastewaterId() {
        return wastewaterId;
    }

    public void setWastewaterId(Long wastewaterId) {
        this.wastewaterId = wastewaterId;
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

        MilitaryWastewaterFiles that = (MilitaryWastewaterFiles) o;

        if (wastewaterId != null ? !wastewaterId.equals(that.wastewaterId) : that.wastewaterId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wastewaterId != null ? wastewaterId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
