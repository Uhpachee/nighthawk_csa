package com.nighthawk.csa.controllers;
import java.lang.Math;


import java.util.ArrayList;

// Write a Class Number
public class Number1 {
    private int random;
    static int countNumber;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class

    public Number1() {
        random=(int)((Math.random()*34)+3);
    }
    public int getRand()
    {
        return random;
    }
    public int getCount()
    {
        return countNumber;
    }

    // It contains a getter for the Random Number


    // It contains a getter for Index, or the order it was initialized


    // Write a tester method
    public static void main(String[] args) {

        ArrayList<Number1> bob= new ArrayList<>();
        Number1 Squirrel1=new Number1();
        Number1 Squirrel2=new Number1();
        Number1 Squirrel3=new Number1();
        Number1 Squirrel4=new Number1();
        Number1 Squirrel5=new Number1();
        Number1 Squirrel6=new Number1();
        Number1 Squirrel7=new Number1();
        Number1 Squirrel8=new Number1();
        Number1 Squirrel9=new Number1();
        Number1 Squirrel10=new Number1();
        Number1 seq[]={Squirrel1, Squirrel2, Squirrel3, Squirrel4, Squirrel5, Squirrel6,Squirrel7, Squirrel8, Squirrel9, Squirrel10};

        for(Number1 x: seq)
        {
            int j = 0;
            for (int i = 0; i < bob.size(); i++) {
                if (x.getRand() > bob.get(i).getRand()) {
                    j += 1;
                } else {
                    break;
                }
            }
            bob.add(j, x);
        }


        for(Number1 x: bob)
        {
            System.out.println("Squirrels:"+x.getCount()+" Day:"+x.getRand());
            countNumber++;
        }

        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

    }

}
