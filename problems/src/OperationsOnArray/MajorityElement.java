package OperationsOnArray;
//Find the majority element in the array. A majority element in an array A[] of size n is an element that appears
//more than n/2 times (and hence there is at most one such element). 
public class MajorityElement {
	
	static void Majority(int arr[],int n) {
		int value=-1;
		int precount =0;
		for(int i=0;i<n;i++) {
			
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(precount<count) {
				precount=count;
				value=arr[i];
			}
		}
		
		if(precount>(n/2)) {
			System.out.println("count"+precount+" "+"element"+value);
		}else {
			System.out.println("No majority element");
		}
		
	}
	
public static void main(String args[]) {
	//int arr[]= {3,3,4,2,4,4,2,4};
	int arr[]= {3,3,4,2,4,4,2,4,4};
	int n=arr.length;
	Majority(arr,n);
}
}




// Moore’s Voting Algorithm:

/* Program for finding out majority element in an array */

//class MajorityElement {
//	/* Function to print Majority Element */
//	void printMajority(int a[], int size)
//	{
//		/* Find the candidate for Majority*/
//		int cand = findCandidate(a, size);
//
//		/* Print the candidate if it is Majority*/
//		if (isMajority(a, size, cand))
//			System.out.println(" " + cand + " ");
//		else
//			System.out.println("No Majority Element");
//	}
//
//	/* Function to find the candidate for Majority */
//	int findCandidate(int a[], int size)
//	{
//		int maj_index = 0, count = 1;
//		int i;
//		for (i = 1; i < size; i++) {
//			if (a[maj_index] == a[i])
//				count++;
//			else
//				count--;
//			if (count == 0) {
//				maj_index = i;
//				count = 1;
//			}
//		}
//		return a[maj_index];
//	}
//
//	/* Function to check if the candidate occurs more
//	than n/2 times */
//	boolean isMajority(int a[], int size, int cand)
//	{
//		int i, count = 0;
//		for (i = 0; i < size; i++) {
//			if (a[i] == cand)
//				count++;
//		}
//		if (count > size / 2)
//			return true;
//		else
//			return false;
//	}
//
//	/* Driver code */
//	public static void main(String[] args)
//	{
//		MajorityElement majorelement
//			= new MajorityElement();
//		int a[] = { 6,8,6,4,8,6,8,6,6,6,6,6,4,1};
//	
//		// Function call
//		int size = a.length;
//		majorelement.printMajority(a, size);
//	}
//}
