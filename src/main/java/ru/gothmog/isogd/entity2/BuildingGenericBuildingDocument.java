package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "building_generic_building_document", schema = "public", catalog = "mgis")
public class BuildingGenericBuildingDocument {
    private Long buildingId;
    private Long documentId;

    @Basic
    @Column(name = "building_id", nullable = false)
    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    @Basic
    @Column(name = "document_id", nullable = false)
    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingGenericBuildingDocument that = (BuildingGenericBuildingDocument) o;

        if (buildingId != null ? !buildingId.equals(that.buildingId) : that.buildingId != null) return false;
        if (documentId != null ? !documentId.equals(that.documentId) : that.documentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = buildingId != null ? buildingId.hashCode() : 0;
        result = 31 * result + (documentId != null ? documentId.hashCode() : 0);
        return result;
    }
}
