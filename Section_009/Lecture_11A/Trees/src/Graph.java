import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

  HashMap<String, ArrayList<String>> adjacencyList;

  public Graph() {
    adjacencyList = new HashMap();
  }

  public void addVertex(String v) {
    adjacencyList.putIfAbsent(v, new ArrayList<String>());
  }

  public void addEdge(String v1, String v2) {
    adjacencyList.get(v1).add(v2);
    adjacencyList.get(v2).add(v1);
  }

  public void print() {
    for(String v : adjacencyList.keySet()) {
      System.out.println(v + "->" + adjacencyList.get(v));
    }
  }

  public void bfs(String start) {
    Queue<String> queue = new LinkedList<>();
    ArrayList<String> visited = new ArrayList<>();

    queue.add(start);
    visited.add(start);

    while (!queue.isEmpty()) {
      String current = queue.poll();
      System.out.println(current);

      for (String neighbour : adjacencyList.get(current)) {
        if (!visited.contains(neighbour)) {
          queue.add(neighbour);
          visited.add(neighbour);
        }
      }
    }

  }

  public void dfs(String start, ArrayList<String> visited) {
    if (visited.contains(start)) {
      return;
    }

    System.out.println(start);
    visited.add(start);
    for (String neighbor : adjacencyList.get(start)) {
      dfs(neighbor, visited);
    }
  }


  public static void main(String[] args) {
    Graph g = new Graph();
    g.addVertex("A");
    g.addVertex("B");
    g.addVertex("C");
    g.addVertex("D");
    g.addVertex("E");
    g.addEdge("A", "B");
    g.addEdge("A", "C");
    g.addEdge("A", "D");
    g.addEdge("B", "E");
    g.addEdge("C", "E");

    g.print();

    g.bfs("E");
    g.dfs("A", new ArrayList<>());
  }
}