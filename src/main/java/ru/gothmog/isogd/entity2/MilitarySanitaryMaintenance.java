package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "military_sanitary_maintenance", schema = "public", catalog = "mgis")
public class MilitarySanitaryMaintenance {
    private Long id;
    private Double areaCleanedInterior;
    private Double areaCleanedNeighborhoods;
    private Double areaNeighborhood;
    private Double areaNeighborhoodWithImprovedSurface;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "area_cleaned_interior", nullable = true, precision = 0)
    public Double getAreaCleanedInterior() {
        return areaCleanedInterior;
    }

    public void setAreaCleanedInterior(Double areaCleanedInterior) {
        this.areaCleanedInterior = areaCleanedInterior;
    }

    @Basic
    @Column(name = "area_cleaned_neighborhoods", nullable = true, precision = 0)
    public Double getAreaCleanedNeighborhoods() {
        return areaCleanedNeighborhoods;
    }

    public void setAreaCleanedNeighborhoods(Double areaCleanedNeighborhoods) {
        this.areaCleanedNeighborhoods = areaCleanedNeighborhoods;
    }

    @Basic
    @Column(name = "area_neighborhood", nullable = true, precision = 0)
    public Double getAreaNeighborhood() {
        return areaNeighborhood;
    }

    public void setAreaNeighborhood(Double areaNeighborhood) {
        this.areaNeighborhood = areaNeighborhood;
    }

    @Basic
    @Column(name = "area_neighborhood_with_improved_surface", nullable = true, precision = 0)
    public Double getAreaNeighborhoodWithImprovedSurface() {
        return areaNeighborhoodWithImprovedSurface;
    }

    public void setAreaNeighborhoodWithImprovedSurface(Double areaNeighborhoodWithImprovedSurface) {
        this.areaNeighborhoodWithImprovedSurface = areaNeighborhoodWithImprovedSurface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitarySanitaryMaintenance that = (MilitarySanitaryMaintenance) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (areaCleanedInterior != null ? !areaCleanedInterior.equals(that.areaCleanedInterior) : that.areaCleanedInterior != null)
            return false;
        if (areaCleanedNeighborhoods != null ? !areaCleanedNeighborhoods.equals(that.areaCleanedNeighborhoods) : that.areaCleanedNeighborhoods != null)
            return false;
        if (areaNeighborhood != null ? !areaNeighborhood.equals(that.areaNeighborhood) : that.areaNeighborhood != null)
            return false;
        if (areaNeighborhoodWithImprovedSurface != null ? !areaNeighborhoodWithImprovedSurface.equals(that.areaNeighborhoodWithImprovedSurface) : that.areaNeighborhoodWithImprovedSurface != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (areaCleanedInterior != null ? areaCleanedInterior.hashCode() : 0);
        result = 31 * result + (areaCleanedNeighborhoods != null ? areaCleanedNeighborhoods.hashCode() : 0);
        result = 31 * result + (areaNeighborhood != null ? areaNeighborhood.hashCode() : 0);
        result = 31 * result + (areaNeighborhoodWithImprovedSurface != null ? areaNeighborhoodWithImprovedSurface.hashCode() : 0);
        return result;
    }
}
