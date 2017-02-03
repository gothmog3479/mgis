package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Okof {
    private Long id;
    private String code;
    private Integer controlNumber;
    private Integer nodeCount;
    private String title;
    private Long parentId;
    private String parentCode;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 10)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "control_number", nullable = true)
    public Integer getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(Integer controlNumber) {
        this.controlNumber = controlNumber;
    }

    @Basic
    @Column(name = "node_count", nullable = true)
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 1024)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "parent_code", nullable = true, length = 10)
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Okof okof = (Okof) o;

        if (id != null ? !id.equals(okof.id) : okof.id != null) return false;
        if (code != null ? !code.equals(okof.code) : okof.code != null) return false;
        if (controlNumber != null ? !controlNumber.equals(okof.controlNumber) : okof.controlNumber != null)
            return false;
        if (nodeCount != null ? !nodeCount.equals(okof.nodeCount) : okof.nodeCount != null) return false;
        if (title != null ? !title.equals(okof.title) : okof.title != null) return false;
        if (parentId != null ? !parentId.equals(okof.parentId) : okof.parentId != null) return false;
        if (parentCode != null ? !parentCode.equals(okof.parentCode) : okof.parentCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (controlNumber != null ? controlNumber.hashCode() : 0);
        result = 31 * result + (nodeCount != null ? nodeCount.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (parentCode != null ? parentCode.hashCode() : 0);
        return result;
    }
}
