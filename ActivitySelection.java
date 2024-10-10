import java.util.Arrays; 
import java.util.Comparator; 

class Activity{
    int start, finish; 
    Activity(int start, int finish){
        this.start=start;
        this.finish=finish; 
    }
}

public class ActivitySelection{
    // Function to perform the activity selection 
    public static void selectActivities(Activity[] activities){
        // Sort activities based on their finish time 
        Arrays.sort(activities, Comparator.comparingInt(a->a.finish));

        System.out.println("Selected Activites: ");
        int lastSelectedFinish = -1; // Track the finish time of the last selected activity 
        for(Activity activity: activities){
            if(activity.start>=lastSelectedFinish){
                System.out.println("Activity: Start = " + activity.start + ", Finish = "+activity.finish); 
                lastSelectedFinish = activity.finish; // Updating the finish time 
            }
        }
    }
    public static void main(String[] args){
        Activity[] activities = {
            new Activity(1, 3), 
            new Activity(2, 4), 
            new Activity(0, 6), 
            new Activity(5, 7), 
            new Activity(8, 9),
            new Activity(5, 9)
        };
        selectActivities(activities);
    }
}