package week4;

import java.util.ArrayList;
import java.util.List;

public class looping {
    public static void main(String[] args) {
        // create a list for class name

        List<String> className = new ArrayList<>();

        className.add("Programming logic");
        className.add("Info tech concept");
        className.add("java");
        className.add("C#");

        // let us loop over the list

        for (String name: className){
            System.out.println(name);
        }
        System.out.println();
        // we can also use the regular loop
        for (int i = 0; i < className.size();  i++){
            System.out.println(className.get(i));
        }

        // best way to remove or modify an item inside loop is while loop
        System.out.println();
        while (!className.isEmpty()){
            String name = className.remove(0);
            System.out.println(name);
        }
        System.out.println();
        System.out.println(className);

    }
}
