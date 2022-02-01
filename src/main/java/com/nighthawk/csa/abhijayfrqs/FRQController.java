//controller

package com.nighthawk.csa.abhijayfrqs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FRQController {
    @GetMapping("/FRQ3")
    public String FRQ3(Model model) {
        Data data = new Data();
        model.addAttribute("data", data);
        System.out.println(data);
        return "abhijayFRQ3";
    }

    @PostMapping("/FRQ3")
    public String submitForm(@ModelAttribute("data") Data data, Model model) {
        System.out.println(data);
        String result = Data.run(data.getRsvp1(), data.getRsvp2(), data.getSelection1(), data.getSelection2());
        model.addAttribute("result", result);
        return "abhijayFRQ3result";
    }

    @GetMapping("/FRQ6")
    public String FRQ6(Model model) {
        FRQ6p2 fRQ6p2 = new FRQ6p2();
        model.addAttribute("fRQ6p2", fRQ6p2);
        return "abhijayFRQ6";
    }

    @PostMapping("/FRQ6")
    public String submitForm(@ModelAttribute("FRQ6p2") FRQ6p2 fRQ6p2, Model model) {
        String result = FRQ6p2.computeWages(fRQ6p2.getFixedWage(), fRQ6p2.getPerItemWage());
        model.addAttribute("result", result);
        return "abhijayFRQ6result";
    }

    /*@GetMapping("/passwordGenerator")
    public String passwordGenerator(Model model) {
        Password password = new Password();
        model.addAttribute("password", password);
        System.out.println(password);
        return "passwordGenerator";
    }

    @PostMapping("/passwordGenerator")
    public String submitForm(@ModelAttribute("password") Password password, Model model) {
        System.out.println(password);
        Generics[] result = Password.passwordData(password.getLength());
        for(Generics a : result)
            ConsoleMethods.println("" + a);
        model.addAttribute("result", result);
        return "passwordGenerated";
    }*/


}
