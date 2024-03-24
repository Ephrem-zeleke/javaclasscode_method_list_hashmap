package week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class roadTrip {
    public static void main(String[] args) {
        // write a program that plan road trip from minneapolis to different cities in minnesota
        // create a hashmap that contain the city name and its distance from minneapolis
        // we will use a string city name key and an integer distance value from minneapolis

        Map<String, Integer> distanceFromMinneapolis = new HashMap<>(); // creating a new hashmap
        // now we can add some values to the hashmap

        distanceFromMinneapolis.put("Duluth", 154);
        distanceFromMinneapolis.put("Brained", 127);
        distanceFromMinneapolis.put("Stillwater", 26);
        distanceFromMinneapolis.put("Ely", 245);
        distanceFromMinneapolis.put("Red wing", 54);

        // let's ask the user how far they want to drive

        int maxDrivingDistance = positiveIntInput("Enter the max distance you want to drive:");

        // now let's find the city within their driving range
        // we can create an array list and put those cities in the list

        List<String> cityInRange = new ArrayList<>();

        // loop the hashmap over the key and value

        for(String city:distanceFromMinneapolis.keySet()){
            Integer distance = distanceFromMinneapolis.get(city);
            if (distance <= maxDrivingDistance){ // add those cities that satisfy this condition to the list
                cityInRange.add(city);
            }


        }
        if(cityInRange.isEmpty()){ // if the list is empty, print the message
            System.out.println("Sorry, there is city in your driving range");
        }
        else {
            System.out.println("Here are the cities you can drive to");
            for(String city:cityInRange){ // else loop over the city and print it
                System.out.println(city);
            }

        }


    }


}
