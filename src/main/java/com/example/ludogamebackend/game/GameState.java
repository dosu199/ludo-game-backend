package com.example.ludogamebackend.game;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Data
public class GameState {
    private int diceIncome;
    private ArrayList<Pawn> redPawns;
    private ArrayList<Pawn> bluePawns;
    private ArrayList<Pawn> greenPawns;
    private ArrayList<Pawn> yellowPawns;

    public GameState(ArrayList<Pawn> redPawns, ArrayList<Pawn> bluePawns, ArrayList<Pawn> greenPawns, ArrayList<Pawn> yellowPawns) {
        this.diceIncome = diceIncome;
        for(int i = 0; i < 4; i++) {
            redPawns.add(new Pawn("red", 0, "home"));
            bluePawns.add(new Pawn("blue", 0, "home"));
            greenPawns.add(new Pawn("green", 0, "home"));
            yellowPawns.add(new Pawn("yellow", 0, "home"));

        }
        this.redPawns = redPawns;
        this.bluePawns = bluePawns;
        this.greenPawns = greenPawns;
        this.yellowPawns = yellowPawns;
    }
}
