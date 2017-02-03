package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "history_collection_mod", schema = "public", catalog = "mgis")
public class HistoryCollectionMod {
    private Long id;
    private Integer ownerId;
    private Integer leftId;
    private Integer rightId;
    private Integer modType;
    private Timestamp modDate;
    private String editorUsername;
    private Integer transactionId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "owner_id", nullable = false)
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "left_id", nullable = false)
    public Integer getLeftId() {
        return leftId;
    }

    public void setLeftId(Integer leftId) {
        this.leftId = leftId;
    }

    @Basic
    @Column(name = "right_id", nullable = false)
    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    @Basic
    @Column(name = "mod_type", nullable = false)
    public Integer getModType() {
        return modType;
    }

    public void setModType(Integer modType) {
        this.modType = modType;
    }

    @Basic
    @Column(name = "mod_date", nullable = false)
    public Timestamp getModDate() {
        return modDate;
    }

    public void setModDate(Timestamp modDate) {
        this.modDate = modDate;
    }

    @Basic
    @Column(name = "editor_username", nullable = true, length = 10)
    public String getEditorUsername() {
        return editorUsername;
    }

    public void setEditorUsername(String editorUsername) {
        this.editorUsername = editorUsername;
    }

    @Basic
    @Column(name = "transaction_id", nullable = true)
    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoryCollectionMod that = (HistoryCollectionMod) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (leftId != null ? !leftId.equals(that.leftId) : that.leftId != null) return false;
        if (rightId != null ? !rightId.equals(that.rightId) : that.rightId != null) return false;
        if (modType != null ? !modType.equals(that.modType) : that.modType != null) return false;
        if (modDate != null ? !modDate.equals(that.modDate) : that.modDate != null) return false;
        if (editorUsername != null ? !editorUsername.equals(that.editorUsername) : that.editorUsername != null)
            return false;
        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (leftId != null ? leftId.hashCode() : 0);
        result = 31 * result + (rightId != null ? rightId.hashCode() : 0);
        result = 31 * result + (modType != null ? modType.hashCode() : 0);
        result = 31 * result + (modDate != null ? modDate.hashCode() : 0);
        result = 31 * result + (editorUsername != null ? editorUsername.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        return result;
    }
}
