import java.util.Scanner;

//      parent class
class Workout {
   int duration; //minutes
   String type;
}

//      child class
class RunningWorkout extends Workout {
    double distance; //km
    void showDetails() {
        System.out.println("Workout: " + type + "\nduration(min): " + duration +
                " minutes \ndistance(km): " + distance + " km \ncalories burned: " + (distance*60));
    }
}

//      Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RunningWorkout w = new RunningWorkout();

        System.out.println("Enter workout type:");
        String type = sc.nextLine();

        System.out.println("Enter duration(min):");
        int duration = sc.nextInt();

        System.out.println("Enter distance(km):");
        double distance = sc.nextDouble();

        w.type = type;
        w.duration = duration;
        w.distance = distance;

        w.showDetails();
    }
}

//Create the Main Class:
//Use a Scanner to prompt the user to enter the workout type, duration, and distance.
//Instantiate a RunningWorkout object, assign the values, and call showDetails().