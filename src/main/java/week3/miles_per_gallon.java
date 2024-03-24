package week3;

import static input.InputUtils.doubleInput;

public class miles_per_gallon {
    public static void main(String[] args) {

        // ask the user how many mile they drive and how many gallon they used to drive

        double miles = doubleInput("how many mile you drive?");
        double gas = doubleInput("how many gallon of gas you use to drive " + miles + " miles?");
        double mpg = milePerGallon(miles, gas); // call the miles per gallon method
        System.out.println("your car efficiency is " + mpg + " miles per gallon"); // the main method will print out this message

    }
        // the mile per gallon method will calculate the mpg and return the value
    private static double milePerGallon(double miles, double gas) {
        double mpg = miles / gas;
        return mpg;
    }
}
