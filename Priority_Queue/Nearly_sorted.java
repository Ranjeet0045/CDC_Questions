package Priority_Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Nearly_sorted {

    public static void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int n = arr.length;

        for(int i=0; i<=k; i++){
            queue.add(arr[i]);
        }
        int j = 0;
        for(int i=k+1; i<n; i++){
            arr[j++] = queue.poll();
            queue.add(arr[i]);
        }
        while(!queue.isEmpty()){
            arr[j++] = queue.poll();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 4};
        int k = 2;
        nearlySorted(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
