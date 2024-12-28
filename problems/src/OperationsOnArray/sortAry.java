package OperationsOnArray;
import java.util.Scanner;
public class sortAry {
	
	static boolean sorted(int arr[],int n) {
		boolean flag=true;
		for(int i=0;i<(n-1);i++) {
			if(arr[i]>arr[i+1]) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
    public static void main(String args[]) {
    	Scanner input=new Scanner(System.in);
    	System.out.println("Enter the nummber of elements in the array:");
    	int n=input.nextInt();
    	System.out.println("Enter the elements of the array:");
    	int arr[]=new int[n]; 
    	for(int i=0;i<n;i++) {
    		arr[i]=input.nextInt();
    	}
    	
    	if(sorted(arr,n)) {
    		System.out.println("Sorted");
    	}
    	else {
    		System.out.println("Not Sorted");
    	}
    	
    }
}
