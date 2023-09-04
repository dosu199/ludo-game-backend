package com.example.ludogamebackend.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/game")
public interface ISimpleController {
    @GetMapping()
    int[] getGameBoard();
}


