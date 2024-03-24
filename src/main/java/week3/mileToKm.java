package week3;

import static input.InputUtils.doubleInput;

public class mileToKm {
    public static void main(String[] args) {
        // this program will convert mile to km
        // it uses a method
        // first let us write the main method
        double miles = doubleInput("Please enter the miles");
        double km = milesToKm(miles);// this line of code the method called milestokm
        System.out.println(miles + " miles is equal to " + km + " kilometers");
    }

    private static double milesToKm(double miles) { // this method do the math to convert miles to km
        double km = miles * 1.6;
        return km;// return the output to the main method.
    }
}
