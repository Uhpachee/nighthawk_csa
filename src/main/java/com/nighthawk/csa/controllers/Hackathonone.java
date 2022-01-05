package com.nighthawk.csa.controllers;

public class Hackathonone {
    public static void longeststreak(String str){
        int longestCount = 1;
        int currentCount =1;
        char currentChar;
        char longestChar='x';
        int beginningIndex=0;
        int finalIndex=0;
        for( int x =0; x<(str.length()-1); x++)
        {
            currentChar=str.charAt(x);
            if(currentChar == str.charAt(x+1))
            {
                currentCount++;
            }
            else
            {
                if(currentCount >= longestCount) {
                    longestChar = currentChar;
                    longestCount=currentCount;
                    currentCount = 1;
                    finalIndex=x;
                }
                else
                {
                }
            }

        }
        beginningIndex=finalIndex-longestCount+1;
        System.out.printf("%c %d\n", longestChar, longestCount);
        System.out.println(beginningIndex);
        System.out.println(finalIndex);

    }
    public static void main(String[] args)
    {
        Hackathonone c =new Hackathonone();
        c.longeststreak("CCAAAAATT!");
    }
}
