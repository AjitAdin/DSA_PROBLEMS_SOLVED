import java.util.Arrays;

public class AnagramChecker {

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase for a fair comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    // Main method for testing
    public static void main(String[] args) {
        String word1 = "Listen";
        String word2 = "Silent";

        if (areAnagrams(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }
    }
}


import java.util.*;

class Main {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("NO");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}

