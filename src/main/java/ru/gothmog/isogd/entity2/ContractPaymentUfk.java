package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "contract_payment_ufk", schema = "public", catalog = "mgis")
public class ContractPaymentUfk {
    private Long id;
    private String bic;
    private String bill;
    private String inn;
    private String kbk;
    private String key;
    private Timestamp loadingdate;
    private String note;
    private String numberPp;
    private Date operationDate;
    private Double summ;
    private String name;
    private String type;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "bic", nullable = true, length = 255)
    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    @Basic
    @Column(name = "bill", nullable = true, length = 255)
    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    @Basic
    @Column(name = "inn", nullable = true, length = 255)
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "kbk", nullable = true, length = 255)
    public String getKbk() {
        return kbk;
    }

    public void setKbk(String kbk) {
        this.kbk = kbk;
    }

    @Basic
    @Column(name = "key", nullable = true, length = 255)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "loadingdate", nullable = true)
    public Timestamp getLoadingdate() {
        return loadingdate;
    }

    public void setLoadingdate(Timestamp loadingdate) {
        this.loadingdate = loadingdate;
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
    @Column(name = "number_pp", nullable = true, length = 255)
    public String getNumberPp() {
        return numberPp;
    }

    public void setNumberPp(String numberPp) {
        this.numberPp = numberPp;
    }

    @Basic
    @Column(name = "operation_date", nullable = true)
    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    @Basic
    @Column(name = "summ", nullable = true, precision = 0)
    public Double getSumm() {
        return summ;
    }

    public void setSumm(Double summ) {
        this.summ = summ;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractPaymentUfk that = (ContractPaymentUfk) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bic != null ? !bic.equals(that.bic) : that.bic != null) return false;
        if (bill != null ? !bill.equals(that.bill) : that.bill != null) return false;
        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (kbk != null ? !kbk.equals(that.kbk) : that.kbk != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (loadingdate != null ? !loadingdate.equals(that.loadingdate) : that.loadingdate != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (numberPp != null ? !numberPp.equals(that.numberPp) : that.numberPp != null) return false;
        if (operationDate != null ? !operationDate.equals(that.operationDate) : that.operationDate != null)
            return false;
        if (summ != null ? !summ.equals(that.summ) : that.summ != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bic != null ? bic.hashCode() : 0);
        result = 31 * result + (bill != null ? bill.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (kbk != null ? kbk.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (loadingdate != null ? loadingdate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (numberPp != null ? numberPp.hashCode() : 0);
        result = 31 * result + (operationDate != null ? operationDate.hashCode() : 0);
        result = 31 * result + (summ != null ? summ.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
