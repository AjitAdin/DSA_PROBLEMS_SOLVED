public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0;i<n;i++){

            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=(2*i);k++){
                System.out.print("*");

            }

            System.out.println();
        }
    }
}

//
//Pattern programs are frequently asked in coding interviews, especially for beginners. Below are some of the most commonly asked pattern programs in Java:
//
//        ---
//
//        ### **1. Right-Angled Triangle Pattern**
//        ```java
//public class Pattern1 {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//```
//        **Output:**
//        ```
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        ```
//
//        ---
//
//        ### **2. Inverted Right-Angled Triangle**
//        ```java
//public class Pattern2 {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//```
//        **Output:**
//        ```
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        ```
//
//        ---
//
//        ### **3. Pyramid Pattern**
//        ```java
//public class PyramidPattern {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = n - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//}
//```
//        **Output:**
//        ```
//        *
//        ***
//        *****
//        *******
//        *********
//        ```
//
//        ---
//
//        ### **4. Diamond Pattern**
//        ```java
//public class DiamondPattern {
//    public static void main(String[] args) {
//        int n = 5;
//
//        // Upper pyramid
//        for (int i = 1; i <= n; i++) {
//            for (int j = n - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // Lower pyramid
//        for (int i = n - 1; i >= 1; i--) {
//            for (int j = n - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//```
//        **Output:**
//        ```
//        *
//        ***
//        *****
//        *******
//        *********
//        *******
//        *****
//        ***
//        *
//        ```
//
//        ---
//
//        ### **5. Floyd’s Triangle**
//        ```java
//public class FloydsTriangle {
//    public static void main(String[] args) {
//        int n = 5, num = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }
//    }
//}
//```
//        **Output:**
//        ```
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        ```
//
//        ---
//
//        ### **6. Pascal’s Triangle**
//        ```java
//public class PascalsTriangle {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            int num = 1;
//            for (int j = 0; j < n - i; j++)
//                System.out.print(" ");
//            for (int j = 0; j <= i; j++) {
//                System.out.print(num + " ");
//                num = num * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }
//    }
//}
//```
//        **Output:**
//        ```
//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//        ```
//
//        ---
//
//        ### **7. Number Pyramid**
//        ```java
//public class NumberPyramid {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = n - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//```
//        **Output:**
//        ```
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//        ```
//
//        ---
//
//        ### **8. Butterfly Pattern**
//        ```java
//public class ButterflyPattern {
//    public static void main(String[] args) {
//        int n = 5;
//
//        // Upper part
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");
//            for (int j = 1; j <= 2 * (n - i); j++)
//                System.out.print(" ");
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//
//        // Lower part
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");
//            for (int j = 1; j <= 2 * (n - i); j++)
//                System.out.print(" ");
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }
//}
//```
//        **Output:**
//        ```
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        ```
//
//        ---
//
//These patterns are commonly asked in coding interviews for beginners to test their logic and understanding of loops. Let me know if you need more! 🚀