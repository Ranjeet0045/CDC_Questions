package HashMap;

public class Most_frequent_character {

    public static char getMaxOccuringChar(String s) {
        
        int maxCount = 0;
        int[] arr = new int[26];
        
        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i) - 97;
            arr[num] += 1;
        }
        
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxCount){
                maxCount = arr[i];
                idx = i;
            }
        }
        
        char ch = (char)(idx+'a');
        return ch;
    }

    public static void main(String[] args) {
        String s = "testsample";
        char ans = getMaxOccuringChar(s);
        System.out.println(ans);
    }
}
