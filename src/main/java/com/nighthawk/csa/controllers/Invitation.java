package com.nighthawk.csa.controllers;

public class Invitation {
    private static String hostName;
    private String address;
    private String city;
    private int age;

    public Invitation(String a, String b, String c, int d)
    {
        hostName = b;
        address = a;
        city = c;
        age = d;
    }

    public String getHostName()
    {
        return hostName;
    }

    public String getAddress()
    {
        return address;
    }

    public String getCity()
    {
        return city;
    }

    public int getAge()
    {
        return age;
    }


    public String setAddress(String ad)
    {
        address=ad;
        return address;
    }

    public String toString(String e)
    {
        return "Dear "+e+", please attend my event at "+address+". See you then, "+hostName+ ".";
    }
    public static void main(String[] args)
    {
        Invitation k = new Invitation("Darryl","1667 Downball Lane", "Toronto", 22);
        k.setAddress("1668 Upbrick Road");
        String s=k.toString("Cherl");
        System.out.println(s);
    }

}

