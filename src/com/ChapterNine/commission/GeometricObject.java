package com.ChapterNine.commission;

import java.util.Date;

public class GeometricObject {
    private String colour;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
    }

    public GeometricObject(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return String.format("%s %b %s", colour, filled, dateCreated);
    }
}