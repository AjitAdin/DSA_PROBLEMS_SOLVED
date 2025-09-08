import java.util.*;

public class InvadeEnemy {

    public static void Invade(String[][] q, boolean[][] invaded) {
        Queue<int[]> queue = new LinkedList<>();
        int n = q.length;
        int m = q[0].length;

        // Add all 'A' cells as starting points
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (q[i][j].equals("A")) {
                    queue.add(new int[]{i, j});
                    invaded[i][j] = true;
                }
            }
        }

        int second = 0;
        int[] drow = {-1, 1, 0, 0};
        int[] dcol = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int size = queue.size(); // all nodes at current time level

            for (int s = 0; s < size; s++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                for (int k = 0; k < 4; k++) {
                    int nrow = r + drow[k];
                    int ncol = c + dcol[k];

                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                            && !invaded[nrow][ncol]
                            && q[nrow][ncol].equals("E")) {
                        queue.add(new int[]{nrow, ncol});
                        invaded[nrow][ncol] = true;
                        q[nrow][ncol] = "A"; // mark invaded
                    }
                }
            }

            // Only increase time if queue is not empty (means next layer exists)
            if (!queue.isEmpty()) {
                second++;
            }
        }

        // Check if any 'E' remains
        for (int I = 0; I < n; I++) {
            for (int J = 0; J < m; J++) {
                if (q[I][J].equals("E")) {
                    System.out.println("-1");
                    return;
                }
            }
        }

        System.out.println(second);
    }

    public static void main(String[] args) {
        // Hardcoded input
        String[][] q = {
                {"A", "E"},
                {"*", "*"},
                {"E", "E"}
        };

        int N = q.length;
        int M = q[0].length;
        boolean[][] invaded = new boolean[N][M];

        Invade(q, invaded);
    }
}





//5. EASY
//General Ali has initiated an invasion in the shape
//of an N×M grid behind enemy lines given by a 2D
//array Q.
//The grid consists of cells represented by the
//following characters:
//        1. ‘*’: Represents a block cell that cannot be visited.
//        2. ‘A’: Represents a cell that has been invaded by
//General Ali’s army.
//        3. ‘E’: Represents a cell that contains the enemy’s
//army.
//General Ali’s invasion progresses as follows: At each
//second, any cell marked ‘E’ that shares a side with a
//cell marked ‘A’ is invaded by General Ali’s army.
//Find the minimum time it will take for General Ali’s
//army to invade all enemy cells (‘E’) in the grid. If it’s
//not possible to invade all enemy cells, return −1.
//Input Format
//The first line contains an integer, N, denoting the
//number of elements in Q.
//The next line contains an integer, M, denoting the
//given integer.
//Each line i of the N subsequent lines (where 0 ≤ i <
//        N) contains a string describing Q[i].
//Constraints
//1 <= N <= 10^3
//        1 <= M <= 10^3
//        1 <= len(Q[i]) <= 10^5
//Sample Test Cases
//Case 1
//Input:
//        2
//        2
//AE
//        EE
//Output:
//        2
//Explanation:
//        Given N = 2, M = 2, Q = [[“AE”], [“EE”]].
//After 1 second the enemy’s country will be like Q =
//[[“AA”], [“AE”]].
//After 2 seconds the enemy’s country will be like Q =
//[[“AA”], [“AA”]].
//Hence, the answer for this case is equal to 2.
//Case 2
//Input:
//        3
//        2
//AE
//*E
//        EE
//Output:
//        4 Explanation:
//        Given N = 3, M = 2, Q = [[“AE”], [“*E”], [“EE”]].
//After 1 second the enemy’s country will be like Q =
//[[“AA”], [“AE”], [“EE”]].
//After 2 seconds the enemy’s country will be like Q =
//[[“AA”], [“AA”], [“AE”]].
//After 3 seconds the enemy’s country will be like Q =
//[[“AA”], [“AA”], [“AA”]]
//Hence, the answer for this case is equal to 4.
//Case 3
//Input:
//        3
//        2
//AE
//**
//EE
//Output:
//        -1
//Explanation:
//        Given N = 3, M = 2, Q = [[“AE”], [“**