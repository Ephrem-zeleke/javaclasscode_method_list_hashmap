package week5;

import java.util.HashMap;
import java.util.Map;

public class classCodes {
    public static void main(String[] args) {
        // first let's create a new hashmap
        // the hashmap will have an integer key and string value

        Map<Integer, String> classCodes = new HashMap<>();

        // now we can add the data key value pair to the hashmap

        classCodes.put(2545, "Java");
        classCodes.put(2560, "Web");
        classCodes.put(1450, "Data communication");
        classCodes.put(1150, "Programming logic");
        classCodes.put(2417, "Android programming");

        // now let's loop over key value pair

        for(Integer classCode: classCodes.keySet()){
            String className = classCodes.get(classCode);
            System.out.println("ITEC " + classCode + " " + className);

        }
        // i can print the number of class i am taking using the size method
        System.out.println("I am taking " + classCodes.size() + " classes in this semester");

        // we can search data in the hashmap
        // for example let's search a class name for the key value of 2417
        // if we found the data in the hashmap, we will print the class name otherwise we will print a message saying data not found
        Integer searchCode = 2417;

        if (classCodes.containsKey(searchCode)){
            String className = classCodes.get(searchCode);
            System.out.println("Found it, the class name for " + searchCode + " is " + className);
        }else {
            System.out.println("Not found");
        }
        // there is also another way of searching data in the hashmap
        // let's search for class name for 2545
        Integer searchCode2 = 2545;
        String className = classCodes.get(searchCode2);
        if(className == null){
            System.out.println("Not found");
        }else {
            System.out.println("The class name for " + searchCode2 + " is " + className);
        }




    }
}
