package com.nighthawk.csa.Tri3;

import java.util.*;
public class randomOrder {

    public void test1() {
        List<Map<Integer, String>> items = new ArrayList<>();

        items.add(new HashMap<Integer, String>());
    }

    public static void test2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Budget:");
        scan.nextLine();
        Map<Integer, Map<String, Double>> items1 = new HashMap<>();
        Map<String, Double> CFA = new HashMap<>();
        Map<String, Double> McD = new HashMap<>();
        CFA.put("One Chicken Nugget",3.50);
        CFA.put("Two Chicken Nugget",7.00);
        CFA.put("Three Chicken Nugget",10.50);
        CFA.put("Milk Shake",4.00);
        CFA.put("Yummy",5.50);
        items1.put(0, CFA);
        items1.put(1, McD);
        //put key values into array, pick randomly from array to input in get
        System.out.println(items1.get(0).get("One Chicken Nugget"));
    }


    public static void main(String[] args) {
        test2();
    }
}
