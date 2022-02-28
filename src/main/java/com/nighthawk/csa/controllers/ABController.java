package com.nighthawk.csa.controllers;

import JustinFRQs.CoinGame;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

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

    public String coingame(Model model) {

        CoinGame game = new CoinGame();

        model.addAttribute("game", game);

        return "coingame";
    }

    @PostMapping("/coingame")

    public String submitForm(@ModelAttribute("game") CoinGame game, Model model) {
        ArrayList<Integer> data = game.playRound(game.getP1Input());
        int p1spend = data.get(0);
        int p2spend = data.get(1);
        int p1Coins = data.get(2);
        int p2Coins = data.get(3);
        int round = data.get(4);

        model.addAttribute("p1spend", p1spend);
        model.addAttribute("p2spend", p2spend);
        model.addAttribute("p1Coins", p1Coins);
        model.addAttribute("p2Coins", p2Coins);
        model.addAttribute("round", round);

        return "coingame";
    }
}
