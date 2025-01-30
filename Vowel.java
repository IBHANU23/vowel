import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        int vowelCount = countVowels(str);

        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

