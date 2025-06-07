
import java.util.*;
public class ChangeCaseOfEachCharacterInAString {

    // Method to change the case of each character
    public static void changeCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch); // Non-alphabetic characters remain unchanged
            }
        }

        System.out.println("Output: " + result.toString());
    }

    // Main method for testing
    public static void main(String[] args) {
        String str1 = "AjIt";
        String str2 = "Hello123!";
        
        System.out.print("Input: " + str1 + " -> ");
        changeCase(str1); // Output: aJiT

        System.out.print("Input: " + str2 + " -> ");
        changeCase(str2); // Output: hELLO123!
    }
}





