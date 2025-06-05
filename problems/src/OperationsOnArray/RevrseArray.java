package OperationsOnArray;

public class RevrseArray {
	
	static void  Reverse(int arr[],int n) {
		for(int i=0;i<(n/2);i++) {
			int temp=arr[n-(i+1)];
			arr[n-(i+1)]=arr[i];
			arr[i]=temp;
			
		}
		
		System.out.println("The Array After the reversing:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			System.out.print(",");
			
		}
		  
		
		
	}
	
	
	public static void main(String args[]) {
		   int arr[] = {1,2,3,4,5},n=5;
		   System.out.print("The Array before the reversing:");
		   for(int i=0;i<n;i++) {
				System.out.print(arr[i]);
				System.out.print(",");
				
			}
		   Reverse(arr,n);
		   
	}
	   
}


// two pointer approach
package OperationsOnArray;

public class ReverseArray {
    
    static void Reverse(int arr[], int n) {
        int i = 0, j = n - 1;
        
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("\nThe Array after reversing:");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]);
            if (k < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;
        System.out.print("The Array before reversing: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        Reverse(arr, n);
    }
}

