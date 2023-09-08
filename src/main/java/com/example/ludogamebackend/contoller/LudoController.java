package com.example.ludogamebackend.contoller;

import com.example.ludogamebackend.game.Pawn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class LudoController {

    @GetMapping("/game")
    public ArrayList<Pawn> getGameBoard() {
        ArrayList<Pawn> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add(new Pawn("blue", 0, "home"));
            list.add(new Pawn("yellow", i + 5, "main"));
            list.add(new Pawn("red", 0, "home"));
            list.add(new Pawn("green", 0, "home"));
        }

        return list;
    }
}
