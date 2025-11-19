import java.util.*;

public class Graph {

  HashMap<String, List<String>> adj;

  public Graph() {
    adj = new HashMap<>();
  }

  public void addVertex(String val) {
    adj.putIfAbsent(val, new ArrayList<String>());
  }

  public void addEdge(String a, String b) {
    adj.get(a).add(b);
    adj.get(b).add(a);
  }

  public void dfs(String start, ArrayList<String> visited) {
    if (visited.contains(start)) {
      return;
    }

    System.out.println(start);
    visited.add(start);
    for (String neighbor : adj.get(start)) {
      dfs(neighbor, visited);
    }
  }


  public void bfs(String start) {
    Queue<String> queue = new LinkedList<>();
    ArrayList<String> visited = new ArrayList<>();

    queue.add(start);
    visited.add(start);

    while(!queue.isEmpty()) {
      String current = queue.poll();
      System.out.println(current);
      for (String neighbour : adj.get(current)) {
        if(!visited.contains(neighbour)) {
          queue.add(neighbour);
          visited.add(neighbour);
        }
      }
    }

  }

  public void print() {
    for (String vert : adj.keySet()) {
      System.out.print(vert + "-->");
      System.out.println(adj.get(vert));
    }
  }

  public static void main(String[] args) {
    Graph g = new Graph();
    g.addVertex("Top Gun");
    g.addVertex("Star Wars Ep III");
    g.addVertex("Star Wars Ep VI");
    g.addVertex("Avengers: End Game");
    g.addVertex("40 Year Old Virgin");
    g.addVertex("Crazy, Stupid, Love");
    g.addVertex("Step Brothers");
    g.addVertex("Billy Madison");
    g.addVertex("Love, Actually");
    g.addVertex("Mighty Morphin Power Rangers: The Movie");

    g.addEdge("Top Gun","Love, Actually");
    g.addEdge("Top Gun","Crazy, Stupid, Love");
    g.addEdge("Star Wars Ep III","Star Wars Ep VI");
    g.addEdge("Star Wars Ep III","Top Gun");
    g.addEdge("Star Wars Ep III","Avengers: End Game");
    g.addEdge("Star Wars Ep III","Mighty Morphin Power Rangers: The Movie");
    g.addEdge("Star Wars Ep VI","Avengers: End Game");
    g.addEdge("Star Wars Ep VI","Mighty Morphin Power Rangers: The Movie");
    g.addEdge("Avengers: End Game","Mighty Morphin Power Rangers: The Movie");
    g.addEdge("40 Year Old Virgin","Crazy, Stupid, Love");
    g.addEdge("40 Year Old Virgin","Step Brothers");
    g.addEdge("40 Year Old Virgin","Love, Actually");
    g.addEdge("40 Year Old Virgin","Step Brothers");
    g.addEdge("Crazy, Stupid, Love","Step Brothers");
    g.addEdge("Crazy, Stupid, Love","Love, Actually");
    g.addEdge("Crazy, Stupid, Love","Billy Madison");


    g.dfs("Top Gun", new ArrayList<>());
  }
}