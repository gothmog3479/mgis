package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "tax_object_land", schema = "public", catalog = "mgis")
public class TaxObjectLand {
    private Long id;
    private Long landId;
    private Double factcadcost;
    private Double facttax;
    private Double potentialcost;
    private Double potentialtax;
    private Double area;
    private Double factCadCost;
    private Double factTax;
    private Double potentialCost;
    private Double potentialTax;
    private Double potentialUpcs;
    private Double factTaxFiscal;
    private Double areaFiscal;
    private Double cadCostFiscal;
    private Double pLastUpcs;
    private Double taxRate;
    private Double taxRateFiscal;
    private String permuseByTax;
    private Double potentialTaxFiscal;
    private String taxAddress;
    private String testAddressStr;
    private Long taxCategoryId;
    private Double bannedTax;
    private Double benefitTax;
    private Double calculatedTax;
    private Double thisYearUpcs;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "land_id", nullable = false)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Basic
    @Column(name = "factcadcost", nullable = true, precision = 0)
    public Double getFactcadcost() {
        return factcadcost;
    }

    public void setFactcadcost(Double factcadcost) {
        this.factcadcost = factcadcost;
    }

    @Basic
    @Column(name = "facttax", nullable = true, precision = 0)
    public Double getFacttax() {
        return facttax;
    }

    public void setFacttax(Double facttax) {
        this.facttax = facttax;
    }

    @Basic
    @Column(name = "potentialcost", nullable = true, precision = 0)
    public Double getPotentialcost() {
        return potentialcost;
    }

    public void setPotentialcost(Double potentialcost) {
        this.potentialcost = potentialcost;
    }

    @Basic
    @Column(name = "potentialtax", nullable = true, precision = 0)
    public Double getPotentialtax() {
        return potentialtax;
    }

    public void setPotentialtax(Double potentialtax) {
        this.potentialtax = potentialtax;
    }

    @Basic
    @Column(name = "area", nullable = true, precision = 0)
    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Basic
    @Column(name = "fact_cad_cost", nullable = true, precision = 0)
    public Double getFactCadCost() {
        return factCadCost;
    }

    public void setFactCadCost(Double factCadCost) {
        this.factCadCost = factCadCost;
    }

    @Basic
    @Column(name = "fact_tax", nullable = true, precision = 0)
    public Double getFactTax() {
        return factTax;
    }

    public void setFactTax(Double factTax) {
        this.factTax = factTax;
    }

    @Basic
    @Column(name = "potential_cost", nullable = true, precision = 0)
    public Double getPotentialCost() {
        return potentialCost;
    }

    public void setPotentialCost(Double potentialCost) {
        this.potentialCost = potentialCost;
    }

    @Basic
    @Column(name = "potential_tax", nullable = true, precision = 0)
    public Double getPotentialTax() {
        return potentialTax;
    }

    public void setPotentialTax(Double potentialTax) {
        this.potentialTax = potentialTax;
    }

    @Basic
    @Column(name = "potential_upcs", nullable = true, precision = 0)
    public Double getPotentialUpcs() {
        return potentialUpcs;
    }

    public void setPotentialUpcs(Double potentialUpcs) {
        this.potentialUpcs = potentialUpcs;
    }

    @Basic
    @Column(name = "fact_tax_fiscal", nullable = true, precision = 0)
    public Double getFactTaxFiscal() {
        return factTaxFiscal;
    }

    public void setFactTaxFiscal(Double factTaxFiscal) {
        this.factTaxFiscal = factTaxFiscal;
    }

    @Basic
    @Column(name = "area_fiscal", nullable = true, precision = 0)
    public Double getAreaFiscal() {
        return areaFiscal;
    }

    public void setAreaFiscal(Double areaFiscal) {
        this.areaFiscal = areaFiscal;
    }

    @Basic
    @Column(name = "cad_cost_fiscal", nullable = true, precision = 0)
    public Double getCadCostFiscal() {
        return cadCostFiscal;
    }

    public void setCadCostFiscal(Double cadCostFiscal) {
        this.cadCostFiscal = cadCostFiscal;
    }

    @Basic
    @Column(name = "p_last_upcs", nullable = true, precision = 0)
    public Double getpLastUpcs() {
        return pLastUpcs;
    }

    public void setpLastUpcs(Double pLastUpcs) {
        this.pLastUpcs = pLastUpcs;
    }

    @Basic
    @Column(name = "tax_rate", nullable = true, precision = 0)
    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    @Basic
    @Column(name = "tax_rate_fiscal", nullable = true, precision = 0)
    public Double getTaxRateFiscal() {
        return taxRateFiscal;
    }

    public void setTaxRateFiscal(Double taxRateFiscal) {
        this.taxRateFiscal = taxRateFiscal;
    }

    @Basic
    @Column(name = "permuse_by_tax", nullable = true, length = 512)
    public String getPermuseByTax() {
        return permuseByTax;
    }

    public void setPermuseByTax(String permuseByTax) {
        this.permuseByTax = permuseByTax;
    }

    @Basic
    @Column(name = "potential_tax_fiscal", nullable = true, precision = 0)
    public Double getPotentialTaxFiscal() {
        return potentialTaxFiscal;
    }

    public void setPotentialTaxFiscal(Double potentialTaxFiscal) {
        this.potentialTaxFiscal = potentialTaxFiscal;
    }

    @Basic
    @Column(name = "tax_address", nullable = true, length = 512)
    public String getTaxAddress() {
        return taxAddress;
    }

    public void setTaxAddress(String taxAddress) {
        this.taxAddress = taxAddress;
    }

    @Basic
    @Column(name = "test_address_str", nullable = true, length = 512)
    public String getTestAddressStr() {
        return testAddressStr;
    }

    public void setTestAddressStr(String testAddressStr) {
        this.testAddressStr = testAddressStr;
    }

    @Basic
    @Column(name = "tax_category_id", nullable = true)
    public Long getTaxCategoryId() {
        return taxCategoryId;
    }

    public void setTaxCategoryId(Long taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
    }

    @Basic
    @Column(name = "banned_tax", nullable = true, precision = 0)
    public Double getBannedTax() {
        return bannedTax;
    }

    public void setBannedTax(Double bannedTax) {
        this.bannedTax = bannedTax;
    }

    @Basic
    @Column(name = "benefit_tax", nullable = true, precision = 0)
    public Double getBenefitTax() {
        return benefitTax;
    }

    public void setBenefitTax(Double benefitTax) {
        this.benefitTax = benefitTax;
    }

    @Basic
    @Column(name = "calculated_tax", nullable = true, precision = 0)
    public Double getCalculatedTax() {
        return calculatedTax;
    }

    public void setCalculatedTax(Double calculatedTax) {
        this.calculatedTax = calculatedTax;
    }

    @Basic
    @Column(name = "this_year_upcs", nullable = true, precision = 0)
    public Double getThisYearUpcs() {
        return thisYearUpcs;
    }

    public void setThisYearUpcs(Double thisYearUpcs) {
        this.thisYearUpcs = thisYearUpcs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxObjectLand that = (TaxObjectLand) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (landId != null ? !landId.equals(that.landId) : that.landId != null) return false;
        if (factcadcost != null ? !factcadcost.equals(that.factcadcost) : that.factcadcost != null) return false;
        if (facttax != null ? !facttax.equals(that.facttax) : that.facttax != null) return false;
        if (potentialcost != null ? !potentialcost.equals(that.potentialcost) : that.potentialcost != null)
            return false;
        if (potentialtax != null ? !potentialtax.equals(that.potentialtax) : that.potentialtax != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (factCadCost != null ? !factCadCost.equals(that.factCadCost) : that.factCadCost != null) return false;
        if (factTax != null ? !factTax.equals(that.factTax) : that.factTax != null) return false;
        if (potentialCost != null ? !potentialCost.equals(that.potentialCost) : that.potentialCost != null)
            return false;
        if (potentialTax != null ? !potentialTax.equals(that.potentialTax) : that.potentialTax != null) return false;
        if (potentialUpcs != null ? !potentialUpcs.equals(that.potentialUpcs) : that.potentialUpcs != null)
            return false;
        if (factTaxFiscal != null ? !factTaxFiscal.equals(that.factTaxFiscal) : that.factTaxFiscal != null)
            return false;
        if (areaFiscal != null ? !areaFiscal.equals(that.areaFiscal) : that.areaFiscal != null) return false;
        if (cadCostFiscal != null ? !cadCostFiscal.equals(that.cadCostFiscal) : that.cadCostFiscal != null)
            return false;
        if (pLastUpcs != null ? !pLastUpcs.equals(that.pLastUpcs) : that.pLastUpcs != null) return false;
        if (taxRate != null ? !taxRate.equals(that.taxRate) : that.taxRate != null) return false;
        if (taxRateFiscal != null ? !taxRateFiscal.equals(that.taxRateFiscal) : that.taxRateFiscal != null)
            return false;
        if (permuseByTax != null ? !permuseByTax.equals(that.permuseByTax) : that.permuseByTax != null) return false;
        if (potentialTaxFiscal != null ? !potentialTaxFiscal.equals(that.potentialTaxFiscal) : that.potentialTaxFiscal != null)
            return false;
        if (taxAddress != null ? !taxAddress.equals(that.taxAddress) : that.taxAddress != null) return false;
        if (testAddressStr != null ? !testAddressStr.equals(that.testAddressStr) : that.testAddressStr != null)
            return false;
        if (taxCategoryId != null ? !taxCategoryId.equals(that.taxCategoryId) : that.taxCategoryId != null)
            return false;
        if (bannedTax != null ? !bannedTax.equals(that.bannedTax) : that.bannedTax != null) return false;
        if (benefitTax != null ? !benefitTax.equals(that.benefitTax) : that.benefitTax != null) return false;
        if (calculatedTax != null ? !calculatedTax.equals(that.calculatedTax) : that.calculatedTax != null)
            return false;
        if (thisYearUpcs != null ? !thisYearUpcs.equals(that.thisYearUpcs) : that.thisYearUpcs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        result = 31 * result + (factcadcost != null ? factcadcost.hashCode() : 0);
        result = 31 * result + (facttax != null ? facttax.hashCode() : 0);
        result = 31 * result + (potentialcost != null ? potentialcost.hashCode() : 0);
        result = 31 * result + (potentialtax != null ? potentialtax.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (factCadCost != null ? factCadCost.hashCode() : 0);
        result = 31 * result + (factTax != null ? factTax.hashCode() : 0);
        result = 31 * result + (potentialCost != null ? potentialCost.hashCode() : 0);
        result = 31 * result + (potentialTax != null ? potentialTax.hashCode() : 0);
        result = 31 * result + (potentialUpcs != null ? potentialUpcs.hashCode() : 0);
        result = 31 * result + (factTaxFiscal != null ? factTaxFiscal.hashCode() : 0);
        result = 31 * result + (areaFiscal != null ? areaFiscal.hashCode() : 0);
        result = 31 * result + (cadCostFiscal != null ? cadCostFiscal.hashCode() : 0);
        result = 31 * result + (pLastUpcs != null ? pLastUpcs.hashCode() : 0);
        result = 31 * result + (taxRate != null ? taxRate.hashCode() : 0);
        result = 31 * result + (taxRateFiscal != null ? taxRateFiscal.hashCode() : 0);
        result = 31 * result + (permuseByTax != null ? permuseByTax.hashCode() : 0);
        result = 31 * result + (potentialTaxFiscal != null ? potentialTaxFiscal.hashCode() : 0);
        result = 31 * result + (taxAddress != null ? taxAddress.hashCode() : 0);
        result = 31 * result + (testAddressStr != null ? testAddressStr.hashCode() : 0);
        result = 31 * result + (taxCategoryId != null ? taxCategoryId.hashCode() : 0);
        result = 31 * result + (bannedTax != null ? bannedTax.hashCode() : 0);
        result = 31 * result + (benefitTax != null ? benefitTax.hashCode() : 0);
        result = 31 * result + (calculatedTax != null ? calculatedTax.hashCode() : 0);
        result = 31 * result + (thisYearUpcs != null ? thisYearUpcs.hashCode() : 0);
        return result;
    }
}
