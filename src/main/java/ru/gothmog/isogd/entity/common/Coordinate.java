package ru.gothmog.isogd.entity.common;

import ru.gothmog.isogd.model.RegistryItem;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Coordinate implements RegistryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coord_index", nullable = false)
    private Integer index;

    @Column
    private Double x;

    @Column
    private Double y;

    @Column
    private Double delta;

    public Coordinate() {
    }

    public Coordinate(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(String xy, boolean xyDirection) {
        xy = xy.replace("\t", " ");
        if (!xy.trim().equals("")) {
            String[] coordsRaw = xy.split(" ");
            String[] coords = new String[2];
            int j = 0;

            for (int i = 0; i < coordsRaw.length; ++i) {
                if (coordsRaw[i].trim().length() > 0) {
                    coords[j] = coordsRaw[i];
                    ++j;
                    if (j > 1) {
                        break;
                    }
                }
            }

            if (xyDirection) {
                this.x = new Double(coords[0].trim().replace(",", "."));
                this.y = new Double(coords[1].trim().replace(",", "."));
            } else {
                this.x = new Double(coords[1].trim().replace(",", "."));
                this.y = new Double(coords[0].trim().replace(",", "."));
            }

        }
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double delta) {
        this.delta = delta;
    }

    public boolean equals(Object obj) {
        return super.equals(obj) || obj != null && obj instanceof Coordinate && this.id != null && ((Coordinate) obj).getId() != null && ((Coordinate) obj).getId().equals(this.id);
    }

    public Boolean getIsSeparator() {
        return this.getX() == null && this.getY() == null ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }

    @Override
    public String getTitle() {
        return null;
    }
}
