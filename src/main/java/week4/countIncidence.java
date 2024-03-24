package week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class countIncidence {
    public static void main(String[] args) {
        // let us create a program that count the incident where the speed of the internet was 0.
        // create a list that asks the user for the speed of the internet.
        List<Double> speeds = new ArrayList<>();

        // loop over the speed list
        int totalHour = 12; // the total hour we are checking for internet speed
        for (int hour = 0; hour < totalHour; hour++){
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            speeds.add(speed); // add the data to the speeds list
        }
        System.out.println("All the speeds are:");

        for(int hour = 0; hour < speeds.size(); hour++){
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d Speed %.2f\n", hour, speed);
        }
        // now lets count the number of time the speed was 0

        int zeroCount = 0;
        for(double speed :speeds){
            if (speed == 0){
                zeroCount++;
            }

        }
        System.out.println("the number of time the speed was 0 is " + zeroCount + " times");


    }
}
