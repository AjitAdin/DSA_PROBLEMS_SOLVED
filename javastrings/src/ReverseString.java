public class ReverseString {

    public static void reverse(String s){
        String temp="";
        for(int i=s.length()-1; i>=0; i--){
         temp+=s.charAt((i));
        }
        System.out.println((temp));
    }

    public static void main(String args[]){
        String s="ajit";
        reverse(s);
    }
}




public class Main {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "ajit";
        System.out.println(reverseString(s));  // Output: tija
    }
}



| Approach                             | Time Complexity | Space Complexity | Notes                                |
| ------------------------------------ | --------------- | ---------------- | ------------------------------------ |
| Using `StringBuilder.append` in loop | O(n)            | O(n)             | Slight overhead in append operations |
| Using `StringBuilder.reverse()`      | O(n)            | O(n)             | Cleaner, same complexity             |
| Using in-place array reversal        | O(n)            | O(n)             | Most direct and minimal overhead     |
