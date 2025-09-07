class Main {
    String str;

    Main(String str) {
        this.str = str;
    }

    public void reverseString() {
        // Step 1: Trim and split on one or more spaces
        String[] words = str.trim().split("\\s+");
        StringBuilder reverseString = new StringBuilder();

        // Step 2: Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]);
            if (i != 0) {
                reverseString.append(" ");
            }
        }

        // Step 3: Output the reversed string
        System.out.println(reverseString);
    }
}

public class ReverseWordsInString {
    public static void main(String args[]) {
        String str = "   hello   ajit  how are   you   ";
        Main obj = new Main(str);
        obj.reverseString();  // Output: you are how ajit hello
    }
}





// TWO POINTER APPROACH

import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="hello ajit how are you";
        
        String[] arr=s.trim().split("\\s+");
        
        
        int l=0,r=arr.length-1;
        while(l<r){
            String temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }

        // System.out.println(Arrays.toString(arr));
        String joined = String.join(" ", arr);  // joins with space
        System.out.println(joined);  
    }
}


s="   hello   ajit  how are   you   "

s=s.split()
s.reverse()
print(" ".join(s))


    s = "   hello   ajit  how are   you   "

# Split string into words
s = s.split()
print(s)  # ['hello', 'ajit', 'how', 'are', 'you']

# Initialize pointers
l, r = 0, len(s) - 1

# Swap words
while l < r:
    s[l], s[r] = s[r], s[l]
    l += 1
    r -= 1

print(s)  # ['you', 'are', 'how', 'ajit', 'hello']
