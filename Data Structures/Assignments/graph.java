import java.util.*;
class Graph {
  private LinkedList<Integer> adjLists[];
  private boolean visited[];
 
  Graph(int vertices) {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];
 
    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<Integer>();
  }
 
  void addEdge(int src, int dest) {
    adjLists[src].add(dest);
  }
  void DFS(int vertex) {
    visited[vertex] = true;
    System.out.print(vertex + " ");
    Iterator<Integer> ite = adjLists[vertex].listIterator();
    while (ite.hasNext()) {
      int adj = ite.next();
      if (!visited[adj])
        DFS(adj);
    }
  }
  void BFS(int s) {
    LinkedList<Integer> queue = new LinkedList();
 
    visited[s] = true;
    queue.add(s);
 
    while (queue.size() != 0) {
      s = queue.poll();
      System.out.print(s + " ");
 
      Iterator<Integer> i = adjLists[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  public static void main(String args[]) {
    Graph g = new Graph(10);
 // A -0 , B - 1, C-2, D-3, E - 4, F - 5, G -6, H - 7
    g.addEdge(0, 1);
    g.addEdge(7, 1);
    g.addEdge(6, 7);
    g.addEdge(6, 3);
    g.addEdge(4, 6);
    g.addEdge(3, 4);
    g.addEdge(3, 2);
    g.addEdge(3, 5);
    g.addEdge(5, 2);
   
 //System.out.println("Breadth First Search");
 //g.BFS(0);   
 System.out.println("Depth First Search");
 g.DFS(3);
 
  }
}
