package com.example.ludogamebackend.contoller;

import com.example.ludogamebackend.contoller.ISimpleController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController implements ISimpleController {
    @Override
    public int[] getGameBoard() {
        int[] gameBoard = new int[50];
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[i] = 0;
        }
         return gameBoard;
    }
}
