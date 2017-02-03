package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "contract_source_of_income", schema = "public", catalog = "mgis")
public class ContractSourceOfIncome {
    private Long id;
    private String account;
    private String bank;
    private String bik;
    private String departmentName;
    private String inn;
    private String kaccount;
    private String kpp;
    private String okato;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account", nullable = true, length = 64)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "bank", nullable = true, length = 512)
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Basic
    @Column(name = "bik", nullable = true, length = 64)
    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }

    @Basic
    @Column(name = "department_name", nullable = false, length = 1024)
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Basic
    @Column(name = "inn", nullable = true, length = 64)
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "kaccount", nullable = true, length = 64)
    public String getKaccount() {
        return kaccount;
    }

    public void setKaccount(String kaccount) {
        this.kaccount = kaccount;
    }

    @Basic
    @Column(name = "kpp", nullable = true, length = 64)
    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    @Basic
    @Column(name = "okato", nullable = true, length = 64)
    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractSourceOfIncome that = (ContractSourceOfIncome) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (bank != null ? !bank.equals(that.bank) : that.bank != null) return false;
        if (bik != null ? !bik.equals(that.bik) : that.bik != null) return false;
        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;
        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (kaccount != null ? !kaccount.equals(that.kaccount) : that.kaccount != null) return false;
        if (kpp != null ? !kpp.equals(that.kpp) : that.kpp != null) return false;
        if (okato != null ? !okato.equals(that.okato) : that.okato != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        result = 31 * result + (bik != null ? bik.hashCode() : 0);
        result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (kaccount != null ? kaccount.hashCode() : 0);
        result = 31 * result + (kpp != null ? kpp.hashCode() : 0);
        result = 31 * result + (okato != null ? okato.hashCode() : 0);
        return result;
    }
}
