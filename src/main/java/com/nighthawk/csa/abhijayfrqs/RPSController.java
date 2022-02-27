package com.nighthawk.csa.abhijayfrqs;
import com.nighthawk.csa.kianfrqs.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class RPSController {

    @GetMapping("/RPS")
    public String RPS(Model model) {
        Data data = new Data();
        model.addAttribute("data", data);
        System.out.println(data);
        return "RPS";
    }

    @PostMapping("/RPS")
    public String submitForm(@ModelAttribute("data") Data data, Model model) {
        System.out.println(data);
        String result = Data.run(data.getRsvp1(), data.getRsvp2(), data.getSelection1(), data.getSelection2());
        model.addAttribute("result", result);
        return "RPSResult";
    }

}
