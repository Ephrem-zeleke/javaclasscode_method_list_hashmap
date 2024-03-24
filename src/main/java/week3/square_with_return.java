package week3;

import static input.InputUtils.doubleInput;

public class square_with_return {
    public static void main(String[] args) {
        /*
        this program do a maths to square number and it has a method called square.
        the main method call the square function to calculate the square of the number and the square method
        will do the maths and will return the answer. method should be better if it works one task and this method
        do the maths and return the value which is a good method.
        the main method will print out the message.
         */
        double number = doubleInput("Please enter a number and i will square it");
        double squared = square(number);
        System.out.println("the square of " + number + " is " + squared);
    }
    public static double square(double n){
        double sq = n * n;
        return sq;
    }
}
