package week5;

import java.util.HashMap;
import java.util.Map;

public class state_abbrevation {
    public static void main(String[] args) {
        // create a new hashmap

        HashMap<String, String> stateAbbrevation = new HashMap<>();
        // now we can add a key value pair to our new hashmap
        // we can use the .put() method to add

        stateAbbrevation.put("Minnesota", "MN");
        stateAbbrevation.put("Wisconsin", "WI");
        stateAbbrevation.put("Michigan", "MI");
        stateAbbrevation.put("Iowa", "IA");


        System.out.println(stateAbbrevation);
        System.out.println(stateAbbrevation.get("Wisconsin"));
        System.out.println(stateAbbrevation.get("Iowa"));

        String stateAbbrevationForMinnesota = stateAbbrevation.get("Minnesota");
        System.out.println(stateAbbrevationForMinnesota);

        // we can loop the hashmap both using the key and value of the hashmap pair
        // let's loop over the key and we can use the key set
        System.out.println(" ");

        for (String stateName: stateAbbrevation.keySet()){
            System.out.println(stateName);
            System.out.println(stateAbbrevation.get(stateName));

        }
        System.out.println(" ");
        // we can also loop over the value
         for (String abbrevation: stateAbbrevation.values()){
             System.out.println(abbrevation);
         }

         // looking up for abbrevation for the state
        // we can loop over key value pair until the value is found

        String searchAbbrevation = "MI";
        // let us found the MI abbrevation in the hashmap

        for (String stateName: stateAbbrevation.keySet()){
            System.out.println(stateName);
            String abbrevation = stateAbbrevation.get(stateName);
            if (abbrevation.equals(searchAbbrevation)){
                System.out.println("Found it, the state name for " + searchAbbrevation + " is " + stateName);
            }

        }

        // another way of looping and at this time the key will be the value and the value will be the key
        // first create a new hashmap

        Map<String, String> abbrevationStateName = new HashMap<>();

        for (Map.Entry<String, String> entry: stateAbbrevation.entrySet()){
            String state = entry.getKey();
            String abbrevation = entry.getValue();
            abbrevationStateName.put(abbrevation, state);





        }
        System.out.println(stateAbbrevation);
        System.out.println(abbrevationStateName);

        // we can also determine the size of the hashmap using the size method

        System.out.println("There are " + stateAbbrevation.size() + " states in the list");



    }
}
