package week3;

import static input.InputUtils.intInput;

public class countNumber {
    public static void main(String[] args) {
        // this program will count a list of number
        // we create a method to do the counting tasks

        int smallNumber = intInput("enter the smaller number: ");
        int largeNumber = intInput("enter the larger number: ");

        System.out.println("i will count from " + smallNumber + " to " + largeNumber);


        count(smallNumber, largeNumber); // calling the count method 



    }

    public static void count(int min, int max) {
        for (int i = min; i <= max; i++){
            System.out.println(i);
            // here in this method we don't return any value and that why we use void when we create the method
        }
    }

}
