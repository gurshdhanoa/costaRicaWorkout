import java.util.ArrayList;

public class workoutMain{


    String[] tuesday;
    public static void main(String[] args) {

        
    ArrayList<String> saturday = new ArrayList<String>();

    saturday.add("Deadlift");
    saturday.add("Weighted Chin-Ups");
    saturday.add("Lower Back Extensions");
    saturday.add("Machine Row");
    saturday.add("Skull Crusher");
    saturday.add("20 Minute Timed Abs");


    ArrayList<String> sunday = new ArrayList<String>();

    sunday.add("Squat");
    sunday.add("Bench Press");
    sunday.add("Shoulder Press");
    sunday.add("Bicep Curls");
    sunday.add("Inner Chest Work");
    sunday.add("20 Minute Timed Abs");


    ArrayList<String> tuesday = new ArrayList<String>();

    tuesday.add("KB Squat Thruster");
    tuesday.add("Bicep Hammer Curl");
    tuesday.add("Preacher Curl");
    tuesday.add("Overhead Tricep Extension");
    tuesday.add("Tricep Extension");


    ArrayList<String> thursday = new ArrayList<String>();

    thursday.add("Cardio");
    thursday.add("20 Minute Timed Abs");
    thursday.add("lateral Shoulder Raises");
    thursday.add("Lunges");


    int saturdayLength = saturday.size();
    for (int i = 0; i < saturdayLength; i++) {
        System.out.println(saturday.get(i));
            
        }
    }
    


}


