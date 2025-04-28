package sortingProblems;
import java.util.Scanner;

class Sort{
	
	
	//System.out.println("sorted:");error
	void bubblesort(int arr[],int n) {
		
		System.out.println("sorted:");
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {//int j = 0; j < n - 1 - i; j++  its for efficient one 
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	

}


public class BubbleSort {

	public static void main(String args[]) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enetr the number of elemens in the array:");
		n=input.nextInt();
		int[] arr=new int[n];
		System.out.println("Enetr   elemens of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		Sort obj=new Sort();
		
		obj.bubblesort(arr,n);
	
		
		
	}
}
//important
//class bubblesort{
//    static void sort(int arr[],int n){
//        int flag;
//        for(int i=0;i<n-1;i++){
//            flag=0;
//            for(int j=1;j<n-i;j++){
//                if(arr[j-1]>arr[j]){
//                    int temp=arr[j-1];
//                    arr[j-1]=arr[j];
//                    arr[j]=temp;
//                    flag=1;//if swapping is done continue
//                }
//            }
//             if(flag==0){//if no swapping is done break the loop;
//                    break;
//                }
//        }
//        
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
//    }
//    
//    
//    
//    public static void main(String[] main){
//        int arr[]={15,16,6,8,5};
//        int n=arr.length;
//        sort(arr,n);
//    }
//}


