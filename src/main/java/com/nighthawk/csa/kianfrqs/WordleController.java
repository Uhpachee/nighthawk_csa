package com.nighthawk.csa.kianfrqs;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// First we have the main controller
public class WordleController {
    // We are creating 3 new variables called 'rightWord', 'printWord', and 'finalWord'
    static String rightWord = "";
    static String[][] printWord = new String[2][5];
    static String finalWord = "";

    // Also notice that there is GetMapping and PostMapping -- GetMapping gets our results and PostMapping is posting that value recieved
    // Now we start on the GetMapping of the menu which is also a new thing we are creating
    @GetMapping("/wordlemenu")
    // We are starting up a new String function which follows the Model variable
    public String wordlemenu(Model model) {
        // We are creating a new String called 'pickWord' using the Wordle file
        Wordle pickWord = new Wordle();
        // model.addAttribute's purpose is to add values in the Model which can identified globally
        // It looks like we are adding values for the variable we created above: 'pickWord'
        model.addAttribute("pickWord", pickWord);
        // Now we are returning function which basically just gets the pickWord ready
        return "wordlemenu";
    }

    // Now we are starting the wordle GetMapping
    @GetMapping("/wordle")
    // We are setting up the wordle String and returning "wordle"
    public String wordle() {
        return "wordle";
    }

    // Now we are starting the post process to send the values into the frontend
    @PostMapping("/wordlemenu")
    // The first thing we are doing is creating a new String called submitForm
    // We then call model we started up above and running the pickWord function
    // Then we set up the variables that we want to send data from which in this case is 'pickWord' and 'model'
    public String submitForm(@ModelAttribute("pickWord") Wordle pickWord, Model model) {
        // This peice of code calls the getters from the Wordle file and connects them to the pickWord function up above in line 22
        rightWord = pickWord.selectWord(pickWord.getSelect(), pickWord.getInput());
        // Now we set up another model which his rightWord which we defined back in line 12
        model.addAttribute("rightWord", rightWord);
        // we call back the finalWord variable we set back in line 14
        finalWord = "";
        // return wordle which is the other function that we created
        return "wordle";
    }

    // Now we start the post processing of the wordle function to send it into the frontend
    @PostMapping("/wordle")
    // now we set up a new String called submitForm1
    // This calls back the model we created for pickWord back in line 25 and use the variables of pickWord and model
    public String submitForm1(@ModelAttribute("pickWord") Wordle pickWord, Model model) {
        // Creating a new String called result
        String result = "";
        // We call back the String array printWord defined back in line 14
        // we are going through the game and getting the word back from the wordle file
        printWord = pickWord.game(pickWord.getWord(),rightWord);
        // We setting the finalWord as the inital space and just adding a break in between them
        finalWord += "" +
                "\n";

        // Now we are setting up a for loop and we are essentially just splitting a word defined in the wordle.java file
        // The reason we do this is because we need to set individual colors on each letter
        // then we are setting the finalWord to to addition of the printWord which is just each letter
        for (int i = 0; i < 5; i++) {
            finalWord += printWord[0][i];
        }

        // Literally this is just getting the letter from the word and storing it in each section of an array
        // This allows us to set a specific color in each letter
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

        // Here is the condition that checks if the user's word matches the word that was selected from the word bank
        if (rightWord.equals(finalWord.substring(finalWord.length()-5))) {
            result = "You won!!!";
        }
        // Now we are taking the result given by the player and checking if the letters match and setting the color like that
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
