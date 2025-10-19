import java.util.Arrays;

public class Longest_substring_without_repeating_character {

    public static int lengthOfLongestSubstring(String s) {
        int [] frq = new int [256];
        Arrays.fill(frq,0);
        int i = 0, j = 0, ans = 0, n = s.length();
        int cnt = 0;
        while(j < n){
            char ch = s.charAt(j);
            if(frq[ch] == 0) cnt++;
            frq[ch]++;
            while(i <= j && cnt < j-i+1){
                ch = s.charAt(i);
                frq[ch]--;
                if(frq[ch] == 0) cnt--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;   
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
