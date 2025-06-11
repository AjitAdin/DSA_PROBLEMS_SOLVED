import java.util.*;

class LongestSubstringWithAtMostKDistinctCharacters {
    public static void main(String[] args) {

        String s="aababbcaacc";
        int k=2;
        int maxlen=0;

        int n=s.length();
        HashMap<Character,Integer> mp= new HashMap<>();



        int l=0,r=0;
        while(r<n){
            char c=s.charAt(r);
            mp.put(c,mp.getOrDefault(c,0)+1);
            while(mp.size()>k){
                char temp=s.charAt(l);
                mp.put(temp,mp.get(temp)-1);
                if(mp.get(temp)==0){
                    mp.remove(temp);
                }


                l++;

            }
            maxlen = Math.max(maxlen, r - l + 1);

            //  System.out.println(mp);
            r++;
        }



        System.out.println(maxlen);

    }
}


//brute force
//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//
//        String s = "aababbcaacc";
//        int k = 2;
//        int maxlen = 0;
//        int n = s.length();
//
//        // Try every possible substring
//        for (int i = 0; i < n; i++) {
//            Set<Character> set = new HashSet<>();
//            for (int j = i; j < n; j++) {
//                char c = s.charAt(j);
//                set.add(c);
//
//                if (set.size() <= k) {
//                    maxlen = Math.max(maxlen, j - i + 1);
//                } else {
//                    break;  // More than k distinct characters, break early
//                }
//            }
//        }
//
//        System.out.println(maxlen);
//    }
//}
