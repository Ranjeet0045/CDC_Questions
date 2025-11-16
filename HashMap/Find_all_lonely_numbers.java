package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_all_lonely_numbers {

    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i]-1) && !map.containsKey(nums[i] + 1) && map.get(nums[i]) == 1){
                list.add(nums[i]);
            }
        }
        System.out.println(map);

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {10,6,5,8};
        List<Integer> ans = findLonely(nums);
        System.out.println(ans);
    }
}
