package com.nighthawk.csa.kianfrqs;

import com.nighthawk.csa.kianfrqs.FRQ3;
import java.util.ArrayList;
import java.util.List;


public class frq3model {
    private static boolean rsvp1;
    private static boolean rsvp2;
    private static int selection1;
    private static int selection2;


    public boolean getRsvp1() { return rsvp1; }
    public boolean getRsvp2() { return rsvp2; }
    public int getSelection1() { return selection1; }
    public int getSelection2() { return selection2; }

    public void setRsvp1(boolean newRsvp1) { this.rsvp1 = newRsvp1; }
    public void setRsvp2(boolean newRsvp2) {
        this.rsvp2 = newRsvp2;
    }
    public void setSelection1(int newSelection1) {
        this.selection1 = newSelection1;
    }
    public void setSelection2(int newSelection2) {
        this.selection2 = newSelection2;
    }


    @Override
    public String toString() {
        return String.format(String.valueOf(rsvp1), rsvp2, selection1, selection2);
    }

    String result = FRQ3.run(rsvp1,selection1,rsvp2,selection2);

    public static void main(String[] args) {
        FRQ3 c = new FRQ3();
        c.run(rsvp1, selection1, rsvp2, selection2);
    }


}
