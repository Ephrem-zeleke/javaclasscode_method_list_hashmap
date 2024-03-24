package week4;

import java.util.ArrayList;
import java.util.List;

// creating a list
public class addingList {
    public static void main(String[] args) {
        // let us create a list containing the class code for an IT class

        List<Integer> classCodes = new ArrayList<>();
        // add the class code number to the list
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        // we can add elements to the list
        classCodes.add(0, 1425);
        classCodes.add(2, 1100);

        // let us print the list
        System.out.println(classCodes);
        System.out.println(classCodes.size());

        // let loop over the classCodes list

        for (int classCode: classCodes){
            System.out.println("ITEC " + classCode);
        }


    }
}
