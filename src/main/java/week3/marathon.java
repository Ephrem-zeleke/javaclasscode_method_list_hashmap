package week3;

public class marathon {
    public static void main(String[] args) {
        // we are now creating a variable that stores the current distance
        // we also create a target distance
        // create a variable percent increase
        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10;

        int week = 1;

        while (currentDistance < targetDistance) { // while the current distance is less than the target distance , the loop will run
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease; // since the runner increase 10% every week, the current distance will multiply by 1.1
            week++;
        }
        System.out.println(week + " " + currentDistance);
    }

}
