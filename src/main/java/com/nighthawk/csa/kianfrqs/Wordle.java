package com.nighthawk.csa.kianfrqs;
import java.util.*;
public class Wordle {
    String[] wordBank = {"finds","sword","array","worst","count","plied","drive","trees","syncs","candy","fraud","glock","pound"};
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
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
                System.out.println("INPUT NOT RIGHT LENGTH");
                wordRight = "guess";
            }
        }

        System.out.println(wordRight);
        return wordRight;
    }

    public boolean game(String word, String wordRight) {
        String[] string = new String[5];
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
                            //string = string.substring(0, i) + ANSI_GREEN + check + ANSI_RESET + string.substring(i + 1);
                           string[i] = ANSI_GREEN + check + ANSI_RESET;
                           break;
                        } else if (check == wordRight.charAt(j)) {
                            //string = string.substring(0, i) + ANSI_YELLOW + check + ANSI_RESET + string.substring(i + 1);
                            string[i] = ANSI_YELLOW + check + ANSI_RESET;
                        }
                }
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
        return win;
    }

    public boolean run(String right) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        return game(input,right);
    }

    public static void main(String[] args) {
        Wordle c = new Wordle();
        Scanner scan = new Scanner(System.in);
        System.out.println("Single or multiplayer? ");
        int select = scan.nextInt();
        System.out.println("Input word if multiplayer.");
        String input2 = scan.next();
        String right = c.selectWord(select,input2);
        System.out.println("Guess: ");
        for (int k = 0; k < 7; k++) {
            boolean win = c.run(right);
            if (win) {
                System.out.println("Do you want to play again?");
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
    }

}
