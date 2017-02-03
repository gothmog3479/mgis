package ru.gothmog.isogd.entity2;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class DynamicAttributesMetadataJoinPK implements Serializable {
    private Long metadataId;
    private Long attrId;

    @Column(name = "metadata_id", nullable = false)
    @Id
    public Long getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(Long metadataId) {
        this.metadataId = metadataId;
    }

    @Column(name = "attr_id", nullable = false)
    @Id
    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicAttributesMetadataJoinPK that = (DynamicAttributesMetadataJoinPK) o;

        if (metadataId != null ? !metadataId.equals(that.metadataId) : that.metadataId != null) return false;
        if (attrId != null ? !attrId.equals(that.attrId) : that.attrId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = metadataId != null ? metadataId.hashCode() : 0;
        result = 31 * result + (attrId != null ? attrId.hashCode() : 0);
        return result;
    }
}
