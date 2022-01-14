package com.nighthawk.csa.kianfrqs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FRQ6p2 {
    private double fixedWage;
    private double perItemWage;
    public double getFixedWage() { return fixedWage; }
    public void setFixedWage(double newFixedWage) { this.fixedWage = newFixedWage; }
    public double getPerItemWage() { return perItemWage; }
    public void setPerItemWage(double newPerItemWage) { this.perItemWage = newPerItemWage; }

    static private final ArrayList<Integer> itemsSold = new ArrayList<>( Arrays.asList(48,50,37,62,38,70,55,37,64,60));
    static List<Double> wages = new ArrayList<>();

    public static boolean computeBonusThreshold(int a)
    {
        return a > 51.75;
    }

    public static String computeWages(double fixedWage, double perItemWage)
    {
        String totals = "";
        for(int a : itemsSold) {
            double wage = fixedWage + a * perItemWage;
            if(computeBonusThreshold(a)) {
                wage = wage*1.1-0.00000000000001;
            }
            wages.add(wage);
            totals += "Wage " + itemsSold.indexOf(a) + ": " + String.valueOf(wage) + ", ";
        }


        return totals;
    }
    public static void main(String[] args) {
        FRQ6p2 c = new FRQ6p2();
        computeWages(10, 1.5);
        System.out.println("Wages:");
        for(double a : wages) {
            System.out.println(a);
        }
    }
}
