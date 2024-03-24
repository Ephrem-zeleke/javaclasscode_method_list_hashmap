package week3;
/*
methods used to do repetitive tasks in an easy way. we can write a method and whenever we need to do the same
task, we can call the method and the method will do the tasks.
methods help us to not write the same code so many times
 */

import static input.InputUtils.doubleInput;

public class lemonades {
    public static void main(String[] args) {
        System.out.println("how much did you spend on lemonade supplies?");
        double lemonadeSuppliesCost = doubleInput();
        System.out.println("what did you sell one cup of lemonade for?");
        double lemonadeSalePrice = doubleInput();
        System.out.println("how many cup of lemonade did you sell?");
        double lemonadeCupsSold = doubleInput();

        double lemonadeProfit = (lemonadeCupsSold * lemonadeSalePrice) - lemonadeSuppliesCost;
        System.out.println("lemonade profit = $" + lemonadeProfit);

        // this program calculate the profit for lemonade and if the user want to calculate the profit for cookies
        // they have to write another line of code that do the same thing like lemonade
        // profit for cookies
        System.out.println("how much did you spend on cookies?");
        double cookiesSuppliesCost = doubleInput();
        System.out.println("what did you sell one cookie for?");
        double cookiesSalePrice = doubleInput();
        System.out.println("how many cookies did you sell?");
        double cookiesSold = doubleInput();

        double cookiesProfit = (cookiesSold * cookiesSalePrice) - cookiesSuppliesCost;
        System.out.println("cookies profit = $" + cookiesProfit);

        /*
        the above two code do the same thing, calculating the profit of product. we can avoid writing repetitive
        code by using method
         */




    }
}
