package com.pm.linkedlist;

class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
  }
}

public class MyLinkedList {

  private Node headNode;
  private Node tailNode;
  private int length;

  public MyLinkedList(){
    this.headNode = null;
    this.tailNode = null;
  }
  public MyLinkedList(int value) {
    Node node = new Node(value);
    this.headNode = node;
    this.tailNode = node;
    this.length = 1;
  }

  public void printElements() {
    Node temp = this.headNode;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public void append(int value) {
    Node node = new Node(value);
    if (length == 0) {
      headNode = node;
      tailNode = node;
    } else {
      tailNode.next = node;
      tailNode = node;
    }
    length++;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      headNode = newNode;
      tailNode = newNode;
    } else {
      newNode.next = headNode;
      headNode = newNode;
    }
    length++;
  }

  public void getLength() {
    System.out.println("Size of List is : " + length);
  }

  public void getHead() {
    System.out.println("Head is : " + headNode.value);
  }

  public void getTail() {
    System.out.println("Tail is : " + tailNode.value);
  }

  public Node removeFirst() {
    Node tempNode = headNode;
    if (length == 0) {
      return null;
    }
    headNode = tempNode.next;
    tempNode.next = null;
    length--;

    if (length == 0) {
      tailNode = null;
    }
    return tempNode;
  }

  public Node removeLast() {
    Node prev = null;
    Node temp = headNode;

    if (length == 0) return null;

    while (temp.next != null) {
      prev = temp;
      temp = temp.next;
    }
    tailNode = prev;
    tailNode.next = null;

    length--;

    return temp;
  }

  public Node get(int index) throws Exception {

    if (index < 0 || index >= length) {
      throw new Exception("Out of Index");
    }
    Node tempNode = headNode;
    for (int i = 0; i < index; i++) {
      tempNode = tempNode.next;
    }
    return tempNode;
  }

  public Node set(int index, int value) throws Exception {
    Node currentNode = get(index);
    if (currentNode != null) {
      currentNode.value = value;
    }
    return currentNode;
  }

  public boolean insert(int index, int value) throws Exception {
    Node newNode = new Node(value);
    if (index < 0 || index > length) return false;
    if (index == 0) {
      prepend(value);
      return true;
    }
    if (index == length) {
      append(value);
      return true;
    }
    Node tempNode = get(index - 1);
    newNode.next = tempNode.next;
    tempNode.next = newNode;
    length++;
    return true;
  }

  public void reverse() {
    Node tempNode = headNode;
    headNode = tailNode;
    tailNode = tempNode;
    Node after = tempNode.next;
    Node before = null;
    for (int i = 0; i < length; i++) {
      after = tempNode.next;
      tempNode.next = before;
      before = tempNode;
      tempNode = after;
    }
  }

  public boolean remove(int index) throws Exception {
    if(index<0 || index>length) return false;

    if(index ==0){
     removeFirst();
      return true;
    }
    if(index == length-1){
      removeLast();
      return true;
    }

    Node prevNode = get(index-1);
    Node deletedNode = prevNode.next;
    if(deletedNode!=null){
      prevNode.next = deletedNode.next;
      deletedNode.next=null;
      length--;
      return true;
    }
    return false;
  }
}
