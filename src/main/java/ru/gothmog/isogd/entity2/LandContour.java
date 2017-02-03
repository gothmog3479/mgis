package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_contour", schema = "public", catalog = "mgis")
public class LandContour {
    private Long id;
    private Integer title;
    private Long land;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false)
    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    @Basic
    @Column(name = "land", nullable = true)
    public Long getLand() {
        return land;
    }

    public void setLand(Long land) {
        this.land = land;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandContour that = (LandContour) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (land != null ? !land.equals(that.land) : that.land != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (land != null ? land.hashCode() : 0);
        return result;
    }
}
