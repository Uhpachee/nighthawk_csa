/* This is just the package from where the file is from */
package com.nighthawk.csa.abhijayfrqs;
/* This is the import that allows us to use a scanner */
import java.util.Scanner;
// The next import we will have is the random function for the CPU
import java.util.Random;

/* This is just the starting class for Rock Paper Scissors - Goes over the entire file */
public class RPS {

    public static int playerpoints = 0;
    public static int cpupoints = 0;
    public static int input;
    public int getInput() {return input;}
    public void setInput(int newInput) { this.input = newInput; }
    /* By making this public, we are allowing the entire file to be able to call this */
    /* static makes it a class related method and makes it so that the original can't change or be manipulated */
    /* void makes it so the main() method doesn't return anything */
    /* main is just kind of a word that we can use (we can name it anything) but we set it as main to state that it is the starting point */
    /* String[] args is sort of an array type but it can be named anything */
    /**public static void main(String[] args) {

        // We seperate this function from the rest so we can repeat the game over a few times
        /* We want the user to choose what they want, so we have to use a scanner class to get that input
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rounds; i++) {
            playGame(scanner);
        }


    }*/

    public int playGame() {

        //First we have our regular string that tells the player to choose one of those following options
        System.out.println("Choose Rock, Paper, or Scissors!: ");
        // we are now creating a new String variable which will take the user's input
        String playermove = "yes";

        //Now we are getting a random value from the computer so that we can fight it
        /* We have to include this new Random() thing so that we can create a new instance of a new "Random" class and you are essentially
        just giving that class the possibility of being a random variable */
        Random random = new Random();
        // This peice of coide allows us to use "nextInt" which essentially just chooses a number from our bound (starting at 0)
        int cpunumber = random.nextInt(3);

        // Giving the string of rock, paper, or scissors to the cpu
        // defining our string so that we can input a value into it
        String cpumove;
        // Now using this if statement we are just getting the random number we generated and correlating with the specific string
        if (cpunumber == 0) {
            cpumove = "paper";
        } else if (cpunumber == 1) {
            cpumove = "scissors";
        } else {
            cpumove = "rock";
        }
        //Now we are just printing out the cpu's result
        System.out.println("The CPU chose " + cpumove + "!");

        //This peice of code allows us to check if the player or the cpu won
        // The first condition is just checking if the strings are equal to each other
        if (playermove.equals(cpumove)) {
            System.out.println("Draw.");
        // The second conditions calls our function from before to check if the opponent lost or not
        } else if (playerwin(playermove, cpumove)) {
            System.out.print("You Won!");
            playerpoints++;
        } else {
            System.out.println("You Lost.");
            cpupoints++;
        }

        System.out.println("You have " + playerpoints + "points!");
        System.out.println("The CPU has " + cpupoints + "points!");

        //RPS.main(null);
        return cpunumber;
    }

    // Now we are going to be creating the function that checks if the cpu or the player wins
    // The whole point of this is to give us the conditions where the player wins the game
    // We want to do this because if we didn't then the else-if set would be way too long and there would be too many ifs
    // We also put this in a seperate place in our file because it is a whole function that is determine the value of a new variable
    static boolean playerwin(String playermove, String cpumove) {
        if (playermove.equals("rock")) {
            return cpumove.equals("scissors");
        } else if (playermove.equals("paper")) {
            return cpumove.equals("rock");
        } else {
            return cpumove.equals("paper");
        }

    }

}
