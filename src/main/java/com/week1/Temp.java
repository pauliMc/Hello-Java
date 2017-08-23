package com.week1;

/**
 * Created by bw1795cr on 8/23/2017.
 */
import static input.InputUtils.*;

public class Temp {


    public static void main(String[] args) {
        // Determine the current month, day, high and low temperature.
        String whatMonth = stringInput("What month is it?");
        int whatDay = intInput("What is today's day of the month?");
        double highTemp = doubleInput("What is the hight temperature for today?");
        double lowTemp = doubleInput("What is today's low temperature for today?");

        //Print a statement that states the month, day and the difference between high and low temperatures.
        System.out.println("On " + whatMonth + whatDay + ", the difference between the forecast high and low temperature is " highTemp - lowTemp " degrees.");

    }
}
