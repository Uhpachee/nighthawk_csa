package JustinFRQs;
import java.util.Random;

public class CoinGame {

    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played
    private int p1Input;
    private int p1Coins;
    private int p2Coins;
    private boolean earlyEnd = false;
    private int round = 0;

    public int getStartingCoins() {return startingCoins;}
    public void setStartingCoins(int newStart) { this.startingCoins = newStart; }
    public int getMaxRounds() {return maxRounds;}
    public void setMaxRounds(int newRounds) { this.maxRounds = newRounds; }
    public int getP1Input() {return p1Input;}
    public void setP1Input(int newInput) { this.p1Input = newInput; }
    public int getP1Coins() {return p1Coins;}
    public void setP1Coins(int newCoins) { this.p1Coins = newCoins; }
    public int getP2Coins() {return p2Coins;}
    public void setP2Coins(int newCoins) { this.p2Coins = newCoins; }

    public CoinGame(int maxRounds, int startingCoins) {
        this.maxRounds = maxRounds;
        this.startingCoins = startingCoins;
        this.p1Coins = startingCoins;
        this.p2Coins = startingCoins;
    }
    /** Returns the number of coins (1, 2, or 3) that player 2 will spend.
     */
    public int getP2Input() {
        Random rand = new Random();
        int result = rand.nextInt(3) + 1;
        return result;
    }

    /** Plays a simulated game between two players, as described in part (b).
     */
    //part b
    public void playRound(int p1Input) {
        //new round
        round += 1;
        System.out.println("Round: " + this.round);

        //how much each player has/spends
        int p1spend = p1Input;
        System.out.println("P1 spends: " + p1spend);
        int p2spend = getP2Input();
        System.out.println("P2 spends: " + p2spend);

        //spending the money
        this.p1Coins -= p1spend;
        this.p2Coins -= p2spend;

        //rewards based on differences in spending
        if (p1spend == p2spend) {
            this.p2Coins += 1;
            System.out.println("P2 gains: 1");
        } else if (Math.abs(p1spend - p2spend) == 1) {
            this.p2Coins += 1;
            System.out.println("P2 gains: 1");
        } else {
            this.p1Coins += 2;
            System.out.println("P1 gains: 2");
        }

        System.out.println("P1 Coins: " + this.p1Coins);
        System.out.println("P2 Coins: " + this.p2Coins);
        System.out.println("End of round " + this.round);

    }

    public static void main(String[] args) {
        CoinGame game1 = new CoinGame(5, 10);
        game1.playRound(2);

    }
}

