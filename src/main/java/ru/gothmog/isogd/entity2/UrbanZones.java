package ru.gothmog.isogd.entity2;

import javax.persistence.*;

@Entity
@Table(name = "urban_zones", schema = "public", catalog = "mgis")
public class UrbanZones {
    private Integer id;
    private String name;
    private Integer signId;
    private Double minLandSquare;
    private Double maxLandSquare;
    private Double maxBuildingHeight;
    private Double minRedlineMargin;
    private Double maxPercentageOfBuildings;
    private Double minPlantsSquare;
    private Double maxBuildingLevels;
    private Double minSideMargin;
    private String searchField;
    private String roadway;
    private String conservationZone;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sign_id", nullable = true)
    public Integer getSignId() {
        return signId;
    }

    public void setSignId(Integer signId) {
        this.signId = signId;
    }

    @Basic
    @Column(name = "min_land_square", nullable = true, precision = 0)
    public Double getMinLandSquare() {
        return minLandSquare;
    }

    public void setMinLandSquare(Double minLandSquare) {
        this.minLandSquare = minLandSquare;
    }

    @Basic
    @Column(name = "max_land_square", nullable = true, precision = 0)
    public Double getMaxLandSquare() {
        return maxLandSquare;
    }

    public void setMaxLandSquare(Double maxLandSquare) {
        this.maxLandSquare = maxLandSquare;
    }

    @Basic
    @Column(name = "max_building_height", nullable = true, precision = 0)
    public Double getMaxBuildingHeight() {
        return maxBuildingHeight;
    }

    public void setMaxBuildingHeight(Double maxBuildingHeight) {
        this.maxBuildingHeight = maxBuildingHeight;
    }

    @Basic
    @Column(name = "min_redline_margin", nullable = true, precision = 0)
    public Double getMinRedlineMargin() {
        return minRedlineMargin;
    }

    public void setMinRedlineMargin(Double minRedlineMargin) {
        this.minRedlineMargin = minRedlineMargin;
    }

    @Basic
    @Column(name = "max_percentage_of_buildings", nullable = true, precision = 0)
    public Double getMaxPercentageOfBuildings() {
        return maxPercentageOfBuildings;
    }

    public void setMaxPercentageOfBuildings(Double maxPercentageOfBuildings) {
        this.maxPercentageOfBuildings = maxPercentageOfBuildings;
    }

    @Basic
    @Column(name = "min_plants_square", nullable = true, precision = 0)
    public Double getMinPlantsSquare() {
        return minPlantsSquare;
    }

    public void setMinPlantsSquare(Double minPlantsSquare) {
        this.minPlantsSquare = minPlantsSquare;
    }

    @Basic
    @Column(name = "max_building_levels", nullable = true, precision = 0)
    public Double getMaxBuildingLevels() {
        return maxBuildingLevels;
    }

    public void setMaxBuildingLevels(Double maxBuildingLevels) {
        this.maxBuildingLevels = maxBuildingLevels;
    }

    @Basic
    @Column(name = "min_side_margin", nullable = true, precision = 0)
    public Double getMinSideMargin() {
        return minSideMargin;
    }

    public void setMinSideMargin(Double minSideMargin) {
        this.minSideMargin = minSideMargin;
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
    @Column(name = "roadway", nullable = true, length = 1024)
    public String getRoadway() {
        return roadway;
    }

    public void setRoadway(String roadway) {
        this.roadway = roadway;
    }

    @Basic
    @Column(name = "conservation_zone", nullable = true, length = 1024)
    public String getConservationZone() {
        return conservationZone;
    }

    public void setConservationZone(String conservationZone) {
        this.conservationZone = conservationZone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UrbanZones that = (UrbanZones) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (signId != null ? !signId.equals(that.signId) : that.signId != null) return false;
        if (minLandSquare != null ? !minLandSquare.equals(that.minLandSquare) : that.minLandSquare != null)
            return false;
        if (maxLandSquare != null ? !maxLandSquare.equals(that.maxLandSquare) : that.maxLandSquare != null)
            return false;
        if (maxBuildingHeight != null ? !maxBuildingHeight.equals(that.maxBuildingHeight) : that.maxBuildingHeight != null)
            return false;
        if (minRedlineMargin != null ? !minRedlineMargin.equals(that.minRedlineMargin) : that.minRedlineMargin != null)
            return false;
        if (maxPercentageOfBuildings != null ? !maxPercentageOfBuildings.equals(that.maxPercentageOfBuildings) : that.maxPercentageOfBuildings != null)
            return false;
        if (minPlantsSquare != null ? !minPlantsSquare.equals(that.minPlantsSquare) : that.minPlantsSquare != null)
            return false;
        if (maxBuildingLevels != null ? !maxBuildingLevels.equals(that.maxBuildingLevels) : that.maxBuildingLevels != null)
            return false;
        if (minSideMargin != null ? !minSideMargin.equals(that.minSideMargin) : that.minSideMargin != null)
            return false;
        if (searchField != null ? !searchField.equals(that.searchField) : that.searchField != null) return false;
        if (roadway != null ? !roadway.equals(that.roadway) : that.roadway != null) return false;
        if (conservationZone != null ? !conservationZone.equals(that.conservationZone) : that.conservationZone != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (signId != null ? signId.hashCode() : 0);
        result = 31 * result + (minLandSquare != null ? minLandSquare.hashCode() : 0);
        result = 31 * result + (maxLandSquare != null ? maxLandSquare.hashCode() : 0);
        result = 31 * result + (maxBuildingHeight != null ? maxBuildingHeight.hashCode() : 0);
        result = 31 * result + (minRedlineMargin != null ? minRedlineMargin.hashCode() : 0);
        result = 31 * result + (maxPercentageOfBuildings != null ? maxPercentageOfBuildings.hashCode() : 0);
        result = 31 * result + (minPlantsSquare != null ? minPlantsSquare.hashCode() : 0);
        result = 31 * result + (maxBuildingLevels != null ? maxBuildingLevels.hashCode() : 0);
        result = 31 * result + (minSideMargin != null ? minSideMargin.hashCode() : 0);
        result = 31 * result + (searchField != null ? searchField.hashCode() : 0);
        result = 31 * result + (roadway != null ? roadway.hashCode() : 0);
        result = 31 * result + (conservationZone != null ? conservationZone.hashCode() : 0);
        return result;
    }
}
