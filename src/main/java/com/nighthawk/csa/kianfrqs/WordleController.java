package com.nighthawk.csa.kianfrqs;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WordleController {
    static String rightWord = "";
    static String[][] printWord = new String[2][5];
    static String finalWord = "";

    @GetMapping("/wordlemenu")
    public String wordlemenu(Model model) {
        Wordle pickWord = new Wordle();
        model.addAttribute("pickWord", pickWord);
        return "wordlemenu";
    }

    @GetMapping("/wordle")
    public String wordle() {
        return "wordle";
    }

    @PostMapping("/wordlemenu")
    public String submitForm(@ModelAttribute("pickWord") Wordle pickWord, Model model) {
        rightWord = pickWord.selectWord(pickWord.getSelect(), pickWord.getInput());
        model.addAttribute("rightWord", rightWord);
        finalWord = "";
        return "wordle";
    }

    @PostMapping("/wordle")
    public String submitForm1(@ModelAttribute("pickWord") Wordle pickWord, Model model) {
        String result = "";
        printWord = pickWord.game(pickWord.getWord(),rightWord);
        finalWord += "" +
                "\n";
        for (int i = 0; i < 5; i++) {
            finalWord += printWord[0][i];
        }

        String value1 = printWord[0][0];
        String value2 = printWord[0][1];
        String value3 = printWord[0][2];
        String value4 = printWord[0][3];
        String value5 = printWord[0][4];
        String color1 = printWord[1][0];
        String color2 = printWord[1][1];
        String color3 = printWord[1][2];
        String color4 = printWord[1][3];
        String color5 = printWord[1][4];
        if (rightWord.equals(finalWord.substring(finalWord.length()-5))) {
            result = "You won!!!";
        }
        model.addAttribute("result", result);
        model.addAttribute("value1", value1);
        model.addAttribute( "color1",color1);
        model.addAttribute("value2", value2);
        model.addAttribute( "color2",color2);
        model.addAttribute("value3", value3);
        model.addAttribute( "color3",color3);
        model.addAttribute("value4", value4);
        model.addAttribute( "color4",color4);
        model.addAttribute("value5", value5);
        model.addAttribute( "color5",color5);
        model.addAttribute("finalWord", finalWord);
        return "wordle";
    }
}
