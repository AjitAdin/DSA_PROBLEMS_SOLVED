import java.util.*;

class BFS {

    public static void bfs(List<List<Integer>> adj) {
        int v = adj.size();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[v];
        List<Integer> bf = new ArrayList<>();

        // Mark starting node as visited and enqueue it
        q.add(0);
        vis[0] = true;

        System.out.println("Initial Queue: " + q);
        System.out.println("Initial Visited: " + Arrays.toString(vis));

        while (!q.isEmpty()) {
            // System.out.println("\nQueue: " + q);
            // System.out.println("Visited: " + Arrays.toString(vis));

            int curr = q.poll();
            // System.out.println("Current Vertex: " + curr);
            bf.add(curr);
            System.out.println("BFS Traversal So Far: " + bf);

            for (int x : adj.get(curr)) {
                if (!vis[x]) {
                    q.add(x);
                    vis[x] = true;
                }
            }
        }

        System.out.println("\nFinal BFS Traversal: " + bf);
    }

    public static void main(String[] args) {
        int vertices = 7;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges for the graph shown in the image
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);
        adj.get(4).add(3);
        adj.get(4).add(5);
        adj.get(5).add(3);
        adj.get(5).add(4);
        adj.get(5).add(6);
        adj.get(6).add(5);

        System.out.println("Adjacency List: " + adj);

        bfs(adj);
    }
}

//_________________________________________________________________________
// BFS FOR DISCONNECTED COMPONENTS
//
//import java.util.*;
//
//class Main {
//
//    // Modified BFS to return traversal result
//    public static List<Integer> bfs(List<List<Integer>> adj, boolean[] vis, int start) {
//        Queue<Integer> q = new LinkedList<>();
//        List<Integer> traversal = new ArrayList<>();
//
//        q.add(start);
//        vis[start] = true;
//
//        while (!q.isEmpty()) {
//            int curr = q.poll();
//            traversal.add(curr);
//
//            for (int neighbor : adj.get(curr)) {
//                if (!vis[neighbor]) {
//                    q.add(neighbor);
//                    vis[neighbor] = true;
//                }
//            }
//        }
//
//        return traversal;
//    }
//
//    public static void main(String[] args) {
//        int vertices = 7;
//        List<List<Integer>> adj = new ArrayList<>();
//
//        // Initialize adjacency list
//        for (int i = 0; i < vertices; i++) {
//            adj.add(new ArrayList<>());
//        }
//
//        // Component 1
//        adj.get(0).add(1);
//        adj.get(0).add(2);
//        adj.get(1).add(0);
//        adj.get(1).add(3);
//        adj.get(2).add(0);
//        adj.get(2).add(4);
//        adj.get(3).add(1);
//        adj.get(3).add(4);
//        adj.get(4).add(2);
//        adj.get(4).add(3);
//
//        // Component 2
//        adj.get(5).add(6);
//        adj.get(6).add(5);
//
//        boolean[] vis = new boolean[vertices];
//        List<Integer> fullTraversal = new ArrayList<>();
//
//        for (int i = 0; i < vertices; i++) {
//            if (!vis[i]) {
//                List<Integer> componentTraversal = bfs(adj, vis, i);
//                fullTraversal.addAll(componentTraversal);
//            }
//        }
//
//        // Final Combined BFS Traversal
//        System.out.println("Final Combined BFS Traversal of the entire graph: " + fullTraversal);
//
//        // Print Adjacency List
//        System.out.println("\nAdjacency List:");
//        for (int i = 0; i < adj.size(); i++) {
//            System.out.println(i + ": " + adj.get(i));
//        }
//    }
//}
//




















//
//import java.util.*;
//
//class IterativeDFS {
//
//    public static void dfs(List<List<Integer>> adj, int start) {
//        int v = adj.size();
//        boolean[] vis = new boolean[v];
//        Stack<Integer> stack = new Stack<>();
//        List<Integer> traversal = new ArrayList<>();
//
//        stack.push(start);
//        vis[start] = true;
//
//        while (!stack.isEmpty()) {
//            int curr = stack.pop();
//            traversal.add(curr);
//
//            // Push adjacent vertices in reverse order to maintain correct traversal order
//            List<Integer> neighbors = adj.get(curr);
//            Collections.reverse(neighbors);
//            for (int neighbor : neighbors) {
//                if (!vis[neighbor]) {
//                    stack.push(neighbor);
//                    vis[neighbor] = true;
//                }
//            }
//        }
//
//        System.out.println("Final Iterative DFS Traversal: " + traversal);
//    }
//
//    public static void main(String[] args) {
//        int vertices = 7;
//        List<List<Integer>> adj = new ArrayList<>();
//
//        for (int i = 0; i < vertices; i++) {
//            adj.add(new ArrayList<>());
//        }
//
//        // Adding edges
//        adj.get(0).add(1);
//        adj.get(0).add(2);
//        adj.get(1).add(0);
//        adj.get(1).add(3);
//        adj.get(2).add(0);
//        adj.get(2).add(4);
//        adj.get(3).add(1);
//        adj.get(3).add(4);
//        adj.get(5).add(6);
//        adj.get(6).add(5);
//
//        System.out.println("Adjacency List: " + adj);
//
//        dfs(adj, 0);
//    }
//}
