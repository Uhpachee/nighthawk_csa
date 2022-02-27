package com.nighthawk.csa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ABController {
    @GetMapping("/abhijay")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String abhijay() {
        return "abhijay";
    }

    @GetMapping("/aboutus")
    public String aboutus() { return "aboutus"; }

    @GetMapping("/kiantransition")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String kiantransition() {
        return "kiantransition";
    }

    @GetMapping("/kian")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String kian() {
        return "kian";
    }

    @GetMapping("/justin")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String justin() {
        return "justin";
    }
    @GetMapping("/rohan")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String rohan() {
        return "rohan";
    }
    @GetMapping("/shekar")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String shekar() {
        return "shekar"; }
    @GetMapping("/playgame")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String playgame() {
        return "playgame"; }

    @GetMapping("/ghibliapi")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String ghibliapi() {
        return "ghibliapi"; }

    @GetMapping("/coingame")
    public String coingame() { return "coingame"; }
}
