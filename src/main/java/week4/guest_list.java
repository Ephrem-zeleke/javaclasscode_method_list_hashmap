package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.stringInput;


public class guest_list {
    public static void main(String[] args) {

        // create a new list
        List<String> guestList = new ArrayList<>();

        while (true){

            String name = stringInput("Enter name of guests or press enter to quit");

            if(name.isEmpty()){
                break;
            }
            if(containsIgnoresCase(guestList, name)){
                System.out.println("You already added " + name);
            }
            else {
                System.out.println("Adding " + name + " to the list");
                guestList.add(name);

            }
        }
        Collections.sort(guestList);
        printGuest(guestList);

    }
    public static void printGuest(List<String> guest){

        System.out.println("your guest list: \n");

        for(int i = 0; i < guest.size(); i++){

            System.out.println((i + 1) + ":" + guest.get(i));
        }
    }
    public static boolean containsIgnoresCase(List<String> list, String data){
        for(String item:list){
            if(item.equalsIgnoreCase(data)){
                return true;
            }

        }
        return false;

    }


}
