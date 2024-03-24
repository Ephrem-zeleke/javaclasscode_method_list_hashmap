package week4;

import java.util.ArrayList;
import java.util.List;
/*
List is one of the data structure in java and it is just similar to lists in python
lists and array has almost the same function
in lists we can resize the elements inside the list, we can add elements at the front, in the middle or at the last.
in java we have three types of lists
arraylist
linked list
vector
in list we can find or remove elements from the list by value or index

 */

public class Lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();  // creating an array list
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("MCTC");
        arrayList.add("clara");

        // loop over the elements of the array list
        for (String s: arrayList){
            System.out.println(s.toUpperCase());
            System.out.println(s.length());

        }
        // we can also print the array list
        System.out.println(arrayList);
        System.out.println(arrayList.toArray().length);

    }
}
