package ru.gothmog.isogd.entity2;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "isogd_documents", schema = "public", catalog = "mgis")
public class IsogdDocuments {
    private Integer id;
    private String name;
    private String number;
    private Date deliveryDate;
    private Date endDate;
    private String status;
    private Integer volumeId;
    private String normActNum;
    private Date prepDate;
    private String partType;
    private Integer typeId;
    private String shortDescr;
    private String nativeNumber;
    private Boolean izs;
    private Integer customerId;
    private Integer executorId;
    private Integer approvedId;
    private String accordingToDoc;
    private String viewForm;
    private String scale;
    private Integer gzoneId;
    private String normActName;
    private Date normActDate;
    private String buildingObject;
    private Long linkedLandDocId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "number", nullable = true, length = 50)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "delivery_date", nullable = true)
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "volume_id", nullable = false)
    public Integer getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(Integer volumeId) {
        this.volumeId = volumeId;
    }

    @Basic
    @Column(name = "norm_act_num", nullable = true, length = 50)
    public String getNormActNum() {
        return normActNum;
    }

    public void setNormActNum(String normActNum) {
        this.normActNum = normActNum;
    }

    @Basic
    @Column(name = "prep_date", nullable = true)
    public Date getPrepDate() {
        return prepDate;
    }

    public void setPrepDate(Date prepDate) {
        this.prepDate = prepDate;
    }

    @Basic
    @Column(name = "part_type", nullable = true, length = 50)
    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    @Basic
    @Column(name = "type_id", nullable = true)
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "short_descr", nullable = true, length = 1024)
    public String getShortDescr() {
        return shortDescr;
    }

    public void setShortDescr(String shortDescr) {
        this.shortDescr = shortDescr;
    }

    @Basic
    @Column(name = "native_number", nullable = true, length = 50)
    public String getNativeNumber() {
        return nativeNumber;
    }

    public void setNativeNumber(String nativeNumber) {
        this.nativeNumber = nativeNumber;
    }

    @Basic
    @Column(name = "izs", nullable = true)
    public Boolean getIzs() {
        return izs;
    }

    public void setIzs(Boolean izs) {
        this.izs = izs;
    }

    @Basic
    @Column(name = "customer_id", nullable = true)
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "executor_id", nullable = true)
    public Integer getExecutorId() {
        return executorId;
    }

    public void setExecutorId(Integer executorId) {
        this.executorId = executorId;
    }

    @Basic
    @Column(name = "approved_id", nullable = true)
    public Integer getApprovedId() {
        return approvedId;
    }

    public void setApprovedId(Integer approvedId) {
        this.approvedId = approvedId;
    }

    @Basic
    @Column(name = "according_to_doc", nullable = true, length = 1024)
    public String getAccordingToDoc() {
        return accordingToDoc;
    }

    public void setAccordingToDoc(String accordingToDoc) {
        this.accordingToDoc = accordingToDoc;
    }

    @Basic
    @Column(name = "view_form", nullable = true, length = 128)
    public String getViewForm() {
        return viewForm;
    }

    public void setViewForm(String viewForm) {
        this.viewForm = viewForm;
    }

    @Basic
    @Column(name = "scale", nullable = true, length = 64)
    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    @Basic
    @Column(name = "gzone_id", nullable = true)
    public Integer getGzoneId() {
        return gzoneId;
    }

    public void setGzoneId(Integer gzoneId) {
        this.gzoneId = gzoneId;
    }

    @Basic
    @Column(name = "norm_act_name", nullable = true, length = 1024)
    public String getNormActName() {
        return normActName;
    }

    public void setNormActName(String normActName) {
        this.normActName = normActName;
    }

    @Basic
    @Column(name = "norm_act_date", nullable = true)
    public Date getNormActDate() {
        return normActDate;
    }

    public void setNormActDate(Date normActDate) {
        this.normActDate = normActDate;
    }

    @Basic
    @Column(name = "building_object", nullable = true, length = 1024)
    public String getBuildingObject() {
        return buildingObject;
    }

    public void setBuildingObject(String buildingObject) {
        this.buildingObject = buildingObject;
    }

    @Basic
    @Column(name = "linked_land_doc_id", nullable = true)
    public Long getLinkedLandDocId() {
        return linkedLandDocId;
    }

    public void setLinkedLandDocId(Long linkedLandDocId) {
        this.linkedLandDocId = linkedLandDocId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IsogdDocuments that = (IsogdDocuments) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (deliveryDate != null ? !deliveryDate.equals(that.deliveryDate) : that.deliveryDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (volumeId != null ? !volumeId.equals(that.volumeId) : that.volumeId != null) return false;
        if (normActNum != null ? !normActNum.equals(that.normActNum) : that.normActNum != null) return false;
        if (prepDate != null ? !prepDate.equals(that.prepDate) : that.prepDate != null) return false;
        if (partType != null ? !partType.equals(that.partType) : that.partType != null) return false;
        if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;
        if (shortDescr != null ? !shortDescr.equals(that.shortDescr) : that.shortDescr != null) return false;
        if (nativeNumber != null ? !nativeNumber.equals(that.nativeNumber) : that.nativeNumber != null) return false;
        if (izs != null ? !izs.equals(that.izs) : that.izs != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (executorId != null ? !executorId.equals(that.executorId) : that.executorId != null) return false;
        if (approvedId != null ? !approvedId.equals(that.approvedId) : that.approvedId != null) return false;
        if (accordingToDoc != null ? !accordingToDoc.equals(that.accordingToDoc) : that.accordingToDoc != null)
            return false;
        if (viewForm != null ? !viewForm.equals(that.viewForm) : that.viewForm != null) return false;
        if (scale != null ? !scale.equals(that.scale) : that.scale != null) return false;
        if (gzoneId != null ? !gzoneId.equals(that.gzoneId) : that.gzoneId != null) return false;
        if (normActName != null ? !normActName.equals(that.normActName) : that.normActName != null) return false;
        if (normActDate != null ? !normActDate.equals(that.normActDate) : that.normActDate != null) return false;
        if (buildingObject != null ? !buildingObject.equals(that.buildingObject) : that.buildingObject != null)
            return false;
        if (linkedLandDocId != null ? !linkedLandDocId.equals(that.linkedLandDocId) : that.linkedLandDocId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (volumeId != null ? volumeId.hashCode() : 0);
        result = 31 * result + (normActNum != null ? normActNum.hashCode() : 0);
        result = 31 * result + (prepDate != null ? prepDate.hashCode() : 0);
        result = 31 * result + (partType != null ? partType.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (shortDescr != null ? shortDescr.hashCode() : 0);
        result = 31 * result + (nativeNumber != null ? nativeNumber.hashCode() : 0);
        result = 31 * result + (izs != null ? izs.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (executorId != null ? executorId.hashCode() : 0);
        result = 31 * result + (approvedId != null ? approvedId.hashCode() : 0);
        result = 31 * result + (accordingToDoc != null ? accordingToDoc.hashCode() : 0);
        result = 31 * result + (viewForm != null ? viewForm.hashCode() : 0);
        result = 31 * result + (scale != null ? scale.hashCode() : 0);
        result = 31 * result + (gzoneId != null ? gzoneId.hashCode() : 0);
        result = 31 * result + (normActName != null ? normActName.hashCode() : 0);
        result = 31 * result + (normActDate != null ? normActDate.hashCode() : 0);
        result = 31 * result + (buildingObject != null ? buildingObject.hashCode() : 0);
        result = 31 * result + (linkedLandDocId != null ? linkedLandDocId.hashCode() : 0);
        return result;
    }
}
