package shekarfrqs;
import java.util.ArrayList;
import java.util.Arrays;

public class frq6 {
    private static ArrayList<String> words = new ArrayList<>( Arrays.asList( "fading", "post", "thunder", "hinge",  "batting"));

    public void printWords() {
        String answer;
        String result = "Words: ";
        for(String a : words) {
            if(a.substring(a.length() - 3, a.length()).equals("ing")) {
                result += ", " + a;
            }
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        frq6 c = new frq6();
        c.printWords();
    }
}
