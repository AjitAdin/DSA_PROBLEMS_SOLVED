public class CountNumberOfWords {


    public static int count(String str){

       int count=0;
       String[] words=str.split(" ");
       for(String word:words){

           count++;

       }
       return count;
    }

    public static void main(String args[]){
        String str="HI AMRMY AND DEFENSE";
        System.out.println(count(str));
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
