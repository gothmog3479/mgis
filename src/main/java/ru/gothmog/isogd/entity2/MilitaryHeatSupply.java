package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_heat_supply", schema = "public", catalog = "mgis")
public class MilitaryHeatSupply {
    private Long id;
    private Double externalTemp;
    private Double externalTemp1;
    private Double externalTemp10;
    private Double externalTemp11;
    private Double externalTemp12;
    private Double externalTemp2;
    private Double externalTemp3;
    private Double externalTemp4;
    private Double externalTemp5;
    private Double externalTemp6;
    private Double externalTemp7;
    private Double externalTemp8;
    private Double externalTemp9;
    private Double koeff;
    private Double lengthExternal;
    private Double lengthExternalGvs;
    private Double maximumAllowable;
    private Double maximumAllowableGvs;
    private Double windSpeed;
    private Long supplierId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "external_temp", nullable = true, precision = 0)
    public Double getExternalTemp() {
        return externalTemp;
    }

    public void setExternalTemp(Double externalTemp) {
        this.externalTemp = externalTemp;
    }

    @Basic
    @Column(name = "external_temp_1", nullable = true, precision = 0)
    public Double getExternalTemp1() {
        return externalTemp1;
    }

    public void setExternalTemp1(Double externalTemp1) {
        this.externalTemp1 = externalTemp1;
    }

    @Basic
    @Column(name = "external_temp_10", nullable = true, precision = 0)
    public Double getExternalTemp10() {
        return externalTemp10;
    }

    public void setExternalTemp10(Double externalTemp10) {
        this.externalTemp10 = externalTemp10;
    }

    @Basic
    @Column(name = "external_temp_11", nullable = true, precision = 0)
    public Double getExternalTemp11() {
        return externalTemp11;
    }

    public void setExternalTemp11(Double externalTemp11) {
        this.externalTemp11 = externalTemp11;
    }

    @Basic
    @Column(name = "external_temp_12", nullable = true, precision = 0)
    public Double getExternalTemp12() {
        return externalTemp12;
    }

    public void setExternalTemp12(Double externalTemp12) {
        this.externalTemp12 = externalTemp12;
    }

    @Basic
    @Column(name = "external_temp_2", nullable = true, precision = 0)
    public Double getExternalTemp2() {
        return externalTemp2;
    }

    public void setExternalTemp2(Double externalTemp2) {
        this.externalTemp2 = externalTemp2;
    }

    @Basic
    @Column(name = "external_temp_3", nullable = true, precision = 0)
    public Double getExternalTemp3() {
        return externalTemp3;
    }

    public void setExternalTemp3(Double externalTemp3) {
        this.externalTemp3 = externalTemp3;
    }

    @Basic
    @Column(name = "external_temp_4", nullable = true, precision = 0)
    public Double getExternalTemp4() {
        return externalTemp4;
    }

    public void setExternalTemp4(Double externalTemp4) {
        this.externalTemp4 = externalTemp4;
    }

    @Basic
    @Column(name = "external_temp_5", nullable = true, precision = 0)
    public Double getExternalTemp5() {
        return externalTemp5;
    }

    public void setExternalTemp5(Double externalTemp5) {
        this.externalTemp5 = externalTemp5;
    }

    @Basic
    @Column(name = "external_temp_6", nullable = true, precision = 0)
    public Double getExternalTemp6() {
        return externalTemp6;
    }

    public void setExternalTemp6(Double externalTemp6) {
        this.externalTemp6 = externalTemp6;
    }

    @Basic
    @Column(name = "external_temp_7", nullable = true, precision = 0)
    public Double getExternalTemp7() {
        return externalTemp7;
    }

    public void setExternalTemp7(Double externalTemp7) {
        this.externalTemp7 = externalTemp7;
    }

    @Basic
    @Column(name = "external_temp_8", nullable = true, precision = 0)
    public Double getExternalTemp8() {
        return externalTemp8;
    }

    public void setExternalTemp8(Double externalTemp8) {
        this.externalTemp8 = externalTemp8;
    }

    @Basic
    @Column(name = "external_temp_9", nullable = true, precision = 0)
    public Double getExternalTemp9() {
        return externalTemp9;
    }

    public void setExternalTemp9(Double externalTemp9) {
        this.externalTemp9 = externalTemp9;
    }

    @Basic
    @Column(name = "koeff", nullable = true, precision = 0)
    public Double getKoeff() {
        return koeff;
    }

    public void setKoeff(Double koeff) {
        this.koeff = koeff;
    }

    @Basic
    @Column(name = "length_external", nullable = true, precision = 0)
    public Double getLengthExternal() {
        return lengthExternal;
    }

    public void setLengthExternal(Double lengthExternal) {
        this.lengthExternal = lengthExternal;
    }

    @Basic
    @Column(name = "length_external_gvs", nullable = true, precision = 0)
    public Double getLengthExternalGvs() {
        return lengthExternalGvs;
    }

    public void setLengthExternalGvs(Double lengthExternalGvs) {
        this.lengthExternalGvs = lengthExternalGvs;
    }

    @Basic
    @Column(name = "maximum_allowable", nullable = true, precision = 0)
    public Double getMaximumAllowable() {
        return maximumAllowable;
    }

    public void setMaximumAllowable(Double maximumAllowable) {
        this.maximumAllowable = maximumAllowable;
    }

    @Basic
    @Column(name = "maximum_allowable_gvs", nullable = true, precision = 0)
    public Double getMaximumAllowableGvs() {
        return maximumAllowableGvs;
    }

    public void setMaximumAllowableGvs(Double maximumAllowableGvs) {
        this.maximumAllowableGvs = maximumAllowableGvs;
    }

    @Basic
    @Column(name = "wind_speed", nullable = true, precision = 0)
    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Basic
    @Column(name = "supplier_id", nullable = true)
    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryHeatSupply that = (MilitaryHeatSupply) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (externalTemp != null ? !externalTemp.equals(that.externalTemp) : that.externalTemp != null) return false;
        if (externalTemp1 != null ? !externalTemp1.equals(that.externalTemp1) : that.externalTemp1 != null)
            return false;
        if (externalTemp10 != null ? !externalTemp10.equals(that.externalTemp10) : that.externalTemp10 != null)
            return false;
        if (externalTemp11 != null ? !externalTemp11.equals(that.externalTemp11) : that.externalTemp11 != null)
            return false;
        if (externalTemp12 != null ? !externalTemp12.equals(that.externalTemp12) : that.externalTemp12 != null)
            return false;
        if (externalTemp2 != null ? !externalTemp2.equals(that.externalTemp2) : that.externalTemp2 != null)
            return false;
        if (externalTemp3 != null ? !externalTemp3.equals(that.externalTemp3) : that.externalTemp3 != null)
            return false;
        if (externalTemp4 != null ? !externalTemp4.equals(that.externalTemp4) : that.externalTemp4 != null)
            return false;
        if (externalTemp5 != null ? !externalTemp5.equals(that.externalTemp5) : that.externalTemp5 != null)
            return false;
        if (externalTemp6 != null ? !externalTemp6.equals(that.externalTemp6) : that.externalTemp6 != null)
            return false;
        if (externalTemp7 != null ? !externalTemp7.equals(that.externalTemp7) : that.externalTemp7 != null)
            return false;
        if (externalTemp8 != null ? !externalTemp8.equals(that.externalTemp8) : that.externalTemp8 != null)
            return false;
        if (externalTemp9 != null ? !externalTemp9.equals(that.externalTemp9) : that.externalTemp9 != null)
            return false;
        if (koeff != null ? !koeff.equals(that.koeff) : that.koeff != null) return false;
        if (lengthExternal != null ? !lengthExternal.equals(that.lengthExternal) : that.lengthExternal != null)
            return false;
        if (lengthExternalGvs != null ? !lengthExternalGvs.equals(that.lengthExternalGvs) : that.lengthExternalGvs != null)
            return false;
        if (maximumAllowable != null ? !maximumAllowable.equals(that.maximumAllowable) : that.maximumAllowable != null)
            return false;
        if (maximumAllowableGvs != null ? !maximumAllowableGvs.equals(that.maximumAllowableGvs) : that.maximumAllowableGvs != null)
            return false;
        if (windSpeed != null ? !windSpeed.equals(that.windSpeed) : that.windSpeed != null) return false;
        if (supplierId != null ? !supplierId.equals(that.supplierId) : that.supplierId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (externalTemp != null ? externalTemp.hashCode() : 0);
        result = 31 * result + (externalTemp1 != null ? externalTemp1.hashCode() : 0);
        result = 31 * result + (externalTemp10 != null ? externalTemp10.hashCode() : 0);
        result = 31 * result + (externalTemp11 != null ? externalTemp11.hashCode() : 0);
        result = 31 * result + (externalTemp12 != null ? externalTemp12.hashCode() : 0);
        result = 31 * result + (externalTemp2 != null ? externalTemp2.hashCode() : 0);
        result = 31 * result + (externalTemp3 != null ? externalTemp3.hashCode() : 0);
        result = 31 * result + (externalTemp4 != null ? externalTemp4.hashCode() : 0);
        result = 31 * result + (externalTemp5 != null ? externalTemp5.hashCode() : 0);
        result = 31 * result + (externalTemp6 != null ? externalTemp6.hashCode() : 0);
        result = 31 * result + (externalTemp7 != null ? externalTemp7.hashCode() : 0);
        result = 31 * result + (externalTemp8 != null ? externalTemp8.hashCode() : 0);
        result = 31 * result + (externalTemp9 != null ? externalTemp9.hashCode() : 0);
        result = 31 * result + (koeff != null ? koeff.hashCode() : 0);
        result = 31 * result + (lengthExternal != null ? lengthExternal.hashCode() : 0);
        result = 31 * result + (lengthExternalGvs != null ? lengthExternalGvs.hashCode() : 0);
        result = 31 * result + (maximumAllowable != null ? maximumAllowable.hashCode() : 0);
        result = 31 * result + (maximumAllowableGvs != null ? maximumAllowableGvs.hashCode() : 0);
        result = 31 * result + (windSpeed != null ? windSpeed.hashCode() : 0);
        result = 31 * result + (supplierId != null ? supplierId.hashCode() : 0);
        return result;
    }
}
