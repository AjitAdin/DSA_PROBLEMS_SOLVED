import java.util.*;
import java.lang.*;
import java.io.*;

class LongestSbStrWithNoRepeatingChars {
    public static void main (String[] args) throws java.lang.Exception {
        String s = "cadbzabcd";
        int l = s.length();
        int maxcount = 0;

        for (int i = 0; i < l; i++) {
            Set<Character> set = new HashSet<>();
            int count = 0;

            for (int j = i; j < l; j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                } else {
                    set.add(s.charAt(j));
                    count++;
                    maxcount = Math.max(maxcount, count);
                }
            }
        }
        System.out.println(maxcount);
    }
}


//import java.util.HashSet;
//import java.util.Set;
//
//public class LongestSubstringWithoutRepeating {
//    public int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        Set<Character> seen = new HashSet<>();
//        int left = 0, maxLen = 0;
//
//        for (int right = 0; right < n; right++) {
//            while (seen.contains(s.charAt(right))) {
//                seen.remove(s.charAt(left));
//                left++;
//            }
//            seen.add(s.charAt(right));
//            maxLen = Math.max(maxLen, right - left + 1);
//        return maxLen;
//    }
//
//    public static void main(String[] args) {
//        LongestSubstringWithoutRepeating solver = new LongestSubstringWithoutRepeating();
//        String input = "abcabcbb";
//        System.out.println("Longest substring length: " + solver.lengthOfLongestSubstring(input));
//    }
//}
