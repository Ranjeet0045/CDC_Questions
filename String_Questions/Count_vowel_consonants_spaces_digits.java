package String_Questions;

public class Count_vowel_consonants_spaces_digits {
    
    public static void countVowelConsonant(String s) {
        int vowels = 0, consonants = 0, spaces = 0, digits = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
            else if (c >= '0' && c <= '9') {
                digits++;
            }
            else if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) >= 0) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels = " + vowels +", Consonants = " + consonants +", Spaces = " + spaces +
", Digits = " + digits);
    }

    public static void main(String[] args) {
        countVowelConsonant("Hello World 123!");
    }
}
