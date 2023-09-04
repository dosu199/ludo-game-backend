package com.example.ludogamebackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/game")
public interface ISimpleController {
    @GetMapping("/gameBoard/{range}")
    int[] getGameBoard(@PathVariable int range);
}


