package com.pm.graph;

public class GraphMain {

  public static void main(String[] args) {
    Graph graph = new Graph();

    // add new vertex
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    graph.addVertex("E");

    // add edge between source & destination vertex
    graph.addEdge("A", "B");
    graph.addEdge("A", "C");
    graph.addEdge("B", "E");
    graph.addEdge("C", "D");
    graph.addEdge("D", "E");

    graph.addEdge("A", "D");
    graph.addEdge("B", "D");

    // removeEdge() remove edge between source and destination vertex
    graph.removeEdge("A", "B");

    System.out.println("\n------------- Before remove vertex");
    // printGraph()
    graph.printGraph();


    // removeVertex() used to remove vertex
    graph.removeVertex("D");
    System.out.println("\n------------- After remove vertex");

    graph.printGraph();
  }
}
