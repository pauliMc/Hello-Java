package com.week1;

import static input.InputUtils.*;

/**
 * Input and output.
 */
public class Main {
    
    public static void main(String[] args) {
        
        double mms = doubleInput("How many M$Ms in a packet?");
        int people = intInput("How many people like to share?");
        
        String name = stringInput("Please enter your name?");
        System.out.println("Hello, " + name + "!");

        int students = intInput ("How many students?");
        System.out.println("There are " + students + " students in class.");

        double mmsEach = mms / people;

        System.out.printf("Each person will get " + mmsEach + "M&Ms each.");
        
    }
    
}
