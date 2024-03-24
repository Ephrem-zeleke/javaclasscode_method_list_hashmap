package week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class toDoList {
    public static void main(String[] args) {
        // creating a list from the user input

        List<String> toDoLists = new ArrayList<>();

        while (true){
            String data = stringInput("Type a task you need to do or enter to quit:");
                if (data.length() == 0){
                    break;
                }
                if (toDoLists.contains(data)){
                    System.out.println("you already add this task");
                }else {
                    toDoLists.add(data);
                }


        }
        System.out.println("Thank you, your tasks are ");

        for (String todolist: toDoLists ){
            System.out.println(todolist);
        }
        System.out.println("you have " + toDoLists.size() + " tasks to do.");



    }
}
