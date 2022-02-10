package com.nighthawk.csa.kianfrqs;
import java.util.*;
public class Wordle {
    String[] wordBank = {"faint","casts","blast","frick","pause","humor","flora","fauna","elect","moron","idiot","phone","flags","coats","state","books","towel","paper","house","crack","whiff","spicy","barge","longs","frisk","glint","finds","sword","array","worst","count","plied","drive","trees","syncs","candy","fraud","glock","pound"};
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    private int select;
    private String input;
    private String word;
    public int getSelect() { return select; }
    public void setSelect(int newSelect) { this.select = newSelect; }
    public String getInput() { return input; }
    public void setInput(String newInput) { this.input = newInput; }
    public String getWord() { return word; }
    public void setWord(String newWord) { this.word = newWord; }

    public String singleplayer() {
        Random rand = new Random();
        return wordBank[rand.nextInt(wordBank.length)];
    }

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

    public String[][] game(String word, String wordRight) {
        String[] string = new String[5];
        String[] color = {"#ffffff","#ffffff","#ffffff","#ffffff","#ffffff"};
        String[][] data = new String[2][5];
        String finalString = "";
        for (int i = 0; i < word.length(); i++) {
            string[i] = String.valueOf(word.charAt(i));
        }
        boolean win = false;
        if (word.length() < 6) {
            for (int i = 0; i < word.length(); i++) {
                char check = word.charAt(i);

                for (int j = 0; j < wordRight.length(); j++) {
                        if (i == j && check == wordRight.charAt(j)) {
                            color[i] = "#46e856";
                           break;
                        } else if (check == wordRight.charAt(j)) {
                            color[i] = "#ebd249";
                        }
                }
            }
            for (int i = 0; i < 5; i++) {
                data[0][i] = string[i];
                data[1][i] = color[i];
            }
            for(String c : string) {
                finalString += c;
            }
            System.out.println(finalString);
            if (word.equals(wordRight)) {
                System.out.println("You win!!!");
                win = true;
            }
        }
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