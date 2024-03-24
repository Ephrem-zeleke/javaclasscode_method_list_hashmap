package week5;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class snowFall {
    public static void main(String[] args) {
        // crating a new Hashmap with a string key and double value

        Map<String, Double> snowfall = new HashMap<>();
        // put the key value pair to the hashmap

        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 4.1);
        snowfall.put("March", 3.1);
        snowfall.put("April", 0.0);
        // print out all the data in the hashmaps

        System.out.println(snowfall);
        // looping the key value pair of the hashmap data

        for(String month: snowfall.keySet()){
            double snow = snowfall.get(month);
            System.out.println("the snow in " + month + " was " + snow + " inches");
        }

        // let us ask the user for a new month data and add it to the hashmap

        String newMonth = stringInput("Enter the name of the new month:");
        // ask the user for the amount of snowfall for the new month

        double newSnow = positiveDoubleInput("Enter the amount of snow for " + newMonth + " in inches");
        snowfall.put(newMonth, newSnow);

        System.out.println(snowfall);

        if (snowfall.containsKey(newMonth)){
            double snow = snowfall.get(newMonth);
            System.out.println("The hashmap already contain that month," + newMonth + " snow: " + snow + " inches" );
            boolean overwrite = yesNoInput("Overwrite?");
            if (overwrite){
                snowfall.put(newMonth, newSnow);
            }else {
                System.out.println("the data was not added");
            }

        }
        else {
            snowfall.put(newMonth, newSnow);
        }
        System.out.println(snowfall);

        // let us add up the total snowfall
        // create a total variable first and add the value using for loop
        double total = 0;
        for ( double snow:snowfall.values()){
            total += snow;
        }
        System.out.println("The total amount of snow is " + total + " inches");



    }
}
