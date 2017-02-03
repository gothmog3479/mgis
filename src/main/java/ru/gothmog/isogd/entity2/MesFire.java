package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mes_fire", schema = "public", catalog = "mgis")
public class MesFire {
    private Long id;
    private Timestamp dateOf;
    private Integer objind;
    private Integer objkult;
    private Integer objobr;
    private Integer objpostr;
    private Integer objproch;
    private Integer objproiz;
    private Integer objsad;
    private Integer objsh;
    private Integer objsoc;
    private Integer objstr;
    private Integer objtorg;
    private Integer objzil;
    private Integer pogiblo;
    private Integer pogiblochs;
    private Integer pogiblodetei;
    private Integer pozary;
    private Integer pozarychs;
    private Integer pozarygrupgibel;
    private Integer pozarygruptavm;
    private Integer pozarysel;
    private Integer pozarytown;
    private Integer spaseno;
    private Integer travmir;
    private Integer zagorania;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_of", nullable = false)
    public Timestamp getDateOf() {
        return dateOf;
    }

    public void setDateOf(Timestamp dateOf) {
        this.dateOf = dateOf;
    }

    @Basic
    @Column(name = "objind", nullable = true)
    public Integer getObjind() {
        return objind;
    }

    public void setObjind(Integer objind) {
        this.objind = objind;
    }

    @Basic
    @Column(name = "objkult", nullable = true)
    public Integer getObjkult() {
        return objkult;
    }

    public void setObjkult(Integer objkult) {
        this.objkult = objkult;
    }

    @Basic
    @Column(name = "objobr", nullable = true)
    public Integer getObjobr() {
        return objobr;
    }

    public void setObjobr(Integer objobr) {
        this.objobr = objobr;
    }

    @Basic
    @Column(name = "objpostr", nullable = true)
    public Integer getObjpostr() {
        return objpostr;
    }

    public void setObjpostr(Integer objpostr) {
        this.objpostr = objpostr;
    }

    @Basic
    @Column(name = "objproch", nullable = true)
    public Integer getObjproch() {
        return objproch;
    }

    public void setObjproch(Integer objproch) {
        this.objproch = objproch;
    }

    @Basic
    @Column(name = "objproiz", nullable = true)
    public Integer getObjproiz() {
        return objproiz;
    }

    public void setObjproiz(Integer objproiz) {
        this.objproiz = objproiz;
    }

    @Basic
    @Column(name = "objsad", nullable = true)
    public Integer getObjsad() {
        return objsad;
    }

    public void setObjsad(Integer objsad) {
        this.objsad = objsad;
    }

    @Basic
    @Column(name = "objsh", nullable = true)
    public Integer getObjsh() {
        return objsh;
    }

    public void setObjsh(Integer objsh) {
        this.objsh = objsh;
    }

    @Basic
    @Column(name = "objsoc", nullable = true)
    public Integer getObjsoc() {
        return objsoc;
    }

    public void setObjsoc(Integer objsoc) {
        this.objsoc = objsoc;
    }

    @Basic
    @Column(name = "objstr", nullable = true)
    public Integer getObjstr() {
        return objstr;
    }

    public void setObjstr(Integer objstr) {
        this.objstr = objstr;
    }

    @Basic
    @Column(name = "objtorg", nullable = true)
    public Integer getObjtorg() {
        return objtorg;
    }

    public void setObjtorg(Integer objtorg) {
        this.objtorg = objtorg;
    }

    @Basic
    @Column(name = "objzil", nullable = true)
    public Integer getObjzil() {
        return objzil;
    }

    public void setObjzil(Integer objzil) {
        this.objzil = objzil;
    }

    @Basic
    @Column(name = "pogiblo", nullable = true)
    public Integer getPogiblo() {
        return pogiblo;
    }

    public void setPogiblo(Integer pogiblo) {
        this.pogiblo = pogiblo;
    }

