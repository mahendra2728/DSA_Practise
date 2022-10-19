package com.pm.doublylinkedlist;

public class DDLMain {

  public static void main(String[] args) {


      DoublyLinkedList dll = new DoublyLinkedList(30);

      // append()
      dll.append(20);
      dll.append(40);

      // prepend()
      dll.prepend(10);

      // set()
      dll.set(3,15);

      dll.insert(4,34);

      // get()
      System.out.println("Get Method call "+dll.get(3).value);

      // removeLast()
      dll.removeLast();

      // removeFirst()
      dll.removeFirst();


      //dll.reverse();

      dll.remove(0);

      // printElements()
      dll.printElements();

      displayMessage(dll);

  }
  public static void displayMessage(DoublyLinkedList doublyLinkedList){
      doublyLinkedList.length();
      doublyLinkedList.getHead();
      doublyLinkedList.getTail();
  }
}
