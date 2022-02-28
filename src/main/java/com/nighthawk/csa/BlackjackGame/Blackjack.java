package com.nighthawk.csa.BlackjackGame;

import java.util.Scanner;
public class Blackjack
{

    public static void main(String [] args)
    {

        int play=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Want to play BlackJack? Press 1 to play");
        play = input.nextInt();
        while(play==1)
        {
            playBlackJack();
            System.out.println("Want to play again? Press 1 to play");
            play = input.nextInt();
        }



    }
    public static void playBlackJack()
    {
        DeckofCards s1=new DeckofCards();
        player p1=new player();
        dealer d1=new dealer();
        card myCard;
        card hiddencard;
        boolean gameOn = true;
        myCard = s1.deal();
        if(myCard.value==1)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter 11 if you want your Ace to be eleven points");
            int j = input.nextInt();
            if(j==11)
            {
                p1.total_point1=p1.total_point1+10;
            }
        }
        System.out.println("First Player Card is "+ myCard.name + " value is: "+myCard.value);
        p1.total_point1+=myCard.value;
        myCard = s1.deal();
        if(myCard.value==1)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter 11 if you want your Ace to be eleven points");
            int j = input.nextInt();
            if(j==11)
            {
                p1.total_point1=p1.total_point1+10;
            }
        }
        System.out.println("Second Player Card is "+ myCard.name + " value is : "+myCard.value);
        p1.total_point1+=myCard.value;
        System.out.println("Player points: "+p1.total_point1);
        System.out.println("--------------------------------------------------");
        myCard = s1.deal();
        System.out.println("Dealer Card is "+ myCard.name + " 1value is : "+myCard.value);
        d1.total_point+=myCard.value;
        hiddencard = s1.deal();
        System.out.println("Dealer hidden Card taken");

        System.out.println("Player points: "+d1.total_point);
        System.out.println("--------------------------------------------------");
        Scanner input=new Scanner(System.in);
        System.out.println("Hey player.... hit or stay ? 1 for Hit ");
        p1.hit = input.nextInt();

        while( gameOn)
        {
            while (p1.hit==1)
            {
                myCard = s1.deal();
                if(myCard.value==1)
                {
                    System.out.println("Enter 11 if you want your Ace to be eleven points");
                    int j = input.nextInt();
                    if(j==11)
                    {
                        p1.total_point1=p1.total_point1+10;
                    }
                }
                System.out.println(" Player Card is "+ myCard.name + " value is : "+myCard.value);
                p1.total_point1+=myCard.value;
                System.out.println("Player points: "+p1.total_point1);
                System.out.println("--------------------------------------------------");
                if(p1.total_point1>=21)
                {
                    if(p1.total_point1==21)
                    {
                        System.out.println("YOU WIN............. Game over");
                    }
                    else
                    {
                        System.out.println("DEALER WINS.............Game over");
                    }
                    gameOn=false;
                    p1.hit=0;

                }
                else
                {
                    System.out.println("Hey player.... hit or stay ? 1 for Hit");
                    p1.hit = input.nextInt();
                }
            }
            if (gameOn == true)
            {
                System.out.println("Opened Dealer Hidden Card is "+ hiddencard.name + "value is: "+hiddencard.value);
                d1.total_point+=hiddencard.value;
                System.out.println("Dealer points: "+d1.total_point);
                System.out.println("--------------------------------------------------");
                while (p1.hit==0 && d1.total_point<=17)
                {


                    myCard = s1.deal();
                    System.out.println(" Dealer Card is "+ myCard.name + " value is: "+myCard.value);
                    d1.total_point+=myCard.value;
                    System.out.println("Dealer points: "+d1.total_point);
                    System.out.println("--------------------------------------------------");
                    if(d1.total_point>=21)
                    {
                        if(d1.total_point==21)
                        {
                            System.out.println("DEALER WINS............. Game over");
                        }
                        else
                        {
                            System.out.println("YOU WIN.............Game over");
                        }
                        gameOn=false;
                        p1.hit=1;
                    }


                }

                if (gameOn == true)
                {
                    if (d1.total_point>=p1.total_point1)
                    {
                        System.out.println("DEALER WINS............. Game over");
                    }
                    else
                    {
                        System.out.println("YOU WIN............. Game over");
                    }
                }

                gameOn=false;


            }
        }



    }
}