    @Basic
    @Column(name = "pogiblochs", nullable = true)
    public Integer getPogiblochs() {
        return pogiblochs;
    }

    public void setPogiblochs(Integer pogiblochs) {
        this.pogiblochs = pogiblochs;
    }

    @Basic
    @Column(name = "pogiblodetei", nullable = true)
    public Integer getPogiblodetei() {
        return pogiblodetei;
    }

    public void setPogiblodetei(Integer pogiblodetei) {
        this.pogiblodetei = pogiblodetei;
    }

    @Basic
    @Column(name = "pozary", nullable = true)
    public Integer getPozary() {
        return pozary;
    }

    public void setPozary(Integer pozary) {
        this.pozary = pozary;
    }

    @Basic
    @Column(name = "pozarychs", nullable = true)
    public Integer getPozarychs() {
        return pozarychs;
    }

    public void setPozarychs(Integer pozarychs) {
        this.pozarychs = pozarychs;
    }

    @Basic
    @Column(name = "pozarygrupgibel", nullable = true)
    public Integer getPozarygrupgibel() {
        return pozarygrupgibel;
    }

    public void setPozarygrupgibel(Integer pozarygrupgibel) {
        this.pozarygrupgibel = pozarygrupgibel;
    }

    @Basic
    @Column(name = "pozarygruptavm", nullable = true)
    public Integer getPozarygruptavm() {
        return pozarygruptavm;
    }

    public void setPozarygruptavm(Integer pozarygruptavm) {
        this.pozarygruptavm = pozarygruptavm;
    }

    @Basic
    @Column(name = "pozarysel", nullable = true)
    public Integer getPozarysel() {
        return pozarysel;
    }

    public void setPozarysel(Integer pozarysel) {
        this.pozarysel = pozarysel;
    }

    @Basic
    @Column(name = "pozarytown", nullable = true)
    public Integer getPozarytown() {
        return pozarytown;
    }

    public void setPozarytown(Integer pozarytown) {
        this.pozarytown = pozarytown;
    }

    @Basic
    @Column(name = "spaseno", nullable = true)
    public Integer getSpaseno() {
        return spaseno;
    }

    public void setSpaseno(Integer spaseno) {
        this.spaseno = spaseno;
    }

    @Basic
    @Column(name = "travmir", nullable = true)
    public Integer getTravmir() {
        return travmir;
    }

    public void setTravmir(Integer travmir) {
        this.travmir = travmir;
    }

    @Basic
    @Column(name = "zagorania", nullable = true)
    public Integer getZagorania() {
        return zagorania;
    }

