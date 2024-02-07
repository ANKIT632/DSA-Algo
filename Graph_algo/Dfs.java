package Graph_algo;

import java.util.ArrayList;

public class Dfs {

 public  void dfsTraverse(int vertex, ArrayList<ArrayList<Integer>> adj ,boolean[] visited,ArrayList<Integer>traversalData)  
 {
    for(var neighbor:adj.get(vertex)){

        if(!visited[neighbor]){
            visited[neighbor]=true; 
            traversalData.add(neighbor);
            dfsTraverse(neighbor, adj, visited, traversalData);
        }
     
    }
 } 


 // print

     public void printTreversalData(ArrayList<Integer>li){
        
      for(var data:li){
        System.out.print(data+" ");
      }

     }


}
