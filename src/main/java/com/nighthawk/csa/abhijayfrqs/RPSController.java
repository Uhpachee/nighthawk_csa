package com.nighthawk.csa.abhijayfrqs;
import com.nighthawk.csa.kianfrqs.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Scanner;

public class RPSController {

    @GetMapping("/RPS")
    public String RPS(Model model) {
        RPS data = new RPS();
        model.addAttribute("data", data);
        return "RPS";
    }

    @PostMapping("/RPS")
    public String submitForm(@ModelAttribute("data") RPS data, Model model) {
        System.out.println(data);
        //0 = rock, 1 = paper, 2 = scissors
        int cpu = data.playGame();
        int input = data.getInput();
        String result;
        if (cpu == 0 && input == 1) {
            result = "CPU chose rock, you chose paper. You win!";
        } else if (cpu == 0 && input == 2) {
            result = "CPU chose rock, you chose scissors. You lose!";
        } else if (cpu == 1 && input == 0) {
            result = "CPU chose paper, you chose rock. You lose!";
        } else if (cpu == 1 && input == 2) {
            result = "CPU chose paper, you chose scissors. You win!";
        } else if (cpu == 2 && input == 0) {
            result = "CPU chose scissors, you chose rock. You win!";
        } else if (cpu == 2 && input == 1) {
            result = "CPU chose scissors, you chose paper. You lose!";
        } else {
            result = "You tied!";
        }

        model.addAttribute("result", result);
        return "RPS";
    }

}
