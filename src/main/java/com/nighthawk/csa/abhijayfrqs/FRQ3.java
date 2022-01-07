package com.nighthawk.csa.abhijayfrqs;

public class FRQ3 {
    private boolean rsvp;
    private int selection;
    private String option1;
    private String option2;
    private String finalString;

    public String FRQ3(boolean rsvp, int selection) {


        if (rsvp == true) {
            finalString = "Thank you for coming! Your drink will come by shortly!";
            if (selection == 3) {
                finalString = finalString.concat("water.");
            }
            else if (selection == 2) {
                finalString = finalString.concat("coke.");
            }
            else {
                finalString = finalString.concat("fanta.");
            }
        }
        else {
            finalString = "RIP. You can't come.";
        }
        return finalString;
    }
    public void run(boolean rsvp1, int selection1, boolean rsvp2, int selection2) {
        option1 = FRQ3(rsvp1, selection1);
        option2 = FRQ3(rsvp2,selection2);
        System.out.println("Person 1: " + option1);
        System.out.println("Person 2: " + option2);

        if (option1 == option2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        FRQ3 c = new FRQ3();
        c.run(true, 3, false, 2);
    }
}
