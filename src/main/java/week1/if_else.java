package week1;

import static input.InputUtils.intInput;

/*
if you have several tasks to do based on the variable and compare the variable with different
condition, you can use else if function
each else if statement needs a condition to check but the else statement doesn't need any
the else statement will be implemented if all the if and the else if statements are false.
 */
public class if_else {
    public static void main(String[] args) {
        int secretNumber = 6;
        int guess = intInput("Guess the number i am thinking?");
        if (guess == secretNumber){
            System.out.println("you guess correctly");
        }else if (guess - secretNumber == 1){
            System.out.println("your guess is 1 too high");
        }else if (secretNumber-guess == 1){
            System.out.println("your guess is 1 too low");
        }else {
            System.out.println("No, i was thinking " + secretNumber);
        }
    }
}
