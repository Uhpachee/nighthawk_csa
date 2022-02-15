package com.nighthawk.csa.controllers;
import java.lang.Math;


import java.util.ArrayList;

// Write a Class Number
public class Number1 {
    private int random;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class

    public Number1() {
        random=(int)((Math.random()*33)+3);
    }
    public int getRand()
    {
        return random;
    }

    // It contains a getter for the Random Number


    // It contains a getter for Index, or the order it was initialized


    // Write a tester method
    public static void main(String[] args) {

        ArrayList<Number1> bob= new ArrayList<>();
        bob.add(new Number1());
        for(int x=1;x<20;x++)
        {
            bob.add(new Number1());
            if(bob.get(x).getRand()>bob.get(x-1).getRand())
            {
                bob.set((x-1), bob.get(x));
                bob.set(x, bob.get(x-1));
            }
        }


        for(int y=0;y<10;y++)
        {
            int z=bob.get(y).getRand();
            System.out.println("Squirrels:"+y+"Day:"+z);
        };



        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

    }

}
