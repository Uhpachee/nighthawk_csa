package com.nighthawk.csa.abhijayfrqs;
import java.util.ArrayList;
import java.util.Random;

// Write a Class Number
public class squirrel {
    private String odd;
    private String even;

    // Creating a string called squirrels
    public ArrayList<String> squirrels;

    // Including the random number generator which picks our squirrel number from 3 to 36
    int randomNum = (int) (Math.random() * 33) + 3;

    // overloaded contructor
    public squirrel(String a, String b, int c) {
        // Storing the number into z
        odd = a;
        even = b;
        randomNum = c;
    }

    public squirrel() {
        squirrels = new ArrayList<>();
    }

    // Getter I think
    public ArrayList<String> getSquirrel() {
        return squirrels;
    }

    public void setSquirrels(ArrayList<String> newSquirrels) {
        this.squirrels = newSquirrels;
    }

    public static void main(String[] args) {
        String[] used = {"squirrel1", "squirrel2", "squirrel3", "squirrel4", "squirrel5", "squirrel6", "squirrel7", "squirrel8", "squirrel9", "squirrel10"};

        System.out.println("Original list" + used);

    }

}