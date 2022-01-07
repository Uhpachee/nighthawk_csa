package com.nighthawk.csa.controllers;
import java.util.Random;

public class CoinGame1

{

    private int startingCoins; // starting number of coins

    private int maxRounds; // maximum number of rounds played

    private int Player2Play=0;
    private int Player1Play=0;



    public CoinGame1(int s, int r)

    {

        startingCoins = s;

        maxRounds = r;

    }



    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.

     */

    public static int getPlayer1Move()

    {
        Random rand = new Random();
        int result = rand.nextInt(3) + 1;
        return result;
    }


    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).

     */

    public static int getPlayer2Move(int round)

    {
        int result;
        if (round%3 == 0)
            result = 3;

        else if (round%2 == 0)
            result = 2;
        else
            result =1;
        return result;
    }



    /** Plays a simulated game between two players, as described in part (b).

     */

    public void playGame()
    {
        int round =maxRounds;
        System.out.println("This is round "+round);
        int Player1total=startingCoins;
        int Player2total=startingCoins;
        while((maxRounds >= 0) && (Player1total>=3) && (Player2total>=3))
        {
            round--;
            Player2Play=CoinGame1.getPlayer2Move(round);
            Player1Play=CoinGame1.getPlayer1Move();
            System.out.println("Player 1 spent "+Player1Play);
            System.out.println("Player 2 spent "+Player2Play);
            Player1total=Player1total-Player1Play;
            Player2total=Player2total-Player2Play;
            if(Player2Play == Player1Play)
            {
                Player2total++;
            }

            else if(((Player2Play-Player1Play)==1) || ((Player1Play-Player2Play)==1))
            {
                Player2total++;
            }
            else
            {
                Player1total=Player1total+2;
            }
            System.out.println("Player 1 has "+Player1total+" coins left");
            System.out.println("Player 2 has "+Player2total+" coins left");
        }
        if(Player1total==Player2total)
        {
            System.out.println("Both players tied");
        }
        if(Player1total>Player2total)
        {
            System.out.println("Player1 won");
        }
        if(Player2total>Player1total)
        {
            System.out.println("Player2 won");
        }
    }
    public static void main(String[] args)
    {
        CoinGame1 n = new CoinGame1(10,20);
        n.playGame();
    }
}

