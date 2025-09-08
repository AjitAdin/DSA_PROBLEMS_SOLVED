//
//Sure! Let’s break the problem down **step-by-step** with a simple explanation and examples. This is a **string partitioning problem**.
//
//        ---
//
//        ## 🧩 **Problem Summary**
//
//        You are given a string **`S`**.
//        You are allowed to:
//
//        1. **Rearrange the string** (shuffle the characters).
//        2. After rearranging, **cut the string into equal-length contiguous parts**.
//        3. All parts **must be exactly the same**.
//
//        Your goal is to **maximize the number of parts** (pieces) you can get.
//
//        ---
//
//        ## ✅ **Rules:**
//
//        * You can rearrange `S` **once** at the beginning.
//        * After that, you can cut it **into any number of parts** — but:
//
//        * All parts must be the **same** (identical in characters and order).
//        * You can't rearrange or alter the parts after cutting.
//
//        ---
//
//        ## 🔍 Example 1:
//
//        **Input:**
//        `S = "aabbcc"`
//
//        You can rearrange it as: `"abcabc"`
//        Now cut into parts: `"abc" | "abc"`
//        Both parts are identical.
//
//        ✅ You get **2** parts.
//
//        ---
//
//        ## 🔍 Example 2:
//
//        **Input:**
//        `S = "aaaaaa"`
//
//        All characters are the same already.
//        You can cut it into: `"a" | "a" | "a" | "a" | "a" | "a"`
//
//        ✅ You get **6** parts (maximum possible).
//
//        ---
//
//        ## 🔍 Example 3:
//
//        **Input:**
//        `S = "aab"`
//
//        Possible rearrangement: `"aba"`, `"aab"`, etc.
//        Try cutting into 2 parts of length 1.5 → ❌ Not allowed.
//        Try cutting into 1 part → `"aab"` → valid.
//
//        ✅ So, you **cannot** cut it further — answer is **1**.
//
//        ---
//
//        ## 💡 The Goal:
//
//        Find the **maximum number of parts** (pieces) you can make such that:
//
//        * The string is rearranged once,
//        * Then cut into equal-length **contiguous substrings**,
//        * All substrings are **exactly the same**.
//
//        ---
//
//        ## 🤔 Why Is Frequency Important?
//
//        If you're cutting into `k` identical parts, then:
//
//        * Each part must have the **same frequency of characters**.
//        * So, the total count of each character must be divisible by `k`.
//
//        That’s why we check if each character's frequency is divisible by `k`.
//
//        ---
//
//        Would you like a visual example or animation-like explanation next?
//



//BRUTE FORCE APPROACH

import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "abccdcabacda";
        int n = s.length();

        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int maxPieces = 1; // At least 1 piece is always possible

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue; // Skip if string can't be evenly divided

            boolean canDivide = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] % k != 0) {
                    canDivide = false;
                    break;
                }
            }

            if (canDivide) {
                maxPieces = Math.max(maxPieces, k);
            }
        }

        System.out.println(maxPieces);
    }
}


//OPTIMAL APPROACH
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "aabbccdd";  // You can change this string to test other cases
        int n = s.length();

        // Count frequency of all characters (supports Unicode)
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int maxPieces = 1;  // At least 1 piece is always possible

        // Try all k from 1 to n
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;  // Length must be divisible

            boolean valid = true;
            for (int count : freq.values()) {
                if (count % k != 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                maxPieces = k;
            }
        }

        System.out.println("Maximum number of equal pieces: " + maxPieces);
    }
}
