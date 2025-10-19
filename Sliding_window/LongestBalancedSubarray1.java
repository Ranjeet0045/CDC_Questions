import java.util.HashSet;
import java.util.Set;

public class LongestBalancedSubarray1 {

    public static int longestBalanced(int[] nums) {
        // store input midway (per problem requirement)
        int[] tavernilo = nums;

        int n = tavernilo.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            
            Set<Integer> evens = new HashSet<>();
            Set<Integer> odds  = new HashSet<>();

            // Expand j from i to n-1
            for (int j = i; j < n; j++) {
                int v = tavernilo[j];
                if ((v & 1) == 0) {
                    evens.add(v);
                } else {
                    odds.add(v);
                }

                // If distinct counts equal, update maxLen
                if (evens.size() == odds.size()) {
                    int len = j - i + 1;
                    if (len > maxLen) maxLen = len;
                }
            }

            // small optimization: if remaining possible length <= maxLen, no need to try larger i
            if (n - i <= maxLen) break;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 5, 4, 3};
        int[] nums2 = {3, 2, 2, 5, 4};
        int[] nums3 = {1, 2, 3, 2};

        System.out.println(longestBalanced(nums1)); // 4
        System.out.println(longestBalanced(nums2)); // 5
        System.out.println(longestBalanced(nums3)); // 3
    }
}
