import javax.sound.midi.SysexMessage;

public class MaximumOccuringCharcter {


    public static void Check(String str){
        int maxcount=0;
        char c='/';
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(maxcount<count){
                maxcount=count;
                c=str.charAt(i);

            }
        }
        System.out.println(c);
    }

// 
    public static void main(String args[]){
        String str="takeuforward";
        Check(str);
    }
}


// O(n+K) n=lenght of the string and k=length of the array

// class Main {
//     public static void Check(String str) {
//         int[] arr = new int[26];
//         // Count frequencies of lowercase letters
//         for (char c : str.toLowerCase().toCharArray()) {
//             if (c >= 'a' && c <= 'z') { // Only process lowercase letters
//                 arr[c - 'a']++;
//             }
//         }
//         int max = 0;
//         int index = 0;
//         // Find the maximum frequency
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//                 index = i;
//             }
//         }
//         // Print the maximum frequency and the corresponding letter
//         if (max > 0) {
//             System.out.println("Max frequency: " + max + " (Letter: " + (char) (index + 'a') + ")");
//         } else {
//             System.out.println("No valid letters found");
//         }
//     }
    
//     public static void main(String[] args) {
//         String str = "abcddda";
//         Check(str);
//     }
// }
