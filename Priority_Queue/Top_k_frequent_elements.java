package Priority_Queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Top_k_frequent_elements {

    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (Integer num : map.keySet()) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int i = 0;
        while(!pq.isEmpty()){
            ans[i] = pq.poll();
            i++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = topKFrequent(nums,k); 
        System.out.println(Arrays.toString(ans));
    }
}
