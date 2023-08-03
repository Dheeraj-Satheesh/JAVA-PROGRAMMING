import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prac{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String palindromicString = rearrangeToPalindrome(input);
        System.out.println("Palindromic String: " + palindromicString);
    }

    public static String rearrangeToPalindrome(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the input string
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder oddStr = new StringBuilder();
        StringBuilder frontStr = new StringBuilder();
        StringBuilder rearStr = new StringBuilder();

        // Construct the oddStr and frontStr
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            if (freq % 2 == 1) {
                if (oddStr.length() > 0) {
                    // If there is already a character with odd frequency, we cannot form a palindromic string
                    return "No Palindromic String";
                }
                oddStr.append(ch);
            } else {
                // Append half occurrences of even occurring characters to frontStr and rearStr
                int halfOccurrences = freq / 2;
                for (int i = 0; i < halfOccurrences; i++) {
                    frontStr.append(ch);
                    rearStr.insert(0, ch);
                }
            }
        }

        // Return the concatenated string
        return frontStr.toString() + oddStr.toString() + rearStr.toString();
    }
}
