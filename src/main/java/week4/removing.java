package week4;

import java.util.ArrayList;
import java.util.List;

public class removing {
    public static void main(String[] args) {
        // now let us see adding and removing an item to and from the list
        // create a list that contain the class name

        List<String> classNames = new ArrayList<>();
        // add elements to the list called classNames

        classNames.add("Programming logic");
        classNames.add("Web client server");
        classNames.add("Project management");
        classNames.add("Info tech concept");
        // print out the list
        System.out.println(classNames);
        // the contain method
        // check if the list contain the value in the list
        if (classNames.contains("C# programming")){
            System.out.println("the list contain C# programming");
        }else {
            System.out.println("the list doesn't contain C# programming");
        }

        // if we want to remove an item from the list, we can write a code to remove by value or by an index
        // remove by value
        //  we can also modify the elements in the list
        // for instance, let us modify info tech concept with system analysis
        classNames.set(3, "System analysis");
        // print and compare the value
        System.out.println(classNames);

        classNames.remove("Project management");
        // remove by index
        classNames.remove(0);
        // let us print the list
        System.out.println(classNames);
        // clear the list
        classNames.clear();
        System.out.println(classNames);
        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());


        // if we have a list contain integers and want remove an item using an index need extra syntax
        // create a list that has a value of integer

        List<Integer> classCodes = new ArrayList<>();

        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1100);
        classCodes.add(1250);
        // print out the list
        System.out.println(classCodes);
        // remove an item by index
        classCodes.remove(1); // by default it thinks it remove the item at index 1
        System.out.println(classCodes);
        // but if we want to remove an item using value we have to use different syntax
        classCodes.remove(Integer.valueOf(1100)); // this will convert the integer value and will remove from the list
        System.out.println(classCodes);


    }
}
