package Graph_algo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Bfs {

    public boolean bfs_traversal(ArrayList<ArrayList<Integer>> adj, int src, int des, int pred[], int dis[],
            int vertex) {

        LinkedList<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[vertex + 1];

        // initialize..
        for (int i = 0; i < vertex; i++) {
            visited[i] = false;
            dis[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        visited[src] = true;
        dis[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()) {
            int curr = queue.remove();
            for (int i = 0; i < adj.get(curr).size(); i++) {
                int neighbor = adj.get(curr).get(i);

                if (visited[neighbor] == false) {

                    visited[neighbor] = true;
                    dis[neighbor] = dis[curr] + 1;
                    pred[neighbor] = curr;
                    queue.add(neighbor);

                    if (neighbor == des) {
                        return true;
                    }
                }
            }
        }
        return false;

    }


    // get path 
    public String findPath(int pre[] ,int src,int des){
        String path="";
        int i=des;
        path=path+6; 
        while(src!=pre[i]){

            path=pre[i]+"-->"+path;
            i=pre[i];

        }
        
        path=pre[i]+"-->"+path;

        return path;
    }

}
