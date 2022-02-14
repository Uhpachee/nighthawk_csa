package com.nighthawk.csa.controllers;




public class LightSequence{

String sequence;

    public LightSequence(String seq)

    { sequence = seq;
    }



    /** Inserts the string segment in the current sequence,

     * starting at the index ind. Returns the new sequence.

     */

    public String insertSegment(String segment, int ind)

    {
        int x = ind;
        String st=segment;
        sequence = sequence.substring(0,x) + segment + sequence.substring(x, sequence.length());
        return sequence;
    }




    /** Updates the sequence to the value in seq

     */

    public void changeSequence(String seq)

    {
        sequence = seq;
    }



    /** Uses the current sequence to turn the light on and off

     * for the show

     */

    public String display()

    {
        return sequence;
    }

    public static void main(String[] args) {
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        String s = gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        String t = gradShow.display();
        String resultSeq = gradShow.insertSegment("1111 1111", 4);
        String n = gradShow.display();
        String segment = "11";
        String oldSeq = "1100000111";
        int index = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
        double a = 5.3;
        double b = 6.4;
        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Results: " + s + t + n + newSeq + c);
    }

}
