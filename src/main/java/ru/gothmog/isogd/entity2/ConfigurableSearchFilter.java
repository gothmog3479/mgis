package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "configurable_search_filter", schema = "public", catalog = "mgis")
public class ConfigurableSearchFilter {
    private Long id;
    private String color;
    private String forclass;
    private String title;
    private Long imageId;
    private String groupName;
    private Boolean byDefualt;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "color", nullable = true, length = 255)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "forclass", nullable = false, length = 512)
    public String getForclass() {
        return forclass;
    }

    public void setForclass(String forclass) {
        this.forclass = forclass;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "image_id", nullable = true)
    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    @Basic
    @Column(name = "group_name", nullable = false, length = 512)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "by_defualt", nullable = true)
    public Boolean getByDefualt() {
        return byDefualt;
    }

    public void setByDefualt(Boolean byDefualt) {
        this.byDefualt = byDefualt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigurableSearchFilter that = (ConfigurableSearchFilter) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (forclass != null ? !forclass.equals(that.forclass) : that.forclass != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (imageId != null ? !imageId.equals(that.imageId) : that.imageId != null) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
        if (byDefualt != null ? !byDefualt.equals(that.byDefualt) : that.byDefualt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (forclass != null ? forclass.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (imageId != null ? imageId.hashCode() : 0);
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (byDefualt != null ? byDefualt.hashCode() : 0);
        return result;
    }
}
