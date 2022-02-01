package com.nighthawk.csa.abhijayfrqs;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class aFRQ6p2 {
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
        String pattern = "###,###,###.##";
        DecimalFormat df = new DecimalFormat(pattern);
        df.setRoundingMode(RoundingMode.DOWN);
        String totals = "";
        for(int a : itemsSold) {
            double wage = fixedWage + a * perItemWage;
            if(computeBonusThreshold(a)) {
                wage = wage*1.1;
            }
            wages.add(wage);
            totals += "Wage " + itemsSold.indexOf(a) + ": $" + df.format(wage) + ", ";
        }


        return totals;
    }
    public static void main(String[] args) {
        aFRQ6p2 c = new aFRQ6p2();
        computeWages(10, 1.5);
        System.out.println("Wages:");
        for(double a : wages) {
            System.out.println(a);
        }
    }
}
