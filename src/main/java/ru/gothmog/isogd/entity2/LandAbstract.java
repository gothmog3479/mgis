package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "land_abstract", schema = "public", catalog = "mgis")
public class LandAbstract {
    private Long id;
    private String index;
    private String location;
    private Boolean virtual;
    private Long cadnumId;
    private Long permitedUtilizationId;
    private Long statusId;
    private Long zoneId;
    private String fileLocation;
    private String fileNumber;
    private Timestamp gknSetDate;
    private String permuseByDoc;
    private Boolean surveyMark;
    private String pAddr;
    private String pArea;
    private String pCadnum;
    private String searchField;
    private Timestamp ctpUploadDate;
    private Long municipalityId;
    private Timestamp publicationDate;
    private Boolean publicationInfo;
    private String publicationNumber;
    private String ctxSearchField;
    private Double pLastCadcost;
    private String permuseFact;
    private String code;
    private Long categoryId;
    private Double areaByCoords;
    private Boolean hasGraphic;
    private Boolean hasRights;
    private Double pAreaD;
    private Double abIntersectArea;
    private Long permuseBydocTypicalId;
    private Double abIntersectDiff;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "index", nullable = true, length = 6)
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Basic
    @Column(name = "location", nullable = true, length = 4000)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "virtual", nullable = true)
    public Boolean getVirtual() {
        return virtual;
    }

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    @Basic
    @Column(name = "cadnum_id", nullable = true)
    public Long getCadnumId() {
        return cadnumId;
    }

    public void setCadnumId(Long cadnumId) {
        this.cadnumId = cadnumId;
    }

    @Basic
    @Column(name = "permited_utilization_id", nullable = true)
    public Long getPermitedUtilizationId() {
        return permitedUtilizationId;
    }

    public void setPermitedUtilizationId(Long permitedUtilizationId) {
        this.permitedUtilizationId = permitedUtilizationId;
    }

    @Basic
    @Column(name = "status_id", nullable = true)
    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "zone_id", nullable = true)
    public Long getZoneId() {
        return zoneId;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    @Basic
    @Column(name = "file_location", nullable = true, length = 1024)
    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Basic
    @Column(name = "file_number", nullable = true, length = 256)
    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    @Basic
    @Column(name = "gkn_set_date", nullable = true)
    public Timestamp getGknSetDate() {
        return gknSetDate;
    }

    public void setGknSetDate(Timestamp gknSetDate) {
        this.gknSetDate = gknSetDate;
    }

    @Basic
    @Column(name = "permuse_by_doc", nullable = true, length = 1024)
    public String getPermuseByDoc() {
        return permuseByDoc;
    }

    public void setPermuseByDoc(String permuseByDoc) {
        this.permuseByDoc = permuseByDoc;
    }

    @Basic
    @Column(name = "survey_mark", nullable = true)
    public Boolean getSurveyMark() {
        return surveyMark;
    }

    public void setSurveyMark(Boolean surveyMark) {
        this.surveyMark = surveyMark;
    }

    @Basic
    @Column(name = "p_addr", nullable = true, length = 512)
    public String getpAddr() {
        return pAddr;
    }

    public void setpAddr(String pAddr) {
        this.pAddr = pAddr;
    }

    @Basic
    @Column(name = "p_area", nullable = true, length = 512)
    public String getpArea() {
        return pArea;
    }

    public void setpArea(String pArea) {
        this.pArea = pArea;
    }

    @Basic
    @Column(name = "p_cadnum", nullable = true, length = 512)
    public String getpCadnum() {
        return pCadnum;
    }

    public void setpCadnum(String pCadnum) {
        this.pCadnum = pCadnum;
    }

    @Basic
    @Column(name = "search_field", nullable = true, length = 4000)
    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    @Basic
    @Column(name = "ctp_upload_date", nullable = true)
    public Timestamp getCtpUploadDate() {
        return ctpUploadDate;
    }

    public void setCtpUploadDate(Timestamp ctpUploadDate) {
        this.ctpUploadDate = ctpUploadDate;
    }

    @Basic
    @Column(name = "municipality_id", nullable = true)
    public Long getMunicipalityId() {
        return municipalityId;
    }

    public void setMunicipalityId(Long municipalityId) {
        this.municipalityId = municipalityId;
    }

    @Basic
    @Column(name = "publication_date", nullable = true)
    public Timestamp getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Timestamp publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Basic
    @Column(name = "publication_info", nullable = true)
    public Boolean getPublicationInfo() {
        return publicationInfo;
    }

    public void setPublicationInfo(Boolean publicationInfo) {
        this.publicationInfo = publicationInfo;
    }

    @Basic
    @Column(name = "publication_number", nullable = true, length = 64)
    public String getPublicationNumber() {
        return publicationNumber;
    }

    public void setPublicationNumber(String publicationNumber) {
        this.publicationNumber = publicationNumber;
    }

    @Basic
    @Column(name = "ctx_search_field", nullable = true, length = 64000)
    public String getCtxSearchField() {
        return ctxSearchField;
    }

    public void setCtxSearchField(String ctxSearchField) {
        this.ctxSearchField = ctxSearchField;
    }

    @Basic
    @Column(name = "p_last_cadcost", nullable = true, precision = 0)
    public Double getpLastCadcost() {
        return pLastCadcost;
    }

    public void setpLastCadcost(Double pLastCadcost) {
        this.pLastCadcost = pLastCadcost;
    }

    @Basic
    @Column(name = "permuse_fact", nullable = true, length = 1024)
    public String getPermuseFact() {
        return permuseFact;
    }

    public void setPermuseFact(String permuseFact) {
        this.permuseFact = permuseFact;
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
    @Column(name = "category_id", nullable = true)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "area_by_coords", nullable = true, precision = 0)
    public Double getAreaByCoords() {
        return areaByCoords;
    }

    public void setAreaByCoords(Double areaByCoords) {
        this.areaByCoords = areaByCoords;
    }

    @Basic
    @Column(name = "has_graphic", nullable = true)
    public Boolean getHasGraphic() {
        return hasGraphic;
    }

    public void setHasGraphic(Boolean hasGraphic) {
        this.hasGraphic = hasGraphic;
    }

    @Basic
    @Column(name = "has_rights", nullable = true)
    public Boolean getHasRights() {
        return hasRights;
    }

    public void setHasRights(Boolean hasRights) {
        this.hasRights = hasRights;
    }

    @Basic
    @Column(name = "p_area_d", nullable = true, precision = 0)
    public Double getpAreaD() {
        return pAreaD;
    }

    public void setpAreaD(Double pAreaD) {
        this.pAreaD = pAreaD;
    }

    @Basic
    @Column(name = "ab_intersect_area", nullable = true, precision = 0)
    public Double getAbIntersectArea() {
        return abIntersectArea;
    }

    public void setAbIntersectArea(Double abIntersectArea) {
        this.abIntersectArea = abIntersectArea;
    }

    @Basic
    @Column(name = "permuse_bydoc_typical_id", nullable = true)
    public Long getPermuseBydocTypicalId() {
        return permuseBydocTypicalId;
    }

    public void setPermuseBydocTypicalId(Long permuseBydocTypicalId) {
        this.permuseBydocTypicalId = permuseBydocTypicalId;
    }

    @Basic
    @Column(name = "ab_intersect_diff", nullable = true, precision = 0)
    public Double getAbIntersectDiff() {
        return abIntersectDiff;
    }

    public void setAbIntersectDiff(Double abIntersectDiff) {
        this.abIntersectDiff = abIntersectDiff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandAbstract that = (LandAbstract) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (index != null ? !index.equals(that.index) : that.index != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (virtual != null ? !virtual.equals(that.virtual) : that.virtual != null) return false;
        if (cadnumId != null ? !cadnumId.equals(that.cadnumId) : that.cadnumId != null) return false;
        if (permitedUtilizationId != null ? !permitedUtilizationId.equals(that.permitedUtilizationId) : that.permitedUtilizationId != null)
            return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (zoneId != null ? !zoneId.equals(that.zoneId) : that.zoneId != null) return false;
        if (fileLocation != null ? !fileLocation.equals(that.fileLocation) : that.fileLocation != null) return false;
        if (fileNumber != null ? !fileNumber.equals(that.fileNumber) : that.fileNumber != null) return false;
        if (gknSetDate != null ? !gknSetDate.equals(that.gknSetDate) : that.gknSetDate != null) return false;
        if (permuseByDoc != null ? !permuseByDoc.equals(that.permuseByDoc) : that.permuseByDoc != null) return false;
        if (surveyMark != null ? !surveyMark.equals(that.surveyMark) : that.surveyMark != null) return false;
        if (pAddr != null ? !pAddr.equals(that.pAddr) : that.pAddr != null) return false;
        if (pArea != null ? !pArea.equals(that.pArea) : that.pArea != null) return false;
        if (pCadnum != null ? !pCadnum.equals(that.pCadnum) : that.pCadnum != null) return false;
        if (searchField != null ? !searchField.equals(that.searchField) : that.searchField != null) return false;
        if (ctpUploadDate != null ? !ctpUploadDate.equals(that.ctpUploadDate) : that.ctpUploadDate != null)
            return false;
        if (municipalityId != null ? !municipalityId.equals(that.municipalityId) : that.municipalityId != null)
            return false;
        if (publicationDate != null ? !publicationDate.equals(that.publicationDate) : that.publicationDate != null)
            return false;
        if (publicationInfo != null ? !publicationInfo.equals(that.publicationInfo) : that.publicationInfo != null)
            return false;
        if (publicationNumber != null ? !publicationNumber.equals(that.publicationNumber) : that.publicationNumber != null)
            return false;
        if (ctxSearchField != null ? !ctxSearchField.equals(that.ctxSearchField) : that.ctxSearchField != null)
            return false;
        if (pLastCadcost != null ? !pLastCadcost.equals(that.pLastCadcost) : that.pLastCadcost != null) return false;
        if (permuseFact != null ? !permuseFact.equals(that.permuseFact) : that.permuseFact != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (areaByCoords != null ? !areaByCoords.equals(that.areaByCoords) : that.areaByCoords != null) return false;
        if (hasGraphic != null ? !hasGraphic.equals(that.hasGraphic) : that.hasGraphic != null) return false;
        if (hasRights != null ? !hasRights.equals(that.hasRights) : that.hasRights != null) return false;
        if (pAreaD != null ? !pAreaD.equals(that.pAreaD) : that.pAreaD != null) return false;
        if (abIntersectArea != null ? !abIntersectArea.equals(that.abIntersectArea) : that.abIntersectArea != null)
            return false;
        if (permuseBydocTypicalId != null ? !permuseBydocTypicalId.equals(that.permuseBydocTypicalId) : that.permuseBydocTypicalId != null)
            return false;
        if (abIntersectDiff != null ? !abIntersectDiff.equals(that.abIntersectDiff) : that.abIntersectDiff != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (index != null ? index.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (virtual != null ? virtual.hashCode() : 0);
        result = 31 * result + (cadnumId != null ? cadnumId.hashCode() : 0);
        result = 31 * result + (permitedUtilizationId != null ? permitedUtilizationId.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (zoneId != null ? zoneId.hashCode() : 0);
        result = 31 * result + (fileLocation != null ? fileLocation.hashCode() : 0);
        result = 31 * result + (fileNumber != null ? fileNumber.hashCode() : 0);
        result = 31 * result + (gknSetDate != null ? gknSetDate.hashCode() : 0);
        result = 31 * result + (permuseByDoc != null ? permuseByDoc.hashCode() : 0);
        result = 31 * result + (surveyMark != null ? surveyMark.hashCode() : 0);
        result = 31 * result + (pAddr != null ? pAddr.hashCode() : 0);
        result = 31 * result + (pArea != null ? pArea.hashCode() : 0);
        result = 31 * result + (pCadnum != null ? pCadnum.hashCode() : 0);
        result = 31 * result + (searchField != null ? searchField.hashCode() : 0);
        result = 31 * result + (ctpUploadDate != null ? ctpUploadDate.hashCode() : 0);
        result = 31 * result + (municipalityId != null ? municipalityId.hashCode() : 0);
        result = 31 * result + (publicationDate != null ? publicationDate.hashCode() : 0);
        result = 31 * result + (publicationInfo != null ? publicationInfo.hashCode() : 0);
        result = 31 * result + (publicationNumber != null ? publicationNumber.hashCode() : 0);
        result = 31 * result + (ctxSearchField != null ? ctxSearchField.hashCode() : 0);
        result = 31 * result + (pLastCadcost != null ? pLastCadcost.hashCode() : 0);
        result = 31 * result + (permuseFact != null ? permuseFact.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (areaByCoords != null ? areaByCoords.hashCode() : 0);
        result = 31 * result + (hasGraphic != null ? hasGraphic.hashCode() : 0);
        result = 31 * result + (hasRights != null ? hasRights.hashCode() : 0);
        result = 31 * result + (pAreaD != null ? pAreaD.hashCode() : 0);
        result = 31 * result + (abIntersectArea != null ? abIntersectArea.hashCode() : 0);
        result = 31 * result + (permuseBydocTypicalId != null ? permuseBydocTypicalId.hashCode() : 0);
        result = 31 * result + (abIntersectDiff != null ? abIntersectDiff.hashCode() : 0);
        return result;
    }
}
