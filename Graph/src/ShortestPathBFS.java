import java.util.*;

public class ShortestPathBFS {

    public static void main(String[] args) {
        int n = 7; // Number of nodes (0 to 6)

        // Graph representation using adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (undirected)
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 3, 5);
        addEdge(graph, 4, 5);
        addEdge(graph, 5, 6);

        int source = 0;
        int destination = 6;

        findShortestPath(graph, source, destination, n);
    }

    // Utility to add undirected edge
    static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // BFS to find shortest path
    static void findShortestPath(List<List<Integer>> graph, int source, int destination, int n) {
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.offer(source);

        boolean found = false;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            if (curr == destination) {
                found = true;
                break;
            }

            for (int neighbor : graph.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = curr;
                    queue.offer(neighbor);
                }
            }
        }

        if (!found) {
            System.out.println("No path found from " + source + " to " + destination);
            return;
        }

        // Reconstruct path
        List<Integer> path = new ArrayList<>();
        int current = destination;
        while (current != -1) {
            path.add(current);
            current = parent[current];
        }

        Collections.reverse(path);

        System.out.println("Shortest path from " + source + " to " + destination + ": " + path);
        System.out.println("Length of shortest path: " + (path.size() - 1));
    }
}
