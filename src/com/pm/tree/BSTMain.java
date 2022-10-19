package com.pm.tree;

public class BSTMain {

  public static void main(String[] args) {
    BinarySeachTree binarySeachTree = new BinarySeachTree();

    binarySeachTree.insert(10);
    binarySeachTree.insert(5);
    binarySeachTree.insert(15);


    //Left node
    binarySeachTree.insert(3);
    binarySeachTree.insert(2);

    //Righ node
    binarySeachTree.insert(20);
    binarySeachTree.insert(12);

    binarySeachTree.root();
    binarySeachTree.left();
    binarySeachTree.right();

    System.out.println("\n --------------------------------");
    System.out.println("Contains Method Test");
    System.out.println(" 1 contains : "+binarySeachTree.contains(1));
    System.out.println(" 20 contains : "+binarySeachTree.contains(20));
    System.out.println(" 2 contains : "+binarySeachTree.contains(2));
    System.out.println(" 12 contains : "+binarySeachTree.contains(12));
    System.out.println(" 5 contains : "+binarySeachTree.contains(5));
    System.out.println("\n --------------------------------");

  }
}
