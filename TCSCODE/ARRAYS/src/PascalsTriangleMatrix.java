// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class PascalsTriangleMatrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=input.nextInt();

        int arr[][]=new int[rows][rows];

        int n=arr.length;


        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }

        for(int i=0;i<n;i++){

            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}