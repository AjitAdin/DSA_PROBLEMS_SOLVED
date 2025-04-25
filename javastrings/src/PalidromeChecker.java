import java.util.Arrays;
class PalindromeChecker{

    private String text;
    public PalindromeChecker(String text){
        this.text=text;
    }
    //METHOD 1
    public boolean isPlaindromeUsingReverse(){
        StringBuilder reversed=new StringBuilder();
        for(int i=text.length()-1;i>=0;i--){
            reversed.append(text.charAt(i));
        }
        // Convert both original and reversed text to character arrays for comparison
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reversed.toString().toCharArray();

        // Return whether the arrays are equal
        return Arrays.equals(originalArray, reversedArray);
    }

    //METHOD 1

    public  boolean isPalindromeUsingTwoPointers(){
        int left=0;
        int right=text.length()-1;
        while(left<right){
            if(text.charAt(left)!=text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

public class PalidromeChecker {
    public static void main(String[] args){
        PalindromeChecker obj1=new PalindromeChecker("soos oto soos");

        System.out.println(obj1.isPlaindromeUsingReverse());
        System.out.println(obj1.isPalindromeUsingTwoPointers());
    }
}


// EASY METHODS 


// class Main {
//     public static void main(String args[]) {
//         String str1 = "soos";
//         String str2 = "ajit";
        
//         StringBuilder rev = new StringBuilder();
        
//         for (int i = str1.length() - 1; i >= 0; i--) {
//             rev.append(str1.charAt(i));
//         }
//         System.out.println(rev);
        
//         if (str1.equals(rev.toString())) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }
//     }
// }


//2ND METHOD
// class Main {
//     public static void main(String args[]) {
//         StringBuilder str1 = new StringBuilder("soos");
        
//         StringBuilder rev = new StringBuilder(str1).reverse();
        
//         if (str1.toString().equals(rev.toString())) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }
//     }
// }
