import java.util.*;

class DFS {
    private List<List<Integer>> adjList;
    private int nodes;

    public DFS(int nodes) {
        this.nodes = nodes;
        adjList = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // Since it's an undirected graph
    }

    public void dfs(int node, boolean[] visited) {
        if (visited[node]) return;

        visited[node] = true;
        System.out.print(node + " ");  // Process node

        for (int neighbor : adjList.get(node)) {
            dfs(neighbor, visited);
        }
    }

    public void dfsDisconnected() {
        boolean[] visited = new boolean[nodes];

        // Ensuring DFS covers all disconnected components
        for (int i = 0; i < nodes; i++) {
            if (!visited[i]) {
                System.out.println("\nComponent starting from node " + i + ":");
                dfs(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        int nodes = 7;
        DFS graph = new DFS(nodes);

        // Adding all edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);

        System.out.println("DFS Traversal for Disconnected Graph:");
        graph.dfsDisconnected();
    }
}


//bool array 4
//import java.util.*;
//
//class Graph {
//    private List<List<Integer>> adjList;
//    private int nodes;
//
//    public Graph(int nodes) {
//        this.nodes = nodes;
//        adjList = new ArrayList<>();
//        for (int i = 0; i < nodes; i++) {
//            adjList.add(new ArrayList<>());
//        }
//    }
//
//    public void addEdge(int u, int v) {
//        adjList.get(u).add(v);
//        adjList.get(v).add(u); // Since it's an undirected graph
//    }
//
//    public void dfs(int node, boolean[] visited) {
//        if (visited[node]) return;
//
//        visited[node] = true;
//        System.out.print(node + " ");  // Process node
//
//        for (int neighbor : adjList.get(node)) {
//            dfs(neighbor, visited);
//        }
//    }
//
//    public static void main(String[] args) {
//        int nodes = 7;
//        Graph graph = new Graph(nodes);
//
//        // Adding all edges
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(2, 4);
//        graph.addEdge(3, 4);
//        graph.addEdge(3, 5);
//        graph.addEdge(4, 5);
//        graph.addEdge(5, 6);
//
//        boolean[] visited = new boolean[nodes];
//
//        // Ensuring DFS covers all disconnected components within main
//        for (int i = 0; i < nodes; i++) {
//            if (!visited[i]) {
//                System.out.println("\nComponent starting from node " + i + ":");
//
//                graph.dfs(i, visited);
//            }
//        }
//    }
//}

//  stack implementation

//import java.util.*;
//
//class Graph {
//    private List<List<Integer>> adjList;
//    private int nodes;
//
//    public Graph(int nodes) {
//        this.nodes = nodes;
//        adjList = new ArrayList<>();
//        for (int i = 0; i < nodes; i++) {
//            adjList.add(new ArrayList<>());
//        }
//    }
//
//    public void addEdge(int u, int v) {
//        adjList.get(u).add(v);
//        adjList.get(v).add(u); // Since it's an undirected graph
//    }
//
//    public void dfsIterative(int startNode, boolean[] visited) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(startNode);
//
//        while (!stack.isEmpty()) {
//            int node = stack.pop();
//
//            if (!visited[node]) {
//                visited[node] = true;
//                System.out.print(node + " "); // Process node
//
//                // Push neighbors in reverse order to process leftmost first
//                List<Integer> neighbors = adjList.get(node);
//                for (int i = neighbors.size() - 1; i >= 0; i--) {
//                    if (!visited[neighbors.get(i)]) {
//                        stack.push(neighbors.get(i));
//                    }
//                }
//            }
//        }
//    }
//
//    public void dfsDisconnected() {
//        boolean[] visited = new boolean[nodes];
//
//        for (int i = 0; i < nodes; i++) {
//            if (!visited[i]) {
//                System.out.println("\nComponent starting from node " + i + ":");
//                dfsIterative(i, visited);
//            }
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        int nodes = 7;
//        Graph graph = new Graph(nodes);
//
//        // Adding all edges
//        graph.addEdge(0, 1); graph.addEdge(0, 2); graph.addEdge(1, 3); graph.addEdge(2, 4); graph.addEdge(3, 4); graph.addEdge(3, 5); graph.addEdge(4, 5); graph.addEdge(5, 6);
//
//        // System.out.println(adjList);
//
//        System.out.println("DFS Traversal for Disconnected Graph:");
//        graph.dfsDisconnected();
//    }
//}



//take u forword

//import java.util.*;
//
//class Solution {
//    // DFS Helper function
//    private void dfsHelper(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> result) {
//        visited[node] = true;
//        result.add(node);
//
//        for (int neighbor : adj.get(node)) {
//            if (!visited[neighbor]) {
//                dfsHelper(neighbor, adj, visited, result);
//            }
//        }
//    }
//
//    // DFS Traversal
//    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
//        List<Integer> result = new ArrayList<>();
//        boolean[] visited = new boolean[V];
//
//        dfsHelper(0, adj, visited, result); // Start DFS from node 0
//        return result;
//    }
//
//    // BFS Traversal
//    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
//        List<Integer> result = new ArrayList<>();
//        boolean[] visited = new boolean[V];
//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(0); // Start BFS from node 0
//        visited[0] = true;
//
//        while (!queue.isEmpty()) {
//            int node = queue.poll();
//            result.add(node);
//
//            for (int neighbor : adj.get(node)) {
//                if (!visited[neighbor]) {
//                    visited[neighbor] = true;
//                    queue.add(neighbor);
//                }
//            }
//        }
//        return result;
//    }
//}
