package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "contract_rent_square", schema = "public", catalog = "mgis")
public class ContractRentSquare {
    private Long id;
    private Timestamp endDate;
    private Timestamp startDate;
    private Boolean cadCost;
    private String note;
    private Double square;
    private Long ownerId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "start_date", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "cad_cost", nullable = true)
    public Boolean getCadCost() {
        return cadCost;
    }

    public void setCadCost(Boolean cadCost) {
        this.cadCost = cadCost;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 255)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "square", nullable = true, precision = 0)
    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    @Basic
    @Column(name = "owner_id", nullable = true)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractRentSquare that = (ContractRentSquare) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (cadCost != null ? !cadCost.equals(that.cadCost) : that.cadCost != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (square != null ? !square.equals(that.square) : that.square != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (cadCost != null ? cadCost.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (square != null ? square.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        return result;
    }
}
