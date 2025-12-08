package String_Questions;

public class Remove_non_alphabet_characters {
    
    public static String filterAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Hello, World! 123";
        System.out.println(filterAlphabets(s));
    }
}
