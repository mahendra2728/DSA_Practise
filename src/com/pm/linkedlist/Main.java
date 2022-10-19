package com.pm.linkedlist;

import com.pm.linkedlist.MyLinkedList;

public class Main {

  public static void main(String[] args) throws Exception {

    MyLinkedList myLinkedList = new MyLinkedList(2);
    myLinkedList.append(4);
    myLinkedList.append(5);
    myLinkedList.append(7);
    myLinkedList.append(88);

    myLinkedList.prepend(1);

    displayMessages(myLinkedList);

    System.out.println("\nAfter removing Last");
    myLinkedList.removeLast();
    displayMessages(myLinkedList);

    System.out.println("\nAfter removing First");
    myLinkedList.removeFirst();
    displayMessages(myLinkedList);

    System.out.println("\n Get Method");
    System.out.println(myLinkedList.get(3));
    displayMessages(myLinkedList);


    System.out.println("\n Set Method");
    myLinkedList.set(0,10);
    displayMessages(myLinkedList);

    System.out.println("\n Reverse List");
    myLinkedList.reverse();
    displayMessages(myLinkedList);

    System.out.println("\nInsert Method");
    myLinkedList.insert(1,2);
    displayMessages(myLinkedList);

    System.out.println("\n Second LinkedList");
    MyLinkedList second = new MyLinkedList();
    second.append(2);
    second.append(5);

    second.remove(1);
    displayMessages(second);
  }

  public static void displayMessages(MyLinkedList myLinkedList) {
    myLinkedList.printElements();
    myLinkedList.getLength();
    myLinkedList.getHead();
    myLinkedList.getTail();
  }
}
