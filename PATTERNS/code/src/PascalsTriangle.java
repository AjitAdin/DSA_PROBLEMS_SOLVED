import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        int[][] triangle = new int[rows][rows];

        // Generate Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1; // First and last elements are always 1
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        // Print Pascal's Triangle with proper spacing
        for (int i = 0; i < rows; i++) {
            // for (int j = 0; j < rows - i; j++) {
            //     System.out.print(" "); // Printing spaces for alignment
            // }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}



































/// public class PascalTriangle {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             int num = 1;
//             for (int j = 0; j < n - i; j++){
//                 System.out.print("*");
//             }

//             for (int j = 0; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num = num * (i - j) / (j + 1);
//             }
//             System.out.println();
//         }
//     }
// }
