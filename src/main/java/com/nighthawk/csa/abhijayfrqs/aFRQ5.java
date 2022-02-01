package com.nighthawk.csa.abhijayfrqs;

public class aFRQ5 {
    private static String hostName;
    private String address;
    private String name;
    private String age;

    public aFRQ5(String n, String a, String c, String d)
        {
            hostName = n;
            address = a;
            name = c;
            age = d;
        }

    public String getHostName() { return hostName; }
    public String getAddress() { return address; }
    public String getName() { return name; }
    public String getAge() { return age; }


    public String setAddress(String ad)
    {
        address=ad;
        return address;
    }

    public String invite(String me)
    {
        return "Dear "+me+", please attend my event at "+address+". See you then, "+hostName+ ".";
    }


}
