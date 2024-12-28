package sortingProblems;

public class insertionsort {

	
	static void sort(int arr[],int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            for(int j=(i-1);j>=0;j--){
                if(temp<arr[j]){
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
    
    public static void main(String args[]){
        int arr[]={23,1,10,5,2};
        int n=arr.length;
        sort(arr,n);
    }
	
	
}
