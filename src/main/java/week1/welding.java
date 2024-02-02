package week1;

import static input.InputUtils.yesNoInput;

public class welding {
    public static void main(String[] args) {
        // write a program that check if the students wear safety cloths for welding

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed toe shoes?");

        // checking if the students wear either cotton or wool clothes and closed toe shoes
        // when we check in this condition, we have to be carefull
        // using both || and && need attention
        // the program start checking the condition from left to right and we have to use parenthesis to check the or condition separately and go to the and condition
        if ((cottonClothes || woolClothes) && closedToeShoes) {
            System.out.println("you wear safely!");
        }else {
            System.out.println("you are not wearing safely");
        }
    }
}
