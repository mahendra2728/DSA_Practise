package com.pm.tree;

public class BinarySeachTree {

  public Node root;

  public boolean insert(int value) {

    Node newNode = new Node(value);
    if (root == null) {
      root = newNode;
      return true;
    }
    Node tempRoot = root;
    while (true) {
      if (newNode.value == tempRoot.value) return false;

      if (newNode.value < tempRoot.value) {
        if (tempRoot.left == null) {
          tempRoot.left = newNode;
          return true;
        }
        tempRoot = tempRoot.left;

      } else {
        if (tempRoot.right == null) {
          tempRoot.right = newNode;
          return true;
        }
        tempRoot = tempRoot.right;
      }
    }
  }

  public boolean contains(int value) {

    // this is optional bcuz if root is null while loop wont execute
    // and simply returns false
    if (root == null) return false;
    Node tempNode = root;

    while (tempNode != null) {
      if (value < tempNode.value) {
        tempNode = tempNode.left;

      } else if (value > tempNode.value) {
        tempNode = tempNode.right;
      } else {
        return true;
      }
    }
    return false;
  }

  public void root() {
    System.out.println("root is : " + root.value);
  }

  public void left() {
    System.out.println("left is : " + root.left.value);
  }

  public void right() {
    System.out.println("right is : " + root.right.value);
  }
}
