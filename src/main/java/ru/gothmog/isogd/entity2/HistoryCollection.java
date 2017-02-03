package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "history_collection", schema = "public", catalog = "mgis")
public class HistoryCollection {
    private Long id;
    private String leftObjectClass;
    private String leftName;
    private String rightObjectClass;
    private String rightName;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "left_object_class", nullable = false, length = 255)
    public String getLeftObjectClass() {
        return leftObjectClass;
    }

    public void setLeftObjectClass(String leftObjectClass) {
        this.leftObjectClass = leftObjectClass;
    }

    @Basic
    @Column(name = "left_name", nullable = false, length = 255)
    public String getLeftName() {
        return leftName;
    }

    public void setLeftName(String leftName) {
        this.leftName = leftName;
    }

    @Basic
    @Column(name = "right_object_class", nullable = false, length = 255)
    public String getRightObjectClass() {
        return rightObjectClass;
    }

    public void setRightObjectClass(String rightObjectClass) {
        this.rightObjectClass = rightObjectClass;
    }

    @Basic
    @Column(name = "right_name", nullable = true, length = 255)
    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoryCollection that = (HistoryCollection) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (leftObjectClass != null ? !leftObjectClass.equals(that.leftObjectClass) : that.leftObjectClass != null)
            return false;
        if (leftName != null ? !leftName.equals(that.leftName) : that.leftName != null) return false;
        if (rightObjectClass != null ? !rightObjectClass.equals(that.rightObjectClass) : that.rightObjectClass != null)
            return false;
        if (rightName != null ? !rightName.equals(that.rightName) : that.rightName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (leftObjectClass != null ? leftObjectClass.hashCode() : 0);
        result = 31 * result + (leftName != null ? leftName.hashCode() : 0);
        result = 31 * result + (rightObjectClass != null ? rightObjectClass.hashCode() : 0);
        result = 31 * result + (rightName != null ? rightName.hashCode() : 0);
        return result;
    }
}
