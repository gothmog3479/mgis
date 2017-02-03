package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Okato {
    private Long id;
    private String fullCode;
    private String kod1;
    private String kod2;
    private String kod3;
    private String name;
    private Integer razdel;
    private String ter;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "full_code", nullable = true, length = 255)
    public String getFullCode() {
        return fullCode;
    }

    public void setFullCode(String fullCode) {
        this.fullCode = fullCode;
    }

    @Basic
    @Column(name = "kod1", nullable = true, length = 255)
    public String getKod1() {
        return kod1;
    }

    public void setKod1(String kod1) {
        this.kod1 = kod1;
    }

    @Basic
    @Column(name = "kod2", nullable = true, length = 255)
    public String getKod2() {
        return kod2;
    }

    public void setKod2(String kod2) {
        this.kod2 = kod2;
    }

    @Basic
    @Column(name = "kod3", nullable = true, length = 255)
    public String getKod3() {
        return kod3;
    }

    public void setKod3(String kod3) {
        this.kod3 = kod3;
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
    @Column(name = "razdel", nullable = true)
    public Integer getRazdel() {
        return razdel;
    }

    public void setRazdel(Integer razdel) {
        this.razdel = razdel;
    }

    @Basic
    @Column(name = "ter", nullable = true, length = 255)
    public String getTer() {
        return ter;
    }

    public void setTer(String ter) {
        this.ter = ter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Okato okato = (Okato) o;

        if (id != null ? !id.equals(okato.id) : okato.id != null) return false;
        if (fullCode != null ? !fullCode.equals(okato.fullCode) : okato.fullCode != null) return false;
        if (kod1 != null ? !kod1.equals(okato.kod1) : okato.kod1 != null) return false;
        if (kod2 != null ? !kod2.equals(okato.kod2) : okato.kod2 != null) return false;
        if (kod3 != null ? !kod3.equals(okato.kod3) : okato.kod3 != null) return false;
        if (name != null ? !name.equals(okato.name) : okato.name != null) return false;
        if (razdel != null ? !razdel.equals(okato.razdel) : okato.razdel != null) return false;
        if (ter != null ? !ter.equals(okato.ter) : okato.ter != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fullCode != null ? fullCode.hashCode() : 0);
        result = 31 * result + (kod1 != null ? kod1.hashCode() : 0);
        result = 31 * result + (kod2 != null ? kod2.hashCode() : 0);
        result = 31 * result + (kod3 != null ? kod3.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (razdel != null ? razdel.hashCode() : 0);
        result = 31 * result + (ter != null ? ter.hashCode() : 0);
        return result;
    }
}
