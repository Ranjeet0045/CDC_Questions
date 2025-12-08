package String_Questions;

public class Remove_duplicates_from_given_string {
    
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];  // or a Set<Character>
        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aabbccddeeff";
        System.out.println(removeDuplicates(s));
    }
}
