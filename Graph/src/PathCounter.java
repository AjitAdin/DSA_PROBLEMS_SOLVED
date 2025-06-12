
//UNDIRECTED


import java.util.*;

public class PathCounter {

    // Recursive method to find and print all simple paths from u to v
    public static int  findPaths(List<List<Integer>> adj, int u, int v, boolean[] visited, List<Integer> path) {

        visited[u]=true;
        path.add(u);
        int count=0;
        if(u==v){
            System.out.println(path + " ");
            count=1;
        }

        for(int nb : adj.get(u)){
            if(!visited[nb]){
                count += findPaths(adj,nb,v,visited,path);  // if no u==v match found += 0 is added if found 1 is added
            }
        }

        visited[u]=false;
        path.remove(path.size()-1);

        return count;
    }

    public static void main(String[] args) {
        int numNodes = 7;
        List<List<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < numNodes; i++) {
            adj.add(new ArrayList<>());
        }

        // Add undirected edges
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(0).add(2); adj.get(2).add(0);
        adj.get(1).add(3); adj.get(3).add(1);
        adj.get(2).add(4); adj.get(4).add(2);
        adj.get(3).add(4); adj.get(4).add(3);
        adj.get(3).add(5); adj.get(5).add(3);
        adj.get(4).add(5); adj.get(5).add(4);
        adj.get(5).add(6); adj.get(6).add(5);

        int source = 0;
        int destination = 6;

        boolean[] visited = new boolean[numNodes];
        List<Integer> path = new ArrayList<>();

        System.out.println("All simple paths from " + source + " to " + destination + ":");
        int totalPaths = findPaths(adj, source, destination, visited, path);

        System.out.println("Total simple paths: " + totalPaths);
    }
}

//

//weighted directed graphs
//import java.util.*;
//
//public class PathCounter {
//
//    // Helper class for storing neighbors and weights
//    static class Pair {
//        int node, weight;
//        Pair(int node, int weight) {
//            this.node = node;
//            this.weight = weight;
//        }
//    }
//
//    // Recursive method to find and print all simple paths from u to v
//    public static int findPaths(List<List<Pair>> adj, int u, int v, boolean[] visited, List<Integer> path, int pathWeight) {
//        visited[u] = true;
//        path.add(u);
//        int totalWeightSum = 0;
//
//        if (u == v) {
//            System.out.println(path + " (Weight: " + pathWeight + ")");
//            return pathWeight;  // Return total weight of this path
//        }
//
//        for (Pair neighbor : adj.get(u)) {
//            if (!visited[neighbor.node]) {
//                totalWeightSum += findPaths(adj, neighbor.node, v, visited, path, pathWeight + neighbor.weight);
//            }
//        }
//
//        visited[u] = false;
//        path.remove(path.size() - 1);
//
//        return totalWeightSum;
//    }
//
//    public static void main(String[] args) {
//        int numNodes = 7;
//        List<List<Pair>> adj = new ArrayList<>();
//
//        // Initialize adjacency list
//        for (int i = 0; i < numNodes; i++) {
//            adj.add(new ArrayList<>());
//        }
//
//        // Add directed, weighted edges
//        adj.get(0).add(new Pair(1, 2)); // 0 → 1 (weight 2)
//        adj.get(0).add(new Pair(2, 3)); // 0 → 2 (weight 3)
//        adj.get(1).add(new Pair(3, 4)); // 1 → 3 (weight 4)
//        adj.get(2).add(new Pair(4, 2)); // 2 → 4 (weight 2)
//        adj.get(3).add(new Pair(4, 1)); // 3 → 4 (weight 1)
//        adj.get(3).add(new Pair(5, 3)); // 3 → 5 (weight 3)
//        adj.get(4).add(new Pair(5, 1)); // 4 → 5 (weight 1)
//        adj.get(5).add(new Pair(6, 2)); // 5 → 6 (weight 2)
//
//        int source = 0;
//        int destination = 6;
//
//        boolean[] visited = new boolean[numNodes];
//        List<Integer> path = new ArrayList<>();
//
//        System.out.println("All simple paths from " + source + " to " + destination + ":");
//        int totalWeightSum = findPaths(adj, source, destination, visited, path, 0);
//
//        System.out.println("Total sum of all simple path weights: " + totalWeightSum);
//    }
//}
