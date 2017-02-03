package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "land_part", schema = "public", catalog = "mgis")
public class LandPart {
    private Long id;
    private String title;
    private Long contourId;
    private Long landId;
    private String state;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "contour_id", nullable = true)
    public Long getContourId() {
        return contourId;
    }

    public void setContourId(Long contourId) {
        this.contourId = contourId;
    }

    @Basic
    @Column(name = "land_id", nullable = true)
    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 255)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LandPart landPart = (LandPart) o;

        if (id != null ? !id.equals(landPart.id) : landPart.id != null) return false;
        if (title != null ? !title.equals(landPart.title) : landPart.title != null) return false;
        if (contourId != null ? !contourId.equals(landPart.contourId) : landPart.contourId != null) return false;
        if (landId != null ? !landId.equals(landPart.landId) : landPart.landId != null) return false;
        if (state != null ? !state.equals(landPart.state) : landPart.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (contourId != null ? contourId.hashCode() : 0);
        result = 31 * result + (landId != null ? landId.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
