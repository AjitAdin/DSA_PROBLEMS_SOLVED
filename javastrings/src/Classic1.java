✅ When to Use
For short strings or simple problems, the naive approach is fine.

For large strings or repeated searches, consider better algorithms like:

KMP (Knuth-Morris-Pratt) – O(n + m)

Rabin-Karp – O(n + m) on average (uses hashing)

Boyer-Moore – Efficient for practical large text searches




public class Classic1 {
    public static void main(String args[]) {
        String str = "takeuforword";
        String substr = "forword";
        int result = -1;

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            int index = 0;

            while (index < substr.length() && str.charAt(i + index) == substr.charAt(index)) {
                index++;
            }

            if (index == substr.length()) {
                result = i; // Full match found at index i
                break;      // Stop after first match
            }
        }

        System.out.println(result);
    }
}


//method 2

public class SubstringSearch {
    public static void main(String[] args) {
        String str = "hello world";
        String substr = "world";

        int ptr1 = 0;
        int ptr2 = 0;
        int result = -1;

        while (ptr1 < str.length() && ptr2 < substr.length()) {
            if (str.charAt(ptr1) == substr.charAt(ptr2)) {
                ptr1++;
                ptr2++;
            } else {
                ptr1 = ptr1 - ptr2 + 1; // Move ptr1 to next possible start
                ptr2 = 0;
            }

            if (ptr2 == substr.length()) {
                result = ptr1 - ptr2;  // Match found: calculate starting index
                break;
            }
        }

        System.out.println(result);
    }
}
