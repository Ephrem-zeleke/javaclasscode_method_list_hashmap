package week1;

import static input.InputUtils.doubleInput;

public class distance_from_MCTC {
    public static void main(String[] args) {
        System.out.println("checking how far students live from MCTC ");
        double distanceFromMCTC = doubleInput("How far you live from MCTC?");

        if (distanceFromMCTC > 10){
            System.out.println("you live 10 mile away from MCTC");
        }else {
            System.out.println("you live less than 10 miles away from MCTC");
        }
        
    }
}
