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


//Brute force approach
//
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        int n=s.length();
//        int maxlength=0;
//
//        for(int i=0;i<n;i++){
//            String substr="";
//            int currlength=0;
//            for(int j=i;j<n;j++){
//
//                if(substr.indexOf(s.charAt(j))==-1){
//                    substr += s.charAt(j);
//                    currlength=substr.length();
//                }else{
//                    break;
//                }
//
//
//            }
//            maxlength=Math.max(maxlength,currlength);
//
//        }
//        return maxlength;
//    }
//}



// two pointer approach
//class Main {
//    public static void main(String[] args) {
//        String s = "pwwkew";
//        int n = s.length();
//
//        int[] freq = new int[256]; // For ASCII characters
//        int i = 0, j = 0;
//        int maxlength = 0;
//
//        while (j < n) {
//            char c = s.charAt(j);
//            freq[c]++;
//
//            // If there's a duplicate, shrink the window from the left
//            while (freq[c] > 1) {
//                freq[s.charAt(i)]--;
//                i++;
//            }
//
//            maxlength = Math.max(maxlength, j - i + 1);
//            j++;
//        }
//
//        System.out.println(maxlength);  // Output: 3
//    }
//}
