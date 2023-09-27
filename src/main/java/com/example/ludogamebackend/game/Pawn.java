package com.example.ludogamebackend.game;

import lombok.Data;

@Data
public class Pawn {
    private String color;
    private Integer position;
    private String road;

    public Pawn(String color, Integer position, String road) {
        this.color = color;
        this.position = position;
        this.road = road;
    }
}
