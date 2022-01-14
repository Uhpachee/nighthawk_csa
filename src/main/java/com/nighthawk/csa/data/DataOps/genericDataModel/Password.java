package com.nighthawk.csa.data.DataOps.genericDataModel;
import com.nighthawk.csa.consoleUI.ConsoleMethods;

import java.util.ArrayList;
import java.util.Random;

public class Password extends Generics {
    private static int length;
    public int getLength() { return length; }
    public void setLength(int newLength) { this.length = newLength; }

    public enum KeyType {title, password}
    public static Password.KeyType key = Password.KeyType.title;
    private static final int number = 10;
    private final String password;

    public Password(String l)
    {
        this.setType("Password");
        this.password = l;
    }

    @Override
    public String toString()
    {

        String output="";
        switch(key) {
            case password:
                output += this.password;
                break;
            case title:
            default:
                output += super.getType() + ": " + this.password;
        }
        return output;
    }

    private static final String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String b = "0123456789!@#$%^&*()";
    private static ArrayList<String> passList = new ArrayList<String>();

    public static int passChar() {
        Random rand = new Random();
        int result = rand.nextInt(a.length());
        return result;
    }

    public static int passNum() {
        Random rand = new Random();
        int result = rand.nextInt(b.length());
        return result;
    }

    public static String passGen(/*int length*/) {
        String tempString ="";

        for (int l = 1; l < 16/*length*/; l++) {
            Random rand = new Random();
            int pick = rand.nextInt(10);
            if(pick >= 4) {
                tempString += a.charAt(passChar());
            }
            else {
                tempString += b.charAt(passNum());
            }
        }
        return tempString;
    }

    public static Generics[] passwordData(/*int length*/)
    {	Generics[] password = new Password[Password.number];
        for (int i = 0; i < Password.number; i++)
        {
            password[i] = new Password( (String)(passGen(/*length*/)) );
        }
        return password;
    }

    public static void main(String[] args)
    {
        Generics[] passData = passwordData(/*length*/);
        for(Generics a : passData)
            ConsoleMethods.println("" + a);
    }

}
