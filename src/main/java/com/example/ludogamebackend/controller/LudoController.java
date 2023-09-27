package com.example.ludogamebackend.controller;

import com.example.ludogamebackend.game.Dice;
import com.example.ludogamebackend.game.GameState;
import com.example.ludogamebackend.game.Pawn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LudoController {

    private GameState gameState;
    private Dice dice;

    public LudoController(GameState gameState, Dice dice) {
        this.gameState = gameState;
        this.dice = dice;
    }

    @GetMapping("/rollDice")
    public GameState getGameBoard() {
    gameState.setDiceIncome(dice.roll());
        System.out.println(gameState.getDiceIncome());
        ArrayList<Pawn> redPawns = new ArrayList<Pawn>();

        System.out.println(gameState);
        ArrayList<Integer> pawns = new ArrayList<>();

        return gameState;
    }
}
