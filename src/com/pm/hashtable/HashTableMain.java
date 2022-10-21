package com.pm.hashtable;

public class HashTableMain {

  public static void main(String[] args) {

    HashTable hashTable = new HashTable(10);

    hashTable.put("mahi", 3);
    hashTable.put("abcd", 4);

    hashTable.put("seth", 6);
    hashTable.put("roman", 10);
    hashTable.printHashTable();

    System.out.println("\n----------------------------");

    System.out.println("Get method " + hashTable.get("mahi"));

    System.out.println("----------------------------");

    System.out.println("All keys : " +hashTable.keys());
  }
}
