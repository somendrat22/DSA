import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   static class Pair  {
      int wsf;
      String psf;

      Pair(int wsf, String psf){
         this.wsf = wsf;
         this.psf = psf;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      int criteria = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      boolean[] visited = new boolean[vtces];
      multisolver(graph, src, dest, visited, criteria, k, src + "", 0);

      System.out.println("Largest Path = " + lpath + "@" + lpathwt);
      System.out.println("Just Smaller Path than " + criteria + " = " + fpath + "@" + fpathwt);
      System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
   }
   
    //Solution
       static String  lpath;
       static Integer lpathwt = Integer.MIN_VALUE;
       static String fpath;
       static Integer fpathwt = Integer.MIN_VALUE; // largestElement < criteria
    public static void dfs(ArrayList<Edge>[] graph, int src, int dest, boolean [] visited, Pair dsf, int criteria, PriorityQueue<Pair> pq){
        if(src == dest){
            int wt = dsf.wsf;
            String path = dsf.psf;
            if(wt > lpathwt){
                lpathwt = wt;
                lpath = path;
            }
            if(wt > fpathwt && wt < criteria){
                fpathwt = wt;
                fpath = dsf.psf;
            }
            pq.add(dsf);
            return;
        }
        visited[src] = true;
        ArrayList<Edge> nbrs = graph[src];
        for(int i  = 0; i < nbrs.size(); i++){
            Edge edge = nbrs.get(i);
            int nbr = edge.nbr;
            if(visited[nbr] == false){
                Pair p = new Pair(dsf.wsf + edge.wt,dsf.psf + nbr);
                dfs(graph, nbr,dest, visited, p, criteria, pq);
            }
        }
        visited[src] = false;
    }


   

   
   
   static PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.wsf - a.wsf);
   public static void multisolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria, int k, String psf, int wsf) {
      //write code here
      //All variables have been initialized for you at the top of the function

     dfs(graph, src, dest, visited, new Pair(0, ""+src),criteria,pq);
     while(pq.size() >  1 && k > 1){
         pq.remove();
         k--;
     } 
   }
}
