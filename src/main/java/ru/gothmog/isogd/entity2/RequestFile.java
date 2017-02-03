package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "request_file", schema = "public", catalog = "mgis")
@IdClass(RequestFilePK.class)
public class RequestFile {
    private Integer reqId;
    private Integer fileId;

    @Id
    @Column(name = "req_id", nullable = false)
    public Integer getReqId() {
        return reqId;
    }

    public void setReqId(Integer reqId) {
        this.reqId = reqId;
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

        RequestFile that = (RequestFile) o;

        if (reqId != null ? !reqId.equals(that.reqId) : that.reqId != null) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reqId != null ? reqId.hashCode() : 0;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        return result;
    }
}
