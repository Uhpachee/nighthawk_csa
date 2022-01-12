package com.nighthawk.csa.kianfrqs;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

public class Controller {
    @GetMapping("/FRQ3")
    public String FRQ3(Model model) {
        frq3model Frq3model = new frq3model();
        model.addAttribute("Frq3model", Frq3model);
        return "FRQ3";
    }

    @PostMapping("/FRQ3")
    public String submitForm(@ModelAttribute("user") frq3model Frq3model) {
        System.out.println(Frq3model);
        return "FRQ3result";
    }
}
