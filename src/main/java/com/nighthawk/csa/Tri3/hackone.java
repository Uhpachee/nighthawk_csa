package com.nighthawk.csa.Tri3;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.*;

public class hackone {

    public static void menu() {
        int selection;
        Scanner scan = new Scanner(System.in);
        Hashtable<Integer, String> menulist = new Hashtable<>();
        menulist.put(1,"1: Hello");
        menulist.put(2,"2: Printy");
        menulist.put(3,"3: Loopy");
        menulist.put(4,"4: Classy Print");
        menulist.put(5,"5: Classy Poem");
        menulist.put(6,"6: Binary");
        menulist.put(7,"7: Termy");
        menulist.put(0,"0: Quit");

        while (true) {
            System.out.println("----------------------------------");
            for (int i = 0; i < 8; i++) {
                System.out.println(menulist.get(i));
            }
            System.out.println("----------------------------------");

            System.out.println("Select a thing.");
            selection = scan.nextInt();


            try {
                if (selection == 0) {
                    System.out.println("Quit");
                    break;
                }
                try {
                    String choice = menulist.get(selection);
                    System.out.println(choice);
                } catch (Exception e) {
                    System.out.println("Bad action, " + e);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                System.out.println("Bad argument");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Random error");
            }

        }
    }


    public static void main(String[] args) {
        menu();
    }
}
