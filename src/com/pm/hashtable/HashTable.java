package com.pm.hashtable;

public class HashTable {

  private int size = 6;
  private Node[] dataMap;
  private int length;

  public HashTable() {
    dataMap = new Node[size];
  }

  public HashTable(int size) {
    dataMap = new Node[size];
  }

  //  Here this logic can be written differently
  //  just make sure add % dataMap.length to hash
  //  value so that it will always return hash value
  //  between specified in size
  public int hashCode(String key) {
    int hash = 0;
    char[] chars = key.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      int ascii = chars[i];
      hash = (hash + ascii * 23) % dataMap.length;
    }
    return hash;
  }

  public void put(String key, int value) {
    int index = hashCode(key);
    Node newNode = new Node(key, value);
    if (dataMap[index] == null) {
      dataMap[index] = newNode;
    } else {
      Node tempNode = dataMap[index];
      if (tempNode.key == key) {
        tempNode.value += value;
        return;
      }
      while (tempNode.next != null) {
        tempNode = tempNode.next;
        if (tempNode.key == key) {
          tempNode.value += value;
          return;
        }
      }
      tempNode.next = newNode;
    }

    length++;
  }

  public int get(String key) {
    int index = hashCode(key);
    Node tempNode = dataMap[index];
    while (tempNode != null) {
      if (tempNode.key == key) {
        return tempNode.value;
      }
      tempNode = tempNode.next;
    }
    return 0;
  }

  public void printHashTable() {
    for (int i = 0; i < dataMap.length; i++) {
      Node tempNode = dataMap[i];
      System.out.println(i + " :");
      while (tempNode != null) {
        System.out.println("{" + tempNode.key + " : " + tempNode.value + "}");
        tempNode = tempNode.next;
      }
    }
  }
}
