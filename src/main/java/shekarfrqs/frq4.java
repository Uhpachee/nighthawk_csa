package shekarfrqs;
import java.util.Random;

public class frq4 {
    private int startingCoins;
    private int maxRounds;

    public frq4(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }

    public int getPlayer1Move() {
        Random rand = new Random();
        int result = rand.nextInt(3) + 1;
        return result;
    }


    public int getPlayer2Move(int round) {
        if (round % 3 == 0) {
            return 3;
        } else if (round % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public void playGame() {
        int round;
        int p1coins = startingCoins;
        int p2coins = startingCoins;
        boolean earlyEnd = false;
        for (round = 1; round <= maxRounds; round += 1) {
            System.out.println("Round " + round);

            int p1spend = getPlayer1Move();
            int p2spend = getPlayer2Move(round);


            p1coins -= p1spend;
            p2coins -= p2spend;


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


            System.out.println("P1 coins: " + p1coins);
            System.out.println("P2 coins: " + p2coins);

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
