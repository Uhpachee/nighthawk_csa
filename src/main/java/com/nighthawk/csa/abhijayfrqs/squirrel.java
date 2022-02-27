package com.nighthawk.csa.abhijayfrqs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class squirrel {
    //Instance Variables
    Random num = new Random();
    int number = num.nextInt(33)+4;
    int index;

    // Now I am setting all my getters and setters
    public int getNumber() { return number; }
    public int getIndex() { return index; }
    public void setIndex(int newIndex) { this.index = newIndex; }

    public static void main(String[] args) {

        // Creating a new array called 'squirrels'
        ArrayList<squirrel> squirrels = new ArrayList<>();
        // Creating a new integer array list
        ArrayList<Integer> truee = new ArrayList<>();
        // Now I am setting a boolean called complete which is initally set as false
        boolean complete = false;

        // Now I create a for loop to make the 10 squirrels and add it my index
        for (int i = 0; i < 10; i++) {
            squirrel squirrely = new squirrel();
            squirrels.add(squirrely);
            squirrely.setIndex(i);

        }

        // Now we create a while loop until complete is true
        while (!complete) {
            // Within this, I need to create a for loop which will repeat 10 times
            for (int i = 0; i < 10; i++) {
                // I set an if statement here that recurses through all the squirrel numbers we generated up above
                // Essentially sorts through everything
                if (i != 0 && squirrels.get(i).getNumber() < squirrels.get(i - 1).getNumber()) {
                    Collections.swap(squirrels, i, i - 1);
                    truee.add(1);
                } else {
                    truee.add(0);
                }
            }

            // This peice of code allows us to run through all the values in the array once again
            /* If any number is ordered incorrectly, then it sets the complete to false and runs through
             the loop again */
            for (int i = 0; i < 10; i++) {
                if (truee.get(i) == 1) {
                    truee.clear();
                    complete = false;
                    break;
                }
                complete = true;
            }
        }

        // Now, we just print out the squirrel code every single time for each value in the index
        for (squirrel i : squirrels) {
            System.out.println("Squirrels: " + i.getNumber() + "... Day: " + i.getIndex());
        }

    }

}

