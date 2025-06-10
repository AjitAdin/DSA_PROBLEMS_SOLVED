import java.util.*;

public class AllSrcTOTrg {
    public static void main(String[] args) {
        int V = 7;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected graph edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 5, 6);

        int source = 0, target = 5;
        System.out.println("All paths from " + source + " to " + target + ":");
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsAllPaths(adj, source, target, visited, path);
    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void dfsAllPaths(List<List<Integer>> adj, int curr, int target, boolean[] visited, List<Integer> path) {
        visited[curr] = true;
        path.add(curr);

        if (curr == target) {
            System.out.println(path);
        } else {
            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    dfsAllPaths(adj, neighbor, target, visited, path);
                }
            }
        }

        // Backtrack
        path.remove(path.size() - 1);
        visited[curr] = false;
    }
}
