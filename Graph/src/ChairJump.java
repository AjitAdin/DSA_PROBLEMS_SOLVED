import java.util.*;

public class ChairJump {

    public static int minJumpsToEscape(int N, int X, int Y, int[] A) {
        boolean[] visited = new boolean[N + 1];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{X, 0});  // [chair number, jump count]
        visited[X] = true;

        while (!queue.isEmpty()) {

            int[] current = queue.poll();
            System.out.println(Arrays.toString(current));
            int chair = current[0];
            int jumps = current[1];

            if (chair == Y) return jumps;

            int move = A[chair]; // A is 1-indexed

            // Calculate next positions with circular wrap
            int right = (chair + move) % N;
            int left = (chair - move + N) % N;
            System.out.println("right :"+ right);
            System.out.println("left :"+ left);

            if (right == 0) right = N;
            if (left == 0) left = N;

            if (!visited[right]) {
                visited[right] = true;
                queue.add(new int[]{right, jumps + 1});
            }

            if (!visited[left]) {
                visited[left] = true;
                queue.add(new int[]{left, jumps + 1});
            }
        }

        return -1; // not reachable
    }

    public static void main(String[] args) {
        // Sample test case
        int N = 5;
        int X = 2;
        int Y = 4;

        int[] A = new int[N + 1]; // 1-indexed
        A[1] = 5;
        A[2] = 4;
        A[3] = 3;
        A[4] = 2;
        A[5] = 1;

        int result = minJumpsToEscape(N, X, Y, A);
//        System.out.println(result);

    }
}
