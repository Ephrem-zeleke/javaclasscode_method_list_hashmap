package week1;

import static input.InputUtils.*;

public class price {
    public static void main(String[] args) {
    String ProductName =stringInput("what is the name of the product?") ;
    double productPrice = doubleInput("how much it costs for one " + ProductName + "?");
    int quantity = intInput("how many " + ProductName + " to sell?");
    double total = productPrice * quantity;
        System.out.println(quantity + " " + ProductName + " at a price of $" + productPrice + " each, costs a total of $" + total);
    }
}
