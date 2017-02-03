package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "dynamic_attributes_metadata_join", schema = "public", catalog = "mgis")
@IdClass(DynamicAttributesMetadataJoinPK.class)
public class DynamicAttributesMetadataJoin {
    private Long metadataId;
    private Long attrId;

    @Id
    @Column(name = "metadata_id", nullable = false)
    public Long getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(Long metadataId) {
        this.metadataId = metadataId;
    }

    @Id
    @Column(name = "attr_id", nullable = false)
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

        DynamicAttributesMetadataJoin that = (DynamicAttributesMetadataJoin) o;

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
