package com.nighthawk.csa.kianfrqs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
    // Write a Class Number
    public class Number {
        // instance variables
        Random rand = new Random();
        int random = rand.nextInt(33)+4;
        int index;

        // Number has a zero Argument constructor
        // It initializes a random number between 3 and 36, ie the number of squirrels in class

        public Number() {
            //int random = this.random;
        }
        public int getRandom() { return random; }
        public int getIndex() { return index; }
        public void setIndex(int newIndex) { this.index = newIndex; }
        // It contains a getter for the Random Number


        // It contains a getter for Index, or the order it was initialized


        // Write a tester method
        public static void main(String[] args) {
            ArrayList<Number> squirrels = new ArrayList<>();
            ArrayList<Integer> yes = new ArrayList<>();
            boolean finish = false;
            for (int i = 0; i < 10; i++) {
                Number squirrel = new Number();
                squirrels.add(squirrel);
                squirrel.setIndex(i);
            }
            while (!finish) {
                for (int i = 0; i < 10; i++) {
                    if (i != 0 && squirrels.get(i).getRandom() < squirrels.get(i - 1).getRandom()) {
                        //System.out.println("Swapping" + squirrels.get(i).getRandom() + " with " + squirrels.get(i-1).getRandom());
                        Collections.swap(squirrels, i, i - 1);
                        yes.add(1);
                        //System.out.println("Swap!");
                    } else {
                        yes.add(0);
                    }
                }

                for (int i = 0; i < 10; i++) {
                    if (yes.get(i) == 1) {
                        //System.out.println("Still swapping!");
                        yes.clear();
                        finish = false;
                        break;
                    }
                    finish = true;
                }
            }

            for (Number i : squirrels) {
                System.out.println("Squirrels: " + i.getRandom() + "... Day: " + i.getIndex());
            }
            // Initialize 10 squirrels of class type Number
            // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops


            // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

        }

    }

