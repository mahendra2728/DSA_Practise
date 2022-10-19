package com.pm.doublylinkedlist;

public class DoublyLinkedList {

  Node headNode;
  Node tailNode;
  int length;

  DoublyLinkedList() {
    headNode = null;
    tailNode = null;
  }

  DoublyLinkedList(int value) {
    Node newNode = new Node(value);
    headNode = newNode;
    tailNode = newNode;
    headNode.next = tailNode;
    tailNode.prev = headNode;
    length++;
  }

  public void getHead() {
    System.out.println("Head is : " + headNode.value);
  }

  public void getTail() {
    System.out.println("Tail is : " + tailNode.value);
  }

  public void length() {
    System.out.println("Length is : " + length);
  }

  public void printElements() {
    Node tempNode = headNode;
    while (tempNode != null) {
      System.out.println(tempNode.value);
      tempNode = tempNode.next;
    }
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      headNode = newNode;
      tailNode = newNode;
    } else {
      Node tempNode = tailNode;
      tailNode = newNode;
      tempNode.next = newNode;
      newNode.prev = tempNode;
    }
    length++;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      headNode = newNode;
      tailNode = newNode;
    } else {
      Node tempNode = headNode;
      headNode = newNode;
      headNode.next = tempNode;
      tempNode.prev = newNode;
    }
    length++;
  }

  public Node get(int index) {
    if (index < 0 || index > length) return null;
    Node tempNode = headNode;
    for (int i = 0; i < index; i++) {
      tempNode = tempNode.next;
    }
    return tempNode;
  }

  public boolean set(int index, int value) {
    if (index < 0 || index > length) return false;
    Node tempNode = get(index);
    tempNode.value = value;
    return false;
  }

  public boolean insert(int index, int value) {
    if (index < 0 || index > length) return false;
    if (index == 0) {
      prepend(value);
      return true;
    }
    if (index == length) {
      append(value);
      return true;
    }

    Node newNode = new Node(value);
    Node tempNode = get(index - 1);
    newNode.next = tempNode.next;
    newNode.prev = tempNode;
    tempNode.next = newNode;
    length++;
    return true;
  }

  public void removeLast() {
    Node pre = null;
    Node tempNode = headNode;
    while (tempNode.next != null) {
      pre = tempNode;
      tempNode = tempNode.next;
    }
    tailNode = pre;
    tailNode.next = null;
    length--;
  }

  public void removeFirst() {
    Node pre = null;
    Node tempNode = tailNode;
    while (tempNode.prev != null) {
      pre = tempNode;
      tempNode = tempNode.prev;
    }
    headNode = pre;
    headNode.prev = null;
    length--;
  }

  //  public void reverse() {
  //    Node tempHead = headNode;
  //    headNode = tailNode;
  //    tailNode = tempHead;
  //    Node before = tempHead.prev;
  //    Node after = tempHead.next;
  //    for (int i = 0; i < length; i++) {
  //      after = tempHead.next;
  //      tempHead.next = before;
  //      before = tempHead;
  //      tempHead = after;
  //    }
  //  }

  public boolean remove(int index) {

    if (index < 0 || index > length) return false;
    Node tempNode = get(index);
    if (tempNode != null) {
      Node nextNode = tempNode.next;
      nextNode.prev = tempNode.prev;
      headNode = nextNode;
      length--;
      return true;
    }
    return false;
  }
}
