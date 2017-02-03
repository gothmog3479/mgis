package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "history_object", schema = "public", catalog = "mgis")
public class HistoryObject {
    private Long id;
    private String objectClass;
    private String actualClass;
    private Integer objectId;
    private Timestamp creationTime;
    private Timestamp removalTime;
    private String creatorUsername;
    private Integer creationTransaction;
    private Integer removalTransaction;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "object_class", nullable = false, length = 255)
    public String getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    @Basic
    @Column(name = "actual_class", nullable = true, length = 255)
    public String getActualClass() {
        return actualClass;
    }

    public void setActualClass(String actualClass) {
        this.actualClass = actualClass;
    }

    @Basic
    @Column(name = "object_id", nullable = false)
    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    @Basic
    @Column(name = "creation_time", nullable = true)
    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    @Basic
    @Column(name = "removal_time", nullable = true)
    public Timestamp getRemovalTime() {
        return removalTime;
    }

    public void setRemovalTime(Timestamp removalTime) {
        this.removalTime = removalTime;
    }

    @Basic
    @Column(name = "creator_username", nullable = true, length = 10)
    public String getCreatorUsername() {
        return creatorUsername;
    }

    public void setCreatorUsername(String creatorUsername) {
        this.creatorUsername = creatorUsername;
    }

    @Basic
    @Column(name = "creation_transaction", nullable = true)
    public Integer getCreationTransaction() {
        return creationTransaction;
    }

    public void setCreationTransaction(Integer creationTransaction) {
        this.creationTransaction = creationTransaction;
    }

    @Basic
    @Column(name = "removal_transaction", nullable = true)
    public Integer getRemovalTransaction() {
        return removalTransaction;
    }

    public void setRemovalTransaction(Integer removalTransaction) {
        this.removalTransaction = removalTransaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoryObject that = (HistoryObject) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (objectClass != null ? !objectClass.equals(that.objectClass) : that.objectClass != null) return false;
        if (actualClass != null ? !actualClass.equals(that.actualClass) : that.actualClass != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (creationTime != null ? !creationTime.equals(that.creationTime) : that.creationTime != null) return false;
        if (removalTime != null ? !removalTime.equals(that.removalTime) : that.removalTime != null) return false;
        if (creatorUsername != null ? !creatorUsername.equals(that.creatorUsername) : that.creatorUsername != null)
            return false;
        if (creationTransaction != null ? !creationTransaction.equals(that.creationTransaction) : that.creationTransaction != null)
            return false;
        if (removalTransaction != null ? !removalTransaction.equals(that.removalTransaction) : that.removalTransaction != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (objectClass != null ? objectClass.hashCode() : 0);
        result = 31 * result + (actualClass != null ? actualClass.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (creationTime != null ? creationTime.hashCode() : 0);
        result = 31 * result + (removalTime != null ? removalTime.hashCode() : 0);
        result = 31 * result + (creatorUsername != null ? creatorUsername.hashCode() : 0);
        result = 31 * result + (creationTransaction != null ? creationTransaction.hashCode() : 0);
        result = 31 * result + (removalTransaction != null ? removalTransaction.hashCode() : 0);
        return result;
    }
}
