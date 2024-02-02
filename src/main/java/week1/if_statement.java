package week1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

/*
if statements, it checks the condition and return a boolean value. based on the condition, it prints
out the message.
 */
public class if_statement {
    public static void main(String[] args) {
        System.out.println("enter today's temperature in F");
        // this program asks the user to input the temperature
        double Temp = doubleInput();
        // the if statements check the condition and if the condition is true, it print out the message
        /*
        the syntax in if statements is we use parenthesis for the condition to be checked and
        we also use curly around the conditional code
         */
        if (Temp > 32){
            System.out.println("It is above freezing!!!");
        }
        // the == sign used to check the equality operation
        // let see another example
        int secretNumber = 6;
        int guess = intInput("Guess the number i am thinking ?");
        if (guess == 6){
            System.out.println("you are guessing correctly!!!");
            // if the condition is false, the program will print the else statement
        }else {
            System.out.println("sorry, i was thinking of " + secretNumber);
        }
        // != this is used for comparing the not equal operation
        // let see another example using the != operation
        System.out.println("quiz time");
        int answer = intInput("what year did the apollo 11 spaceship land on the moon ");
        if (answer != 1969){
            System.out.println("wrong answer, it was 1969");

        }


    }
}
