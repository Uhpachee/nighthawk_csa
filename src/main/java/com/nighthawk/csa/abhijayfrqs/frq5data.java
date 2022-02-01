package com.nighthawk.csa.abhijayfrqs;

public class frq5data {

    // This is the stuff that defines all the information
    private static String hostName;
    private String address;
    private String name;
    private String age;

    public String getHostName() { return hostName; }
    public String getAddress() { return address; }
    public String getName() { return name; }
    public String getAge() { return age; }

    public void setHostName(String newHostName) { this.hostName = newHostName; }
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(String newAge) {
        this.age = newAge;
    }


    // Here we start to run that actual program and finish FRQ 5
    public frq5data(String n, String a, String c, String d)
    {
        hostName = n;
        address = a;
        name = c;
        age = d;
    }

    public String inputAddress(String ad)
    {
        address=ad;
        return address;
    }

    public String invite(String me)
    {
        return "Dear "+me+", please attend my event at "+address+". See you then, "+hostName+ ".";
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(hostName), address, name, age);
    }
}