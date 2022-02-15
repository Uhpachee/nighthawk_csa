package shekarfrqs;
import java.util.ArrayList;
import java.util.Random;

public class squirrel {
    private static final String chickennumber = "0123456789";
    private static ArrayList<String> passList = new ArrayList<String>();
    String tempString = "";
    Integer listnumber = 0;

    public int randnum() {
        Random rand = new Random();
        int result = rand.nextInt(9);
        return result;
    }

    Random rand = new Random();
    int rand_int1 = rand.nextInt(37);


    public void passGen() {
        for (int i = 1; i < 8; i++) {
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

