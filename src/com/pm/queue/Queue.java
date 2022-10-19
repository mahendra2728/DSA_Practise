package com.pm.queue;

public class Queue {

  public Node first;
  public Node last;
  public int size;

  public Queue() {
    first = null;
    last = null;
  }

  public Queue(int value) {
    Node newNode = new Node(value);
    first = newNode;
    last = newNode;
    size = 1;
  }

  public void enqueue(int value) {
    Node newNode = new Node(value);
    if (size == 0) {
      first = newNode;
      last = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }
    size++;
  }

  public Node dequeue() {
    if (size == 0) return null;

    Node tempNode = first;
    if (size == 1) {
      first = null;
      last = null;
    } else {
      first = tempNode.next;
      tempNode.next = null;
    }
    size--;
    return tempNode;
  }

  public void printQueue() {
    Node tempNode = first;
    while (tempNode != null) {
      System.out.println(tempNode.value);
      tempNode = tempNode.next;
    }
  }

  public void first() {
    System.out.println("First is : " + first.value);
  }

  public void last() {
    System.out.println("Last is : " + last.value);
  }

  public void size() {
    System.out.println("Size of Queue is : " + size);
  }
}
