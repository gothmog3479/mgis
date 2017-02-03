package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Addresses {
    private Integer id;
    private String name;
    private Integer prefixId;
    private Long parentId;
    private Integer layer;
    private Integer detailsId;
    private String searchField;
    private Integer nameInt;
    private String oktmo;
    private String job;
    private String person;
    private String volumeRegnumPart;
    private String docNumPart;
    private String municipality;
    private Long okatoId;
    private Long municiplityId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "prefix_id", nullable = true)
    public Integer getPrefixId() {
        return prefixId;
    }

    public void setPrefixId(Integer prefixId) {
        this.prefixId = prefixId;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "layer", nullable = false)
    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    @Basic
    @Column(name = "details_id", nullable = true)
    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    @Basic
    @Column(name = "search_field", nullable = true, length = 2048)
    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    @Basic
    @Column(name = "name_int", nullable = true)
    public Integer getNameInt() {
        return nameInt;
    }

    public void setNameInt(Integer nameInt) {
        this.nameInt = nameInt;
    }

    @Basic
    @Column(name = "oktmo", nullable = true, length = 64)
    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }

    @Basic
    @Column(name = "job", nullable = true, length = 512)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "person", nullable = true, length = 255)
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Basic
    @Column(name = "volume_regnum_part", nullable = true, length = 64)
    public String getVolumeRegnumPart() {
        return volumeRegnumPart;
    }

    public void setVolumeRegnumPart(String volumeRegnumPart) {
        this.volumeRegnumPart = volumeRegnumPart;
    }

    @Basic
    @Column(name = "doc_num_part", nullable = true, length = 64)
    public String getDocNumPart() {
        return docNumPart;
    }

    public void setDocNumPart(String docNumPart) {
        this.docNumPart = docNumPart;
    }

    @Basic
    @Column(name = "municipality", nullable = true, length = 512)
    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    @Basic
    @Column(name = "okato_id", nullable = true)
    public Long getOkatoId() {
        return okatoId;
    }

    public void setOkatoId(Long okatoId) {
        this.okatoId = okatoId;
    }

    @Basic
    @Column(name = "municiplity_id", nullable = true)
    public Long getMuniciplityId() {
        return municiplityId;
    }

    public void setMuniciplityId(Long municiplityId) {
        this.municiplityId = municiplityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Addresses addresses = (Addresses) o;

        if (id != null ? !id.equals(addresses.id) : addresses.id != null) return false;
        if (name != null ? !name.equals(addresses.name) : addresses.name != null) return false;
        if (prefixId != null ? !prefixId.equals(addresses.prefixId) : addresses.prefixId != null) return false;
        if (parentId != null ? !parentId.equals(addresses.parentId) : addresses.parentId != null) return false;
        if (layer != null ? !layer.equals(addresses.layer) : addresses.layer != null) return false;
        if (detailsId != null ? !detailsId.equals(addresses.detailsId) : addresses.detailsId != null) return false;
        if (searchField != null ? !searchField.equals(addresses.searchField) : addresses.searchField != null)
            return false;
        if (nameInt != null ? !nameInt.equals(addresses.nameInt) : addresses.nameInt != null) return false;
        if (oktmo != null ? !oktmo.equals(addresses.oktmo) : addresses.oktmo != null) return false;
        if (job != null ? !job.equals(addresses.job) : addresses.job != null) return false;
        if (person != null ? !person.equals(addresses.person) : addresses.person != null) return false;
        if (volumeRegnumPart != null ? !volumeRegnumPart.equals(addresses.volumeRegnumPart) : addresses.volumeRegnumPart != null)
            return false;
        if (docNumPart != null ? !docNumPart.equals(addresses.docNumPart) : addresses.docNumPart != null) return false;
        if (municipality != null ? !municipality.equals(addresses.municipality) : addresses.municipality != null)
            return false;
        if (okatoId != null ? !okatoId.equals(addresses.okatoId) : addresses.okatoId != null) return false;
        if (municiplityId != null ? !municiplityId.equals(addresses.municiplityId) : addresses.municiplityId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (prefixId != null ? prefixId.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (layer != null ? layer.hashCode() : 0);
        result = 31 * result + (detailsId != null ? detailsId.hashCode() : 0);
        result = 31 * result + (searchField != null ? searchField.hashCode() : 0);
        result = 31 * result + (nameInt != null ? nameInt.hashCode() : 0);
        result = 31 * result + (oktmo != null ? oktmo.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (volumeRegnumPart != null ? volumeRegnumPart.hashCode() : 0);
        result = 31 * result + (docNumPart != null ? docNumPart.hashCode() : 0);
        result = 31 * result + (municipality != null ? municipality.hashCode() : 0);
        result = 31 * result + (okatoId != null ? okatoId.hashCode() : 0);
        result = 31 * result + (municiplityId != null ? municiplityId.hashCode() : 0);
        return result;
    }
}
