package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MilitaryWastewaterFilesPK implements Serializable {
    private Long wastewaterId;
    private Long fileId;

    @Column(name = "wastewater_id", nullable = false)
    @Id
    public Long getWastewaterId() {
        return wastewaterId;
    }

    public void setWastewaterId(Long wastewaterId) {
        this.wastewaterId = wastewaterId;
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

        MilitaryWastewaterFilesPK that = (MilitaryWastewaterFilesPK) o;

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
