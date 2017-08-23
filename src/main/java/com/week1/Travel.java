package com.week1;

/**
 * Created by bw1795cr on 8/23/2017.
 */
public class Travel {
    public static void main(String[] args) {
        //Ask for distance traveled, in miles

        double miles = doubleInput("How far do you travel to MCTC, in miles?");

        // Convert to KM

        double km = miles * 1.6;

        // Print the km in distance

        System.out.println("That's equivilent to " + km + "kilometers.");
    }
}
