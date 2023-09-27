package com.example.ludogamebackend.game;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class Dice {
    public static int roll() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(7 - 1) + 1;
    }
}
