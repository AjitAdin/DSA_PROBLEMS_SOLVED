class CountNumberOfWords {
    public static void main(String[] args) {
        String s = "                    HI    AMRMY  AND DEFENSE    hello";
        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = s.split("\\s+"); // split by one or more spaces
        System.out.println(String.join(" ", words)); // optional: print cleaned version
        System.out.println(words.length);
    }
}



//  very very imp pattern 
class Main {
    public static void main(String[] args) {
        String s = "                    HI    AMRMY  AND DEFENSE    hello";
        s = s.trim();
        
        int count = 0;
        boolean inWord = false;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        
        System.out.println(count);
    }
}
