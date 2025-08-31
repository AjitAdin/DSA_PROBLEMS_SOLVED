package OperationsOnArray;
//PROGRAM FOR THE INSERTION OF THE ELEMENT IN THE STATIC CSIZED ARRAAYS
//(WHERE THE SIZE IS FIXED)
public class InsertElm {
	static int Insert(int arr[],int ele,int pos,int cap,int n) {
 	   if(n==cap) {
 		  return n;//if the static array is full means we have to return the array size;
 	   }
 	   int ind=pos-1;
 	   for(int i=n-1;i>=ind;i--) {
 		   arr[i+1]=arr[i];
 	   }
 	   arr[ind]=ele;
 	   
 	   
	return n+1;
	
    }
	public static void main(String args[]) {
		int arr[]=new int[5],cap=5,n=3;
		arr[0]=5;arr[1]=10;arr[2]=20;
		int ele=6,pos=2;
		System.out.println("Before the insertion:");
		for(int i=0;i<n;i++) {
			System.out.println("index:"+i+" "+arr[i]+" :");
		}
		n=Insert(arr,ele,pos,cap,n);
		System.out.println("After the insertion:");
		for(int i=0;i<n;i++ ) {
			System.out.println("index:"+i+" "+arr[i]+": ");	}
	}
}




// py
before = [5, 10, 20]

# Insert 16 at index 1
after = before[:]  # make a copy
after.insert(1, 16)

# keep the same length as before
after = after[:]

print("Before:", before)
print("After :", after)
