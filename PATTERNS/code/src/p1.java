class p1{
    public static void main(String[] args) {


        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





// Here’s a collection of **matrix-based pattern** questions along with Java code for each. These patterns include basic shapes, number arrangements, and creative designs.

// ---

// ## **1. Square Matrix Pattern**
// ```
// *****
// *****
// *****
// *****
// *****
// ```
// ### **Java Code:**
// ```java
// public class SquarePattern {
//     public static void main(String[] args) {
//         int n = 5; // Size of square
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// ## **2. Right-Angled Triangle**
// ```
// *
// * *
// * * *
// * * * *
// * * * * *
// ```
// ### **Java Code:**
// ```java
// public class TrianglePattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// ## **3. Inverted Right-Angled Triangle**
// ```
// * * * * *
// * * * *
// * * *
// * *
// *
// ```
// ### **Java Code:**
// ```java
// public class InvertedTriangle {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// ## **4. Hollow Square Matrix**
// ```
// *****
// *   *
// *   *
// *   *
// *****
// ```
// ### **Java Code:**
// ```java
// public class HollowSquare {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// ## **5. Hollow Right-Angled Triangle**
// ```
// *
// * *
// *   *
// *     *
// ********
// ```
// ### **Java Code:**
// ```java
// public class HollowTriangle {
//     public static void main(String[] args) {
//         int n = 6;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1 || j == i || i == n) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// ## **6. Pyramid Pattern**
// ```
//     *    
//    ***   
//   *****  
//  ******* 
// *********
// ```
// ### **Java Code:**
// ```java
// public class PyramidPattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// ## **7. Number Triangle**
// ```
// 1
// 12
// 123
// 1234
// 12345
// ```
// ### **Java Code:**
// ```java
// public class NumberTriangle {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// ## **8. Number Pyramid**
// ```
//     1    
//    121   
//   12321  
//  1234321 
// 123454321
// ```
// ### **Java Code:**
// ```java
// public class NumberPyramid {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             for (int j = i - 1; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// ## **9. Checkerboard Pattern**
// ```
// * * * * *
//  * * * * 
// * * * * *
//  * * * * 
// * * * * *
// ```
// ### **Java Code:**
// ```java
// public class CheckerboardPattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if ((i + j) % 2 == 0) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// ## **10. Spiral Matrix (Filling Numbers in Spiral Order)**
// ```
// 1  2  3  4  
// 12 13 14 5  
// 11 16 15 6  
// 10 9  8  7  
// ```
// ### **Java Code:**
// ```java
// public class SpiralMatrix {
//     public static void main(String[] args) {
//         int n = 4;
//         int[][] matrix = new int[n][n];
//         int top = 0, bottom = n - 1, left = 0, right = n - 1;
//         int num = 1;

//         while (num <= n * n) {
//             for (int i = left; i <= right; i++) matrix[top][i] = num++;
//             top++;
//             for (int i = top; i <= bottom; i++) matrix[i][right] = num++;
//             right--;
//             for (int i = right; i >= left; i--) matrix[bottom][i] = num++;
//             bottom--;
//             for (int i = bottom; i >= top; i--) matrix[i][left] = num++;
//             left++;
//         }

//         for (int[] row : matrix) {
//             for (int col : row) {
//                 System.out.printf("%2d ", col);
//             }
//             System.out.println();
//         }
//     }
// }
// ```

// ---

// These are some of the most common **matrix-based pattern questions** in Java. Let me know if you need more! 🚀