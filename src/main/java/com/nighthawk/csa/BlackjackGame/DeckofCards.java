package com.nighthawk.csa.BlackjackGame;

public class DeckofCards
{
    public card [] cards;

    public DeckofCards()
    {
        cards= new card[52];
        cards[0] = new card("Clubs_A",1);
        cards[1] = new card("Clubs_2",2);
        cards[2] = new card("Clubs_3",3);
        cards[3] = new card("Clubs_4",4);
        cards[4] = new card("Clubs_5",5);
        cards[5] = new card("Clubs_6",6);
        cards[6] = new card("Clubs_7",7);
        cards[7] = new card("Clubs_8",8);
        cards[8] = new card("Clubs_9",9);
        cards[9] = new card("Clubs_10",10);
        cards[10] = new card("Clubs_J",10);
        cards[11] = new card("Clubs_Q",10);
        cards[12] = new card("Clubs_K",10);
        cards[13] = new card("Diamond_A",1);
        cards[14] = new card("Diamond_2",2);
        cards[15] = new card("Diamond_3",3);
        cards[16] = new card("Diamond_4",4);
        cards[17] = new card("Diamond_5",5);
        cards[18] = new card("Diamond_6",6);
        cards[19] = new card("Diamond_7",7);
        cards[20] = new card("Diamond_8",8);
        cards[21] = new card("Diamond_9",9);
        cards[22] = new card("Diamond_10",10);
        cards[23] = new card("Diamond_J",10);
        cards[24] = new card("Diamond_Q",10);
        cards[25] = new card("Diamond_K",10);
        cards[26] = new card("Spade_A",1);
        cards[27] = new card("Spade_2",2);
        cards[28] = new card("Spade_3",3);
        cards[29] = new card("Spade_4",4);
        cards[30] = new card("Spade_5",5);
        cards[31] = new card("Spade_6",6);
        cards[32] = new card("Spade_7",7);
        cards[33] = new card("Spade_8",8);
        cards[34] = new card("Spade_9",9);
        cards[35] = new card("Spade_10",10);
        cards[36] = new card("Spade_J",10);
        cards[37] = new card("Spade_Q",10);
        cards[38] = new card("Spade_K",10);
        cards[39] = new card("Hearts_A",1);
        cards[40] = new card("Hearts_2",2);
        cards[41] = new card("Hearts_3",3);
        cards[42] = new card("Hearts_4",4);
        cards[43] = new card("Hearts_5",5);
        cards[44] = new card("Hearts_6",6);
        cards[45] = new card("Hearts_7",7);
        cards[46] = new card("Hearts_8",8);
        cards[47] = new card("Hearts_9",9);
        cards[48] = new card("Hearts_10",10);
        cards[49] = new card("Hearts_J",10);
        cards[50] = new card("Hearts_Q",10);
        cards[51] = new card("Hearts_K",10);
    }
    public card deal()
    {
        int j=0;
        boolean found=false;
        while(found==false)
        {
            j=(int)Math.round(Math.random()*51);
            if(cards[j].played==false)
            {
                cards[j].played=true;
                found=true;
            }
        }

        return cards[j];
    }
}

