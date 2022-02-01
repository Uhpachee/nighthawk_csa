package com.nighthawk.csa.abhijayfrqs;

import java.util.Scanner;

public class aClassActivity {
    private static String name;
    private static String address;
    private static String age;
    private static String location;

    public String getLocation() { return location; }
    public String getAddress() { return address; }
    public String getName() { return name; }
    public String getAge() { return age; }

    public void setLocation(String newLocation) { this.location = newLocation; }
    public void setAddress(String newAddress) { this.address = newAddress; }
    public void setName(String newName) { this.name = newName; }
    public void setAge(String newAge) { this.age = newAge; }

    public String drinkingAgeTester() {
        String legality;
        if(Integer.parseInt(age) >= 21) {
            legality = "You are legal!";
        }
        else {
            legality = "You are not legal!";
        }
        return legality;
    }

    public String barLocator(int place) {
        String bar;
        if(place == 1) {
            bar = "You chose the Authentic Irish Pub";
        }
        else if(place > 1 && place < 10){
            bar = "You chose the Languid Lounge";
        }
        else {
            bar = "You chose the Neon Nights";
        }
        return bar;
    }

    public void run(String name, String address, String age, String location) {
        System.out.println("Hello " + name + "! Your address is " + address + " and your age is " + age + "!");
        System.out.println(drinkingAgeTester());
        if(Integer.parseInt(age) >= 21) {
            System.out.println(barLocator(Integer.parseInt(location)));
        }
        else {
            System.out.println("You are not of legal age! Go drink at McDonalds!");
        }
    }
    public static void main(String[] args) {
        aClassActivity c = new aClassActivity();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter name");
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter address");
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter age (integer)");
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Enter location (integer)");

        name = myObj.nextLine();
        address = myObj1.nextLine();
        age = myObj2.nextLine();
        location = myObj3.nextLine();
        c.run(name, address, age, location);
        System.out.println("ClassActivity[name:" + name + ",address:" + address + ",age:" + age + ",location:" + location + "]");
    }
}
