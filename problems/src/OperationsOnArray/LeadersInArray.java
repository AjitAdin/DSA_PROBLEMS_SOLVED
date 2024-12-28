package OperationsOnArray;
//Write a program to print all the LEADERS in the array. An element is a leader 
//if it is greater than all the elements to its right side. And the rightmost element is always a leader. 
public class LeadersInArray {
	  static void Leader(int arr[],int n){
	        for(int i=0;i<(n-1);i++){
	            int flag=0;
	            for(int j=(i+1);j<(n-1);j++){
	                if(arr[i]<=arr[j]){
	                     flag=1;
	                      break;
	                }
	               
	            }
	            if(flag==0){
	                 System.out.println(arr[i]);
	            }
	            
	        }
	        System.out.println(arr[n-1]);
	    }
	    
	    public static void main(String[] args) {
	    //   int arr[]={16,17,4,3,5,2};
//	    int arr[]={1,2,3,4,5,2};
	    int arr[]={1,2,5,3,4,5,2};
	      int n=arr.length;
	      Leader(arr,n);
	    }
}


//similar approach but the small logic is change
//class LeadersInArray
//{
//	/*Java Function to print leaders in an array */
//	void printLeaders(int arr[], int size)
//	{
//		for (int i = 0; i < size; i++)
//		{
//			int j;
//			for (j = i + 1; j < size; j++)
//			{
//				if (arr[i] <=arr[j])
//					break;
//			}
//			if (j == size) // the loop didn't break
//				System.out.print(arr[i] + " ");
//		}
//	}
//
//	/* Driver program to test above functions */
//	public static void main(String[] args)
//	{
//		LeadersInArray lead = new LeadersInArray();
//		int arr[] = new int[]{16, 17, 4, 3, 5, 2};
//		int n = arr.length;
//		lead.printLeaders(arr, n);
//	}
//}

//efficient algorithm;
//class LeadersInArray
//{
//	/* Java Function to print leaders in an array */
//	void printLeaders(int arr[], int size)
//	{
//		int max_from_right = arr[size-1];
//
//		/* Rightmost element is always leader */
//		System.out.print(max_from_right + " ");
//	
//		for (int i = size-2; i >= 0; i--)
//		{
//			if (max_from_right < arr[i])
//			{		
//			max_from_right = arr[i];
//			System.out.print(max_from_right + " ");
//			}
//		}
//	}
//
//	/* Driver program to test above functions */
//	public static void main(String[] args)
//	{
//		LeadersInArray lead = new LeadersInArray();
//		int arr[] = new int[]{16, 17, 4, 3, 5, 2};
//		int n = arr.length;
//		lead.printLeaders(arr, n);
//	}
//}

