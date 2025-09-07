// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class SortArrayBasedonRiskLevels {
    public static void main(String[] args) {
        int arr[]={2,0,1,2,1,0};


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}




///best method


//bubble sort


//3rd method  Dutch National Flag Algorithm
// 
arr = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]

count = [0] * 3
for i in arr:
    count[i] += 1

# Rebuild arr in sorted (low → medium → high risk) order
index = 0
for risk_level in range(3):        # 0 → low, 1 → medium, 2 → high
    for _ in range(count[risk_level]):
        arr[index] = risk_level
        index += 1

print(arr)

