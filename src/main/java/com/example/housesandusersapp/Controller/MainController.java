package com.example.housesandusersapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("")
    public String index() {
        return "Server is running ...";
    }

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }
}

