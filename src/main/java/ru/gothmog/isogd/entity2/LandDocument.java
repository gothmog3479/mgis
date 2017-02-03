package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "land_document", schema = "public", catalog = "mgis")
public class LandDocument {
    private Long id;
    private Date givendate;
    private String givingagency;
    private String name;
    private String number;
    private String series;
    private String status;
    private String type;
    private Timestamp datereg;
    private String numreg;
    private String code;
    private String typeStr;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "givendate", nullable = true)
    public Date getGivendate() {
        return givendate;
    }

    public void setGivendate(Date givendate) {
        this.givendate = givendate;
    }

    @Basic
    @Column(name = "givingagency", nullable = true, length = 255)
    public String getGivingagency() {
        return givingagency;
    }

    public void setGivingagency(String givingagency) {
        this.givingagency = givingagency;
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
    @Column(name = "number", nullable = true, length = 255)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "series", nullable = true, length = 255)
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "datereg", nullable = true)
    public Timestamp getDatereg() {
        return datereg;
    }

    public void setDatereg(Timestamp datereg) {
        this.datereg = datereg;
    }

    @Basic
    @Column(name = "numreg", nullable = true, length = 256)
    public String getNumreg() {
        return numreg;
    }

    public void setNumreg(String numreg) {
        this.numreg = numreg;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "type_str", nullable = true, length = 512)
    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandDocument that = (LandDocument) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (givendate != null ? !givendate.equals(that.givendate) : that.givendate != null) return false;
        if (givingagency != null ? !givingagency.equals(that.givingagency) : that.givingagency != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (series != null ? !series.equals(that.series) : that.series != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (datereg != null ? !datereg.equals(that.datereg) : that.datereg != null) return false;
        if (numreg != null ? !numreg.equals(that.numreg) : that.numreg != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (typeStr != null ? !typeStr.equals(that.typeStr) : that.typeStr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (givendate != null ? givendate.hashCode() : 0);
        result = 31 * result + (givingagency != null ? givingagency.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (datereg != null ? datereg.hashCode() : 0);
        result = 31 * result + (numreg != null ? numreg.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (typeStr != null ? typeStr.hashCode() : 0);
        return result;
    }
}
