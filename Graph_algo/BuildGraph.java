package Graph_algo;

import java.util.ArrayList;

class BuildGraph {

    static void addEdge(int a[][], int sorce, int des) {
        // Bidirectional edge.
        a[sorce][des] = 1;
        a[sorce][des] = 1;
    }

    static void addEdgeUsingLL(ArrayList<ArrayList<Integer>> adj, int sorce, int des) {
        adj.get(sorce).add(des);
        adj.get(des).add(sorce);
    }

    public static void main(String[] args) {

        int vertex = 7;
        int edge = 8;

        // using adjacency matrix
        int arr[][] = new int[vertex + 1][vertex + 1];

        addEdge(arr, 1, 2);
        addEdge(arr, 2, 3);
        addEdge(arr, 3, 4);
        addEdge(arr, 4, 2);

        // using adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < vertex + 1; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdgeUsingLL(adj, 1, 2);
        addEdgeUsingLL(adj, 1, 3);
        addEdgeUsingLL(adj, 1, 5);
        addEdgeUsingLL(adj, 2, 5);
        addEdgeUsingLL(adj, 3, 4);

        addEdgeUsingLL(adj, 4, 5);
        addEdgeUsingLL(adj, 4, 6);
        addEdgeUsingLL(adj, 5, 6);

        // from bfs.java
        int pred[] = new int[vertex + 1]; // pre decessor.
        int dis[] = new int[vertex + 1]; // distance.

        Bfs obj = new Bfs();
        boolean check = obj.bfs_traversal(adj, 1, 6, pred, dis, vertex);

        System.out.println("Is source to des path exist : " + check);

    }
}

// graph.

// 1------------2
// | \ |
// 3 \ |
// | \ |
// 4------------5
// |-----6----- |