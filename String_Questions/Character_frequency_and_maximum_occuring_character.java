package String_Questions;

import java.util.HashMap;
import java.util.Map;

public class Character_frequency_and_maximum_occuring_character {
    
     public static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static char maxOccurringChar(String s) {
        Map<Character, Integer> freq = charFrequency(s);
        char maxC = s.charAt(0);
        int maxF = freq.get(maxC);
        for (Map.Entry<Character,Integer> e : freq.entrySet()) {
            if (e.getValue() > maxF) {
                maxF = e.getValue();
                maxC = e.getKey();
            }
        }
        return maxC;
    }

    public static void main(String[] args) {
        String s = "abracadabra";
        System.out.println("Frequencies: " + charFrequency(s));
        System.out.println(maxOccurringChar(s));
    }
}
