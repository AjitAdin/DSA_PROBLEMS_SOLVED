//https://takeuforward.org/data-structure/print-all-the-duplicates-in-the-string/

public class PrintDuplicateCharacters {



    public static void check(String str){

        int mincount=1;


        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>mincount && str.indexOf(str.charAt(i))==i){
                System.out.println(str.charAt(i)+"-"+count);
            }
        }
    }

    public static void main(String args[]){

        String str="sinstriiintng";
        check(str);
    }
}
//
//str.indexOf(str.charAt(i)) == i: This checks if the first appearance of the character is at the current position i.
//
//If this condition is true, it means that the character has not been processed before, so it’s safe to print it.
//If it’s false, it means we have already counted and printed this character in an earlier iteration.



//M2

class Main {
    public static void main(String[] args) {
       String str="sinstriiintng";
       boolean[] visited=new boolean[256];
       
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           int count=0;
           if(!visited[ch]){
               for(int j=0;j<str.length();j++){
               if(ch==str.charAt(j)){
                   count++;
               }
           }
           if(count>1){
               System.out.println(ch+" - "+count);
           }
           visited[ch]=true;
           }
           
           
       }
    }
}


//M3
class Main {
    public static void main(String[] args) {
        String str = "sinstriiintng";
        int[] freq = new int[256];

        // First pass: count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Second pass: print characters with frequency > 1 (only once)
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char)i + " - " + freq[i]);
            }
        }
    }
}

