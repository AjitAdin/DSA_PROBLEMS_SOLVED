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
