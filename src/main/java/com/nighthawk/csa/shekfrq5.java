package com.nighthawk.csa;

public class shekfrq5 {
    private static String hostName;
    private String address;
    private String name;
    private String age;

    public shekfrq5(String n, String a, String c, String d)
    {
        hostName = n;
        name = c;
        age = d;
    }

    public String getHostName() { return hostName; }
    public String getName() { return name; }
    public String getAge() { return age; }


    public String invite(String me)
    {
        return "Dear "+me+", please attend my event at "+address+". See you then, "+hostName+ ".";
    }


}

