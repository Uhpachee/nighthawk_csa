package shekarfrqs;
import java.util.ArrayList;
import java.util.Random;

public class frq2pass {
    private static final String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String b = "0123456789!@#$%^&*()";
    private static ArrayList<String> passList = new ArrayList<String>();

    public int passChar() {
        Random rand = new Random();
        int result = rand.nextInt(52);
        return result;
    }

    public int passNum() {
        Random rand = new Random();
        int result = rand.nextInt(20);
        return result;
    }

    public void passGen() {
        String tempString = "";
        for (int i = 1; i < 11; i++) {
            for (int l = 1; l < 8; l++) {
                tempString += a.charAt(passChar());
                tempString += b.charAt(passNum());
            }
            passList.add(tempString);
            tempString = "";
        }

        for (String s : passList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        frq2pass c = new frq2pass();
        c.passGen();


    }

}

