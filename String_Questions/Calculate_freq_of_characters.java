package String_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Calculate_freq_of_characters {

    public static String helper(String str){
        StringBuilder sb = new StringBuilder();

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0) + 1);
        }

        Map<Character, Integer> sortedMap = new TreeMap<>(map);
        
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            sb.append(key).append(value).append(" ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "takeuforward";
        String ans = helper(str);
        System.out.println(ans);
    }
}
