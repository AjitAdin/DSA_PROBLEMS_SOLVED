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



def pascals_triangle(n):
    triangle = []  # list to hold rows of Pascal's triangle

    for i in range(n):
        row = [1] * (i + 1)  # each row starts and ends with 1
        print("row:",row)
        for j in range(1, i):
            row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]  # sum of two numbers above
        triangle.append(row)

    return triangle


# Example usage
n = 6  # number of rows
triangle = pascals_triangle(n)

# # Pretty print the triangle
# for row in triangle:
#     print(" ".join(map(str, row)).center(n * 2))

for i in triangle:
    print(i)
