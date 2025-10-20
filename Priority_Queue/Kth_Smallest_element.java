package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest_element {

    public static int kthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove largest
            }
        }
        
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int ans = kthSmallest(nums,k);
        System.out.println(ans);
    }
}
