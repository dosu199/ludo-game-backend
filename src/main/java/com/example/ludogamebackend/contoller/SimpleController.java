package com.example.ludogamebackend;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController implements ISimpleController {
    @Override
    public int[] getGameBoard(int range) {
        System.out.println("controller"); return new int[10];
    }
}
