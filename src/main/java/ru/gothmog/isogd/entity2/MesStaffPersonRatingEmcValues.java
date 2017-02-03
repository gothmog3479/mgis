package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "mes_staff_person_rating_emc_values", schema = "public", catalog = "mgis")
public class MesStaffPersonRatingEmcValues {
    private Long id;
    private String chsalg;
    private String chsan;
    private String chsotch;
    private String chsrating;
    private String chssoi;
    private String chszamech;
    private String commonrating;
    private String povsan;
    private String povsdoc;
    private String povsfunc;
    private String povsotch;
    private String povsrating;
    private String povssoi;
    private String povszamech;
    private String totalrating;
    private String zastdoc;
    private String zastfunc;
    private String zastmedosmotr;
    private String zastpribytie;
    private String zastrating;
    private String zastvid;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "chsalg", nullable = true, length = 255)
    public String getChsalg() {
        return chsalg;
    }

    public void setChsalg(String chsalg) {
        this.chsalg = chsalg;
    }

    @Basic
    @Column(name = "chsan", nullable = true, length = 255)
    public String getChsan() {
        return chsan;
    }

    public void setChsan(String chsan) {
        this.chsan = chsan;
    }

    @Basic
    @Column(name = "chsotch", nullable = true, length = 255)
    public String getChsotch() {
        return chsotch;
    }

    public void setChsotch(String chsotch) {
        this.chsotch = chsotch;
    }

    @Basic
    @Column(name = "chsrating", nullable = true, length = 255)
    public String getChsrating() {
        return chsrating;
    }

    public void setChsrating(String chsrating) {
        this.chsrating = chsrating;
    }

    @Basic
    @Column(name = "chssoi", nullable = true, length = 255)
    public String getChssoi() {
        return chssoi;
    }

    public void setChssoi(String chssoi) {
        this.chssoi = chssoi;
    }

    @Basic
    @Column(name = "chszamech", nullable = true, length = 255)
    public String getChszamech() {
        return chszamech;
    }

    public void setChszamech(String chszamech) {
        this.chszamech = chszamech;
    }

    @Basic
    @Column(name = "commonrating", nullable = true, length = 255)
    public String getCommonrating() {
        return commonrating;
    }

    public void setCommonrating(String commonrating) {
        this.commonrating = commonrating;
    }

    @Basic
    @Column(name = "povsan", nullable = true, length = 255)
    public String getPovsan() {
        return povsan;
    }

    public void setPovsan(String povsan) {
        this.povsan = povsan;
    }

    @Basic
    @Column(name = "povsdoc", nullable = true, length = 255)
    public String getPovsdoc() {
        return povsdoc;
    }

    public void setPovsdoc(String povsdoc) {
        this.povsdoc = povsdoc;
    }

    @Basic
    @Column(name = "povsfunc", nullable = true, length = 255)
    public String getPovsfunc() {
        return povsfunc;
    }

    public void setPovsfunc(String povsfunc) {
        this.povsfunc = povsfunc;
    }

    @Basic
    @Column(name = "povsotch", nullable = true, length = 255)
    public String getPovsotch() {
        return povsotch;
    }

    public void setPovsotch(String povsotch) {
        this.povsotch = povsotch;
    }

    @Basic
    @Column(name = "povsrating", nullable = true, length = 255)
    public String getPovsrating() {
        return povsrating;
    }

    public void setPovsrating(String povsrating) {
        this.povsrating = povsrating;
    }

    @Basic
    @Column(name = "povssoi", nullable = true, length = 255)
    public String getPovssoi() {
        return povssoi;
    }

    public void setPovssoi(String povssoi) {
        this.povssoi = povssoi;
    }

    @Basic
    @Column(name = "povszamech", nullable = true, length = 255)
    public String getPovszamech() {
        return povszamech;
    }

    public void setPovszamech(String povszamech) {
        this.povszamech = povszamech;
    }

    @Basic
    @Column(name = "totalrating", nullable = true, length = 255)
    public String getTotalrating() {
        return totalrating;
    }

    public void setTotalrating(String totalrating) {
        this.totalrating = totalrating;
    }

    @Basic
    @Column(name = "zastdoc", nullable = true, length = 255)
    public String getZastdoc() {
        return zastdoc;
    }

    public void setZastdoc(String zastdoc) {
        this.zastdoc = zastdoc;
    }

    @Basic
    @Column(name = "zastfunc", nullable = true, length = 255)
    public String getZastfunc() {
        return zastfunc;
    }

    public void setZastfunc(String zastfunc) {
        this.zastfunc = zastfunc;
    }

    @Basic
    @Column(name = "zastmedosmotr", nullable = true, length = 255)
    public String getZastmedosmotr() {
        return zastmedosmotr;
    }

    public void setZastmedosmotr(String zastmedosmotr) {
        this.zastmedosmotr = zastmedosmotr;
    }

    @Basic
    @Column(name = "zastpribytie", nullable = true, length = 255)
    public String getZastpribytie() {
        return zastpribytie;
    }

    public void setZastpribytie(String zastpribytie) {
        this.zastpribytie = zastpribytie;
    }

    @Basic
    @Column(name = "zastrating", nullable = true, length = 255)
    public String getZastrating() {
        return zastrating;
    }

    public void setZastrating(String zastrating) {
        this.zastrating = zastrating;
    }

    @Basic
    @Column(name = "zastvid", nullable = true, length = 255)
    public String getZastvid() {
        return zastvid;
    }

    public void setZastvid(String zastvid) {
        this.zastvid = zastvid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MesStaffPersonRatingEmcValues that = (MesStaffPersonRatingEmcValues) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (chsalg != null ? !chsalg.equals(that.chsalg) : that.chsalg != null) return false;
        if (chsan != null ? !chsan.equals(that.chsan) : that.chsan != null) return false;
        if (chsotch != null ? !chsotch.equals(that.chsotch) : that.chsotch != null) return false;
        if (chsrating != null ? !chsrating.equals(that.chsrating) : that.chsrating != null) return false;
        if (chssoi != null ? !chssoi.equals(that.chssoi) : that.chssoi != null) return false;
        if (chszamech != null ? !chszamech.equals(that.chszamech) : that.chszamech != null) return false;
        if (commonrating != null ? !commonrating.equals(that.commonrating) : that.commonrating != null) return false;
        if (povsan != null ? !povsan.equals(that.povsan) : that.povsan != null) return false;
        if (povsdoc != null ? !povsdoc.equals(that.povsdoc) : that.povsdoc != null) return false;
        if (povsfunc != null ? !povsfunc.equals(that.povsfunc) : that.povsfunc != null) return false;
        if (povsotch != null ? !povsotch.equals(that.povsotch) : that.povsotch != null) return false;
        if (povsrating != null ? !povsrating.equals(that.povsrating) : that.povsrating != null) return false;
        if (povssoi != null ? !povssoi.equals(that.povssoi) : that.povssoi != null) return false;
        if (povszamech != null ? !povszamech.equals(that.povszamech) : that.povszamech != null) return false;
        if (totalrating != null ? !totalrating.equals(that.totalrating) : that.totalrating != null) return false;
        if (zastdoc != null ? !zastdoc.equals(that.zastdoc) : that.zastdoc != null) return false;
        if (zastfunc != null ? !zastfunc.equals(that.zastfunc) : that.zastfunc != null) return false;
        if (zastmedosmotr != null ? !zastmedosmotr.equals(that.zastmedosmotr) : that.zastmedosmotr != null)
            return false;
        if (zastpribytie != null ? !zastpribytie.equals(that.zastpribytie) : that.zastpribytie != null) return false;
        if (zastrating != null ? !zastrating.equals(that.zastrating) : that.zastrating != null) return false;
        if (zastvid != null ? !zastvid.equals(that.zastvid) : that.zastvid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (chsalg != null ? chsalg.hashCode() : 0);
        result = 31 * result + (chsan != null ? chsan.hashCode() : 0);
        result = 31 * result + (chsotch != null ? chsotch.hashCode() : 0);
        result = 31 * result + (chsrating != null ? chsrating.hashCode() : 0);
        result = 31 * result + (chssoi != null ? chssoi.hashCode() : 0);
        result = 31 * result + (chszamech != null ? chszamech.hashCode() : 0);
        result = 31 * result + (commonrating != null ? commonrating.hashCode() : 0);
        result = 31 * result + (povsan != null ? povsan.hashCode() : 0);
        result = 31 * result + (povsdoc != null ? povsdoc.hashCode() : 0);
        result = 31 * result + (povsfunc != null ? povsfunc.hashCode() : 0);
        result = 31 * result + (povsotch != null ? povsotch.hashCode() : 0);
        result = 31 * result + (povsrating != null ? povsrating.hashCode() : 0);
        result = 31 * result + (povssoi != null ? povssoi.hashCode() : 0);
        result = 31 * result + (povszamech != null ? povszamech.hashCode() : 0);
        result = 31 * result + (totalrating != null ? totalrating.hashCode() : 0);
        result = 31 * result + (zastdoc != null ? zastdoc.hashCode() : 0);
        result = 31 * result + (zastfunc != null ? zastfunc.hashCode() : 0);
        result = 31 * result + (zastmedosmotr != null ? zastmedosmotr.hashCode() : 0);
        result = 31 * result + (zastpribytie != null ? zastpribytie.hashCode() : 0);
        result = 31 * result + (zastrating != null ? zastrating.hashCode() : 0);
        result = 31 * result + (zastvid != null ? zastvid.hashCode() : 0);
        return result;
    }
}
