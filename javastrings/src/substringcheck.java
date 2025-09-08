public class substringcheck {
    public static boolean isSubstring(String str, String sub) {
        int strLen = str.length();
        int subLen = sub.length();

        // If the substring is longer, it can't be in the main string
        if (subLen > strLen) return false;

        // Loop through the main string
        for (int i = 0; i <= strLen - subLen; i++) {
            int j;

            // Check if substring matches starting from position i
            for (j = 0; j < subLen; j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }

            // If inner loop wasn't broken, all characters matched
            if (j == subLen) return true;
        }

        return false; // No match found
    }

    public static void main(String[] args) {
        String mainStr = "Hello, world!";
        String subStr = "world";

        if (isSubstring(mainStr, subStr)) {
            System.out.println("Substring found!");
        } else {
            System.out.println("Substring not found.");
        }
    }
}
