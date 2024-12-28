package OperationsOnArray;
//Minimum Consecutive Flips
//the main logic is we have to flip the element which is second because 1,0 in this 0 and 
//1,0,1,0,1 in this 0 because we have to put vice versa number 
public class MinimumConsecutiveFlips {
	
		
	static void printGroups(int arr[], int n)
	{
		
		// Traverse through all array elements
		// starting from the second element
		for(int i = 1; i < n; i++)
		{
			
		// If current element is not same
		// as previous
		if (arr[i] != arr[i - 1])
		{
				
			// If it is same as first element
			// then it is starting of the interval
			// to be flipped.
			if (arr[i] != arr[0])
				System.out.print("From " + i + " to ");
				
			// If it is not same as previous
			// and same as first element, then
			// previous element is end of interval
			else
				System.out.println(i - 1);
		}
		}
		
		// Explicitly handling the end of
		// last interval
		if (arr[n - 1] != arr[0])
			System.out.println(n - 1);
	}
		
	// Driver code
	public static void main(String[] args)
	{
		int arr[] = {0, 1, 1, 0, 0, 0, 1, 1};
		int n = arr.length;
		
		printGroups(arr, n);
	}
	}

//similar approach
//class Main {
//
//    static void a(int arr[], int n) {
//        int c1 = 0;
//        int c0 = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] == 1) {
//                if (arr[i + 1] != 1) {
//                    c1++;
//                }
//            } else {
//                if (arr[i + 1] != 0) {
//                    c0++;
//                }
//            }
//        }
//        if (arr[n - 1] == 1) {
//            c1++;
//        } else {
//            c0++;
//        }
//        System.out.println("1's segments: " + c1 + ", 0's segments: " + c0);
//
//        if (c0 < c1) {
//            for (int i = 0; i < n; i++) {
//                if (arr[i] == 0) {
//                    int start = i;
//                    while (i < n && arr[i] == 0) {
//                        i++;
//                    }
//                    int end = i - 1;
//                    System.out.println("From " + start + " to " + end);
//                }
//            }
//        } else {
//            for (int i = 0; i < n; i++) {
//                if (arr[i] == 1) {
//                    int start = i;
//                    while (i < n && arr[i] == 1) {
//                        i++;
//                    }
//                    int end = i - 1;
//                    System.out.println("From " + start + " to " + end);
//                }
//            }
//        }
//    }
//
//    public static void main(String args[]) {
//      //  int arr[] = {1, 0, 0, 0, 1, 0, 0, 1, 1, 1};
//      int arr[] = {0,1,1,1,1,1,1};//From 1 to 6 because 
//        int n = arr.length;
//        a(arr, n);
//    }
//}

