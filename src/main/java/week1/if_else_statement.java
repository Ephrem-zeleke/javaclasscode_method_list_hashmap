package week1;

import static input.InputUtils.doubleInput;

/*
the if statement check if one condition is true and if it is false the else statement
will print something else
the else statement comes right after the if statements

 */
public class if_else_statement {
    public static void main(String[] args) {
        // checking if the number is positive or negative
        int number = 4;
        if (number >= 0) {
            System.out.println("the number is positive");
        } else {
            System.out.println("the number is negative");
        }
        // let is do another example that check if the temp is above freezing or below freezing

        // asking the user to write down the daily temperature in F
        double Temp = doubleInput("what is the temperature today in F?");

        if (Temp > 32) {
            System.out.println("The temperature is above freezing!!!");
        }else{
            System.out.println("The temperature is below freezing!!!");
        }
    }
}




