package week3;

import static input.InputUtils.doubleInput;

public class square {
    public static void main(String[] args) {
        // asking the user to put the number to make it square and the main method will the the square method to do
        // the maths. the square method will do the maths and will print the message
        // the square method will not return any value rather it will print the message
        double number = doubleInput("please enter the number and i will square it");
        square(number);
    }

    public  static void square(double n) {
        double sq = n * n;
        System.out.println("the square of " + n + " is " + sq);
    }

}


