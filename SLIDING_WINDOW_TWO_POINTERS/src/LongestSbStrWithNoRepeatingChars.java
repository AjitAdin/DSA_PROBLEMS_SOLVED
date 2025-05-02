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
