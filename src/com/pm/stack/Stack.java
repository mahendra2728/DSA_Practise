package com.pm.stack;

public class Stack {

  private Node top;
  private int size;

  public Stack(){
    top =null;
  }
  public Stack(int value) {
    Node newNode = new Node(value);
    top = newNode;
    size = 1;
  }

  public void push(int value) {
    Node newNode = new Node(value);
    if (size == 0) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    size++;
  }

  public Node pop(){
    if(size==0) return null;
    Node temp = top;
    top = top.next;
    temp.next = null;
    size--;
    return top;
  }

  public void printStacks() {
    Node tempNode = top;
    while (tempNode != null) {
      System.out.println(tempNode.value);
      tempNode = tempNode.next;
    }
  }

  public void size() {
    System.out.println("size of stack is : " + size);
  }

  public void getTop() {
    System.out.println("top element is : " + top.value);
  }
}
