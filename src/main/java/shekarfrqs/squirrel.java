package shekarfrqs;
import java.util.ArrayList;
import java.util.Random;

public class squirrel {
    private static final String chickennumber = "0123456789";
    private static ArrayList<String> passList = new ArrayList<String>();
    String tempString = "";
    Integer listnumber = 0;

    public class Number {
        Random rand = new Random();
        int result = rand.nextInt(9);
    }

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


    Number[] unorderedSquirrels = {squirrel1, squirrel2, squirrel3, squirrel4, squirrel5, squirrel6, squirrel7, squirrel8, squirrel9, squirrel10};


    public int randnum() {
        Random rand = new Random();
        int result = rand.nextInt(9);
        return result;
    }

    Random rand = new Random();
    int rand_int1 = rand.nextInt(37);


    public void passGen() {
        for (int i = 1; i < 11; i++) {
            for (int l = 1; l < 3; l++) {
                tempString += chickennumber.charAt(randnum());

            }
            passList.add(tempString);
            tempString = "";

        }



        for (String list : passList) {
            for (int i = 1; i < 2; i++) {
                listnumber++;
                Random rand = new Random();
                int rand_int1 = rand.nextInt(37);
                System.out.println("chicken number " + listnumber + " equals " + rand_int1);

            }
        }
    }

    public static void main(String[] args) {
        squirrel c = new squirrel();
        c.passGen();


    }

}

