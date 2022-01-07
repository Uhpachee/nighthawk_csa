package com.nighthawk.csa.kianfrqs;

public class FRQ3 {
    private boolean rsvp;
    private int selection;
    private String option1;
    private String option2;
    private String finalString;

    public String FRQ3(boolean rsvp, int selection) {


        if (rsvp == true) {
            System.out.println("attending");
            finalString = "Thank you for attending! You will be served ";
            if (selection == 3) {
                System.out.println("pasta");
                finalString = finalString.concat("pasta.");
            }
            else if (selection == 2) {
                System.out.println("chicken");
                finalString = finalString.concat("chicken.");
            }
            else {
                System.out.println("beef");
                finalString = finalString.concat("beef.");
            }
        }
        else {
            System.out.println("not attending");
            finalString = "Sorry you can't make it";
        }
        return finalString;
    }
    public void run(boolean rsvp1, int selection1, boolean rsvp2, int selection2) {
        option1 = FRQ3(rsvp1, selection1);
        option2 = FRQ3(rsvp2,selection2);

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
