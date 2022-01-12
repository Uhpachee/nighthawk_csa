package com.nighthawk.csa.mvc.DataOps.genericDataModel;

import java.util.ArrayList;
import java.util.Random;

public class Password {
    private static final String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String b = "0123456789!@#$%^&*()";
    private static ArrayList<String> passList = new ArrayList<String>();

    public int passChar() {
        Random rand = new Random();
        int result = rand.nextInt(52);
        return result;
    }

    public int passNum() {
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

    public static void main(String[] args) {
        com.nighthawk.csa.kianfrqs.Password c = new com.nighthawk.csa.kianfrqs.Password();
        c.passGen();


    }

}
