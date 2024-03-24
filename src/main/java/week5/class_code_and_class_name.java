package week5;

import java.util.HashMap;
import java.util.Map;

public class class_code_and_class_name {
    public static void main(String[] args) {
        // creating a new hashmap

        Map<String, String> h = new HashMap<>();

        // adding the key value pair to the map

        h.put("1100", "Info Tech concept");
        h.put("1110", "Info Tech skills");
        h.put("1150", "Programming logic");
        h.put("1250", "Windows");
        h.put("1425", "Data communications");
        // let us print the hashmap and see how it is printed

        System.out.println(h);

        // finding the value using the key
        System.out.println("the value of the key for 1150 is " + h.get("1150"));
        System.out.println("the value of the key for 1999 is " + h.get(1999));
        System.out.println("Does hashmap contain the key 1150 " + h.containsKey("1150"));
        System.out.println("Is this hashmap empty? " + h.isEmpty());
        System.out.println("How many key value pair " + h.size());
        System.out.println("Is there an entry with the value \"Windows\"?" + h.containsValue("Windows"));
        System.out.println("Delete the 1425 key value pair by key. the value is " + h.remove("1425"));


        // loop and hashmap

        for(String classNumber: h.keySet()){
            // use the key to get each value. repeat for each key
            System.out.println("Class number = " + classNumber + " Class name = " + h.get(classNumber));

        }
        // printing all value using loop
        for(String value: h.values()){
            System.out.println(value);
        }
        // looping over both keys and values

        System.out.println("\n a loop for both keys and values\n");

        for (Map.Entry<String, String> entry: h.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }











    }
}