    public void setZagorania(Integer zagorania) {
        this.zagorania = zagorania;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesFire mesFire = (MesFire) o;

        if (id != null ? !id.equals(mesFire.id) : mesFire.id != null) return false;
        if (dateOf != null ? !dateOf.equals(mesFire.dateOf) : mesFire.dateOf != null) return false;
        if (objind != null ? !objind.equals(mesFire.objind) : mesFire.objind != null) return false;
        if (objkult != null ? !objkult.equals(mesFire.objkult) : mesFire.objkult != null) return false;
        if (objobr != null ? !objobr.equals(mesFire.objobr) : mesFire.objobr != null) return false;
        if (objpostr != null ? !objpostr.equals(mesFire.objpostr) : mesFire.objpostr != null) return false;
        if (objproch != null ? !objproch.equals(mesFire.objproch) : mesFire.objproch != null) return false;
        if (objproiz != null ? !objproiz.equals(mesFire.objproiz) : mesFire.objproiz != null) return false;
        if (objsad != null ? !objsad.equals(mesFire.objsad) : mesFire.objsad != null) return false;
        if (objsh != null ? !objsh.equals(mesFire.objsh) : mesFire.objsh != null) return false;
        if (objsoc != null ? !objsoc.equals(mesFire.objsoc) : mesFire.objsoc != null) return false;
        if (objstr != null ? !objstr.equals(mesFire.objstr) : mesFire.objstr != null) return false;
        if (objtorg != null ? !objtorg.equals(mesFire.objtorg) : mesFire.objtorg != null) return false;
        if (objzil != null ? !objzil.equals(mesFire.objzil) : mesFire.objzil != null) return false;
        if (pogiblo != null ? !pogiblo.equals(mesFire.pogiblo) : mesFire.pogiblo != null) return false;
        if (pogiblochs != null ? !pogiblochs.equals(mesFire.pogiblochs) : mesFire.pogiblochs != null) return false;
        if (pogiblodetei != null ? !pogiblodetei.equals(mesFire.pogiblodetei) : mesFire.pogiblodetei != null)
            return false;
        if (pozary != null ? !pozary.equals(mesFire.pozary) : mesFire.pozary != null) return false;
        if (pozarychs != null ? !pozarychs.equals(mesFire.pozarychs) : mesFire.pozarychs != null) return false;
        if (pozarygrupgibel != null ? !pozarygrupgibel.equals(mesFire.pozarygrupgibel) : mesFire.pozarygrupgibel != null)
            return false;
        if (pozarygruptavm != null ? !pozarygruptavm.equals(mesFire.pozarygruptavm) : mesFire.pozarygruptavm != null)
            return false;
        if (pozarysel != null ? !pozarysel.equals(mesFire.pozarysel) : mesFire.pozarysel != null) return false;
        if (pozarytown != null ? !pozarytown.equals(mesFire.pozarytown) : mesFire.pozarytown != null) return false;
        if (spaseno != null ? !spaseno.equals(mesFire.spaseno) : mesFire.spaseno != null) return false;
        if (travmir != null ? !travmir.equals(mesFire.travmir) : mesFire.travmir != null) return false;
        if (zagorania != null ? !zagorania.equals(mesFire.zagorania) : mesFire.zagorania != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateOf != null ? dateOf.hashCode() : 0);
        result = 31 * result + (objind != null ? objind.hashCode() : 0);
        result = 31 * result + (objkult != null ? objkult.hashCode() : 0);
        result = 31 * result + (objobr != null ? objobr.hashCode() : 0);
        result = 31 * result + (objpostr != null ? objpostr.hashCode() : 0);
        result = 31 * result + (objproch != null ? objproch.hashCode() : 0);
        result = 31 * result + (objproiz != null ? objproiz.hashCode() : 0);
        result = 31 * result + (objsad != null ? objsad.hashCode() : 0);
        result = 31 * result + (objsh != null ? objsh.hashCode() : 0);
        result = 31 * result + (objsoc != null ? objsoc.hashCode() : 0);
        result = 31 * result + (objstr != null ? objstr.hashCode() : 0);
        result = 31 * result + (objtorg != null ? objtorg.hashCode() : 0);
        result = 31 * result + (objzil != null ? objzil.hashCode() : 0);
        result = 31 * result + (pogiblo != null ? pogiblo.hashCode() : 0);
        result = 31 * result + (pogiblochs != null ? pogiblochs.hashCode() : 0);
        result = 31 * result + (pogiblodetei != null ? pogiblodetei.hashCode() : 0);
        result = 31 * result + (pozary != null ? pozary.hashCode() : 0);
        result = 31 * result + (pozarychs != null ? pozarychs.hashCode() : 0);
        result = 31 * result + (pozarygrupgibel != null ? pozarygrupgibel.hashCode() : 0);
        result = 31 * result + (pozarygruptavm != null ? pozarygruptavm.hashCode() : 0);
        result = 31 * result + (pozarysel != null ? pozarysel.hashCode() : 0);
        result = 31 * result + (pozarytown != null ? pozarytown.hashCode() : 0);
        result = 31 * result + (spaseno != null ? spaseno.hashCode() : 0);
        result = 31 * result + (travmir != null ? travmir.hashCode() : 0);
        result = 31 * result + (zagorania != null ? zagorania.hashCode() : 0);
        return result;
    }
}
