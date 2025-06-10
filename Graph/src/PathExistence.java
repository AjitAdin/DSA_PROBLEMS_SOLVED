import java.util.*;

public class PathExistence {
    public static boolean dfs(List<List<Integer>> adj, int u, int v, boolean[] visited) {
        if (u == v) return true;  // Path found

        visited[u] = true;

        for (int neighbor : adj.get(u)) {
            if (!visited[neighbor]) {
                if (dfs(adj, neighbor, v, visited)) {
                    return true;
                }
            }
        }

        return false;  // No path found
    }

    public static void main(String[] args) {
        int n = 7;  // Number of nodes
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        // Add undirected edges
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(0).add(2); adj.get(2).add(0);
        adj.get(1).add(3); adj.get(3).add(1);
        adj.get(2).add(4); adj.get(4).add(2);
        adj.get(3).add(4); adj.get(4).add(3);
        adj.get(3).add(5); adj.get(5).add(3);
        adj.get(4).add(5); adj.get(5).add(4);
        adj.get(5).add(6); adj.get(6).add(5);

        int u = 0;
        int v = 6;

        boolean[] visited = new boolean[n];
        boolean pathExists = dfs(adj, u, v, visited);
        System.out.println(Arrays.toString(visited));
        System.out.println("Path exists between " + u + " and " + v + ": " + pathExists);
    }
}


// using BFS
//import java.util.*;
//
//public class PathExistence {
//
//    public static boolean bfs(List<List<Integer>> adj, int u, int v, boolean[] visited) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(u);
//        visited[u] = true;
//
//        while (!q.isEmpty()) {
//            int curr = q.poll();
//            if (curr == v) return true;
//
//            for (int neighbor : adj.get(curr)) {
//                if (!visited[neighbor]) {
//                    visited[neighbor] = true;
//                    q.add(neighbor);
//                }
//            }
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int n = 7;  // Number of nodes
//        List<List<Integer>> adj = new ArrayList<>();
//        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
//
//        // Add undirected edges
//        adj.get(0).add(1); adj.get(1).add(0);
//        adj.get(0).add(2); adj.get(2).add(0);
//        adj.get(1).add(3); adj.get(3).add(1);
//        adj.get(2).add(4); adj.get(4).add(2);
//        adj.get(3).add(4); adj.get(4).add(3);
//        adj.get(3).add(5); adj.get(5).add(3);
//        adj.get(4).add(5); adj.get(5).add(4);
//        adj.get(5).add(6); adj.get(6).add(5);
//
//        int u = 0;
//        int v = 6;
//
//        boolean[] visited = new boolean[n];
//        boolean pathExists = bfs(adj, u, v, visited);
//
//        System.out.println(Arrays.toString(visited));
//        System.out.println("Path exists between " + u + " and " + v + ": " + pathExists);
//    }
//}


//6. Count Total Paths Between Two Nodes
//Problem: Count how many different paths exist between two nodes (without visiting any node twice).
//
//        ✅ Skills: DFS with counter
//📘 Learn: Recursive path counting
//
//7. Find All Paths with Max Depth K
//Problem: Modify DFS to only print paths with at most K steps (edges).
//
//        ✅ Skills: Depth control
//📘 Learn: Limiting recursion
