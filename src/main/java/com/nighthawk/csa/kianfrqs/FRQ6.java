package com.nighthawk.csa.kianfrqs;

import java.util.ArrayList;
import java.util.Arrays;

public class FRQ6 {
    private static ArrayList<String> words = new ArrayList<>( Arrays.asList("ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"));

    public void printWords() {
        String answer;
        String result = "Words: ";
        for(String a : words) {
            if(a.substring(a.length() - 3, a.length()).equals("ing")) {
                result += ", " + a;
            }
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        FRQ6 c = new FRQ6();
        c.printWords();
    }
}
