import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public boolean dfs(int src, ArrayList<Integer>[] graph, boolean [] visited, boolean [] recurssionTracker){
        visited[src] = true;
        recurssionTracker[src] = true;

        ArrayList<Integer> nbrs = graph[src];
        for(int  i = 0; i < nbrs.size(); i++){
            int nbr = nbrs.get(i);
            if(visited[nbr] == false){
                // dfs
                boolean res = dfs(nbr, graph, visited, recurssionTracker);
                if(res == true){
                    return true;
                }
            }else if(recurssionTracker[nbr] == true){
                return true;
            }
        }

        recurssionTracker[src] = false;
        return false;
    }
    public boolean isCyclic(int V, ArrayList<Integer>[] adj) {
        // Your code here
        boolean [] visted = new boolean[V];
        boolean [] recurssionTracker = new boolean[V];
        for(int i = 0; i < V; i++){
            if(visted[i] == false){
                boolean res = dfs(i, adj, visted, recurssionTracker);
                if(res == true){
                    return true;
                }
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < E; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            adj[u].add(v);
        }
        Solution obj = new Solution();
        boolean ans = obj.isCyclic(V, adj);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
