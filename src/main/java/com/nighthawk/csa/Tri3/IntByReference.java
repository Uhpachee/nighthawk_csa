package com.nighthawk.csa.Tri3;

public class IntByReference {
    int n0;

    public IntByReference(int n0) {
        this.n0 = n0;
    }


    // Hack: create IntByReference, swapToLowHighOrder and toString methods

    // static method that enables me to see numbers swapped by reference (before, after)
    public static void swapper(int n0, int n1) {
        IntByReference a = new IntByReference(n0);
        IntByReference b = new IntByReference(n1);
        System.out.println("Before: " + a.n0 + " " + b.n0);
        a.swapToLowHighOrder(b);  // conditionally build swap method to change values of a, b
        System.out.println("After: " + a.n0 + " " + b.n0);
        System.out.println();
    }

    public void swapToLowHighOrder(IntByReference b) {
        int finalString;

        if (n0 > b.n0) {
            finalString = b.n0;
            b.n0 = n0;
            n0 = finalString;
        }
    }

    // static main method that provides some simple test cases
    public static void main(String[] ags) {
        IntByReference.swapper(21, 16);
        IntByReference.swapper(16, 21);
        IntByReference.swapper(1231234,4324324);
        IntByReference.swapper(16, -1);
    }
}
