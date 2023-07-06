class Solution {
    public boolean isBipartite(int[][] graph) {
        // As we may have disconnected componenet we need to travel over all the unvisited component 
        // Time Complexity -> O(n) As each node is exactly visited once.
        // Space Complexity -> O(n) -> For levels array and as we are creating a queue also so at max we can store all neighbours at once so it can also take o(n) space
        // so the total space we are taking is o(n + n)
        int [] levels = new int[graph.length];
        Arrays.fill(levels, -1);
        for(int i  = 0; i < graph.length; i++){
           if(levels[i] == -1){
               boolean res = checkBipartite(graph, i, levels);
               if(res == false){
                   return false;
               }
           } 
        }
        return true;
    }
    
    public boolean checkBipartite(int [][] graph, int src, int [] levels){
        LinkedList<Integer> q = new LinkedList<>();
        q.addLast(src);
        
        int level  = 0;
        while(q.size() >  0){
            int size = q.size();
            while(size-- != 0){
                int rem = q.removeFirst();
                if(levels[rem] != -1){
                    if(levels[rem] != level){
                        return false;
                    }else{
                        continue;
                    }
                }else{
                    levels[rem] = level;
                }
                
                for(int nbr : graph[rem]){
                    if(levels[nbr] == -1){
                        q.addLast(nbr);
                    }
                }
            }
            level++;
        }
        
        return true;
    }
}
