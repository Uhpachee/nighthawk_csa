package com.nighthawk.csa.data.DataOps.genericDataModel;
import com.nighthawk.csa.consoleUI.ConsoleMethods;

import java.util.ArrayList;
import java.util.Random;

public class Password extends Generics {

    public enum KeyType {title, password}
    public static Password.KeyType key = Password.KeyType.title;
    private static final int size = 16;
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
        int result = rand.nextInt(52);
        return result;
    }

    public static int passNum() {
        Random rand = new Random();
        int result = rand.nextInt(20);
        return result;
    }

    public void passGen() {
        String tempString = "";
        for (int i = 1; i < 11; i++) {
            for (int l = 1; l < 8; l++) {
                tempString += a.charAt(passChar());
                tempString += b.charAt(passNum());
            }
            passList.add(tempString);
            tempString = "";
        }
        for (int i = 0; i < passList.size(); i++){
            System.out.println(passList.get(i));
        }

    }

    public static String passGen1() {
        String tempString ="";
        for (int l = 1; l < 8; l++) {
            tempString += a.charAt(passChar());
            tempString += b.charAt(passNum());
        }
        return tempString;
    }

    public static Generics[] passwordData()
    {	Generics[] password = new Password[Password.size];
        for (int i = 0; i < Password.size; i++)
        {
            password[i] = new Password( (String)(passGen1()) );
        }
        return password;
    }

    public static void main(String[] args)
    {
        Generics[] passData = passwordData();
        for(Generics a : passData)
            ConsoleMethods.println("" + a);
    }

}
