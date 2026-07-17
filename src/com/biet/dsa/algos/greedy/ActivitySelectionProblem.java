package com.biet.dsa.algos.greedy;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Activity {
    int start, finish;
    public Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}
public class ActivitySelectionProblem {
    static class ActivityComparator implements Comparator<Activity> {
        @Override
        public int compare(Activity a1, Activity a2){
            // Ascending Order
            return a1.finish - a2.finish;
            // Descending Order
            // return a2.finish - a1.finish;
        }
    }
    public static void printMaxActivities(List<Activity> activities){
        // Sort the activities according to finish times
        activities.sort(new ActivityComparator());
        // First activity is always selected
        int lastSelected = 0;
        // (1,4)(5,7)(8,9)
        System.out.print("(" + activities.get(lastSelected).start + "," +
                activities.get(lastSelected).finish + ")");
        // The next activity's start time should be greater or equal
        // to the finish time of the previous activity
        // Start the comparison from index number 1
        for (int i=1; i<activities.size(); i++){
            if(activities.get(i).start >= activities.get(lastSelected).finish){
                // Print the next selected activity
                System.out.print("(" + activities.get(i).start + "," +
                        activities.get(i).finish + ")");
                // Move to the next activity for further comparison
                lastSelected = i;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
                new Activity(5,7),
                new Activity(8,9),
                new Activity(1,4),
                new Activity(5,9),
                new Activity(0,6),
                new Activity(3,5)
        );
        printMaxActivities(activities);
    }
}
