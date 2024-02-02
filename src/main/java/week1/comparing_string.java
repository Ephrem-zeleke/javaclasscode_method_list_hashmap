package week1;

import static input.InputUtils.stringInput;

public class comparing_string {
    public static void main(String[] args) {
        // when we compare strings we should use the .equal method to get the expected result
        // let see an example
        String college = stringInput("Which college are you going");
        if (college.equals("MCTC")) {
            System.out.println("Ya, MCTC");
        }else {
            System.out.println("You should go to MCTC");
        }
        String userPassword = stringInput("What is your password?");
        if (userPassword.equals("qwerty")) {
            System.out.println("access granted ");
        }else {
            System.out.println("access denied");
        }
        // condition plus string library method

        String name = stringInput("what is your name?");
        if (name.length() > 5) {
            System.out.println("your name is more than 5 letters");
        }else {
            System.out.println("your name is 5 letter or less");
        }
    }
}

