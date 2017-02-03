package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "building_under_construction", schema = "public", catalog = "mgis")
public class BuildingUnderConstruction {
    private Long id;
    private String cadnum2;
    private String condCadnum;
    private String name;
    private Long cadnum1Id;
    private Long volumeId;
    private Long typeId;
    private Date buildingPermitDate;
    private Date buildingPermitEndDate;
    private String buildingPermitNum;
    private String location;
    private String locationAddress;
    private String baseProjNum;
    private Date constructionEndDateByProj;
    private Date constructionWorksDate;
    private String constructionWorksNum;
    private String constrActionType;
    private String constrMethod;
    private Long buildingViewId;
    private String buildingStage;
    private String comfortLevel;
    private String financeSourceCodes;
    private String targetUse;
    private String wallMaterial;
    private Timestamp actDate;
    private String actNum;
    private Timestamp certDate;
    private String certNum;
    private Timestamp dateOfApplication;
    private Timestamp endStageDate1;
    private Timestamp endStageDate2;
    private Timestamp endStageDate3;
    private Timestamp endStageDate4;
    private Timestamp endStageDate5;
    private Timestamp regDate;
    private String regExclusion;
    private String regNum;
    private Timestamp startOfConstruction;
    private String pBuildingType;
    private String pCadnum;
    private Double pCommonArea;
    private Double pCommonAreaProj;
    private String pCustomer;
    private Double pHeight;
    private Double pHeightProj;
    private Integer pNumberOfStoreys;
    private Integer pNumberOfStoreysProj;
    private Long buildingTypeId;
    private String ctxSearchField;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cadnum2", nullable = true, length = 10)
    public String getCadnum2() {
        return cadnum2;
    }

    public void setCadnum2(String cadnum2) {
        this.cadnum2 = cadnum2;
    }

    @Basic
    @Column(name = "cond_cadnum", nullable = true, length = 20)
    public String getCondCadnum() {
        return condCadnum;
    }

