package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class RandomController {
    private final Random random = new Random();

    @GetMapping("/")
    public String getRandomNumber() {
        return String.valueOf(random.nextInt(1000));
    }
}
