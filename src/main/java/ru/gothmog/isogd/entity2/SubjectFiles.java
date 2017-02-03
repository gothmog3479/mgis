package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "subject_files", schema = "public", catalog = "mgis")
@IdClass(SubjectFilesPK.class)
public class SubjectFiles {
    private Integer subjectId;
    private Integer fileId;

    @Id
    @Column(name = "subject_id", nullable = false)
    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @Id
    @Column(name = "file_id", nullable = false)
    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectFiles that = (SubjectFiles) o;

        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subjectId != null ? subjectId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