    public void setCondCadnum(String condCadnum) {
        this.condCadnum = condCadnum;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 1024)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "cadnum1_id", nullable = true)
    public Long getCadnum1Id() {
        return cadnum1Id;
    }

    public void setCadnum1Id(Long cadnum1Id) {
        this.cadnum1Id = cadnum1Id;
    }

    @Basic
    @Column(name = "volume_id", nullable = false)
    public Long getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(Long volumeId) {
        this.volumeId = volumeId;
    }

    @Basic
    @Column(name = "type_id", nullable = false)
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "building_permit_date", nullable = true)
    public Date getBuildingPermitDate() {
        return buildingPermitDate;
    }

    public void setBuildingPermitDate(Date buildingPermitDate) {
        this.buildingPermitDate = buildingPermitDate;
    }

    @Basic
    @Column(name = "building_permit_end_date", nullable = true)
    public Date getBuildingPermitEndDate() {
        return buildingPermitEndDate;
    }

    public void setBuildingPermitEndDate(Date buildingPermitEndDate) {
        this.buildingPermitEndDate = buildingPermitEndDate;
    }

    @Basic
    @Column(name = "building_permit_num", nullable = true, length = 255)
    public String getBuildingPermitNum() {
        return buildingPermitNum;
    }

    public void setBuildingPermitNum(String buildingPermitNum) {
        this.buildingPermitNum = buildingPermitNum;
    }

    @Basic
    @Column(name = "location", nullable = true, length = 4096)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "location_address", nullable = true, length = 4096)
    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    @Basic
    @Column(name = "base_proj_num", nullable = true, length = 255)
    public String getBaseProjNum() {
        return baseProjNum;
    }

    public void setBaseProjNum(String baseProjNum) {
        this.baseProjNum = baseProjNum;
    }

    @Basic
    @Column(name = "construction_end_date_by_proj", nullable = true)
    public Date getConstructionEndDateByProj() {
        return constructionEndDateByProj;
    }

    public void setConstructionEndDateByProj(Date constructionEndDateByProj) {
        this.constructionEndDateByProj = constructionEndDateByProj;
    }

    @Basic
    @Column(name = "construction_works_date", nullable = true)
    public Date getConstructionWorksDate() {
        return constructionWorksDate;
    }

    public void setConstructionWorksDate(Date constructionWorksDate) {
        this.constructionWorksDate = constructionWorksDate;
    }

    @Basic
    @Column(name = "construction_works_num", nullable = true, length = 255)
    public String getConstructionWorksNum() {
        return constructionWorksNum;
    }

    public void setConstructionWorksNum(String constructionWorksNum) {
        this.constructionWorksNum = constructionWorksNum;
    }

    @Basic
    @Column(name = "constr_action_type", nullable = true, length = 512)
    public String getConstrActionType() {
        return constrActionType;
    }

    public void setConstrActionType(String constrActionType) {
        this.constrActionType = constrActionType;
    }

    @Basic
    @Column(name = "constr_method", nullable = true, length = 512)
    public String getConstrMethod() {
        return constrMethod;
    }

    public void setConstrMethod(String constrMethod) {
        this.constrMethod = constrMethod;
    }

    @Basic
    @Column(name = "building_view_id", nullable = true)
    public Long getBuildingViewId() {
        return buildingViewId;
    }

    public void setBuildingViewId(Long buildingViewId) {
        this.buildingViewId = buildingViewId;
    }

    @Basic
    @Column(name = "building_stage", nullable = true, length = 1024)
    public String getBuildingStage() {
        return buildingStage;
    }

    public void setBuildingStage(String buildingStage) {
        this.buildingStage = buildingStage;
    }

    @Basic
    @Column(name = "comfort_level", nullable = true, length = 1024)
    public String getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(String comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    @Basic
    @Column(name = "finance_source_codes", nullable = true, length = 1024)
    public String getFinanceSourceCodes() {
        return financeSourceCodes;
    }

    public void setFinanceSourceCodes(String financeSourceCodes) {
        this.financeSourceCodes = financeSourceCodes;
    }

    @Basic
    @Column(name = "target_use", nullable = true, length = 1024)
    public String getTargetUse() {
        return targetUse;
    }

    public void setTargetUse(String targetUse) {
        this.targetUse = targetUse;
    }

    @Basic
    @Column(name = "wall_material", nullable = true, length = 1024)
    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    @Basic
    @Column(name = "act_date", nullable = true)
    public Timestamp getActDate() {
        return actDate;
    }

    public void setActDate(Timestamp actDate) {
        this.actDate = actDate;
    }

    @Basic
    @Column(name = "act_num", nullable = true, length = 255)
    public String getActNum() {
        return actNum;
    }

    public void setActNum(String actNum) {
        this.actNum = actNum;
    }

    @Basic
    @Column(name = "cert_date", nullable = true)
    public Timestamp getCertDate() {
        return certDate;
    }

    public void setCertDate(Timestamp certDate) {
        this.certDate = certDate;
    }

    @Basic
    @Column(name = "cert_num", nullable = true, length = 255)
    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    @Basic
    @Column(name = "date_of_application", nullable = true)
    public Timestamp getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(Timestamp dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    @Basic
    @Column(name = "end_stage_date1", nullable = true)
    public Timestamp getEndStageDate1() {
        return endStageDate1;
    }

    public void setEndStageDate1(Timestamp endStageDate1) {
        this.endStageDate1 = endStageDate1;
    }

    @Basic
    @Column(name = "end_stage_date2", nullable = true)
    public Timestamp getEndStageDate2() {
        return endStageDate2;
    }

    public void setEndStageDate2(Timestamp endStageDate2) {
        this.endStageDate2 = endStageDate2;
    }

    @Basic
    @Column(name = "end_stage_date3", nullable = true)
    public Timestamp getEndStageDate3() {
        return endStageDate3;
    }

    public void setEndStageDate3(Timestamp endStageDate3) {
        this.endStageDate3 = endStageDate3;
    }

    @Basic
    @Column(name = "end_stage_date4", nullable = true)
    public Timestamp getEndStageDate4() {
        return endStageDate4;
    }

    public void setEndStageDate4(Timestamp endStageDate4) {
        this.endStageDate4 = endStageDate4;
    }

    @Basic
    @Column(name = "end_stage_date5", nullable = true)
    public Timestamp getEndStageDate5() {
        return endStageDate5;
    }

    public void setEndStageDate5(Timestamp endStageDate5) {
        this.endStageDate5 = endStageDate5;
    }

    @Basic
    @Column(name = "reg_date", nullable = true)
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "reg_exclusion", nullable = true, length = 255)
    public String getRegExclusion() {
        return regExclusion;
    }

    public void setRegExclusion(String regExclusion) {
        this.regExclusion = regExclusion;
    }

    @Basic
    @Column(name = "reg_num", nullable = true, length = 255)
    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    @Basic
    @Column(name = "start_of_construction", nullable = true)
    public Timestamp getStartOfConstruction() {
        return startOfConstruction;
    }

    public void setStartOfConstruction(Timestamp startOfConstruction) {
        this.startOfConstruction = startOfConstruction;
    }

    @Basic
    @Column(name = "p_building_type", nullable = true, length = 512)
    public String getpBuildingType() {
        return pBuildingType;
    }

    public void setpBuildingType(String pBuildingType) {
        this.pBuildingType = pBuildingType;
    }

    @Basic
    @Column(name = "p_cadnum", nullable = true, length = 256)
    public String getpCadnum() {
        return pCadnum;
    }

    public void setpCadnum(String pCadnum) {
        this.pCadnum = pCadnum;
    }

    @Basic
    @Column(name = "p_common_area", nullable = true, precision = 0)
    public Double getpCommonArea() {
        return pCommonArea;
    }

    public void setpCommonArea(Double pCommonArea) {
        this.pCommonArea = pCommonArea;
    }

    @Basic
    @Column(name = "p_common_area_proj", nullable = true, precision = 0)
    public Double getpCommonAreaProj() {
        return pCommonAreaProj;
    }

    public void setpCommonAreaProj(Double pCommonAreaProj) {
        this.pCommonAreaProj = pCommonAreaProj;
    }

    @Basic
    @Column(name = "p_customer", nullable = true, length = 512)
    public String getpCustomer() {
        return pCustomer;
    }

    public void setpCustomer(String pCustomer) {
        this.pCustomer = pCustomer;
    }

    @Basic
    @Column(name = "p_height", nullable = true, precision = 0)
    public Double getpHeight() {
        return pHeight;
    }

    public void setpHeight(Double pHeight) {
        this.pHeight = pHeight;
    }

    @Basic
    @Column(name = "p_height_proj", nullable = true, precision = 0)
    public Double getpHeightProj() {
        return pHeightProj;
    }

    public void setpHeightProj(Double pHeightProj) {
        this.pHeightProj = pHeightProj;
    }

    @Basic
    @Column(name = "p_number_of_storeys", nullable = true)
    public Integer getpNumberOfStoreys() {
        return pNumberOfStoreys;
    }

    public void setpNumberOfStoreys(Integer pNumberOfStoreys) {
        this.pNumberOfStoreys = pNumberOfStoreys;
    }

    @Basic
    @Column(name = "p_number_of_storeys_proj", nullable = true)
    public Integer getpNumberOfStoreysProj() {
        return pNumberOfStoreysProj;
    }

    public void setpNumberOfStoreysProj(Integer pNumberOfStoreysProj) {
        this.pNumberOfStoreysProj = pNumberOfStoreysProj;
    }

    @Basic
    @Column(name = "building_type_id", nullable = true)
    public Long getBuildingTypeId() {
        return buildingTypeId;
    }

    public void setBuildingTypeId(Long buildingTypeId) {
        this.buildingTypeId = buildingTypeId;
    }

    @Basic
    @Column(name = "ctx_search_field", nullable = true, length = 4096)
    public String getCtxSearchField() {
        return ctxSearchField;
    }

    public void setCtxSearchField(String ctxSearchField) {
        this.ctxSearchField = ctxSearchField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingUnderConstruction that = (BuildingUnderConstruction) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cadnum2 != null ? !cadnum2.equals(that.cadnum2) : that.cadnum2 != null) return false;
        if (condCadnum != null ? !condCadnum.equals(that.condCadnum) : that.condCadnum != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (cadnum1Id != null ? !cadnum1Id.equals(that.cadnum1Id) : that.cadnum1Id != null) return false;
        if (volumeId != null ? !volumeId.equals(that.volumeId) : that.volumeId != null) return false;
        if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;
        if (buildingPermitDate != null ? !buildingPermitDate.equals(that.buildingPermitDate) : that.buildingPermitDate != null)
            return false;
        if (buildingPermitEndDate != null ? !buildingPermitEndDate.equals(that.buildingPermitEndDate) : that.buildingPermitEndDate != null)
            return false;
        if (buildingPermitNum != null ? !buildingPermitNum.equals(that.buildingPermitNum) : that.buildingPermitNum != null)
            return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (locationAddress != null ? !locationAddress.equals(that.locationAddress) : that.locationAddress != null)
            return false;
        if (baseProjNum != null ? !baseProjNum.equals(that.baseProjNum) : that.baseProjNum != null) return false;
        if (constructionEndDateByProj != null ? !constructionEndDateByProj.equals(that.constructionEndDateByProj) : that.constructionEndDateByProj != null)
            return false;
        if (constructionWorksDate != null ? !constructionWorksDate.equals(that.constructionWorksDate) : that.constructionWorksDate != null)
            return false;
        if (constructionWorksNum != null ? !constructionWorksNum.equals(that.constructionWorksNum) : that.constructionWorksNum != null)
            return false;
        if (constrActionType != null ? !constrActionType.equals(that.constrActionType) : that.constrActionType != null)
            return false;
        if (constrMethod != null ? !constrMethod.equals(that.constrMethod) : that.constrMethod != null) return false;
        if (buildingViewId != null ? !buildingViewId.equals(that.buildingViewId) : that.buildingViewId != null)
            return false;
        if (buildingStage != null ? !buildingStage.equals(that.buildingStage) : that.buildingStage != null)
            return false;
        if (comfortLevel != null ? !comfortLevel.equals(that.comfortLevel) : that.comfortLevel != null) return false;
        if (financeSourceCodes != null ? !financeSourceCodes.equals(that.financeSourceCodes) : that.financeSourceCodes != null)
            return false;
        if (targetUse != null ? !targetUse.equals(that.targetUse) : that.targetUse != null) return false;
        if (wallMaterial != null ? !wallMaterial.equals(that.wallMaterial) : that.wallMaterial != null) return false;
        if (actDate != null ? !actDate.equals(that.actDate) : that.actDate != null) return false;
        if (actNum != null ? !actNum.equals(that.actNum) : that.actNum != null) return false;
        if (certDate != null ? !certDate.equals(that.certDate) : that.certDate != null) return false;
        if (certNum != null ? !certNum.equals(that.certNum) : that.certNum != null) return false;
        if (dateOfApplication != null ? !dateOfApplication.equals(that.dateOfApplication) : that.dateOfApplication != null)
            return false;
        if (endStageDate1 != null ? !endStageDate1.equals(that.endStageDate1) : that.endStageDate1 != null)
            return false;
        if (endStageDate2 != null ? !endStageDate2.equals(that.endStageDate2) : that.endStageDate2 != null)
            return false;
        if (endStageDate3 != null ? !endStageDate3.equals(that.endStageDate3) : that.endStageDate3 != null)
            return false;
        if (endStageDate4 != null ? !endStageDate4.equals(that.endStageDate4) : that.endStageDate4 != null)
            return false;
        if (endStageDate5 != null ? !endStageDate5.equals(that.endStageDate5) : that.endStageDate5 != null)
            return false;
        if (regDate != null ? !regDate.equals(that.regDate) : that.regDate != null) return false;
        if (regExclusion != null ? !regExclusion.equals(that.regExclusion) : that.regExclusion != null) return false;
        if (regNum != null ? !regNum.equals(that.regNum) : that.regNum != null) return false;
        if (startOfConstruction != null ? !startOfConstruction.equals(that.startOfConstruction) : that.startOfConstruction != null)
            return false;
        if (pBuildingType != null ? !pBuildingType.equals(that.pBuildingType) : that.pBuildingType != null)
            return false;
        if (pCadnum != null ? !pCadnum.equals(that.pCadnum) : that.pCadnum != null) return false;
        if (pCommonArea != null ? !pCommonArea.equals(that.pCommonArea) : that.pCommonArea != null) return false;
        if (pCommonAreaProj != null ? !pCommonAreaProj.equals(that.pCommonAreaProj) : that.pCommonAreaProj != null)
            return false;
        if (pCustomer != null ? !pCustomer.equals(that.pCustomer) : that.pCustomer != null) return false;
        if (pHeight != null ? !pHeight.equals(that.pHeight) : that.pHeight != null) return false;
        if (pHeightProj != null ? !pHeightProj.equals(that.pHeightProj) : that.pHeightProj != null) return false;
        if (pNumberOfStoreys != null ? !pNumberOfStoreys.equals(that.pNumberOfStoreys) : that.pNumberOfStoreys != null)
            return false;
        if (pNumberOfStoreysProj != null ? !pNumberOfStoreysProj.equals(that.pNumberOfStoreysProj) : that.pNumberOfStoreysProj != null)
            return false;
        if (buildingTypeId != null ? !buildingTypeId.equals(that.buildingTypeId) : that.buildingTypeId != null)
            return false;
        if (ctxSearchField != null ? !ctxSearchField.equals(that.ctxSearchField) : that.ctxSearchField != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cadnum2 != null ? cadnum2.hashCode() : 0);
        result = 31 * result + (condCadnum != null ? condCadnum.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cadnum1Id != null ? cadnum1Id.hashCode() : 0);
        result = 31 * result + (volumeId != null ? volumeId.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (buildingPermitDate != null ? buildingPermitDate.hashCode() : 0);
        result = 31 * result + (buildingPermitEndDate != null ? buildingPermitEndDate.hashCode() : 0);
        result = 31 * result + (buildingPermitNum != null ? buildingPermitNum.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (locationAddress != null ? locationAddress.hashCode() : 0);
        result = 31 * result + (baseProjNum != null ? baseProjNum.hashCode() : 0);
        result = 31 * result + (constructionEndDateByProj != null ? constructionEndDateByProj.hashCode() : 0);
        result = 31 * result + (constructionWorksDate != null ? constructionWorksDate.hashCode() : 0);
        result = 31 * result + (constructionWorksNum != null ? constructionWorksNum.hashCode() : 0);
        result = 31 * result + (constrActionType != null ? constrActionType.hashCode() : 0);
        result = 31 * result + (constrMethod != null ? constrMethod.hashCode() : 0);
        result = 31 * result + (buildingViewId != null ? buildingViewId.hashCode() : 0);
        result = 31 * result + (buildingStage != null ? buildingStage.hashCode() : 0);
        result = 31 * result + (comfortLevel != null ? comfortLevel.hashCode() : 0);
        result = 31 * result + (financeSourceCodes != null ? financeSourceCodes.hashCode() : 0);
        result = 31 * result + (targetUse != null ? targetUse.hashCode() : 0);
        result = 31 * result + (wallMaterial != null ? wallMaterial.hashCode() : 0);
        result = 31 * result + (actDate != null ? actDate.hashCode() : 0);
        result = 31 * result + (actNum != null ? actNum.hashCode() : 0);
        result = 31 * result + (certDate != null ? certDate.hashCode() : 0);
        result = 31 * result + (certNum != null ? certNum.hashCode() : 0);
        result = 31 * result + (dateOfApplication != null ? dateOfApplication.hashCode() : 0);
        result = 31 * result + (endStageDate1 != null ? endStageDate1.hashCode() : 0);
        result = 31 * result + (endStageDate2 != null ? endStageDate2.hashCode() : 0);
        result = 31 * result + (endStageDate3 != null ? endStageDate3.hashCode() : 0);
        result = 31 * result + (endStageDate4 != null ? endStageDate4.hashCode() : 0);
        result = 31 * result + (endStageDate5 != null ? endStageDate5.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (regExclusion != null ? regExclusion.hashCode() : 0);
        result = 31 * result + (regNum != null ? regNum.hashCode() : 0);
        result = 31 * result + (startOfConstruction != null ? startOfConstruction.hashCode() : 0);
        result = 31 * result + (pBuildingType != null ? pBuildingType.hashCode() : 0);
        result = 31 * result + (pCadnum != null ? pCadnum.hashCode() : 0);
        result = 31 * result + (pCommonArea != null ? pCommonArea.hashCode() : 0);
        result = 31 * result + (pCommonAreaProj != null ? pCommonAreaProj.hashCode() : 0);
        result = 31 * result + (pCustomer != null ? pCustomer.hashCode() : 0);
        result = 31 * result + (pHeight != null ? pHeight.hashCode() : 0);
        result = 31 * result + (pHeightProj != null ? pHeightProj.hashCode() : 0);
        result = 31 * result + (pNumberOfStoreys != null ? pNumberOfStoreys.hashCode() : 0);
        result = 31 * result + (pNumberOfStoreysProj != null ? pNumberOfStoreysProj.hashCode() : 0);
        result = 31 * result + (buildingTypeId != null ? buildingTypeId.hashCode() : 0);
        result = 31 * result + (ctxSearchField != null ? ctxSearchField.hashCode() : 0);
        return result;
    }
}
