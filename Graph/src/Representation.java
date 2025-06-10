import java.util.ArrayList;
import java.util.List;

public class GfG {

    // Method to add an edge between two vertices
    public static void addEdge(List<List<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i); // Undirected
    }

    // Method to display the adjacency list
    public static void displayAdjList(List<List<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + ": "); // Print the vertex
            for (int j : adj.get(i)) {
                System.out.print(j + " "); // Print its adjacent
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create a graph with 4 vertices and no edges
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Now add edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);

        System.out.println("Adjacency List Representation:");
        displayAdjList(adj);
    }
}

//_________________________________________________________
// WEIGHTED GRAPHGS
import java.util.ArrayList;
import java.util.List;

public class Graph {
    static class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "(" + dest + ", " + weight + ")";
        }
    }

    static void addUndirectedEdge(List<List<Edge>> adj, int u, int v, int weight) {
        adj.get(u).add(new Edge(v, weight));
        adj.get(v).add(new Edge(u, weight)); // Add reverse edge for undirected graph
    }

    public static void main(String[] args) {
        int v = 4;
        List<List<Edge>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected)
        addUndirectedEdge(adj, 0, 1, 10);
        addUndirectedEdge(adj, 0, 2, 5);
        addUndirectedEdge(adj, 1, 2, 2);
        addUndirectedEdge(adj, 1, 3, 1);
        addUndirectedEdge(adj, 2, 3, 9);

        System.out.println(adj);
    }
}
_____________________________________________________________________
//implement the method to check if two vertices are directly connected in your undirected graph.
import java.util.ArrayList;
import java.util.List;

public class Graph {
    static class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "(" + dest + ", " + weight + ")";
        }
    }



    static void addUndirectedEdge(List<List<Edge>> adj, int u, int v, int weight) {
        adj.get(u).add(new Edge(v, weight));
        adj.get(v).add(new Edge(u, weight)); // Add reverse edge for undirected graph
    }

    static boolean areConnected(List<List<Edge>> adj , int u, int v){
        // adj.get(0) = [Edge(1, 10), Edge(2, 5)]  example

        for( Edge edge :adj.get(u)){
            if(edge.dest == v){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        List<List<Edge>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected)
        addUndirectedEdge(adj, 0, 1, 10);
        addUndirectedEdge(adj, 0, 2, 5);
        addUndirectedEdge(adj, 1, 2, 2);
        addUndirectedEdge(adj, 1, 3, 1);
        addUndirectedEdge(adj, 2, 3, 9);

        System.out.println(adj);

        System.out.println("Is 0 connected to 1? " + areConnected(adj, 0, 1)); // true
        System.out.println("Is 0 connected to 3? " + areConnected(adj, 0, 3)); // false
    }
}

