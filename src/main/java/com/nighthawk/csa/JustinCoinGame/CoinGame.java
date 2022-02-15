package com.nighthawk.csa.JustinCoinGame;

import java.util.Random;

public class CoinGame {
    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played

    public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }

    //Returns the number of coins (1, 2, or 3) that player 1 will spend.
    public int getPlayer1Move() {
        Random rand = new Random();
        int result = rand.nextInt(3) + 1;
        return result;
    }

    //Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).
    public int getPlayer2Move(int round) {
        if (round % 3 == 0) {
            return 3;
        } else if (round % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    //Plays a simulated game between two players, as described in part (b).
    public void playGame() {
        int round;
        int p1coins = startingCoins;
        int p2coins = startingCoins;
        boolean earlyEnd = false;
        for (round = 1; round <= maxRounds; round += 1) {
            System.out.println("Round " + round);


            //how much each player spends
            int p1spend = getPlayer1Move();
            int p2spend = getPlayer2Move(round);

            //spending the money
            p1coins -= p1spend;
            System.out.println("P1 spends: " + p1spend);
            p2coins -= p2spend;
            System.out.println("P2 spends: " + p2spend);

            //rewards based on differences in spending
            if (p1spend == p2spend) {
                p2coins += 1;
                System.out.println("P2 gains: 1");
            } else if (Math.abs(p1spend - p2spend) == 1) {
                p2coins += 1;
                System.out.println("P2 gains: 1");
            } else {
                p1coins += 2;
                System.out.println("P1 gains: 2");
            }

            //printing coins at end of round
            System.out.println("P1 coins: " + p1coins);
            System.out.println("P2 coins: " + p2coins);

            //ending game if less than 3
            if (p1coins < 3 | p2coins < 3) {
                if (p1coins > p2coins) {
                    System.out.println("player 1 wins.");
                } else if (p1coins == p2coins) {
                    System.out.println("tie game");
                } else if (p2coins > p1coins) {
                    System.out.println("player 2 wins.");
                }

                earlyEnd = true;
            }

        }
        if (earlyEnd == false) {
            if (p1coins > p2coins) {
                System.out.println("player 1 wins.");
            } else if (p1coins == p2coins) {
                System.out.println("tie game");
            } else if (p2coins > p1coins) {
                System.out.println("player 2 wins.");
            }
        }
    }
}
