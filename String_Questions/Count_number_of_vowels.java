package String_Questions;

public class Count_number_of_vowels {
    
    public static int countWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        String[] parts = s.split("\\s+");
        return parts.length;
    }

    public static void main(String[] args) {
        String s = "  This  is   a   test string ";
        System.out.println(countWords(s));
    }
}
