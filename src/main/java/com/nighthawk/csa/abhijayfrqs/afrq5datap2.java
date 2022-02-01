package com.nighthawk.csa.abhijayfrqs;
import com.nighthawk.csa.kianfrqs.FRQ5p2;

import java.util.Random;

public class afrq5datap2 {

    private static int passwordsGenerated = 0;
    private static Random random = new Random();
    private String prefix;
    private int length;

    public int getPasswordsGenerated() { return passwordsGenerated; }
    public Random getRandom() { return random; }
    public String getPrefix() { return prefix; }
    public int getLength() { return length; }

    public void setPasswordsGenerated(int newPasswordsGenerated) { this.passwordsGenerated = newPasswordsGenerated; }
    public void setRandom(Random newRandom) {
        this.random = newRandom;
    }
    public void setPrefix(String newPrefix) {
        this.prefix = newPrefix;
    }
    public void setLength(int newLength) {
        this.length = newLength;
    }


    public afrq5datap2(int length, String prefix) {
        this.prefix = prefix;
        this.length = length;
    }

    public afrq5datap2(int length) {
        this.prefix = "A";
        this.length = length;
    }

    public String pwGen(){
        String pwd= this.prefix+".";
        for(int i=1;i<=this.length;i++){
            pwd+=random.nextInt(10);
        }
        passwordsGenerated+=1;
        return pwd;
    }

    public int pwCount(){
        return passwordsGenerated;
    }

    public static void main(String[] args) {
        FRQ5p2 pw1 = new FRQ5p2(4,"chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        FRQ5p2 pw2 = new FRQ5p2(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(passwordsGenerated), random, prefix, length);
    }
}
