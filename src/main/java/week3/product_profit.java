package week3;

import static input.InputUtils.doubleInput;
/*
this program uses a method to avoid repetitive writing of the same code. the calculatedProductForProduct method
will ask the user different question and do the maths for product profit and return the profit value to the main method.
the main method uses the return value and print out the profit amount for the product.
 */
public class product_profit {
    public static void main(String[] args) {
        double lemonadeProfit = calculatedProfitForProduct("lemonade");
        System.out.println("lemonade profit = $" + lemonadeProfit);
        double cookiesProfit = calculatedProfitForProduct("cookies");
        System.out.println("cookies profit = $" + cookiesProfit);
        double coffeeProfit = calculatedProfitForProduct("coffee");
        System.out.println("coffee profit = $" + coffeeProfit);
    }
    public static double calculatedProfitForProduct(String productName){
        double productCost = doubleInput("how much did you spend on " + productName + " supplies?");
        double salesPrice = doubleInput("what did you sell " + productName + " for?");
        double numberSold = doubleInput("how many " + productName + " did you sales?");

        double profit = (salesPrice * numberSold) - productCost;
        return profit;
    }

}
