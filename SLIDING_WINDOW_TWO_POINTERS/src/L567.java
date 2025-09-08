
// Leetcode 567
//Leetcode 438 


import java.util.*;

class Main {
    static boolean permutationcheck(String s, HashMap<Character, Integer> mp) {
        HashMap<Character, Integer> mp2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mp2.put(s.charAt(i), mp2.getOrDefault(s.charAt(i), 0) + 1);
        }

        return mp.equals(mp2);
    }

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        int n1 = s1.length();
        int n2 = s2.length();

        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            mp.put(s1.charAt(i), mp.getOrDefault(s1.charAt(i), 0) + 1);
        }

        System.out.println("MP1" + mp);

        boolean found = false;
        for (int j = 0; j <= n2 - n1; j++) {
            if (permutationcheck(s2.substring(j, j + n1), mp)) {
                System.out.println("YES");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("NO");
        }
    }
}
//brute force approach
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) return false;

        for (int i = 0; i <= n2 - n1; i++) {
            String sub = s2.substring(i, i + n1);
            if (isPermutation(s1, sub)) {
                return true;
            }
        }

        return false;
    }

    private boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] freq = new int[26]; // for lowercase letters

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}






