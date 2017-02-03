package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "document_counter", schema = "public", catalog = "mgis")
public class DocumentCounter {
    private Integer bookId;
    private Integer doctypeId;
    private Integer counterValue;
    private Integer id;

    @Basic
    @Column(name = "book_id", nullable = false)
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "doctype_id", nullable = false)
    public Integer getDoctypeId() {
        return doctypeId;
    }

    public void setDoctypeId(Integer doctypeId) {
        this.doctypeId = doctypeId;
    }

    @Basic
    @Column(name = "counter_value", nullable = false)
    public Integer getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(Integer counterValue) {
        this.counterValue = counterValue;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentCounter that = (DocumentCounter) o;

        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (doctypeId != null ? !doctypeId.equals(that.doctypeId) : that.doctypeId != null) return false;
        if (counterValue != null ? !counterValue.equals(that.counterValue) : that.counterValue != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (doctypeId != null ? doctypeId.hashCode() : 0);
        result = 31 * result + (counterValue != null ? counterValue.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
