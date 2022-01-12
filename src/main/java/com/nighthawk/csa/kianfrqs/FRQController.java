package com.nighthawk.csa.kianfrqs;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FRQController {

    @GetMapping("/FRQ3")
    public String FRQ3(Model model) {
        Data data = new Data();
        model.addAttribute("data", data);

        return "FRQ3";
    }

    @PostMapping("/FRQ3")
    public String submitForm(@ModelAttribute("data") Data data) {
        System.out.println(data);
        return "FRQ3result";
    }
}
