import java.util.Arrays;
public class StockSpanProblem {
    public static void main(String args[]){


        int price[]={10,4,5,90,120,80};
        int[] counts=new int [price.length];

        for(int i=1;i<price.length;i++){
            int count=1;
            for(int j=i-1;j>=0;j--){
                if(price[j]>price[i]){
                    break;
                }
                else{
                    count++;
                }
            }
            counts[i]=count;
        }
        counts[0]=1;
        System.out.println("counts:"+Arrays.toString(counts));




    }
}


// see

//import java.util.Stack;
//
//public class StockSpan {
//
//    // Function to calculate the stock span
//    public static int[] calculateSpan(int[] price) {
//        int n = price.length;
//        int[] span = new int[n];
//        Stack<Integer> stack = new Stack<>();
//
//        // Calculate the span values
//        for (int i = 0; i < n; i++) {
//            // Calculate span for the current day
//            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
//                stack.pop();
//            }
//
//            // If the stack is empty, it means no higher price was found before, so span is i+1
//            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
//
//            // Push the current index onto the stack
//            stack.push(i);
//        }
//
//        return span;
//    }
//
//    public static void main(String[] args) {
//        // Test case
//        int[] price = {100, 80, 60, 70, 60, 75, 85};
//
//        // Calculate the stock span
//        int[] span = calculateSpan(price);
//
//        // Output the result
//        for (int s : span) {
//            System.out.print(s + " ");
//        }
//    }
//}
