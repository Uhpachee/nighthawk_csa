package com.nighthawk.csa.kianfrqs;
import java.util.*;
public class Wordle {
    //defining array of possible words
    String[] wordBank = {"bongs","whine","grips","write","quota","faint","casts","blast","frick","pause","humor","flora","fauna","elect","moron","idiot","phone","flags","coats","state","books","towel","paper","house","crack","whiff","spicy","barge","longs","frisk","glint","finds","sword","array","worst","count","plied","drive","trees","syncs","candy","fraud","glock","pound"};

    //initializers, getters, setters
    private int select;
    private String input;
    private String word;
    public int getSelect() { return select; }
    public void setSelect(int newSelect) { this.select = newSelect; }
    public String getInput() { return input; }
    public void setInput(String newInput) { this.input = newInput; }
    public String getWord() { return word; }
    public void setWord(String newWord) { this.word = newWord; }

    //picks random word from word bank
    public String singleplayer() {
        Random rand = new Random();
        return wordBank[rand.nextInt(wordBank.length)];
    }

    //either selects random word or allows input of word
    public String selectWord(int selection, String input) {
        String wordRight;
        if (selection == 1) {
            wordRight = singleplayer();
            String blank = input;
        } else {
            if (input.length() < 6) {
                wordRight = input;
            } else {
                System.out.println("INPUT NOT RIGHT LENGTH! SETTING WORD TO GUESS!");
                wordRight = "guess";
            }
        }
        System.out.println(wordRight);
        return wordRight;
    }

    //main game function
    public String[][] game(String word, String wordRight) {
        //initializing variables and arrays
        String[] string = new String[5];
        String[] color = {"#ffffff","#ffffff","#ffffff","#ffffff","#ffffff"};
        //creates 2d array with 2 rows and 5 columns
        String[][] data = new String[2][5];
        String finalString = "";
        //converts inputted string into char array
        for (int i = 0; i < word.length(); i++) {
            string[i] = String.valueOf(word.charAt(i));
        }

        //main algorithm
        if (word.length() < 6) {
            //loops through inputted word for each char
            for (int i = 0; i < word.length(); i++) {
                //stores current character in variable
                char check = word.charAt(i);
                //loops through right word
                for (int j = 0; j < wordRight.length(); j++) {
                        //checks if the characters match and if they're in the same place in the word
                        if (i == j && check == wordRight.charAt(j)) {
                            //sets the corresponding color to green
                            color[i] = "#46e856";
                           break;
                           //checks if characters match
                        } else if (check == wordRight.charAt(j)) {
                            //sets corresponding color to yellow
                            color[i] = "#ebd249";
                        }
                }
            }
            //inputs string and color arrays into the 2d array
            for (int i = 0; i < 5; i++) {
                data[0][i] = string[i];
                data[1][i] = color[i];
            }
            for(String c : string) {
                finalString += c;
            }
            System.out.println(finalString);
        }
        //returns 2d array
        return data;
    }

    /*public String run(String input, String right) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        return game(input,right);
    }*/

    /*public static void main(String[] args) {
        Wordle c = new Wordle();
        Scanner scan = new Scanner(System.in);
        System.out.println("Single or multiplayer? (1 or 2)");
        int select = scan.nextInt();
        System.out.println("Input word if multiplayer. (If singleplayer just put whatever)");
        String input2 = scan.next();
        String right = c.selectWord(select,input2);
        System.out.println("Guess: ");
        for (int k = 0; k < 7; k++) {
            if (c.game(input2,right).equals("words")) {
                System.out.println("Do you want to play again? (yes/no)");
                String choice = scan.next();
                if (choice.equals("yes")) {
                    main(null);
                } else {
                    System.out.println("Oh, ok. Bye.");
                    System.exit(0);
                }
            }
        }
        System.out.println("You lost :( No more wordle for you!");
    }*/
}