package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_electricity_supply", schema = "public", catalog = "mgis")
public class MilitaryElectricitySupply {
    private Long id;
    private Double negotiatedValue1;
    private Double negotiatedValue10;
    private Double negotiatedValue11;
    private Double negotiatedValue12;
    private Double negotiatedValue2;
    private Double negotiatedValue3;
    private Double negotiatedValue4;
    private Double negotiatedValue5;
    private Double negotiatedValue6;
    private Double negotiatedValue7;
    private Double negotiatedValue8;
    private Double negotiatedValue9;
    private Double negotiatedValueYear;
    private String supplyBase;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "negotiated_value_1", nullable = true, precision = 0)
    public Double getNegotiatedValue1() {
        return negotiatedValue1;
    }

    public void setNegotiatedValue1(Double negotiatedValue1) {
        this.negotiatedValue1 = negotiatedValue1;
    }

    @Basic
    @Column(name = "negotiated_value_10", nullable = true, precision = 0)
    public Double getNegotiatedValue10() {
        return negotiatedValue10;
    }

    public void setNegotiatedValue10(Double negotiatedValue10) {
        this.negotiatedValue10 = negotiatedValue10;
    }

    @Basic
    @Column(name = "negotiated_value_11", nullable = true, precision = 0)
    public Double getNegotiatedValue11() {
        return negotiatedValue11;
    }

    public void setNegotiatedValue11(Double negotiatedValue11) {
        this.negotiatedValue11 = negotiatedValue11;
    }

    @Basic
    @Column(name = "negotiated_value_12", nullable = true, precision = 0)
    public Double getNegotiatedValue12() {
        return negotiatedValue12;
    }

    public void setNegotiatedValue12(Double negotiatedValue12) {
        this.negotiatedValue12 = negotiatedValue12;
    }

    @Basic
    @Column(name = "negotiated_value_2", nullable = true, precision = 0)
    public Double getNegotiatedValue2() {
        return negotiatedValue2;
    }

    public void setNegotiatedValue2(Double negotiatedValue2) {
        this.negotiatedValue2 = negotiatedValue2;
    }

    @Basic
    @Column(name = "negotiated_value_3", nullable = true, precision = 0)
    public Double getNegotiatedValue3() {
        return negotiatedValue3;
    }

    public void setNegotiatedValue3(Double negotiatedValue3) {
        this.negotiatedValue3 = negotiatedValue3;
    }

    @Basic
    @Column(name = "negotiated_value_4", nullable = true, precision = 0)
    public Double getNegotiatedValue4() {
        return negotiatedValue4;
    }

    public void setNegotiatedValue4(Double negotiatedValue4) {
        this.negotiatedValue4 = negotiatedValue4;
    }

    @Basic
    @Column(name = "negotiated_value_5", nullable = true, precision = 0)
    public Double getNegotiatedValue5() {
        return negotiatedValue5;
    }

    public void setNegotiatedValue5(Double negotiatedValue5) {
        this.negotiatedValue5 = negotiatedValue5;
    }

    @Basic
    @Column(name = "negotiated_value_6", nullable = true, precision = 0)
    public Double getNegotiatedValue6() {
        return negotiatedValue6;
    }

    public void setNegotiatedValue6(Double negotiatedValue6) {
        this.negotiatedValue6 = negotiatedValue6;
    }

    @Basic
    @Column(name = "negotiated_value_7", nullable = true, precision = 0)
    public Double getNegotiatedValue7() {
        return negotiatedValue7;
    }

    public void setNegotiatedValue7(Double negotiatedValue7) {
        this.negotiatedValue7 = negotiatedValue7;
    }

    @Basic
    @Column(name = "negotiated_value_8", nullable = true, precision = 0)
    public Double getNegotiatedValue8() {
        return negotiatedValue8;
    }

    public void setNegotiatedValue8(Double negotiatedValue8) {
        this.negotiatedValue8 = negotiatedValue8;
    }

    @Basic
    @Column(name = "negotiated_value_9", nullable = true, precision = 0)
    public Double getNegotiatedValue9() {
        return negotiatedValue9;
    }

    public void setNegotiatedValue9(Double negotiatedValue9) {
        this.negotiatedValue9 = negotiatedValue9;
    }

    @Basic
    @Column(name = "negotiated_value_year", nullable = true, precision = 0)
    public Double getNegotiatedValueYear() {
        return negotiatedValueYear;
    }

    public void setNegotiatedValueYear(Double negotiatedValueYear) {
        this.negotiatedValueYear = negotiatedValueYear;
    }

    @Basic
    @Column(name = "supply_base", nullable = true, length = 1024)
    public String getSupplyBase() {
        return supplyBase;
    }

    public void setSupplyBase(String supplyBase) {
        this.supplyBase = supplyBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryElectricitySupply that = (MilitaryElectricitySupply) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (negotiatedValue1 != null ? !negotiatedValue1.equals(that.negotiatedValue1) : that.negotiatedValue1 != null)
            return false;
        if (negotiatedValue10 != null ? !negotiatedValue10.equals(that.negotiatedValue10) : that.negotiatedValue10 != null)
            return false;
        if (negotiatedValue11 != null ? !negotiatedValue11.equals(that.negotiatedValue11) : that.negotiatedValue11 != null)
            return false;
        if (negotiatedValue12 != null ? !negotiatedValue12.equals(that.negotiatedValue12) : that.negotiatedValue12 != null)
            return false;
        if (negotiatedValue2 != null ? !negotiatedValue2.equals(that.negotiatedValue2) : that.negotiatedValue2 != null)
            return false;
        if (negotiatedValue3 != null ? !negotiatedValue3.equals(that.negotiatedValue3) : that.negotiatedValue3 != null)
            return false;
        if (negotiatedValue4 != null ? !negotiatedValue4.equals(that.negotiatedValue4) : that.negotiatedValue4 != null)
            return false;
        if (negotiatedValue5 != null ? !negotiatedValue5.equals(that.negotiatedValue5) : that.negotiatedValue5 != null)
            return false;
        if (negotiatedValue6 != null ? !negotiatedValue6.equals(that.negotiatedValue6) : that.negotiatedValue6 != null)
            return false;
        if (negotiatedValue7 != null ? !negotiatedValue7.equals(that.negotiatedValue7) : that.negotiatedValue7 != null)
            return false;
        if (negotiatedValue8 != null ? !negotiatedValue8.equals(that.negotiatedValue8) : that.negotiatedValue8 != null)
            return false;
        if (negotiatedValue9 != null ? !negotiatedValue9.equals(that.negotiatedValue9) : that.negotiatedValue9 != null)
            return false;
        if (negotiatedValueYear != null ? !negotiatedValueYear.equals(that.negotiatedValueYear) : that.negotiatedValueYear != null)
            return false;
        if (supplyBase != null ? !supplyBase.equals(that.supplyBase) : that.supplyBase != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (negotiatedValue1 != null ? negotiatedValue1.hashCode() : 0);
        result = 31 * result + (negotiatedValue10 != null ? negotiatedValue10.hashCode() : 0);
        result = 31 * result + (negotiatedValue11 != null ? negotiatedValue11.hashCode() : 0);
        result = 31 * result + (negotiatedValue12 != null ? negotiatedValue12.hashCode() : 0);
        result = 31 * result + (negotiatedValue2 != null ? negotiatedValue2.hashCode() : 0);
        result = 31 * result + (negotiatedValue3 != null ? negotiatedValue3.hashCode() : 0);
        result = 31 * result + (negotiatedValue4 != null ? negotiatedValue4.hashCode() : 0);
        result = 31 * result + (negotiatedValue5 != null ? negotiatedValue5.hashCode() : 0);
        result = 31 * result + (negotiatedValue6 != null ? negotiatedValue6.hashCode() : 0);
        result = 31 * result + (negotiatedValue7 != null ? negotiatedValue7.hashCode() : 0);
        result = 31 * result + (negotiatedValue8 != null ? negotiatedValue8.hashCode() : 0);
        result = 31 * result + (negotiatedValue9 != null ? negotiatedValue9.hashCode() : 0);
        result = 31 * result + (negotiatedValueYear != null ? negotiatedValueYear.hashCode() : 0);
        result = 31 * result + (supplyBase != null ? supplyBase.hashCode() : 0);
        return result;
    }
}
