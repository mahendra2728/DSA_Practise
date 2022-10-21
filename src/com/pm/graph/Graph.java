package com.pm.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

  HashMap<String, ArrayList<String>> data = new HashMap<>();

  public boolean addVertex(String vertex) {
    if (data.get(vertex) == null) {
      data.put(vertex, new ArrayList<>());
      return true;
    }
    return false;
  }

  public boolean addEdge(String source, String destination) {
    if (data.get(source) != null || data.get(destination) != null) {
      data.get(source).add(destination);
      data.get(destination).add(source);
      return true;
    }
    return false;
  }

  public boolean removeEdge(String source, String destination) {
    if (data.get(source) != null || data.get(destination) != null) {
      data.get(source).remove(destination);
      data.get(destination).remove(source);
      return true;
    }
    return false;
  }

  public boolean removeVertex(String vertex) {
    if (data.get(vertex) == null) return false;
    for (String removeVertex : data.get(vertex)) {
      data.get(removeVertex).remove(vertex);
    }
    data.remove(vertex);
    return true;
  }

  public void printGraph() {
    System.out.println(data);
  }
}
