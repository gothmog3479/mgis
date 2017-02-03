package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_passport_cantonment", schema = "public", catalog = "mgis")
public class MilitaryPassportCantonment {
    private Long id;
    private String title;
    private Long ownerId;
    private Long subordinationId;
    private String director;
    private String directorKeg;
    private String finAllowSubj;
    private String phone;
    private Long addressId;
    private String commander;
    private String phoneCommander;
    private String phoneKeg;
    private Long masterplanId;
    private Long sanitaryId;
    private Long wastewaterId;
    private Long waterSupplyId;
    private Long powerGridId;
    private Long heatSupplyId;
    private Long electricitySupplyId;
    private String addressStr;
    private Double areaOfGeneralSaturation;
    private Double areaOfHighSaturation;
    private Integer buildingCount;
    private String ownerStr;
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
    @Column(name = "title", nullable = true, length = 1024)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "owner_id", nullable = true)
    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "subordination_id", nullable = true)
    public Long getSubordinationId() {
        return subordinationId;
    }

    public void setSubordinationId(Long subordinationId) {
        this.subordinationId = subordinationId;
    }

    @Basic
    @Column(name = "director", nullable = true, length = 1024)
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Basic
    @Column(name = "director_keg", nullable = true, length = 1024)
    public String getDirectorKeg() {
        return directorKeg;
    }

    public void setDirectorKeg(String directorKeg) {
        this.directorKeg = directorKeg;
    }

    @Basic
    @Column(name = "fin_allow_subj", nullable = true, length = 1024)
    public String getFinAllowSubj() {
        return finAllowSubj;
    }

    public void setFinAllowSubj(String finAllowSubj) {
        this.finAllowSubj = finAllowSubj;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 256)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address_id", nullable = true)
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "commander", nullable = true, length = 1024)
    public String getCommander() {
        return commander;
    }

    public void setCommander(String commander) {
        this.commander = commander;
    }

    @Basic
    @Column(name = "phone_commander", nullable = true, length = 256)
    public String getPhoneCommander() {
        return phoneCommander;
    }

    public void setPhoneCommander(String phoneCommander) {
        this.phoneCommander = phoneCommander;
    }

    @Basic
    @Column(name = "phone_keg", nullable = true, length = 256)
    public String getPhoneKeg() {
        return phoneKeg;
    }

    public void setPhoneKeg(String phoneKeg) {
        this.phoneKeg = phoneKeg;
    }

    @Basic
    @Column(name = "masterplan_id", nullable = true)
    public Long getMasterplanId() {
        return masterplanId;
    }

    public void setMasterplanId(Long masterplanId) {
        this.masterplanId = masterplanId;
    }

    @Basic
    @Column(name = "sanitary_id", nullable = true)
    public Long getSanitaryId() {
        return sanitaryId;
    }

    public void setSanitaryId(Long sanitaryId) {
        this.sanitaryId = sanitaryId;
    }

    @Basic
    @Column(name = "wastewater_id", nullable = true)
    public Long getWastewaterId() {
        return wastewaterId;
    }

    public void setWastewaterId(Long wastewaterId) {
        this.wastewaterId = wastewaterId;
    }

    @Basic
    @Column(name = "water_supply_id", nullable = true)
    public Long getWaterSupplyId() {
        return waterSupplyId;
    }

    public void setWaterSupplyId(Long waterSupplyId) {
        this.waterSupplyId = waterSupplyId;
    }

    @Basic
    @Column(name = "power_grid_id", nullable = true)
    public Long getPowerGridId() {
        return powerGridId;
    }

    public void setPowerGridId(Long powerGridId) {
        this.powerGridId = powerGridId;
    }

    @Basic
    @Column(name = "heat_supply_id", nullable = true)
    public Long getHeatSupplyId() {
        return heatSupplyId;
    }

    public void setHeatSupplyId(Long heatSupplyId) {
        this.heatSupplyId = heatSupplyId;
    }

    @Basic
    @Column(name = "electricity_supply_id", nullable = true)
    public Long getElectricitySupplyId() {
        return electricitySupplyId;
    }

    public void setElectricitySupplyId(Long electricitySupplyId) {
        this.electricitySupplyId = electricitySupplyId;
    }

    @Basic
    @Column(name = "address_str", nullable = true, length = 1024)
    public String getAddressStr() {
        return addressStr;
    }

    public void setAddressStr(String addressStr) {
        this.addressStr = addressStr;
    }

    @Basic
    @Column(name = "area_of_general_saturation", nullable = true, precision = 0)
    public Double getAreaOfGeneralSaturation() {
        return areaOfGeneralSaturation;
    }

    public void setAreaOfGeneralSaturation(Double areaOfGeneralSaturation) {
        this.areaOfGeneralSaturation = areaOfGeneralSaturation;
    }

    @Basic
    @Column(name = "area_of_high_saturation", nullable = true, precision = 0)
    public Double getAreaOfHighSaturation() {
        return areaOfHighSaturation;
    }

    public void setAreaOfHighSaturation(Double areaOfHighSaturation) {
        this.areaOfHighSaturation = areaOfHighSaturation;
    }

    @Basic
    @Column(name = "building_count", nullable = true)
    public Integer getBuildingCount() {
        return buildingCount;
    }

    public void setBuildingCount(Integer buildingCount) {
        this.buildingCount = buildingCount;
    }

    @Basic
    @Column(name = "owner_str", nullable = true, length = 1024)
    public String getOwnerStr() {
        return ownerStr;
    }

    public void setOwnerStr(String ownerStr) {
        this.ownerStr = ownerStr;
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

        MilitaryPassportCantonment that = (MilitaryPassportCantonment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (subordinationId != null ? !subordinationId.equals(that.subordinationId) : that.subordinationId != null)
            return false;
        if (director != null ? !director.equals(that.director) : that.director != null) return false;
        if (directorKeg != null ? !directorKeg.equals(that.directorKeg) : that.directorKeg != null) return false;
        if (finAllowSubj != null ? !finAllowSubj.equals(that.finAllowSubj) : that.finAllowSubj != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
        if (commander != null ? !commander.equals(that.commander) : that.commander != null) return false;
        if (phoneCommander != null ? !phoneCommander.equals(that.phoneCommander) : that.phoneCommander != null)
            return false;
        if (phoneKeg != null ? !phoneKeg.equals(that.phoneKeg) : that.phoneKeg != null) return false;
        if (masterplanId != null ? !masterplanId.equals(that.masterplanId) : that.masterplanId != null) return false;
        if (sanitaryId != null ? !sanitaryId.equals(that.sanitaryId) : that.sanitaryId != null) return false;
        if (wastewaterId != null ? !wastewaterId.equals(that.wastewaterId) : that.wastewaterId != null) return false;
        if (waterSupplyId != null ? !waterSupplyId.equals(that.waterSupplyId) : that.waterSupplyId != null)
            return false;
        if (powerGridId != null ? !powerGridId.equals(that.powerGridId) : that.powerGridId != null) return false;
        if (heatSupplyId != null ? !heatSupplyId.equals(that.heatSupplyId) : that.heatSupplyId != null) return false;
        if (electricitySupplyId != null ? !electricitySupplyId.equals(that.electricitySupplyId) : that.electricitySupplyId != null)
            return false;
        if (addressStr != null ? !addressStr.equals(that.addressStr) : that.addressStr != null) return false;
        if (areaOfGeneralSaturation != null ? !areaOfGeneralSaturation.equals(that.areaOfGeneralSaturation) : that.areaOfGeneralSaturation != null)
            return false;
        if (areaOfHighSaturation != null ? !areaOfHighSaturation.equals(that.areaOfHighSaturation) : that.areaOfHighSaturation != null)
            return false;
        if (buildingCount != null ? !buildingCount.equals(that.buildingCount) : that.buildingCount != null)
            return false;
        if (ownerStr != null ? !ownerStr.equals(that.ownerStr) : that.ownerStr != null) return false;
        if (ctxSearchField != null ? !ctxSearchField.equals(that.ctxSearchField) : that.ctxSearchField != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (subordinationId != null ? subordinationId.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (directorKeg != null ? directorKeg.hashCode() : 0);
        result = 31 * result + (finAllowSubj != null ? finAllowSubj.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (commander != null ? commander.hashCode() : 0);
        result = 31 * result + (phoneCommander != null ? phoneCommander.hashCode() : 0);
        result = 31 * result + (phoneKeg != null ? phoneKeg.hashCode() : 0);
        result = 31 * result + (masterplanId != null ? masterplanId.hashCode() : 0);
        result = 31 * result + (sanitaryId != null ? sanitaryId.hashCode() : 0);
        result = 31 * result + (wastewaterId != null ? wastewaterId.hashCode() : 0);
        result = 31 * result + (waterSupplyId != null ? waterSupplyId.hashCode() : 0);
        result = 31 * result + (powerGridId != null ? powerGridId.hashCode() : 0);
        result = 31 * result + (heatSupplyId != null ? heatSupplyId.hashCode() : 0);
        result = 31 * result + (electricitySupplyId != null ? electricitySupplyId.hashCode() : 0);
        result = 31 * result + (addressStr != null ? addressStr.hashCode() : 0);
        result = 31 * result + (areaOfGeneralSaturation != null ? areaOfGeneralSaturation.hashCode() : 0);
        result = 31 * result + (areaOfHighSaturation != null ? areaOfHighSaturation.hashCode() : 0);
        result = 31 * result + (buildingCount != null ? buildingCount.hashCode() : 0);
        result = 31 * result + (ownerStr != null ? ownerStr.hashCode() : 0);
        result = 31 * result + (ctxSearchField != null ? ctxSearchField.hashCode() : 0);
        return result;
    }
}
