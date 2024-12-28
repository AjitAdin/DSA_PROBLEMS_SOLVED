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