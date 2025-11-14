package Greedy;

import java.util.Arrays;

public class Activity_Selection_problem {

    public static int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        int[][] activity = new int[n][2];

        for(int i=0; i<start.length; i++){
            activity[i][0] = start[i];
            activity[i][1] = finish[i];
        }

        Arrays.sort(activity,(a,b) -> Integer.compare(a[1] , b[1]));

        int count = 1;
        int lastFinished = activity[0][1];

        for(int i=1; i<n; i++){
            if(activity[i][0] > lastFinished){
                count++;
                lastFinished = activity[i][1];
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5}, finish = {2, 4, 6, 7, 9, 9};
        int count = activitySelection(start,finish);
        System.out.println(count);
    }
}
