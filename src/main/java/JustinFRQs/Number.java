package JustinFRQs;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Random;

public class Number {

    private int randomNumber;
    private static int totalCount = 0;
    private int index;

    public int getRandomNumber() {return randomNumber;}
    public int getIndex() {return index;}

    public Number() {
        Random rand = new Random();
        randomNumber = rand.nextInt(34) + 3;
        totalCount += 1;
        index = totalCount;
    }

    public static void main(String[] args) {
        ArrayList<Number> squirrels = new ArrayList<Number>();

        Number squirrel1 = new Number();
        Number squirrel2 = new Number();
        Number squirrel3 = new Number();
        Number squirrel4 = new Number();
        Number squirrel5 = new Number();
        Number squirrel6 = new Number();
        Number squirrel7 = new Number();
        Number squirrel8 = new Number();
        Number squirrel9 = new Number();
        Number squirrel10 = new Number();

        squirrels.add(squirrel1);

        Number[] unorderedSquirrels = {squirrel1, squirrel2, squirrel3, squirrel4, squirrel5, squirrel6, squirrel7, squirrel8, squirrel9, squirrel10};

        for (Number squirrel: unorderedSquirrels) {
            int i = 0;
            while (squirrel.getRandomNumber() < squirrels.get(i).getRandomNumber()) {
                if (i < squirrels.size() - 1) {
                    i += 1;
                }
            }
            squirrels.add(i, squirrel);
        }

        for (Number squirrel: squirrels) {
            System.out.println("Squirrels: " + squirrel.getRandomNumber() + " Day: " + squirrel.getIndex());
        }

    }

}