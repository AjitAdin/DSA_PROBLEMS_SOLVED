class change {
    String str;
    String substr;

    change(String str, String substr) {
        this.str = str;
        this.substr = substr;
    }

    public void getIndex() {
        int index = -1; // -1 indicates that the substring was not found
        int strLength = str.length();
        int substrLength = substr.length();

        // Loop to check each possible starting position in 'str'
        for (int i = 0; i <= strLength - substrLength; i++) {
            int j;

            // Check if substring starting from this index matches
            for (j = 0; j < substrLength; j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    break;
                }
            }

            // If j reached the end of substr, we found a match
            if (j == substrLength) {
                index = i;
                break;
            }
        }

        System.out.println("Starting index of substring: " + index);
    }
}

public class PositionOfSubStringWithinString {
    public static void main(String[] args) {
        String str = "takeuforward";
        String substr = "forward";
        change obj = new change(str, substr);
        obj.getIndex();
    }
}

//
//
//
//
//
//
//
//
//Let’s assume the outer loop starts at i = 5, which is where "forward" begins in str.
//
//        i = 5:
//j = 0: str.charAt(i + j) becomes str.charAt(5 + 0), which is str.charAt(5) = 'f'. This matches substr.charAt(0) = 'f'.
//j = 1: str.charAt(i + j) becomes str.charAt(5 + 1), which is str.charAt(6) = 'o'. This matches substr.charAt(1) = 'o'.
//j = 2: str.charAt(i + j) becomes str.charAt(5 + 2), which is str.charAt(7) = 'r'. This matches substr.charAt(2) = 'r'.
//j = 3: str.charAt(i + j) becomes str.charAt(5 + 3), which is str.charAt(8) = 'w'. This matches substr.charAt(3) = 'w'.
//j = 4: str.charAt(i + j) becomes str.charAt(5 + 4), which is str.charAt(9) = 'a'. This matches substr.charAt(4) = 'a'.
//j = 5: str.charAt(i + j) becomes str.charAt(5 + 5), which is str.charAt(10) = 'r'. This matches substr.charAt(5) = 'r'.
//j = 6: str.charAt(i + j) becomes str.charAt(5 + 6), which is str.charAt(11) = 'd'. This matches substr.charAt(6) = 'd'.
//Since all characters of substr matched str starting from index 5, we know that substr is found in str starting at i = 5.
//
//Summary
//strLength - substrLength helps limit our search to indexes where substr can completely fit within str.
//        str.charAt(i + j) allows us to compare each character of substr with the corresponding character in str, starting from i.
//Using this approach, we can correctly identify the starting index of substr within str.
//
//
//
//
//
//
//
//
//
//
//
//ChatGPT can make mi