
//Remove All Duplicates from a String
//
//
//22
//
//        0
//Problem Statement: Given a String remove all the duplicate characters from the given String.
//
//Examples:
//
//Example 1:
//Input: s = "bcabc"
//Output: “bca"
//
//Explanation: Duplicate Characters are removed
//Example 2:
//Input: s = "cbacdcbc"
//Output: "cbad"
//Explanation: Duplicate Characters are removed

public class RemoveAllDuplicatesfromaString{


    public static void Remove(String str){

        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            boolean isDuplicate=false;
            System.out.println("i= "+i);
            for(int j=0;j<i;j++){
                
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i)+" == "+str.charAt(j));
                    isDuplicate=true;
                    break;
                }
            }// 

            if(!isDuplicate){
                result.append(str.charAt(i));
                System.out.println("appended -- "+str.charAt(i));
            }
        }//
        // System.out.println(result.toString());//output
    }

    public static void main(String args[]){

        String str="fcaabbdacdcbc";
        Remove(str);
    }
}

//method 2
// class Main {
//     public static void main(String[] args) {
//        String s="abcbcadt";//abcdt
//        boolean[] visited=new boolean[256];
//        StringBuilder sb=new StringBuilder();
       
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if(!visited[ch]){
//                visited[ch]=true;
//                sb.append(ch);
//            }
//        }
//       System.out.println(sb.toString());
//     }
// }


// You are dealing with Unicode characters (not just ASCII) — like emojis, special symbols, etc.
//Automatically avoids duplicates — no need to manually check if an element already exists.
// import java.util.HashSet;

// class Main {
//     public static void main(String[] args) {
//         String s = "abcbcadt";
//         HashSet<Character> seen = new HashSet<>();
//         StringBuilder sb = new StringBuilder();
        
//         for (char ch : s.toCharArray()) {
//             if (!seen.contains(ch)) {
//                 seen.add(ch);
//                 sb.append(ch);
//             }
//         }
        
//         System.out.println(sb.toString());
//     }
// }



//linked hashset
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "sinstriiintng";
        
        Set<Character> hs = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (char c : hs) {
            sb.append(c);
        }

        System.out.println("Result: " + sb.toString());
    }
}


s="cbacdcbc"
seen=set()
new_s=[]

for i in s:
     if i not in seen:
         seen.add(i)
         new_s.append(i)


print("".join(new_s))


//see another question i e leetcode 316 vimp



