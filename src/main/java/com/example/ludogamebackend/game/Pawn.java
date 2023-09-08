package com.example.ludogamebackend.game;

public class Pawn {
    private String color;
    private Number position;
    private String road;

    public Pawn(String color, Number position, String road) {
        this.color = color;
        this.position = position;
        this.road = road;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Number getPosition() {
        return position;
    }

    public void setPosition(Number position) {
        this.position = position;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "color='" + color + '\'' +
                ", position=" + position +
                ", road='" + road + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pawn pawn = (Pawn) o;

        if (color != null ? !color.equals(pawn.color) : pawn.color != null) return false;
        if (position != null ? !position.equals(pawn.position) : pawn.position != null) return false;
        return road != null ? road.equals(pawn.road) : pawn.road == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (road != null ? road.hashCode() : 0);
        return result;
    }
}
