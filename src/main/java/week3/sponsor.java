package week3;

import java.util.Arrays;

public class sponsor {
    public static void main(String[] args) {
        // create an array with the sponsor company
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};
        // loop the array
        for (int i = 0; i < sponsors.length; i++){
           // System.out.println(sponsors[i]);
            String sponsor = sponsors[i];
            sponsor = sponsors[i].toUpperCase();
            System.out.println(sponsor);
            sponsors[i] = sponsor;
        }
        System.out.println(Arrays.toString(sponsors));
    }
}
