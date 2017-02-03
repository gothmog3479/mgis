package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MilitarySanitaryFilesPK implements Serializable {
    private Long sanitaryId;
    private Long fileId;

    @Column(name = "sanitary_id", nullable = false)
    @Id
    public Long getSanitaryId() {
        return sanitaryId;
    }

    public void setSanitaryId(Long sanitaryId) {
        this.sanitaryId = sanitaryId;
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

        MilitarySanitaryFilesPK that = (MilitarySanitaryFilesPK) o;

        if (sanitaryId != null ? !sanitaryId.equals(that.sanitaryId) : that.sanitaryId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sanitaryId != null ? sanitaryId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
