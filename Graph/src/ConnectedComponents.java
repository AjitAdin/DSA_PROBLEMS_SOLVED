import java.util.*;

class ConnectedComponents {
    // Method to find the number of connected components
    public int findNumberOfComponent(int V, List<List<Integer>> edges) {
        // Step 1: Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u); // Undirected graph
        }
        System.out.println(adj);
        // Step 2: Use DFS to count components
        boolean[] visited = new boolean[V];
        int components = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                components++;
                dfs(i, adj, visited);
            }
        }

        return components;
    }

    // DFS helper method
    private void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }

    // Main method with a sample test case
    public static void main(String[] args) {
        ConnectedComponents solution = new ConnectedComponents();
        int V = 5;

        List<List<Integer>> edges = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );

        // System.out.println(edges);

        int result = solution.findNumberOfComponent(V, edges);
        System.out.println("Number of connected components: " + result);
    }
}
