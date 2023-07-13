# Bipartite Graph :
   1. If it is possible to divide all the vertices into 2 mutually exclusive or exhaustive sets such that all edges are across sets then we say the graph is bipartite.
   2. For even length cyclic graph. Graph can be bipartite but for odd length cyclic graph. Graph can never be bipartite.

# Minimum Spanning Tree :
   1. Its a graph Subgraph (Subgraph is basically picking some edges and vertices).
   2. It is like a tree.
   3. It's a connected graph such that we can travel from one vertices to another vertices directyl or indirectly.
   4. It ia ascylcic graph.
   5. Spanning : In spanning we have to choose all vertices but we can leave some edges
   6. So Minimum Spanning Tree is a graph where all the vertices are connected indirectly or directly and over all weight o the graph is minimum.

# Kruksal Algorithm 
   1. This algo is used to form Minimum Spanning Tree using DSU.
   2. First we have to arrange all the edges in the terms of wieghts. Then Sort the array.
   3. After Sorting we have to apply DSU. By applying DSU we will be able to acheieve Tree Property.
   4. Kruksal'S algorithm will fail in Directed Graph.
   5. In Kruskal’s algorithm, In each step, it is checked that if the edges form a cycle with the spanning-tree formed so far. But Kruskal’s algorithm fails to 
      detect the cycles in a directed graph as there are cases when there is no cycle between the vertices but Kruskal’s Algorithm assumes it to cycle and don’t take 
      consider some edges due to which Kruskal’s Algorithm fails for directed graph.
   6. ![image](https://github.com/somendrat22/DSA1/assets/49708374/6bd44607-6d9c-4fad-a35e-de5001413844)

# KosaRaju Algorithm (Calculating Strongly Connected Component):
   1. Apply Random Dfs and create a specific Order. We are doing like Topological Sort but not topologocal sort. 
   2. Reverse the connection between Vertices
   3. And then apply dfs in that specific order only. And the number times you will apply DFS that number of strongly connected component you are going to have.
   4. If we will reverse the edges of a strongly connected component then it will remain strongly connected component only why ? Because strongly connnected component is a cycle if you reverse the edges then it will still remain a cycle only. Then why we are reversing it ?
   5. ![image](https://github.com/somendrat22/DSA1/assets/49708374/e6f3a52b-e559-414f-bf58-f01ff4d9ab8c)
   6. We are doing reversal because of the problamatic edge only. Now as it is reversed and we are moving with a specific order then we are not going to enter from one component to another. 



      
